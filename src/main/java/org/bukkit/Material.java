package org.bukkit;

import org.apache.commons.lang.Validate;
import org.bukkit.block.data.BlockData;
import org.bukkit.material.MaterialData;
import org.spongepowered.api.CatalogType;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.property.block.*;
import org.spongepowered.api.data.property.item.BurningFuelProperty;
import org.spongepowered.api.data.property.item.FoodRestorationProperty;
import org.spongepowered.api.data.property.item.RecordProperty;
import org.spongepowered.api.data.property.item.UseLimitProperty;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.ItemTypes;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * An enum of all material IDs accepted by the official server and client
 */
public enum Material implements Keyed {
    ACACIA_BOAT(ItemTypes.ACACIA_BOAT),
    ACACIA_BUTTON(BlockTypes.WOODEN_BUTTON),
    ACACIA_DOOR(BlockTypes.ACACIA_DOOR),
    ACACIA_FENCE(BlockTypes.ACACIA_FENCE),
    ACACIA_FENCE_GATE(BlockTypes.ACACIA_FENCE_GATE),
    ACACIA_LEAVES(BlockTypes.LEAVES),
    ACACIA_LOG(BlockTypes.LOG),
    ACACIA_PLANKS(BlockTypes.PLANKS),
    ACACIA_PRESSURE_PLATE(BlockTypes.WOODEN_PRESSURE_PLATE),
    ACACIA_SAPLING(BlockTypes.SAPLING),
    ACACIA_SLAB(BlockTypes.WOODEN_SLAB),
    ACACIA_STAIRS(BlockTypes.ACACIA_STAIRS),
    ACACIA_TRAPDOOR(BlockTypes.TRAPDOOR),
    //NOT 1.12.2 ACACIA_WOOD(BlockTypes.LOG),
    ACTIVATOR_RAIL(BlockTypes.ACTIVATOR_RAIL),
    AIR(BlockTypes.AIR),
    //NOT 1.12.2 ALLIUM(BlockTypes.ALLIUM),
    /*ANDESITE(25975),
    ANVIL(18718, Directional.class),
    APPLE(7720),
    ARMOR_STAND(12852, 16),
    ARROW(31091),
    ATTACHED_MELON_STEM(30882, Directional.class),
    ATTACHED_PUMPKIN_STEM(12724, Directional.class),
    AZURE_BLUET(17608),
    BAKED_POTATO(14624),*/
    BARRIER(BlockTypes.BARRIER),
    /*BAT_SPAWN_EGG(14607),
    BEACON(6608),
    BEDROCK(23130),
    BEEF(4803),
    BEETROOT(23305),
    BEETROOTS(22075, Ageable.class),
    BEETROOT_SEEDS(21282),
    BEETROOT_SOUP(16036, 1),
    BIRCH_BOAT(28104, 1),
    BIRCH_BUTTON(26934, Switch.class),
    BIRCH_DOOR(14759, Door.class),
    BIRCH_FENCE(17347, Fence.class),
    BIRCH_FENCE_GATE(6322, Gate.class),
    BIRCH_LEAVES(12601, Leaves.class),
    BIRCH_LOG(26727, Orientable.class),
    BIRCH_PLANKS(29322),
    BIRCH_PRESSURE_PLATE(9664, Powerable.class),
    BIRCH_SAPLING(31533, Sapling.class),
    BIRCH_SLAB(13807, Slab.class),
    BIRCH_STAIRS(7657, Stairs.class),
    BIRCH_TRAPDOOR(32585, TrapDoor.class),
    BIRCH_WOOD(20913, Orientable.class),
    BLACK_BANNER(9365, 16, Rotatable.class),
    BLACK_BED(20490, 1, Bed.class),
    BLACK_CARPET(6056),
    BLACK_CONCRETE(13338),
    BLACK_CONCRETE_POWDER(16150),
    BLACK_GLAZED_TERRACOTTA(29678, Directional.class),
    BLACK_SHULKER_BOX(24076, 1, Directional.class),
    BLACK_STAINED_GLASS(13941),
    BLACK_STAINED_GLASS_PANE(13201, GlassPane.class),
    BLACK_TERRACOTTA(26691),
    BLACK_WALL_BANNER(4919, Directional.class),
    BLACK_WOOL(16693),
    BLAZE_POWDER(18941),
    BLAZE_ROD(8289),
    BLAZE_SPAWN_EGG(4759),
    BLUE_BANNER(18481, 16, Rotatable.class),
    BLUE_BED(12714, 1, Bed.class),
    BLUE_CARPET(13292),
    BLUE_CONCRETE(18756),
    BLUE_CONCRETE_POWDER(17773),
    BLUE_GLAZED_TERRACOTTA(23823, Directional.class),
    BLUE_ICE(22449),
    BLUE_ORCHID(13432),
    BLUE_SHULKER_BOX(11476, 1, Directional.class),
    BLUE_STAINED_GLASS(7107),
    BLUE_STAINED_GLASS_PANE(28484, GlassPane.class),
    BLUE_TERRACOTTA(5236),
    BLUE_WALL_BANNER(17757, Directional.class),
    BLUE_WOOL(15738),*/
    BONE(ItemTypes.BONE),
    BONE_BLOCK(BlockTypes.BONE_BLOCK),
    //BONE_MEAL(),
    BOOK(ItemTypes.BOOK),
    BOOKSHELF(ItemTypes.BOOKSHELF),
    BOW(ItemTypes.BOW),
    /*BOWL(32661),
    BRAIN_CORAL(31316, Waterlogged.class),
    BRAIN_CORAL_BLOCK(30618),
    BRAIN_CORAL_FAN(13849, Waterlogged.class),
    BRAIN_CORAL_WALL_FAN(22685, CoralWallFan.class),
    BREAD(32049),
    BREWING_STAND(14539, BrewingStand.class),
    BRICK(6820),
    BRICKS(14165),
    BRICK_SLAB(26333, Slab.class),
    BRICK_STAIRS(21534, Stairs.class),
    BROWN_BANNER(11481, 16, Rotatable.class),
    BROWN_BED(25624, 1, Bed.class),
    BROWN_CARPET(23352),
    BROWN_CONCRETE(19006),
    BROWN_CONCRETE_POWDER(21485),
    BROWN_GLAZED_TERRACOTTA(5655, Directional.class),
    BROWN_MUSHROOM(9665),
    BROWN_MUSHROOM_BLOCK(6291, MultipleFacing.class),
    BROWN_SHULKER_BOX(24230, 1, Directional.class),
    BROWN_STAINED_GLASS(20945),
    BROWN_STAINED_GLASS_PANE(17557, GlassPane.class),
    BROWN_TERRACOTTA(23664),
    BROWN_WALL_BANNER(14731, Directional.class),
    BROWN_WOOL(32638),
    BUBBLE_COLUMN(13758, BubbleColumn.class),
    BUBBLE_CORAL(12464, Waterlogged.class),
    BUBBLE_CORAL_BLOCK(15437),
    BUBBLE_CORAL_FAN(10795, Waterlogged.class),
    BUBBLE_CORAL_WALL_FAN(20382, CoralWallFan.class),
    BUCKET(15215, 16),
    CACTUS(12191, Ageable.class),
    CACTUS_GREEN(17296),
    CAKE(27048, 1, Cake.class),
    CARROT(22824),
    CARROTS(17258, Ageable.class),
    CARROT_ON_A_STICK(27809, 1, 25),*/
    CARVED_PUMPKIN(ItemTypes.PUMPKIN),
    /*CAULDRON(26531, Levelled.class),
    CAVE_AIR(17422),
    CAVE_SPIDER_SPAWN_EGG(23341),*/
    CHAINMAIL_BOOTS(ItemTypes.CHAINMAIL_BOOTS),
    CHAINMAIL_CHESTPLATE(ItemTypes.CHAINMAIL_CHESTPLATE),
    CHAINMAIL_HELMET(ItemTypes.CHAINMAIL_HELMET),
    CHAINMAIL_LEGGINGS(ItemTypes.CHAINMAIL_LEGGINGS),
    /*CHAIN_COMMAND_BLOCK(26798, CommandBlock.class),
    CHARCOAL(5390),*/
    CHEST(BlockTypes.CHEST),
    CHEST_MINECART(ItemTypes.CHEST_MINECART),
    /*CHICKEN(17281),
    CHICKEN_SPAWN_EGG(5462),
    CHIPPED_ANVIL(10623, Directional.class),
    CHISELED_QUARTZ_BLOCK(30964),
    CHISELED_RED_SANDSTONE(15529),
    CHISELED_SANDSTONE(31763),
    CHISELED_STONE_BRICKS(9087),
    CHORUS_FLOWER(28542, Ageable.class),
    CHORUS_FRUIT(7652),
    CHORUS_PLANT(28243, MultipleFacing.class),
    CLAY(27880),
    CLAY_BALL(24603),
    CLOCK(14980),
    COAL(29067),
    COAL_BLOCK(27968),
    COAL_ORE(30965),
    COARSE_DIRT(15411),
    COBBLESTONE(32147),
    COBBLESTONE_SLAB(6340, Slab.class),
    COBBLESTONE_STAIRS(24715, Stairs.class),
    COBBLESTONE_WALL(12616, Fence.class),
    COBWEB(9469),
    COCOA(29709, Cocoa.class),
    COCOA_BEANS(27381),
    COD(24691),
    COD_BUCKET(28601, 1),
    COD_SPAWN_EGG(27248),
    COMMAND_BLOCK(4355, CommandBlock.class),
    COMMAND_BLOCK_MINECART(7992, 1),
    COMPARATOR(18911, Comparator.class),
    COMPASS(24139),
    CONDUIT(5148, Waterlogged.class),
    COOKED_BEEF(21595),
    COOKED_CHICKEN(20780),
    COOKED_COD(9681),
    COOKED_MUTTON(31447),
    COOKED_PORKCHOP(27231),
    COOKED_RABBIT(4454),
    COOKED_SALMON(5615),
    COOKIE(27431),
    COW_SPAWN_EGG(14761),
    CRACKED_STONE_BRICKS(27869),
    CRAFTING_TABLE(20706),*/
    CREEPER_HEAD(BlockTypes.SKULL),
    //CREEPER_SPAWN_EGG(9653),
    CREEPER_WALL_HEAD(BlockTypes.SKULL),
    /*CUT_RED_SANDSTONE(26842),
    CUT_SANDSTONE(6118),
    CYAN_BANNER(9839, 16, Rotatable.class),
    CYAN_BED(16746, 1, Bed.class),
    CYAN_CARPET(31495),
    CYAN_CONCRETE(26522),
    CYAN_CONCRETE_POWDER(15734),
    CYAN_DYE(8043),
    CYAN_GLAZED_TERRACOTTA(9550, Directional.class),
    CYAN_SHULKER_BOX(28123, 1, Directional.class),
    CYAN_STAINED_GLASS(30604),
    CYAN_STAINED_GLASS_PANE(11784, GlassPane.class),
    CYAN_TERRACOTTA(25940),
    CYAN_WALL_BANNER(10889, Directional.class),
    CYAN_WOOL(12221),
    DAMAGED_ANVIL(10274, Directional.class),
    DANDELION(30558),
    DANDELION_YELLOW(21789),
    DARK_OAK_BOAT(28618, 1),
    DARK_OAK_BUTTON(6214, Switch.class),
    DARK_OAK_DOOR(10669, Door.class),
    DARK_OAK_FENCE(21767, Fence.class),
    DARK_OAK_FENCE_GATE(10679, Gate.class),
    DARK_OAK_LEAVES(22254, Leaves.class),
    DARK_OAK_LOG(14831, Orientable.class),
    DARK_OAK_PLANKS(20869),
    DARK_OAK_PRESSURE_PLATE(31375, Powerable.class),
    DARK_OAK_SAPLING(14933, Sapling.class),
    DARK_OAK_SLAB(28852, Slab.class),
    DARK_OAK_STAIRS(22921, Stairs.class),
    DARK_OAK_TRAPDOOR(10355, TrapDoor.class),
    DARK_OAK_WOOD(16995, Orientable.class),
    DARK_PRISMARINE(19940),
    DARK_PRISMARINE_SLAB(7577, Slab.class),
    DARK_PRISMARINE_STAIRS(26511, Stairs.class),
    DAYLIGHT_DETECTOR(8864, DaylightDetector.class),
    DEAD_BRAIN_CORAL(9116, Waterlogged.class),
    DEAD_BRAIN_CORAL_BLOCK(12979),
    DEAD_BRAIN_CORAL_FAN(26150, Waterlogged.class),
    DEAD_BRAIN_CORAL_WALL_FAN(23718, CoralWallFan.class),
    DEAD_BUBBLE_CORAL(30583, Waterlogged.class),
    DEAD_BUBBLE_CORAL_BLOCK(28220),
    DEAD_BUBBLE_CORAL_FAN(17322, Waterlogged.class),
    DEAD_BUBBLE_CORAL_WALL_FAN(18453, CoralWallFan.class),
    DEAD_BUSH(22888),
    DEAD_FIRE_CORAL(8365, Waterlogged.class),
    DEAD_FIRE_CORAL_BLOCK(5307),
    DEAD_FIRE_CORAL_FAN(27073, Waterlogged.class),
    DEAD_FIRE_CORAL_WALL_FAN(23375, CoralWallFan.class),
    DEAD_HORN_CORAL(5755, Waterlogged.class),
    DEAD_HORN_CORAL_BLOCK(15103),
    DEAD_HORN_CORAL_FAN(11387, Waterlogged.class),
    DEAD_HORN_CORAL_WALL_FAN(27550, CoralWallFan.class),
    DEAD_TUBE_CORAL(18028, Waterlogged.class),
    DEAD_TUBE_CORAL_BLOCK(28350),
    DEAD_TUBE_CORAL_FAN(17628, Waterlogged.class),
    DEAD_TUBE_CORAL_WALL_FAN(5128, CoralWallFan.class),
    DEBUG_STICK(24562, 1),
    DETECTOR_RAIL(13475, RedstoneRail.class),
    DIAMOND(20865),*/
    DIAMOND_AXE(ItemTypes.DIAMOND_AXE),
    //DIAMOND_BLOCK(5944),
    DIAMOND_BOOTS(ItemTypes.DIAMOND_BOOTS),
    DIAMOND_CHESTPLATE(ItemTypes.DIAMOND_CHESTPLATE),
    DIAMOND_HELMET(ItemTypes.DIAMOND_HELMET),
    DIAMOND_HOE(ItemTypes.DIAMOND_HOE),
    /*DIAMOND_HORSE_ARMOR(10321, 1),*/
    DIAMOND_LEGGINGS(ItemTypes.DIAMOND_LEGGINGS),
    DIAMOND_ORE(BlockTypes.DIAMOND_ORE),
    DIAMOND_PICKAXE(ItemTypes.DIAMOND_PICKAXE),
    DIAMOND_SHOVEL(ItemTypes.DIAMOND_SHOVEL),
    DIAMOND_SWORD(ItemTypes.DIAMOND_SWORD),
    /*DIORITE(24688),
    DIRT(10580),
    DISPENSER(20871, Dispenser.class),
    DOLPHIN_SPAWN_EGG(20787),
    DONKEY_SPAWN_EGG(14513),
    DRAGON_BREATH(20154),
    DRAGON_EGG(29946),*/
    DRAGON_HEAD(BlockTypes.SKULL),
    DRAGON_WALL_HEAD(BlockTypes.SKULL),
    /*DRIED_KELP(21042),
    DRIED_KELP_BLOCK(12966),
    DROPPER(31273, Dispenser.class),
    DROWNED_SPAWN_EGG(19368),
    EGG(21603, 16),
    ELDER_GUARDIAN_SPAWN_EGG(11418),*/
    ELYTRA(ItemTypes.ELYTRA),
    EMERALD(ItemTypes.EMERALD),
    EMERALD_BLOCK(BlockTypes.EMERALD_BLOCK),
    EMERALD_ORE(BlockTypes.EMERALD_ORE),
    ENCHANTED_BOOK(ItemTypes.ENCHANTED_BOOK),
    /*ENCHANTED_GOLDEN_APPLE(8280),
    ENCHANTING_TABLE(16255),
    ENDERMAN_SPAWN_EGG(29488),
    ENDERMITE_SPAWN_EGG(16617),
    ENDER_CHEST(32349, EnderChest.class),
    ENDER_EYE(24860),
    ENDER_PEARL(5259, 16),
    END_CRYSTAL(19090),
    END_GATEWAY(26605),
    END_PORTAL(16782),
    END_PORTAL_FRAME(15480, EndPortalFrame.class),
    END_ROD(24832, Directional.class),
    END_STONE(29686),
    END_STONE_BRICKS(20314),
    EVOKER_SPAWN_EGG(21271),
    EXPERIENCE_BOTTLE(12858),
    FARMLAND(31166, Farmland.class),
    FEATHER(30548),
    FERMENTED_SPIDER_EYE(19386),
    FERN(15794),
    FILLED_MAP(23504),
    FIRE(16396, Fire.class),
    FIREWORK_ROCKET(23841),
    FIREWORK_STAR(12190),
    FIRE_CHARGE(4842),
    FIRE_CORAL(29151, Waterlogged.class),
    FIRE_CORAL_BLOCK(12119),
    FIRE_CORAL_FAN(11112, Waterlogged.class),
    FIRE_CORAL_WALL_FAN(20100, CoralWallFan.class),*/
    FISHING_ROD(ItemTypes.FISHING_ROD),
    FLINT(ItemTypes.FLINT),
    FLINT_AND_STEEL(ItemTypes.FLINT_AND_STEEL),
    /*FLOWER_POT(30567),
    FROSTED_ICE(21814, Ageable.class),
    FURNACE(8133, Furnace.class),
    FURNACE_MINECART(14196, 1),
    GHAST_SPAWN_EGG(9970),
    GHAST_TEAR(18222),
    GLASS(6195),
    GLASS_BOTTLE(6116),
    GLASS_PANE(5709, GlassPane.class),
    GLISTERING_MELON_SLICE(20158),
    GLOWSTONE(32713),
    GLOWSTONE_DUST(6665),
    GOLDEN_APPLE(27732),*/
    GOLDEN_AXE(ItemTypes.GOLDEN_AXE),
    GOLDEN_BOOTS(ItemTypes.GOLDEN_BOOTS),
    //GOLDEN_CARROT(5300),
    GOLDEN_CHESTPLATE(ItemTypes.GOLDEN_CHESTPLATE),
    GOLDEN_HELMET(ItemTypes.GOLDEN_HELMET),
    GOLDEN_HOE(ItemTypes.GOLDEN_HOE),
    /*GOLDEN_HORSE_ARMOR(7996, 1),*/
    GOLDEN_LEGGINGS(ItemTypes.GOLDEN_LEGGINGS),
    GOLDEN_PICKAXE(ItemTypes.GOLDEN_PICKAXE),
    GOLDEN_SHOVEL(ItemTypes.GOLDEN_SHOVEL),
    GOLDEN_SWORD(ItemTypes.GOLDEN_SWORD),
    /*GOLD_BLOCK(27392),
    GOLD_INGOT(28927),
    GOLD_NUGGET(28814),
    GOLD_ORE(32625),
    GRANITE(21091),
    GRASS(6155),
    GRASS_BLOCK(28346, Snowable.class),
    GRASS_PATH(8604),*/
    GRAVEL(BlockTypes.GRAVEL),
    /*GRAY_BANNER(12053, 16, Rotatable.class),
    GRAY_BED(15745, 1, Bed.class),
    GRAY_CARPET(26991),
    GRAY_CONCRETE(13959),
    GRAY_CONCRETE_POWDER(13031),
    GRAY_DYE(9184),
    GRAY_GLAZED_TERRACOTTA(6256, Directional.class),
    GRAY_SHULKER_BOX(12754, 1, Directional.class),
    GRAY_STAINED_GLASS(29979),
    GRAY_STAINED_GLASS_PANE(25272, GlassPane.class),
    GRAY_TERRACOTTA(18004),
    GRAY_WALL_BANNER(24275, Directional.class),
    GRAY_WOOL(27209),
    GREEN_BANNER(10698, 16, Rotatable.class),
    GREEN_BED(13797, 1, Bed.class),
    GREEN_CARPET(7780),
    GREEN_CONCRETE(17949),
    GREEN_CONCRETE_POWDER(6904),
    GREEN_GLAZED_TERRACOTTA(6958, Directional.class),
    GREEN_SHULKER_BOX(9377, 1, Directional.class),
    GREEN_STAINED_GLASS(22503),
    GREEN_STAINED_GLASS_PANE(4767, GlassPane.class),
    GREEN_TERRACOTTA(4105),
    GREEN_WALL_BANNER(15046, Directional.class),
    GREEN_WOOL(25085),
    GUARDIAN_SPAWN_EGG(20113),
    GUNPOWDER(29974),
    HAY_BLOCK(17461, Orientable.class),
    HEART_OF_THE_SEA(11807),
    HEAVY_WEIGHTED_PRESSURE_PLATE(16970, AnaloguePowerable.class),
    HOPPER(31974, Hopper.class),
    HOPPER_MINECART(19024, 1),
    HORN_CORAL(19511, Waterlogged.class),
    HORN_CORAL_BLOCK(19958),
    HORN_CORAL_FAN(13610, Waterlogged.class),
    HORN_CORAL_WALL_FAN(28883, CoralWallFan.class),
    HORSE_SPAWN_EGG(25981),
    HUSK_SPAWN_EGG(20178),
    ICE(30428),
    INFESTED_CHISELED_STONE_BRICKS(4728),
    INFESTED_COBBLESTONE(28798),
    INFESTED_CRACKED_STONE_BRICKS(7476),
    INFESTED_MOSSY_STONE_BRICKS(9850),
    INFESTED_STONE(18440),
    INFESTED_STONE_BRICKS(19749),
    INK_SAC(7184),*/
    IRON_AXE(ItemTypes.IRON_AXE),
    /*IRON_BARS(9378, Fence.class),
    IRON_BLOCK(24754),*/
    IRON_BOOTS(ItemTypes.IRON_BOOTS),
    IRON_CHESTPLATE(ItemTypes.IRON_CHESTPLATE),
    //IRON_DOOR(4788, Door.class),
    IRON_HELMET(ItemTypes.IRON_HELMET),
    IRON_HOE(ItemTypes.IRON_HOE),
    /*IRON_HORSE_ARMOR(30108, 1),
    IRON_INGOT(24895),*/
    IRON_LEGGINGS(ItemTypes.IRON_LEGGINGS),
    /*IRON_NUGGET(13715),
    IRON_ORE(19834),*/
    IRON_PICKAXE(ItemTypes.IRON_PICKAXE),
    IRON_SHOVEL(ItemTypes.IRON_SHOVEL),
    IRON_SWORD(ItemTypes.IRON_SWORD),
    /*IRON_TRAPDOOR(17095, TrapDoor.class),
    ITEM_FRAME(27318),*/
    JACK_O_LANTERN(ItemTypes.LIT_PUMPKIN),
    /*JUKEBOX(19264, Jukebox.class),
    JUNGLE_BOAT(4495, 1),
    JUNGLE_BUTTON(25317, Switch.class),
    JUNGLE_DOOR(28163, Door.class),
    JUNGLE_FENCE(14358, Fence.class),
    JUNGLE_FENCE_GATE(21360, Gate.class),
    JUNGLE_LEAVES(5133, Leaves.class),
    JUNGLE_LOG(20721, Orientable.class),
    JUNGLE_PLANKS(26445),
    JUNGLE_PRESSURE_PLATE(11376, Powerable.class),
    JUNGLE_SAPLING(17951, Sapling.class),
    JUNGLE_SLAB(19117, Slab.class),
    JUNGLE_STAIRS(20636, Stairs.class),
    JUNGLE_TRAPDOOR(8626, TrapDoor.class),
    JUNGLE_WOOD(10341, Orientable.class),
    KELP(21916, Ageable.class),
    KELP_PLANT(29697),
    KNOWLEDGE_BOOK(12646, 1),
    LADDER(23599, Ladder.class),
    LAPIS_BLOCK(14485),
    LAPIS_LAZULI(11075),
    LAPIS_ORE(22934),
    LARGE_FERN(30177, Bisected.class),*/
    LAVA(BlockTypes.LAVA),
    /*LAVA_BUCKET(9228, 1),
    LEAD(29539),
    LEATHER(16414),*/
    LEATHER_BOOTS(ItemTypes.LEATHER_BOOTS),
    LEATHER_CHESTPLATE(ItemTypes.LEATHER_CHESTPLATE),
    LEATHER_HELMET(ItemTypes.LEATHER_HELMET),
    LEATHER_LEGGINGS(ItemTypes.LEATHER_LEGGINGS),
    /*LEVER(15319, Switch.class),
    LIGHT_BLUE_BANNER(18060, 16, Rotatable.class),
    LIGHT_BLUE_BED(20957, 1, Bed.class),
    LIGHT_BLUE_CARPET(21194),
    LIGHT_BLUE_CONCRETE(29481),
    LIGHT_BLUE_CONCRETE_POWDER(31206),
    LIGHT_BLUE_DYE(28738),
    LIGHT_BLUE_GLAZED_TERRACOTTA(4336, Directional.class),
    LIGHT_BLUE_SHULKER_BOX(18226, 1, Directional.class),
    LIGHT_BLUE_STAINED_GLASS(17162),
    LIGHT_BLUE_STAINED_GLASS_PANE(18721, GlassPane.class),
    LIGHT_BLUE_TERRACOTTA(31779),
    LIGHT_BLUE_WALL_BANNER(12011, Directional.class),
    LIGHT_BLUE_WOOL(21073),
    LIGHT_GRAY_BANNER(11417, 16, Rotatable.class),
    LIGHT_GRAY_BED(5090, 1, Bed.class),
    LIGHT_GRAY_CARPET(11317),
    LIGHT_GRAY_CONCRETE(14453),
    LIGHT_GRAY_CONCRETE_POWDER(21589),
    LIGHT_GRAY_DYE(27643),
    LIGHT_GRAY_GLAZED_TERRACOTTA(10707, Directional.class),
    LIGHT_GRAY_SHULKER_BOX(21345, 1, Directional.class),
    LIGHT_GRAY_STAINED_GLASS(5843),
    LIGHT_GRAY_STAINED_GLASS_PANE(19008, GlassPane.class),
    LIGHT_GRAY_TERRACOTTA(26388),
    LIGHT_GRAY_WALL_BANNER(31088, Directional.class),
    LIGHT_GRAY_WOOL(22936),
    LIGHT_WEIGHTED_PRESSURE_PLATE(14875, AnaloguePowerable.class),
    LILAC(22837, Bisected.class),
    LILY_PAD(19271),
    LIME_BANNER(18887, 16, Rotatable.class),
    LIME_BED(27860, 1, Bed.class),
    LIME_CARPET(15443),
    LIME_CONCRETE(5863),
    LIME_CONCRETE_POWDER(28859),
    LIME_DYE(6147),
    LIME_GLAZED_TERRACOTTA(13861, Directional.class),
    LIME_SHULKER_BOX(28360, 1, Directional.class),
    LIME_STAINED_GLASS(24266),
    LIME_STAINED_GLASS_PANE(10610, GlassPane.class),
    LIME_TERRACOTTA(24013),
    LIME_WALL_BANNER(21422, Directional.class),
    LIME_WOOL(10443),
    LINGERING_POTION(25857, 1),
    LLAMA_SPAWN_EGG(23640),
    MAGENTA_BANNER(15591, 16, Rotatable.class),
    MAGENTA_BED(20061, 1, Bed.class),
    MAGENTA_CARPET(6180),
    MAGENTA_CONCRETE(20591),
    MAGENTA_CONCRETE_POWDER(8272),
    MAGENTA_DYE(11788),
    MAGENTA_GLAZED_TERRACOTTA(8067, Directional.class),
    MAGENTA_SHULKER_BOX(21566, 1, Directional.class),
    MAGENTA_STAINED_GLASS(26814),
    MAGENTA_STAINED_GLASS_PANE(14082, GlassPane.class),
    MAGENTA_TERRACOTTA(25900),
    MAGENTA_WALL_BANNER(23291, Directional.class),
    MAGENTA_WOOL(11853),
    MAGMA_BLOCK(25927),
    MAGMA_CREAM(25097),
    MAGMA_CUBE_SPAWN_EGG(26638),
    MAP(21655),
    MELON(25172),
    MELON_SEEDS(18340),
    MELON_SLICE(5347),
    MELON_STEM(8247, Ageable.class),
    MILK_BUCKET(9680, 1),
    MINECART(14352, 1),
    MOOSHROOM_SPAWN_EGG(22125),
    MOSSY_COBBLESTONE(21900, MultipleFacing.class),
    MOSSY_COBBLESTONE_WALL(11536, Fence.class),
    MOSSY_STONE_BRICKS(16415),*/
    MOVING_PISTON(BlockTypes.PISTON_EXTENSION),
    /*MULE_SPAWN_EGG(11229),
    MUSHROOM_STEM(16543, MultipleFacing.class),
    MUSHROOM_STEW(16336, 1),
    MUSIC_DISC_11(27426, 1),
    MUSIC_DISC_13(16359, 1),
    MUSIC_DISC_BLOCKS(26667, 1),
    MUSIC_DISC_CAT(16246, 1),
    MUSIC_DISC_CHIRP(19436, 1),
    MUSIC_DISC_FAR(13823, 1),
    MUSIC_DISC_MALL(11517, 1),
    MUSIC_DISC_MELLOHI(26117, 1),
    MUSIC_DISC_STAL(14989, 1),
    MUSIC_DISC_STRAD(16785, 1),
    MUSIC_DISC_WAIT(26499, 1),
    MUSIC_DISC_WARD(24026, 1),
    MUTTON(4792),
    MYCELIUM(9913, Snowable.class),*/
    NAME_TAG(ItemTypes.NAME_TAG),
    /*NAUTILUS_SHELL(19989),
    NETHERRACK(23425),
    NETHER_BRICK(19996),
    NETHER_BRICKS(27802),
    NETHER_BRICK_FENCE(5286, Fence.class),
    NETHER_BRICK_SLAB(26586, Slab.class),
    NETHER_BRICK_STAIRS(12085, Stairs.class),
    NETHER_PORTAL(19469, Orientable.class),
    NETHER_QUARTZ_ORE(4807),
    NETHER_STAR(12469),
    NETHER_WART(29227, Ageable.class),
    NETHER_WART_BLOCK(15486),
    NOTE_BLOCK(20979, NoteBlock.class),
    OAK_BOAT(17570, 1),
    OAK_BUTTON(13510, Switch.class),
    OAK_DOOR(20341, Door.class),
    OAK_FENCE(6442, Fence.class),
    OAK_FENCE_GATE(16689, Gate.class),
    OAK_LEAVES(4385, Leaves.class),
    OAK_LOG(26723, Orientable.class),
    OAK_PLANKS(14905),
    OAK_PRESSURE_PLATE(20108, Powerable.class),
    OAK_SAPLING(9636, Sapling.class),
    OAK_SLAB(12002, Slab.class),
    OAK_STAIRS(5449, Stairs.class),
    OAK_TRAPDOOR(16927, TrapDoor.class),
    OAK_WOOD(7378, Orientable.class),
    OBSERVER(10726, Observer.class),
    OBSIDIAN(32723),
    OCELOT_SPAWN_EGG(30080),
    ORANGE_BANNER(4839, 16, Rotatable.class),
    ORANGE_BED(11194, 1, Bed.class),
    ORANGE_CARPET(24752),
    ORANGE_CONCRETE(19914),
    ORANGE_CONCRETE_POWDER(30159),
    ORANGE_DYE(13866),
    ORANGE_GLAZED_TERRACOTTA(27451, Directional.class),
    ORANGE_SHULKER_BOX(21673, 1, Directional.class),
    ORANGE_STAINED_GLASS(25142),
    ORANGE_STAINED_GLASS_PANE(21089, GlassPane.class),
    ORANGE_TERRACOTTA(18684),
    ORANGE_TULIP(26038),
    ORANGE_WALL_BANNER(9936, Directional.class),
    ORANGE_WOOL(23957),
    OXEYE_DAISY(11709),
    PACKED_ICE(28993),
    PAINTING(23945),*/
    PAPER(ItemTypes.PAPER),
    /*PARROT_SPAWN_EGG(23614),
    PEONY(21155, Bisected.class),
    PETRIFIED_OAK_SLAB(18658, Slab.class),
    PHANTOM_MEMBRANE(18398),
    PHANTOM_SPAWN_EGG(24648),
    PIG_SPAWN_EGG(22584),
    PINK_BANNER(19439, 16, Rotatable.class),
    PINK_BED(13795, 1, Bed.class),
    PINK_CARPET(30186),
    PINK_CONCRETE(5227),
    PINK_CONCRETE_POWDER(6421),
    PINK_DYE(31151),
    PINK_GLAZED_TERRACOTTA(10260, Directional.class),
    PINK_SHULKER_BOX(24968, 1, Directional.class),
    PINK_STAINED_GLASS(16164),
    PINK_STAINED_GLASS_PANE(24637, GlassPane.class),
    PINK_TERRACOTTA(23727),
    PINK_TULIP(27319),
    PINK_WALL_BANNER(9421, Directional.class),
    PINK_WOOL(7611),*/
    PISTON(BlockTypes.PISTON),
    PISTON_HEAD(BlockTypes.PISTON_HEAD),
    PLAYER_HEAD(BlockTypes.SKULL),
    PLAYER_WALL_HEAD(BlockTypes.SKULL),
    /*PODZOL(24068, Snowable.class),
    POISONOUS_POTATO(32640),
    POLAR_BEAR_SPAWN_EGG(17015),
    POLISHED_ANDESITE(8335),
    POLISHED_DIORITE(31615),
    POLISHED_GRANITE(5477),
    POPPED_CHORUS_FRUIT(27844),
    POPPY(12851),
    PORKCHOP(30896),
    POTATO(21088),
    POTATOES(10879, Ageable.class),*/
    POTION(ItemTypes.POTION),
    /*POTTED_ACACIA_SAPLING(14096),
    POTTED_ALLIUM(13184),
    POTTED_AZURE_BLUET(8754),
    POTTED_BIRCH_SAPLING(32484),
    POTTED_BLUE_ORCHID(6599),
    POTTED_BROWN_MUSHROOM(14481),
    POTTED_CACTUS(8777),
    POTTED_DANDELION(9727),
    POTTED_DARK_OAK_SAPLING(6486),
    POTTED_DEAD_BUSH(13020),
    POTTED_FERN(23315),
    POTTED_JUNGLE_SAPLING(7525),
    POTTED_OAK_SAPLING(11905),
    POTTED_ORANGE_TULIP(28807),
    POTTED_OXEYE_DAISY(19707),
    POTTED_PINK_TULIP(10089),
    POTTED_POPPY(7457),
    POTTED_RED_MUSHROOM(22881),
    POTTED_RED_TULIP(28594),
    POTTED_SPRUCE_SAPLING(29498),
    POTTED_WHITE_TULIP(24330),
    POWERED_RAIL(11064, RedstoneRail.class),
    PRISMARINE(7539),
    PRISMARINE_BRICKS(29118),
    PRISMARINE_BRICK_SLAB(26672, Slab.class),
    PRISMARINE_BRICK_STAIRS(15445, Stairs.class),
    PRISMARINE_CRYSTALS(31546),
    PRISMARINE_SHARD(10993),
    PRISMARINE_SLAB(31323, Slab.class),
    PRISMARINE_STAIRS(19217, Stairs.class),
    PUFFERFISH(8115),
    PUFFERFISH_BUCKET(8861, 1),
    PUFFERFISH_SPAWN_EGG(24573),*/
    PUMPKIN(ItemTypes.PUMPKIN),
    /*PUMPKIN_PIE(28725),
    PUMPKIN_SEEDS(28985),
    PUMPKIN_STEM(19021, Ageable.class),
    PURPLE_BANNER(29027, 16, Rotatable.class),
    PURPLE_BED(29755, 1, Bed.class),
    PURPLE_CARPET(5574),
    PURPLE_CONCRETE(20623),
    PURPLE_CONCRETE_POWDER(26808),
    PURPLE_DYE(6347),
    PURPLE_GLAZED_TERRACOTTA(4818, Directional.class),
    PURPLE_SHULKER_BOX(10373, 1, Directional.class),
    PURPLE_STAINED_GLASS(21845),
    PURPLE_STAINED_GLASS_PANE(10948, GlassPane.class),
    PURPLE_TERRACOTTA(10387),
    PURPLE_WALL_BANNER(14298, Directional.class),
    PURPLE_WOOL(11922),
    PURPUR_BLOCK(7538),
    PURPUR_PILLAR(26718, Orientable.class),
    PURPUR_SLAB(11487, Slab.class),
    PURPUR_STAIRS(8921, Stairs.class),
    QUARTZ(23608),
    QUARTZ_BLOCK(11987),
    QUARTZ_PILLAR(16452, Orientable.class),
    QUARTZ_SLAB(4423, Slab.class),
    QUARTZ_STAIRS(24079, Stairs.class),
    RABBIT(23068),
    RABBIT_FOOT(13864),
    RABBIT_HIDE(12467),
    RABBIT_SPAWN_EGG(26496),
    RABBIT_STEW(10611, 1),
    RAIL(13285, Rail.class),
    REDSTONE(11233),
    REDSTONE_BLOCK(19496),
    REDSTONE_LAMP(8217, Lightable.class),
    REDSTONE_ORE(10887, Lightable.class),
    REDSTONE_TORCH(22547, Lightable.class),
    REDSTONE_WALL_TORCH(7595, RedstoneWallTorch.class),
    REDSTONE_WIRE(25984, RedstoneWire.class),
    RED_BANNER(26961, 16, Rotatable.class),
    RED_BED(30910, 1, Bed.class),
    RED_CARPET(5424),
    RED_CONCRETE(8032),
    RED_CONCRETE_POWDER(13286),
    RED_GLAZED_TERRACOTTA(24989, Directional.class),
    RED_MUSHROOM(19728),
    RED_MUSHROOM_BLOCK(20766, MultipleFacing.class),
    RED_NETHER_BRICKS(18056),
    RED_SAND(16279),
    RED_SANDSTONE(9092),
    RED_SANDSTONE_SLAB(17550, Slab.class),
    RED_SANDSTONE_STAIRS(25466, Stairs.class),
    RED_SHULKER_BOX(32448, 1, Directional.class),
    RED_STAINED_GLASS(9717),
    RED_STAINED_GLASS_PANE(8630, GlassPane.class),
    RED_TERRACOTTA(5086),
    RED_TULIP(16781),
    RED_WALL_BANNER(4378, Directional.class),
    RED_WOOL(11621),
    REPEATER(28823, Repeater.class),
    REPEATING_COMMAND_BLOCK(12405, CommandBlock.class),
    ROSE_BUSH(6080, Bisected.class),
    ROSE_RED(15694),
    ROTTEN_FLESH(21591),
    SADDLE(30206, 1),
    SALMON(18516),
    SALMON_BUCKET(31427, 1),
    SALMON_SPAWN_EGG(18739),*/
    SAND(BlockTypes.SAND),
    /*SANDSTONE(13141),
    SANDSTONE_SLAB(29830, Slab.class),
    SANDSTONE_STAIRS(18474, Stairs.class),
    SCUTE(11914),
    SEAGRASS(23942),
    SEA_LANTERN(16984),
    SEA_PICKLE(19562, SeaPickle.class),*/
    SHEARS(ItemTypes.SHEARS),
    /*SHEEP_SPAWN_EGG(24488),
    SHIELD(29943, 1, 336),
    SHULKER_BOX(7776, 1, Directional.class),
    SHULKER_SHELL(27848),
    SHULKER_SPAWN_EGG(31848),
    SIGN(16918, 16, Sign.class),
    SILVERFISH_SPAWN_EGG(14537),
    SKELETON_HORSE_SPAWN_EGG(21356),*/
    SKELETON_SKULL(ItemTypes.SKULL),
    //SKELETON_SPAWN_EGG(15261),
    SKELETON_WALL_SKULL(ItemTypes.SKULL),
    /*SLIME_BALL(5242),
    SLIME_BLOCK(31892),
    SLIME_SPAWN_EGG(6550),
    SMOOTH_QUARTZ(14415),
    SMOOTH_RED_SANDSTONE(25180),
    SMOOTH_SANDSTONE(30039),
    SMOOTH_STONE(21910),
    SNOW(14146, Snow.class),
    SNOWBALL(19487, 16),
    SNOW_BLOCK(19913),
    SOUL_SAND(16841),
    SPAWNER(7018),
    SPECTRAL_ARROW(4568),
    SPIDER_EYE(9318),
    SPIDER_SPAWN_EGG(14984),*/
    SPLASH_POTION(ItemTypes.SPLASH_POTION),
    /*SPONGE(15860),
    SPRUCE_BOAT(9606, 1),
    SPRUCE_BUTTON(23281, Switch.class),
    SPRUCE_DOOR(10642, Door.class),
    SPRUCE_FENCE(25416, Fence.class),
    SPRUCE_FENCE_GATE(26423, Gate.class),
    SPRUCE_LEAVES(20039, Leaves.class),
    SPRUCE_LOG(9726, Orientable.class),
    SPRUCE_PLANKS(14593),
    SPRUCE_PRESSURE_PLATE(15932, Powerable.class),
    SPRUCE_SAPLING(19874, Sapling.class),
    SPRUCE_SLAB(4348, Slab.class),
    SPRUCE_STAIRS(11192, Stairs.class),
    SPRUCE_TRAPDOOR(10289, TrapDoor.class),
    SPRUCE_WOOD(32328, Orientable.class),
    SQUID_SPAWN_EGG(10682),
    STICK(9773),*/
    STICKY_PISTON(BlockTypes.STICKY_PISTON),
    //STONE(22948),
    STONE_AXE(ItemTypes.STONE_AXE),
    /*STONE_BRICKS(6962),
    STONE_BRICK_SLAB(19676, Slab.class),
    STONE_BRICK_STAIRS(27032, Stairs.class),
    STONE_BUTTON(12279, Switch.class),*/
    STONE_HOE(ItemTypes.STONE_HOE),
    STONE_PICKAXE(ItemTypes.STONE_PICKAXE),
    //STONE_PRESSURE_PLATE(22591, Powerable.class),
    STONE_SHOVEL(ItemTypes.STONE_SHOVEL),
    //STONE_SLAB(19838, Slab.class),
    STONE_SWORD(ItemTypes.STONE_SWORD),
    /*STRAY_SPAWN_EGG(30153),
    STRING(12806),
    STRIPPED_ACACIA_LOG(18167, Orientable.class),
    STRIPPED_ACACIA_WOOD(27193, Orientable.class),
    STRIPPED_BIRCH_LOG(8838, Orientable.class),
    STRIPPED_BIRCH_WOOD(22350, Orientable.class),
    STRIPPED_DARK_OAK_LOG(6492, Orientable.class),
    STRIPPED_DARK_OAK_WOOD(16000, Orientable.class),
    STRIPPED_JUNGLE_LOG(15476, Orientable.class),
    STRIPPED_JUNGLE_WOOD(30315, Orientable.class),
    STRIPPED_OAK_LOG(20523, Orientable.class),
    STRIPPED_OAK_WOOD(31455, Orientable.class),
    STRIPPED_SPRUCE_LOG(6140, Orientable.class),
    STRIPPED_SPRUCE_WOOD(6467, Orientable.class),
    STRUCTURE_BLOCK(26831, StructureBlock.class),
    STRUCTURE_VOID(30806),
    SUGAR(30638),
    SUGAR_CANE(7726, Ageable.class),
    SUNFLOWER(7408, Bisected.class),
    TALL_GRASS(21559, Bisected.class),
    TALL_SEAGRASS(27189, Bisected.class),
    TERRACOTTA(16544),
    TIPPED_ARROW(25164),
    TNT(7896, TNT.class),
    TNT_MINECART(4277, 1),
    TORCH(6063),
    TOTEM_OF_UNDYING(10139, 1),
    TRAPPED_CHEST(18970, Chest.class),*/
    TRIDENT(ItemTypes.WOODEN_SWORD), //temp item - 1.12 doesnt have it
    /*TRIPWIRE(8810, Tripwire.class),
    TRIPWIRE_HOOK(8130, TripwireHook.class),
    TROPICAL_FISH(24879),
    TROPICAL_FISH_BUCKET(29995, 1),
    TROPICAL_FISH_SPAWN_EGG(19713),
    TUBE_CORAL(23048, Waterlogged.class),
    TUBE_CORAL_BLOCK(23723),
    TUBE_CORAL_FAN(19929, Waterlogged.class),
    TUBE_CORAL_WALL_FAN(25282, CoralWallFan.class),
    TURTLE_EGG(32101, TurtleEgg.class),
    TURTLE_HELMET(30120, 1, 275),
    TURTLE_SPAWN_EGG(17324),
    VEX_SPAWN_EGG(27751),*/
    VILLAGER_SPAWN_EGG(ItemTypes.SPAWN_EGG),
    /*VINDICATOR_SPAWN_EGG(25324),
    VINE(14564, MultipleFacing.class),
    VOID_AIR(13668),
    WALL_SIGN(10644, WallSign.class),
    WALL_TORCH(25890, Directional.class),*/
    WATER(BlockTypes.WATER),
    /*WATER_BUCKET(8802, 1),
    WET_SPONGE(9043),
    WHEAT(27709, Ageable.class),
    WHEAT_SEEDS(28742),
    WHITE_BANNER(17562, 16, Rotatable.class),
    WHITE_BED(8185, 1, Bed.class),
    WHITE_CARPET(15117),
    WHITE_CONCRETE(6281),
    WHITE_CONCRETE_POWDER(10363),
    WHITE_GLAZED_TERRACOTTA(11326, Directional.class),
    WHITE_SHULKER_BOX(31750, 1, Directional.class),
    WHITE_STAINED_GLASS(31190),
    WHITE_STAINED_GLASS_PANE(10557, GlassPane.class),
    WHITE_TERRACOTTA(20975),
    WHITE_TULIP(9742),
    WHITE_WALL_BANNER(15967, Directional.class),
    WHITE_WOOL(8624),
    WITCH_SPAWN_EGG(11837),*/
    WITHER_SKELETON_SKULL(BlockTypes.SKULL),
    //WITHER_SKELETON_SPAWN_EGG(10073),
    WITHER_SKELETON_WALL_SKULL(BlockTypes.SKULL),
    //WOLF_SPAWN_EGG(21692),
    WOODEN_AXE(ItemTypes.WOODEN_AXE),
    WOODEN_HOE(ItemTypes.WOODEN_HOE),
    WOODEN_PICKAXE(ItemTypes.WOODEN_PICKAXE),
    WOODEN_SHOVEL(ItemTypes.WOODEN_SHOVEL),
    WOODEN_SWORD(ItemTypes.WOODEN_SWORD),
    WRITABLE_BOOK(ItemTypes.WRITABLE_BOOK),
    WRITTEN_BOOK(ItemTypes.WRITTEN_BOOK),
    /*YELLOW_BANNER(30382, 16, Rotatable.class),
    YELLOW_BED(30410, 1, Bed.class),
    YELLOW_CARPET(18149),
    YELLOW_CONCRETE(15722),
    YELLOW_CONCRETE_POWDER(10655),
    YELLOW_GLAZED_TERRACOTTA(10914, Directional.class),
    YELLOW_SHULKER_BOX(28700, 1, Directional.class),
    YELLOW_STAINED_GLASS(12182),
    YELLOW_STAINED_GLASS_PANE(20298, GlassPane.class),
    YELLOW_TERRACOTTA(32129),
    YELLOW_WALL_BANNER(32004, Directional.class),
    YELLOW_WOOL(29507),*/
    ZOMBIE_HEAD(BlockTypes.SKULL),
    /*ZOMBIE_HORSE_SPAWN_EGG(4275),
    ZOMBIE_PIGMAN_SPAWN_EGG(11531),
    ZOMBIE_SPAWN_EGG(5814),
    ZOMBIE_VILLAGER_SPAWN_EGG(10311),*/
    ZOMBIE_WALL_HEAD(BlockTypes.SKULL),
    UNKNOWN((BlockType)null) {

    };

