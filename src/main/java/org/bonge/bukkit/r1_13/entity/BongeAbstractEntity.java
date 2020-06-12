package org.bonge.bukkit.r1_13.entity;

import com.flowpowered.math.vector.Vector3d;
import org.bonge.Bonge;
import org.bonge.bukkit.r1_13.server.BongeServer;
import org.bonge.bukkit.r1_13.world.BongeLocation;
import org.bonge.bukkit.r1_13.world.BongeWorld;
import org.bonge.util.WrappedArrayList;
import org.bonge.wrapper.BongeWrapper;
import org.bukkit.*;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Transform;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;

import java.io.IOException;
import java.util.*;

public abstract class BongeAbstractEntity<T extends org.spongepowered.api.entity.Entity> extends BongeWrapper<T> implements Entity {
    
    public BongeAbstractEntity(T entity){
        super(entity);
    }

    public EntityManager.KeyHashMap getData(){
        return ((BongeServer)Bukkit.getServer()).getEntityManager().getData(this);
    }

    @Override
    public Location getLocation() {
        Location loc = this.getData().get(EntityManager.LOCATION);
        if(loc != null){
            return loc;
        }
        return new BongeLocation(this.getSpongeValue().getTransform());
    }

    @Override
    public Location getLocation(Location location) {
        return null;
    }

