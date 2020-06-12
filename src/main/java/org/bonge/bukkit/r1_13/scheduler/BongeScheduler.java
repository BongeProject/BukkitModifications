package org.bonge.bukkit.r1_13.scheduler;

import org.bonge.Bonge;
import org.bonge.launch.BongeLaunch;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scheduler.BukkitWorker;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.scheduler.Task;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BongeScheduler implements BukkitScheduler {

    private static class BongeWrappedRunnable implements Runnable {

        private Runnable run;
        private BongeTaskData data;

        public BongeWrappedRunnable(Runnable run){
            this.run = run;
        }

        public Optional<BongeTaskData> getData(){
            return Optional.ofNullable(this.data);
        }

        public void setData(BongeTaskData data){
            this.data = data;
        }

        @Override
        public void run() {
            try{
                this.run.run();
            }catch (Throwable e){
                if(this.data != null){
                    Bonge.createCrashFile(this.data.getOwner(), "scheduler", e);
                }
                throw e;
            }
        }
    }

    private Set<BongeTaskData> tasks = new HashSet<>();

    public Set<BongeTaskData> getTasks(){
        return this.tasks;
    }

    private Optional<BongeTaskData> getId(int id){
        Set<BongeTaskData> set = get(b -> b.getTaskId() == id);
        if (set.size() == 0){
            return Optional.empty();
        }
        return Optional.of(set.iterator().next());
    }

    private Set<BongeTaskData> get(Predicate<BongeTaskData> predicate){
        return this.tasks.stream().filter(predicate).collect(Collectors.toSet());

    }

    private int getRandomID() {
        int B = 0;
        while(true) {
            boolean check = true;
            for (BongeTaskData data : this.tasks) {
                if (B == data.getTaskId()) {
                    B++;
                    check = false;
                    break;
                }
            }
            if(check){
                return B;
            }
        }
    }

    @Override
    public synchronized int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay) {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = getRandomID();
        Task task1 = Task.builder().delayTicks(delay).name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData data = new BongeTaskData(task1, plugin, id, true);
        runnable.setData(data);
        this.tasks.add(data);
        return id;
    }

    @Override
    @Deprecated
    public synchronized int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay) {
        return this.scheduleSyncDelayedTask(plugin, (Runnable)task, delay);
    }

    @Override
    public synchronized int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task) {
        return this.scheduleSyncDelayedTask(plugin, task, 0);
    }

    @Override
    @Deprecated
    public synchronized int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task) {
        return this.scheduleSyncDelayedTask(plugin, task, 0);
    }

    @Override
    public synchronized int scheduleSyncRepeatingTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task task1 = Task.builder().delayTicks(delay).intervalTicks(period).name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData data = new BongeTaskData(task1, plugin, id, true);
        runnable.setData(data);
        this.tasks.add(data);
        return id;
    }

    @Override
    @Deprecated
    public synchronized int scheduleSyncRepeatingTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay, long period) {
        return this.scheduleSyncRepeatingTask(plugin, (Runnable) task, delay, period);
    }

    @Override
    public synchronized int scheduleAsyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay) {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task task1 = Task.builder().async().delayTicks(delay).name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData data = new BongeTaskData(task1, plugin, id, false);
        runnable.setData(data);
        this.tasks.add(data);
        return id;
    }

    @Override
    public synchronized int scheduleAsyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task) {
        return this.scheduleAsyncDelayedTask(plugin, task, 0);
    }

    @Override
    public synchronized int scheduleAsyncRepeatingTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task task1 = Task.builder().async().delayTicks(delay).intervalTicks(period).name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData data = new BongeTaskData(task1, plugin, id, false);
        runnable.setData(data);
        this.tasks.add(data);
        return id;
    }

    @NotNull
    @Override
    public <T> Future<T> callSyncMethod(@NotNull Plugin plugin, @NotNull Callable<T> task) {
        return null;
    }

    @Override
    public void cancelTask(int taskId) {
        getId(taskId).ifPresent(t -> {
            t.getTask().cancel();
            this.tasks.remove(t);
        });
    }

    @Override
    public void cancelTasks(@NotNull Plugin plugin) {
        get(b -> b.getOwner().equals(plugin)).forEach(c -> {
            c.getTask().cancel();
            this.tasks.remove(c);
        });
    }

    @Override
    public boolean isCurrentlyRunning(int taskId) {
        Optional<BongeTaskData> opBongeTaskData = getId(taskId);
        return opBongeTaskData.isPresent();
    }

    @Override
    public boolean isQueued(int taskId) {
        return false;
    }

    @NotNull
    @Override
    public List<BukkitWorker> getActiveWorkers() {
        return new ArrayList<>();
    }

    @NotNull
    @Override
    public List<BukkitTask> getPendingTasks() {
        return new ArrayList<>();
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTask(@NotNull Plugin plugin, @NotNull Runnable task) throws IllegalArgumentException {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task result = Sponge.getScheduler().createTaskBuilder().name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData taskData = new BongeTaskData(result, plugin, id, true);
        runnable.setData(taskData);
        this.tasks.add(taskData);
        return taskData;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task) throws IllegalArgumentException {
        return null;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskAsynchronously(@NotNull Plugin plugin, @NotNull Runnable task) throws IllegalArgumentException {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task result = Sponge.getScheduler().createTaskBuilder().async().name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData taskData = new BongeTaskData(result, plugin, id, false);
        runnable.setData(taskData);
        this.tasks.add(taskData);
        return taskData;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskAsynchronously(@NotNull Plugin plugin, @NotNull BukkitRunnable task) throws IllegalArgumentException {
        return null;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskLater(@NotNull Plugin plugin, @NotNull Runnable task, long delay) throws IllegalArgumentException {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task result = Sponge.getScheduler().createTaskBuilder().name(task.getClass().getSimpleName() + "-" + id).execute(runnable).delayTicks(delay).submit(BongeLaunch.getInstance());
        BongeTaskData data = new BongeTaskData(result, plugin, id, true);
        this.tasks.add(data);
        return data;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskLater(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay) throws IllegalArgumentException {
        return null;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskLaterAsynchronously(@NotNull Plugin plugin, @NotNull Runnable task, long delay) throws IllegalArgumentException {
        return null;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskLaterAsynchronously(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay) throws IllegalArgumentException {
        return null;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskTimer(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) throws IllegalArgumentException {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task result = Sponge.getScheduler().createTaskBuilder().delayTicks(delay).intervalTicks(period).name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData taskData = new BongeTaskData(result, plugin, id, false);
        runnable.setData(taskData);
        this.tasks.add(taskData);
        return taskData;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskTimer(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay, long period) throws IllegalArgumentException {
        return task.runTaskTimer(plugin, delay, period);
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskTimerAsynchronously(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) throws IllegalArgumentException {
        BongeWrappedRunnable runnable = new BongeWrappedRunnable(task);
        int id = this.getRandomID();
        Task result = Sponge.getScheduler().createTaskBuilder().async().delayTicks(delay).intervalTicks(period).name(task.getClass().getSimpleName() + "-" + id).execute(runnable).submit(BongeLaunch.getInstance());
        BongeTaskData taskData = new BongeTaskData(result, plugin, id, false);
        runnable.setData(taskData);
        this.tasks.add(taskData);
        return taskData;
    }

    @NotNull
    @Override
    public synchronized BukkitTask runTaskTimerAsynchronously(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay, long period) throws IllegalArgumentException {
        return null;
    }
}