    private CatalogType type;

    Material(BlockType type) {
        this.type = type;
    }

    Material(ItemType type){
        this.type = type;
    }

    public Optional<CatalogType> getSpongeValue(){
        return Optional.ofNullable(this.type);
    }

    @Deprecated
    public int getId() {
        return -1;
    }

    @Deprecated
    public boolean isLegacy() {
        return false;
    }

    @Override
    public NamespacedKey getKey() {
        return NamespacedKey.minecraft(this.type.getId().substring(10));
    }

    public int getMaxStackSize() {
        ItemType type;
        if(this.type instanceof ItemType){
            type = (ItemType) this.type;
        }else{
            Optional<ItemType> opItem = ((BlockType)this.type).getItem();
            if(!opItem.isPresent()){
                return 0;
            }
            type = opItem.get();
        }
        return type.getMaxStackQuantity();
    }

    public short getMaxDurability() {
        ItemType type;
        if(this.type instanceof ItemType){
            type = (ItemType) this.type;
        }else{
            Optional<ItemType> opItem = ((BlockType)this.type).getItem();
            if(!opItem.isPresent()){
                return 0;
            }
            type = opItem.get();
        }
        return type.getDefaultProperty(UseLimitProperty.class).get().getValue().shortValue();
    }

    public BlockData createBlockData() {
        return Bukkit.createBlockData(this);
    }

