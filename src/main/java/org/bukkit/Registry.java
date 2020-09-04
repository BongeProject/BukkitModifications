package org.bukkit;

import org.array.utils.ArrayUtils;
import org.bonge.Bonge;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.Biome;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.CatalogType;
import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.advancement.AdvancementType;
import org.spongepowered.api.data.type.ArtType;
import org.spongepowered.api.data.type.ProfessionType;
import org.spongepowered.api.data.type.VillagerType;
import org.spongepowered.api.item.enchantment.EnchantmentType;
import org.spongepowered.api.world.biome.BiomeType;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;

public interface Registry<T extends Keyed> extends Iterable<T> {

    Registry<Advancement> ADVANCEMENT = new SimpleRegistry<>(Advancement.class, AdvancementType.class);
    Registry<Art> ART = new SimpleRegistry<>(Art.class, ArtType.class);
    Registry<Biome> BIOME = new SimpleRegistry<>(Biome.class, BiomeType.class);
    //TODO Registry<KeyedBossBar> BOSS_BARS;
    Registry<Enchantment> ENCHANTMENT = new SimpleRegistry<>(Enchantment.class, EnchantmentType.class);
    Registry<EntityType> ENTITY_TYPE = new SimpleRegistry<>(EntityType.class, org.spongepowered.api.entity.EntityType.class);
    //TODO find sponge loot table Registry<LootTable> LOOT_TABLES = new SimpleRegistry<>(LootTable.class, org.spongepowered.api.util.weighted.LootTable.class);
    Registry<Statistic> STATISTIC = new SimpleRegistry<>(Statistic.class, org.spongepowered.api.statistic.Statistic.class);
    Registry<Material> MATERIAL = new SimpleListRegistry<>(() -> Arrays.asList(Material.values()));
    Registry<Villager.Profession> VILLAGER_PROFESSION = new SimpleRegistry<>(Villager.Profession.class, ProfessionType.class);
    Registry<Villager.Type> VILLAGER_TYPE = new SimpleRegistry<>(Villager.Type.class, VillagerType.class);
    //TODO find sponge alternative Registry<MemoryKey> MEMORY_MODULE_TYPE = new SimpleRegistry<>(MemoryKey.class, );

    final class SimpleListRegistry<T extends Keyed> implements Registry<T> {

        private Supplier<Collection<T>> supplier;

        public SimpleListRegistry(final T... collection){
            this(Arrays.asList(collection));
        }

        public SimpleListRegistry(final Collection<T> collection){
            this(() -> collection);
        }

        public SimpleListRegistry(Supplier<Collection<T>> supplier){
            this.supplier = supplier;
        }

        @Override
        public T get(NamespacedKey key) {
            return this.supplier.get().stream().filter(e -> e.getKey().equals(key)).findAny().orElse(null);
        }

        @NotNull
        @Override
        public Iterator<T> iterator() {
            return this.supplier.get().iterator();
        }
    }

    final class SimpleRegistry<T extends Keyed> implements Registry<T>{

        private Class<? extends CatalogType> sponge;
        private Class<T> bukkit;

        public SimpleRegistry(Class<T> bukkit, Class<? extends CatalogType> sponge){
            this.sponge = sponge;
            this.bukkit = bukkit;
        }

        public Class<? extends CatalogType> getSpongeKeyClass() {
            return this.sponge;
        }

        public Class<T> getBukkitKeyClass() {
            return this.bukkit;
        }

        @Override
        public T get(NamespacedKey key) {
            CatalogType type = Sponge.getRegistry().getCatalogRegistry().get(this.getSpongeKeyClass(), ResourceKey.builder().value(key.toString()).build()).orElse(null);
            if(type == null){
                return null;
            }
            try {
                return Bonge.getInstance().convert(this.getBukkitKeyClass(), type);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @NotNull
        @Override
        public Iterator<T> iterator() {
            Collection<? extends CatalogType> collection = Sponge.getRegistry().getCatalogRegistry().getAllOf(this.getSpongeKeyClass());
            return ArrayUtils.convert(e -> {
                try {
                    return Bonge.getInstance().convert(this.getBukkitKeyClass(), e);
                } catch (IOException ex) {
                    throw new IllegalStateException(ex);
                }
            }, collection).iterator();
        }
    }

    T get(NamespacedKey key);

}
