package org.bukkit.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bonge.Bonge;
import org.bonge.convert.InterfaceConvert;
import org.bonge.launch.BongeLaunch;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandCallable;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public final class PluginCommand extends Command implements PluginIdentifiableCommand {

    private Plugin plugin;
    private CommandExecutor executor;
    private TabCompleter tab;

    public PluginCommand(@NotNull String name, @NotNull Plugin owner) {
        super(name);
        this.executor = owner;
        this.plugin = owner;
        this.usageMessage = "";
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        return this.executor.onCommand(sender, this, commandLabel, args);
    }

    public void setExecutor(@Nullable CommandExecutor executor) {
        this.executor = executor;
    }

    public CommandExecutor getExecutor() {
        return this.executor;
    }

    public void setTabCompleter(@Nullable TabCompleter completer) {
        this.tab = completer;
    }

    @Nullable
    public TabCompleter getTabCompleter() {
        return this.tab;
    }

    @Override
    @NotNull
    public Plugin getPlugin() {
        return this.plugin;
    }

    @NotNull
    @Override
    public java.util.List<String> tabComplete(@NotNull CommandSender sender, @NotNull String alias, @NotNull String[] args) throws CommandException, IllegalArgumentException {
        TabCompleter completer = this.tab;
        if(completer == null){
            return new ArrayList<>();
        }
        return completer.onTabComplete(sender, this, alias, args);
    }
}