    public BlockData createBlockData(Consumer<BlockData> consumer) {
        return Bukkit.createBlockData(this, consumer);
    }

    public BlockData createBlockData(String data) throws IllegalArgumentException {
        return Bukkit.createBlockData(this, data);
    }

    @Deprecated
    public Class<? extends MaterialData> getData() {
        return MaterialData.class;
    }

    @Deprecated
    public MaterialData getNewData(final byte raw) {
        return null;
    }

    public boolean isBlock() {
        return this.type instanceof BlockType;
    }

    public boolean isEdible() {
        ItemType type;
        if(this.type instanceof ItemType){
            type = (ItemType) this.type;
        }else{
            Optional<ItemType> opItem = ((BlockType)this.type).getItem();
            if(!opItem.isPresent()){
                return false;
            }
            type = opItem.get();
        }
        return type.getDefaultProperty(FoodRestorationProperty.class).isPresent();
    }

    /**
     * @return True if this material represents a playable music disk.
     */
    public boolean isRecord() {
        ItemType type;
        if(this.type instanceof ItemType){
            type = (ItemType) this.type;
        }else{
            Optional<ItemType> opItem = ((BlockType)this.type).getItem();
            if(!opItem.isPresent()){
                return false;
            }
            type = opItem.get();
        }
        return type.getDefaultProperty(RecordProperty.class).isPresent();
    }