    @Override
    public void setVelocity(Vector vector) {
        try {
            this.getSpongeValue().setVelocity(Bonge.getInstance().convert(vector, Vector3d.class));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Vector getVelocity() {
        try {
            return Bonge.getInstance().convert(Vector.class, this.getSpongeValue().getVelocity());
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public double getHeight() {
        return this.getSpongeValue().get(Keys.HEIGHT).get();
    }

    @Override
    public double getWidth() {
        return this.getSpongeValue().get(Keys.BASE_SIZE).get();
    }

    @Override
    public boolean isOnGround() {
        return this.getSpongeValue().isOnGround();
    }

    @Override
    public World getWorld() {
        return new BongeWorld(this.spongeValue.getWorld());
    }

    @Override
    public boolean teleport(Location location) {
        try {
            return this.getSpongeValue().setTransform(Bonge.getInstance().convert(location, Transform.class));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
        return this.teleport(location);
    }

    @Override
    public boolean teleport(Entity entity) {
        return this.teleport(entity.getLocation());
    }

    @Override
    public boolean teleport(Entity entity, PlayerTeleportEvent.TeleportCause teleportCause) {
        return this.teleport(entity);
    }

    @Override
    public List<Entity> getNearbyEntities(double v, double v1, double v2) {
        return null;
    }

    @Override
    public int getEntityId() {
        return this.getSpongeValue().getUniqueId().clockSequence();
    }

    @Override
    public int getFireTicks() {
        return this.getSpongeValue().get(Keys.FIRE_TICKS).get();
    }

    @Override
    public int getMaxFireTicks() {
        return this.spongeValue.get(Keys.FIRE_TICKS).get();
    }

    @Override
    public void setFireTicks(int i) {
        this.spongeValue.offer(Keys.FIRE_TICKS, i);
    }

    @Override
    public void remove() {
        this.spongeValue.remove();
    }

    @Override
    public boolean isDead() {
        return this.getSpongeValue().isRemoved();
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void sendMessage(String s) {
        //TODO sending message to a none player entity?
    }

    @Override
    public void sendMessage(String[] strings) {
        //TODO sending message to a none player entity?
    }

    @Override
    public Server getServer() {
        return Bukkit.getServer();
    }

    @Override
    public String getName() {
        Optional<Text> opText = this.getSpongeValue().get(Keys.DISPLAY_NAME);
        return opText.map(TextSerializers.FORMATTING_CODE::serialize).orElse(null);
    }

    @Override
    public boolean isPersistent() {
        return this.getSpongeValue().get(Keys.PERSISTS).get();
    }

    @Override
    public void setPersistent(boolean b) {
        this.getSpongeValue().offer(Keys.PERSISTS, b);
    }

    @Override
    @Deprecated
    public Entity getPassenger() {
        List<Entity> entities = this.getPassengers();
        if(entities.isEmpty()){
            return null;
        }
        return entities.get(0);
    }

    @Override
    @Deprecated
    public boolean setPassenger(Entity entity) {
        List<Entity> entities = this.getPassengers();
        entities.clear();
        return entities.add(entity);
    }

    @Override
    public List<Entity> getPassengers() {
        return new WrappedArrayList<>(e -> {
            assert e != null;
            return this.spongeValue.getPassengers().add(((BongeAbstractEntity<?>)e).spongeValue);
        }, e -> {
            assert e != null;
            return this.spongeValue.getPassengers().remove(((BongeAbstractEntity<?>)e).spongeValue);
        });
    }

    @Override
    public boolean addPassenger(Entity entity) {
        return this.getPassengers().add(entity);
    }

    @Override
    public boolean removePassenger(Entity entity) {
        return this.getPassengers().remove(entity);
    }

    @Override
    public boolean isEmpty() {
        //TODO check what is meant to be empty
        return false;
    }

    @Override
    public boolean eject() {
        //TODO vehicle
        return false;
    }

    @Override
    public float getFallDistance() {
        return this.getSpongeValue().get(Keys.FALL_DISTANCE).get();
    }

    @Override
    public void setFallDistance(float v) {
        this.getSpongeValue().offer(Keys.FALL_DISTANCE, v);
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent entityDamageEvent) {
        //TODO check if sponge has such a thing
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        //TODO check if sponge has such a thing
        return null;
    }

    @Override
    public UUID getUniqueId() {
        return this.getSpongeValue().getUniqueId();
    }

    @Override
    public int getTicksLived() {
        return 0;
    }

    @Override
    public void setTicksLived(int i) {

    }

    @Override
    public void playEffect(EntityEffect entityEffect) {

    }

    @Override
    public boolean isInsideVehicle() {
        return getVehicle() != null;
    }

    @Override
    public boolean leaveVehicle() {
        return this.spongeValue.setVehicle(null);
    }

    @Override
    public Entity getVehicle() {
        Optional<org.spongepowered.api.entity.Entity> opVe = this.spongeValue.getVehicle();
        if(!opVe.isPresent()){
            return null;
        }
        try {
            return Bonge.getInstance().convert(Entity.class, opVe.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setCustomNameVisible(boolean b) {
        this.getSpongeValue().offer(Keys.CUSTOM_NAME_VISIBLE, b);
    }

    @Override
    public boolean isCustomNameVisible() {
        return this.getSpongeValue().get(Keys.CUSTOM_NAME_VISIBLE).get();
    }

    @Override
    public void setGlowing(boolean b) {
        this.getSpongeValue().offer(Keys.GLOWING, b);
    }

    @Override
    public boolean isGlowing() {
        return this.getSpongeValue().get(Keys.GLOWING).get();
    }

    @Override
    public void setInvulnerable(boolean b) {
        this.getSpongeValue().offer(Keys.INVULNERABLE, b);
    }

    @Override
    public boolean isInvulnerable() {
        return this.getSpongeValue().get(Keys.INVULNERABLE).get();
    }

    @Override
    public boolean isSilent() {
        return this.getSpongeValue().get(Keys.IS_SILENT).get();
    }

    @Override
    public void setSilent(boolean b) {
        this.getSpongeValue().offer(Keys.IS_SILENT, b);
    }

    @Override
    public boolean hasGravity() {
        return this.getSpongeValue().get(Keys.HAS_GRAVITY).get();
    }

    @Override
    public void setGravity(boolean b) {
        this.getSpongeValue().offer(Keys.HAS_GRAVITY, b);
    }

    @Override
    public int getPortalCooldown() {
        return this.spongeValue.get(Keys.END_GATEWAY_TELEPORT_COOLDOWN).orElse(0);
    }

    @Override
    public void setPortalCooldown(int i) {
        this.spongeValue.offer(Keys.END_GATEWAY_TELEPORT_COOLDOWN, i);
    }

    @Override
    public Set<String> getScoreboardTags() {
        return null;
    }

    @Override
    public boolean addScoreboardTag(String s) {
        return false;
    }

    @Override
    public boolean removeScoreboardTag(String s) {
        return false;
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return null;
    }

    @Override
    public BlockFace getFacing() {
        return null;
    }

    @Override
    public String getCustomName() {
        return null;
    }

    @Override
    public void setCustomName(String s) {

    }

    @Override
    public void setMetadata(String s, MetadataValue metadataValue) {

    }

    @Override
    public List<MetadataValue> getMetadata(String s) {
        Map<MetadataValue, String> map = this.getData().getOrDefault(EntityManager.METADATA, new HashMap<>());
        List<MetadataValue> list = new ArrayList<>();
        map.entrySet().stream().filter(m -> m.getValue().equals(s)).forEach(e -> list.add(e.getKey()));
        return list;
    }

    @Override
    public boolean hasMetadata(String s) {
        return !this.getMetadata(s).isEmpty();
    }

    @Override
    public void removeMetadata(String s, Plugin plugin) {
        Map<MetadataValue, String> map = this.getData().getOrDefault(EntityManager.METADATA, new HashMap<>());
        map.entrySet().stream().filter(m -> m.getValue().equals(s)).filter(m -> m.getKey().getOwningPlugin().equals(plugin)).findAny().ifPresent(v -> map.remove(v.getKey()));
    }

    @Override
    public boolean isPermissionSet(String s) {
        return false;
    }

    @Override
    public boolean isPermissionSet(Permission permission) {
        return false;
    }

    @Override
    public boolean hasPermission(String s) {
        return false;
    }

    @Override
    public boolean hasPermission(Permission permission) {
        return false;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b, int i) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int i) {
        return null;
    }

    @Override
    public void removeAttachment(PermissionAttachment permissionAttachment) {

    }

    @Override
    public void recalculatePermissions() {

    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    @Override
    @Deprecated
    public boolean isOp() {
        return false;
    }

    @Override
    @Deprecated
    public void setOp(boolean b) {

    }
}