    /**
     * Check if the material is a block and solid (can be built upon)
     *
     * @return True if this material is a block and solid
     */
    public boolean isSolid() {
        BlockType type;
        if(this.type instanceof BlockType){
            type = (BlockType) this.type;
        }else{
            Optional<BlockType> opBlock = ((ItemType)this.type).getBlock();
            if(!opBlock.isPresent()){
                return false;
            }
            type = opBlock.get();
        }
        Optional<MatterProperty> opProp = type.getProperty(MatterProperty.class);
        if(!opProp.isPresent()){
            return false;
        }
        return opProp.get().getValue().equals(MatterProperty.Matter.SOLID);
    }

    @Deprecated
    public boolean isTransparent() {
        return false;
    }

    public boolean isFlammable() {
        BlockType type;
        if(this.type instanceof BlockType){
            type = (BlockType) this.type;
        }else{
            Optional<BlockType> opBlock = ((ItemType)this.type).getBlock();
            if(!opBlock.isPresent()){
                return false;
            }
            type = opBlock.get();
        }
        return type.getProperty(FlammableProperty.class).isPresent();
    }

    public boolean isBurnable() {
        return isFlammable();
    }

    public boolean isFuel() {
        ItemType type;
        if(this.type instanceof ItemType){
            type = (ItemType) this.type;
        }else{
            Optional<ItemType> opItem = ((BlockType)this.type).getItem();
            if(!opItem.isPresent()){
                return false;
            }
            type = opItem.get();
        }
        return type.getDefaultProperty(BurningFuelProperty.class).isPresent();
    }

    public boolean isOccluding() {
        //TODO
        return false;
    }

    public boolean hasGravity() {
        BlockType type;
        if(this.type instanceof BlockType){
            type = (BlockType) this.type;
        }else{
            Optional<BlockType> opBlock = ((ItemType)this.type).getBlock();
            if(!opBlock.isPresent()){
                return false;
            }
            type = opBlock.get();
        }
        return type.getProperty(GravityAffectedProperty.class).isPresent();
    }

    public boolean isItem() {
        return this.type instanceof ItemType;
    }

    public boolean isInteractable() {
        //TODO
        return false;
    }

    public float getHardness() {
        BlockType type;
        if(this.type instanceof BlockType){
            type = (BlockType) this.type;
        }else{
            Optional<BlockType> opBlock = ((ItemType)this.type).getBlock();
            if(!opBlock.isPresent()){
                return 0;
            }
            type = opBlock.get();
        }
        Optional<HardnessProperty> opProp = type.getProperty(HardnessProperty.class);
        if(opProp.isPresent()){
            return opProp.get().getValue().floatValue();
        }
        return 0;
    }

    /**
     * Obtains the blast resistance value (also known as block "durability").
     * <br>
     * This value is used in explosions to calculate whether a block should be
     * broken or not.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the blast resistance of that material.
     */
    public float getBlastResistance() {
        BlockType type;
        if(this.type instanceof BlockType){
            type = (BlockType) this.type;
        }else{
            Optional<BlockType> opBlock = ((ItemType)this.type).getBlock();
            if(!opBlock.isPresent()){
                return 0;
            }
            type = opBlock.get();
        }
        Optional<BlastResistanceProperty> opProp = type.getProperty(BlastResistanceProperty.class);
        if(opProp.isPresent()){
            return opProp.get().getValue().floatValue();
        }
        return 0;
    }

    public static Material getMaterial(CatalogType type){
        return Stream.of(Material.values())
                .filter(m -> m.getSpongeValue().isPresent())
                .filter(m -> m.getSpongeValue().get().equals(type))
                .findAny()
                .orElse(Material.UNKNOWN);
    }

    public static Material getMaterial(final String name) {
        return getMaterial(name, false);
    }

    public static Material getMaterial(String name, boolean legacyName) {
        return Material.valueOf(name.toUpperCase());
    }

    public static Material matchMaterial(final String name) {
        return matchMaterial(name, false);
    }

    public static Material matchMaterial(String name, boolean legacyName) {
        Validate.notNull(name, "Name cannot be null");
        if (name.startsWith(NamespacedKey.MINECRAFT + ":")) {
            name = name.substring((NamespacedKey.MINECRAFT + ":").length());
        }
        name = name.toUpperCase(Locale.ENGLISH).replaceAll("\\s+", "_").replaceAll("\\W", "");
        for(Material material : Material.values()){
            if(material.type.getName().equalsIgnoreCase(name)){
                return material;
            }
        }
        return null;
    }
}
