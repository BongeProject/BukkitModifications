package org.bukkit;

import org.bonge.Bonge;
import org.bonge.bukkit.r1_13.material.BlockMaterial;
import org.bonge.bukkit.r1_13.material.ItemMaterial;
import org.bonge.bukkit.r1_13.material.UnknownMaterial;
import org.bukkit.block.data.BlockData;
import org.bukkit.material.MaterialData;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.item.ItemTypes;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * An enum of all material IDs accepted by the official server and client
 */
public interface Material extends Keyed {

    Material ACACIA_BOAT = new ItemMaterial(ItemTypes.ACACIA_BOAT, "ACACIA_BOAT");
    Material ACACIA_BUTTON = new BlockMaterial(BlockTypes.WOODEN_BUTTON, "ACACIA_BUTTON");
    Material ACACIA_DOOR = new BlockMaterial(BlockTypes.ACACIA_DOOR, "ACACIA_DOOR");
    Material ACACIA_FENCE = new BlockMaterial(BlockTypes.ACACIA_FENCE, "ACACIA_FENCE");
    Material ACACIA_FENCE_GATE = new BlockMaterial(BlockTypes.ACACIA_FENCE_GATE, "ACACIA_FENCE_GATE");
    Material ACACIA_LEAVES = new BlockMaterial(BlockTypes.LEAVES, "ACACIA_LEAVES");
    Material ACACIA_LOG = new BlockMaterial(BlockTypes.LOG, "ACACIA_LOG");
    Material ACACIA_PLANKS = new BlockMaterial(BlockTypes.PLANKS, "ACACIA_PLANKS");
    Material ACACIA_PRESSURE_PLATE = new BlockMaterial(BlockTypes.WOODEN_PRESSURE_PLATE, "ACACIA_PRESSURE_PLATE");
    Material ACACIA_SAPLING = new BlockMaterial(BlockTypes.SAPLING, "ACACIA_SAPLING");
    Material ACACIA_SLAB = new BlockMaterial(BlockTypes.WOODEN_SLAB, "ACACIA_SLAB");
    Material ACACIA_STAIRS = new BlockMaterial(BlockTypes.ACACIA_STAIRS, "ACACIA_STAIRS");
    Material ACACIA_TRAPDOOR = new BlockMaterial(BlockTypes.TRAPDOOR, "ACACIA_TRAPDOOR");
    //ACACIA_WOOD = new BlockMaterial(BlockTypes.LOG);
    Material ACTIVATOR_RAIL = new BlockMaterial(BlockTypes.ACTIVATOR_RAIL, "ACTIVATOR_RAIL");
    Material AIR = new BlockMaterial(BlockTypes.AIR, "AIR");
    //ALLIUM = new BlockMaterial(BlockTypes.ALLIUM);
    //ANDESITE(25975);
    Material ANVIL = new BlockMaterial(BlockTypes.ANVIL, "ANVIL");
    Material APPLE = new ItemMaterial(ItemTypes.APPLE, "APPLE");
    Material ARMOR_STAND = new ItemMaterial(ItemTypes.ARMOR_STAND, "ARMOR_STAND");
    Material ARROW = new ItemMaterial(ItemTypes.ARROW, "ARROW");
    Material ATTACHED_MELON_STEM = new BlockMaterial(BlockTypes.MELON_STEM, "ATTACHED_MELON_STEM");
    Material ATTACHED_PUMPKIN_STEM = new BlockMaterial(BlockTypes.PUMPKIN_STEM, "ATTACHED_PUMPKIN_STEM");
    //AZURE_BLUET(17608);
    Material BAKED_POTATO = new ItemMaterial(ItemTypes.BAKED_POTATO, "BAKED_POTATO");
    Material BARRIER = new BlockMaterial(BlockTypes.BARRIER, "BARRIER");
    //BAT_SPAWN_EGG(14607);
    Material BEACON = new BlockMaterial(BlockTypes.BEACON, "BEACON");
    Material BEDROCK = new BlockMaterial(BlockTypes.BEDROCK, "BEDROCK");
    Material BEEF = new ItemMaterial(ItemTypes.BEEF, "BEEF");
    Material BEETROOT = new ItemMaterial(ItemTypes.BEETROOT, "BEETROOT");
    //BEETROOTS(22075, Ageable.class);
    Material BEETROOT_SEEDS = new ItemMaterial(ItemTypes.BEETROOT_SEEDS, "BEETROOT_SEEDS");
    Material BEETROOT_SOUP = new ItemMaterial(ItemTypes.BEETROOT_SOUP, "BEETROOT_SOUP");
    /*BIRCH_BOAT(28104, 1);
    BIRCH_BUTTON(26934, Switch.class);
    BIRCH_DOOR(14759, Door.class);
    BIRCH_FENCE(17347, Fence.class);
    BIRCH_FENCE_GATE(6322, Gate.class);
    BIRCH_LEAVES(12601, Leaves.class);
    BIRCH_LOG(26727, Orientable.class);
    BIRCH_PLANKS(29322);
    BIRCH_PRESSURE_PLATE(9664, Powerable.class);
    BIRCH_SAPLING(31533, Sapling.class);
    BIRCH_SLAB(13807, Slab.class);
    BIRCH_STAIRS(7657, Stairs.class);
    BIRCH_TRAPDOOR(32585, TrapDoor.class);
    BIRCH_WOOD(20913, Orientable.class);
    BLACK_BANNER(9365, 16, Rotatable.class);
    BLACK_BED(20490, 1, Bed.class);
    BLACK_CARPET(6056);
    BLACK_CONCRETE(13338);
    BLACK_CONCRETE_POWDER(16150);
    BLACK_GLAZED_TERRACOTTA(29678, Directional.class);
    BLACK_SHULKER_BOX(24076, 1, Directional.class);
    BLACK_STAINED_GLASS(13941);
    BLACK_STAINED_GLASS_PANE(13201, GlassPane.class);
    BLACK_TERRACOTTA(26691);
    BLACK_WALL_BANNER(4919, Directional.class);
    BLACK_WOOL(16693);
    BLAZE_POWDER(18941);
    BLAZE_ROD(8289);
    BLAZE_SPAWN_EGG(4759);
    BLUE_BANNER(18481, 16, Rotatable.class);
    BLUE_BED(12714, 1, Bed.class);
    BLUE_CARPET(13292);
    BLUE_CONCRETE(18756);
    BLUE_CONCRETE_POWDER(17773);
    BLUE_GLAZED_TERRACOTTA(23823, Directional.class);
    BLUE_ICE(22449);
    BLUE_ORCHID(13432);
    BLUE_SHULKER_BOX(11476, 1, Directional.class);
    BLUE_STAINED_GLASS(7107);
    BLUE_STAINED_GLASS_PANE(28484, GlassPane.class);
    BLUE_TERRACOTTA(5236);
    BLUE_WALL_BANNER(17757, Directional.class);
    BLUE_WOOL(15738);*/
    Material BONE = new ItemMaterial(ItemTypes.BONE, "BONE");
    Material BONE_BLOCK = new BlockMaterial(BlockTypes.BONE_BLOCK, "BONE_BLOCK");
    //BONE_MEAL();
    Material BOOK = new ItemMaterial(ItemTypes.BOOK, "BOOK");
    Material BOOKSHELF = new ItemMaterial(ItemTypes.BOOKSHELF, "BOOKSHELF");
    Material BOW = new ItemMaterial(ItemTypes.BOW, "BOW");
    Material BOWL = new ItemMaterial(ItemTypes.BOWL, "BOWL");
    /*BRAIN_CORAL(31316, Waterlogged.class);
    BRAIN_CORAL_BLOCK(30618);
    BRAIN_CORAL_FAN(13849, Waterlogged.class);
    BRAIN_CORAL_WALL_FAN(22685, CoralWallFan.class);*/
    Material BREAD = new ItemMaterial(ItemTypes.BREAD, "BREAD");
    Material BREWING_STAND = new ItemMaterial(ItemTypes.BREWING_STAND, "BREWING_STAND");
    Material BRICK = new ItemMaterial(ItemTypes.BRICK, "BRICK");
    Material BRICKS = new BlockMaterial(BlockTypes.BRICK_BLOCK, "BRICKS");
    //Material BRICK_SLAB = new BlockMaterial(BlockTypes.BRICK_);
    Material BRICK_STAIRS = new BlockMaterial(BlockTypes.BRICK_STAIRS, "BRICK_STAIRS");
    /*BROWN_BANNER(11481, 16, Rotatable.class);
    BROWN_BED(25624, 1, Bed.class);
    BROWN_CARPET(23352);
    BROWN_CONCRETE(19006);
    BROWN_CONCRETE_POWDER(21485);
    BROWN_GLAZED_TERRACOTTA(5655, Directional.class);
    BROWN_MUSHROOM(9665);
    BROWN_MUSHROOM_BLOCK(6291, MultipleFacing.class);
    BROWN_SHULKER_BOX(24230, 1, Directional.class);
    BROWN_STAINED_GLASS(20945);
    BROWN_STAINED_GLASS_PANE(17557, GlassPane.class);
    BROWN_TERRACOTTA(23664);
    BROWN_WALL_BANNER(14731, Directional.class);
    BROWN_WOOL(32638);
    BUBBLE_COLUMN(13758, BubbleColumn.class);
    BUBBLE_CORAL(12464, Waterlogged.class);
    BUBBLE_CORAL_BLOCK(15437);
    BUBBLE_CORAL_FAN(10795, Waterlogged.class);
    BUBBLE_CORAL_WALL_FAN(20382, CoralWallFan.class);*/
    Material BUCKET = new ItemMaterial(ItemTypes.BUCKET, "BUCKET");
    Material CACTUS = new BlockMaterial(BlockTypes.CACTUS, "CACTUS");
    //CACTUS_GREEN(17296);
    Material CAKE = new BlockMaterial(BlockTypes.CAKE, "CAKE");
    Material CARROT = new ItemMaterial(ItemTypes.CARROT, "CARROT");
    Material CARROTS = new BlockMaterial(BlockTypes.CARROTS, "CARROTS");
    Material CARROT_ON_A_STICK = new ItemMaterial(ItemTypes.CARROT_ON_A_STICK, "CARROT_ON_A_STICK");
    Material CARVED_PUMPKIN = new ItemMaterial(ItemTypes.PUMPKIN, "CARVED_PUMPKIN");
    Material CAULDRON = new BlockMaterial(BlockTypes.CAULDRON, "CAULDRON");
    //Material CAVE_AIR = new BlockMaterial(ItemTypes.AIR);
    //CAVE_SPIDER_SPAWN_EGG(23341);
    Material CHAINMAIL_BOOTS = new ItemMaterial(ItemTypes.CHAINMAIL_BOOTS, "CHAINMAIL_BOOTS");
    Material CHAINMAIL_CHESTPLATE = new ItemMaterial(ItemTypes.CHAINMAIL_CHESTPLATE, "CHAINMAIL_CHESTPLATE");
    Material CHAINMAIL_HELMET = new ItemMaterial(ItemTypes.CHAINMAIL_HELMET, "CHAINMAIL_HELMET");
    Material CHAINMAIL_LEGGINGS = new ItemMaterial(ItemTypes.CHAINMAIL_LEGGINGS, "CHAINMAIL_LEGGINGS");
    /*CHAIN_COMMAND_BLOCK(26798, CommandBlock.class);
    CHARCOAL(5390);*/
    Material CHEST = new BlockMaterial(BlockTypes.CHEST, "CHEST");
    Material CHEST_MINECART = new ItemMaterial(ItemTypes.CHEST_MINECART, "CHEST_MINECART");
    Material CHICKEN = new ItemMaterial(ItemTypes.CHICKEN, "CHICKEN");
    /*CHICKEN_SPAWN_EGG(5462);
    CHIPPED_ANVIL(10623, Directional.class);
    CHISELED_QUARTZ_BLOCK(30964);
    CHISELED_RED_SANDSTONE(15529);
    CHISELED_SANDSTONE(31763);
    CHISELED_STONE_BRICKS(9087);
    CHORUS_FLOWER(28542, Ageable.class);
    CHORUS_FRUIT(7652);
    CHORUS_PLANT(28243, MultipleFacing.class);*/
    Material CLAY = new ItemMaterial(ItemTypes.CLAY, "CLAY");
    Material CLAY_BALL = new ItemMaterial(ItemTypes.CLAY_BALL, "CLAY_BALL");
    Material CLOCK = new ItemMaterial(ItemTypes.CLOCK, "CLOCK");
    Material COAL = new ItemMaterial(ItemTypes.COAL, "COAL");
    Material COAL_BLOCK = new ItemMaterial(ItemTypes.COAL_BLOCK, "COAL_BLOCK");
    Material COAL_ORE = new BlockMaterial(BlockTypes.COAL_ORE, "COAL_ORE");
    //Material COARSE_DIRT = new BlockMaterial(BlockTypes.COARSE_DIRT, "COARSE_DIRT");
    Material COBBLESTONE = new BlockMaterial(BlockTypes.COBBLESTONE, "COBBLESTONE");
    //Material COBBLESTONE_SLAB = new BlockMaterial(BlockTypes.COBBLESTONE_SLAB, "COBBLESTONE_SLAB");
    //Material COBBLESTONE_STAIRS = new BlockMaterial(BlockTypes.COBBLESTONE_STAIRS, "COBBLESTONE_STAIRS");
    Material COBBLESTONE_WALL = new BlockMaterial(BlockTypes.COBBLESTONE_WALL, "COBBLESTONE_WALL");
    Material COBWEB = new BlockMaterial(BlockTypes.WEB, "COBWEB");
    Material COCOA = new BlockMaterial(BlockTypes.COCOA, "COCOA");
    //Material COCOA_BEANS = new BlockMaterial(BlockTypes.COC);
    /*COD(24691);
    COD_BUCKET(28601, 1);
    COD_SPAWN_EGG(27248);
    COMMAND_BLOCK(4355, CommandBlock.class);
    COMMAND_BLOCK_MINECART(7992, 1);*/
    Material COMPARATOR = new BlockMaterial(BlockTypes.UNPOWERED_COMPARATOR, "COMPARATOR");
    Material COMPASS = new ItemMaterial(ItemTypes.COMPASS, "COMPASS");
    /*CONDUIT(5148, Waterlogged.class);
    COOKED_BEEF(21595);
    COOKED_CHICKEN(20780);
    COOKED_COD(9681);
    COOKED_MUTTON(31447);
    COOKED_PORKCHOP(27231);
    COOKED_RABBIT(4454);
    COOKED_SALMON(5615);
    COOKIE(27431);
    COW_SPAWN_EGG(14761);
    CRACKED_STONE_BRICKS(27869);*/
    Material CRAFTING_TABLE = new BlockMaterial(BlockTypes.CRAFTING_TABLE, "CRAFTING_TABLE");
    Material CREEPER_HEAD = new BlockMaterial(BlockTypes.SKULL, "CREEPER_HEAD"); //required for Bukkit API 1.13
    /*CREEPER_SPAWN_EGG(9653);
    CREEPER_WALL_HEAD = new BlockMaterial(BlockTypes.SKULL);
    CUT_RED_SANDSTONE(26842);
    CUT_SANDSTONE(6118);
    CYAN_BANNER(9839, 16, Rotatable.class);
    CYAN_BED(16746, 1, Bed.class);
    CYAN_CARPET(31495);
    CYAN_CONCRETE(26522);
    CYAN_CONCRETE_POWDER(15734);
    CYAN_DYE(8043);
    CYAN_GLAZED_TERRACOTTA(9550, Directional.class);
    CYAN_SHULKER_BOX(28123, 1, Directional.class);
    CYAN_STAINED_GLASS(30604);
    CYAN_STAINED_GLASS_PANE(11784, GlassPane.class);
    CYAN_TERRACOTTA(25940);
    CYAN_WALL_BANNER(10889, Directional.class);
    CYAN_WOOL(12221);
    DAMAGED_ANVIL(10274, Directional.class);
    DANDELION(30558);
    DANDELION_YELLOW(21789);
    DARK_OAK_BOAT(28618, 1);
    DARK_OAK_BUTTON(6214, Switch.class);
    DARK_OAK_DOOR(10669, Door.class);
    DARK_OAK_FENCE(21767, Fence.class);
    DARK_OAK_FENCE_GATE(10679, Gate.class);
    DARK_OAK_LEAVES(22254, Leaves.class);
    DARK_OAK_LOG(14831, Orientable.class);
    DARK_OAK_PLANKS(20869);
    DARK_OAK_PRESSURE_PLATE(31375, Powerable.class);
    DARK_OAK_SAPLING(14933, Sapling.class);
    DARK_OAK_SLAB(28852, Slab.class);
    DARK_OAK_STAIRS(22921, Stairs.class);
    DARK_OAK_TRAPDOOR(10355, TrapDoor.class);
    DARK_OAK_WOOD(16995, Orientable.class);
    DARK_PRISMARINE(19940);
    DARK_PRISMARINE_SLAB(7577, Slab.class);
    DARK_PRISMARINE_STAIRS(26511, Stairs.class);
    DAYLIGHT_DETECTOR(8864, DaylightDetector.class);
    DEAD_BRAIN_CORAL(9116, Waterlogged.class);
    DEAD_BRAIN_CORAL_BLOCK(12979);
    DEAD_BRAIN_CORAL_FAN(26150, Waterlogged.class);
    DEAD_BRAIN_CORAL_WALL_FAN(23718, CoralWallFan.class);
    DEAD_BUBBLE_CORAL(30583, Waterlogged.class);
    DEAD_BUBBLE_CORAL_BLOCK(28220);
    DEAD_BUBBLE_CORAL_FAN(17322, Waterlogged.class);
    DEAD_BUBBLE_CORAL_WALL_FAN(18453, CoralWallFan.class);
    DEAD_BUSH(22888);
    DEAD_FIRE_CORAL(8365, Waterlogged.class);
    DEAD_FIRE_CORAL_BLOCK(5307);
    DEAD_FIRE_CORAL_FAN(27073, Waterlogged.class);
    DEAD_FIRE_CORAL_WALL_FAN(23375, CoralWallFan.class);
    DEAD_HORN_CORAL(5755, Waterlogged.class);
    DEAD_HORN_CORAL_BLOCK(15103);
    DEAD_HORN_CORAL_FAN(11387, Waterlogged.class);
    DEAD_HORN_CORAL_WALL_FAN(27550, CoralWallFan.class);
    DEAD_TUBE_CORAL(18028, Waterlogged.class);
    DEAD_TUBE_CORAL_BLOCK(28350);
    DEAD_TUBE_CORAL_FAN(17628, Waterlogged.class);
    DEAD_TUBE_CORAL_WALL_FAN(5128, CoralWallFan.class);
    DEBUG_STICK(24562, 1);*/
    Material DETECTOR_RAIL = new BlockMaterial(BlockTypes.DETECTOR_RAIL, "DETECTOR_RAIL");
    Material DIAMOND = new ItemMaterial(ItemTypes.DIAMOND, "DIAMOND");
    Material DIAMOND_AXE = new ItemMaterial(ItemTypes.DIAMOND_AXE, "DIAMOND_AXE");
    Material DIAMOND_BLOCK = new BlockMaterial(BlockTypes.DIAMOND_BLOCK, "DIAMOND_BLOCK");
    Material DIAMOND_BOOTS = new ItemMaterial(ItemTypes.DIAMOND_BOOTS, "DIAMOND_BOOTS");
    Material DIAMOND_CHESTPLATE = new ItemMaterial(ItemTypes.DIAMOND_CHESTPLATE, "DIAMOND_CHESTPLATE");
    Material DIAMOND_HELMET = new ItemMaterial(ItemTypes.DIAMOND_HELMET, "DIAMOND_HELMET");
    Material DIAMOND_HOE = new ItemMaterial(ItemTypes.DIAMOND_HOE, "DIAMOND_HOE");
    Material DIAMOND_HORSE_ARMOR = new ItemMaterial(ItemTypes.DIAMOND_HORSE_ARMOR, "DIAMOND_HORSE_ARMOR");
    Material DIAMOND_LEGGINGS = new ItemMaterial(ItemTypes.DIAMOND_LEGGINGS, "DIAMOND_LEGGINGS");
    Material DIAMOND_ORE = new BlockMaterial(BlockTypes.DIAMOND_ORE, "DIAMOND_ORE");
    Material DIAMOND_PICKAXE = new ItemMaterial(ItemTypes.DIAMOND_PICKAXE, "DIAMOND_PICKAXE");
    Material DIAMOND_SHOVEL = new ItemMaterial(ItemTypes.DIAMOND_SHOVEL, "DIAMOND_SHOVEL");
    Material DIAMOND_SWORD = new ItemMaterial(ItemTypes.DIAMOND_SWORD, "DIAMOND_SWORD");
    //Material DIORITE = new BlockMaterial(BlockTypes.DIORITE, "DIORITE");
    Material DIRT = new BlockMaterial(BlockTypes.DIRT, "DIRT");
    Material DISPENSER = new BlockMaterial(BlockTypes.DISPENSER, "DISPENSER");
    /*DOLPHIN_SPAWN_EGG(20787);
    DONKEY_SPAWN_EGG(14513);
    DRAGON_BREATH(20154);*/
    Material DRAGON_EGG = new BlockMaterial(BlockTypes.DRAGON_EGG, "DRAGON_EGG");
    Material DRAGON_HEAD = new BlockMaterial(BlockTypes.SKULL, "DRAGON_HEAD"); //required for Bukkit API 1.13
    /*DRAGON_WALL_HEAD = new BlockMaterial(BlockTypes.SKULL);
    DRIED_KELP(21042);
    DRIED_KELP_BLOCK(12966);*/
    Material DROPPER = new BlockMaterial(BlockTypes.DROPPER, "DROPPER");
    //DROWNED_SPAWN_EGG(19368);
    Material EGG = new ItemMaterial(ItemTypes.EGG, "EGG");
    //ELDER_GUARDIAN_SPAWN_EGG(11418);
    Material ELYTRA = new ItemMaterial(ItemTypes.ELYTRA, "ELYTRA");
    Material EMERALD = new ItemMaterial(ItemTypes.EMERALD, "EMERALD");
    Material EMERALD_BLOCK = new BlockMaterial(BlockTypes.EMERALD_BLOCK, "EMERALD_BLOCK");
    Material EMERALD_ORE = new BlockMaterial(BlockTypes.EMERALD_ORE, "EMERALD_ORE");
    Material ENCHANTED_BOOK = new ItemMaterial(ItemTypes.ENCHANTED_BOOK, "ENCHANTED_BOOK");
    //ENCHANTED_GOLDEN_APPLE(8280);
    Material ENCHANTING_TABLE = new BlockMaterial(BlockTypes.ENCHANTING_TABLE, "ENCHANTING_TABLE");
    /*ENDERMAN_SPAWN_EGG(29488);
    ENDERMITE_SPAWN_EGG(16617);*/
    Material ENDER_CHEST = new BlockMaterial(BlockTypes.ENDER_CHEST, "ENDER_CHEST");
    Material ENDER_EYE = new ItemMaterial(ItemTypes.ENDER_EYE, "ENDER_EYE");
    Material ENDER_PEARL = new ItemMaterial(ItemTypes.ENDER_PEARL, "ENDER_PEARL");
    Material END_CRYSTAL = new ItemMaterial(ItemTypes.END_CRYSTAL, "END_CRYSTAL");
    Material END_GATEWAY = new BlockMaterial(BlockTypes.END_GATEWAY, "END_GATEWAY");
    Material END_PORTAL = new BlockMaterial(BlockTypes.END_PORTAL, "END_PORTAL");
    Material END_PORTAL_FRAME = new BlockMaterial(BlockTypes.END_PORTAL_FRAME, "END_PORTAL_FRAME");
    Material END_ROD = new ItemMaterial(ItemTypes.END_ROD, "END_ROD");
    Material END_STONE = new ItemMaterial(ItemTypes.END_STONE, "END_STONE");
    Material END_STONE_BRICKS = new BlockMaterial(BlockTypes.END_STONE, "END_STONE_BRICKS");
    //EVOKER_SPAWN_EGG(21271);
    Material EXPERIENCE_BOTTLE = new ItemMaterial(ItemTypes.EXPERIENCE_BOTTLE, "EXPERIENCE_BOTTLE");
    Material FARMLAND = new BlockMaterial(BlockTypes.FARMLAND, "FARMLAND");
    Material FEATHER = new ItemMaterial(ItemTypes.FEATHER, "FEATHER");
    /*FERMENTED_SPIDER_EYE(19386);
    FERN(15794);*/
    Material FILLED_MAP = new ItemMaterial(ItemTypes.FILLED_MAP, "FILLED_MAP");
    Material FIRE = new BlockMaterial(BlockTypes.FIRE, "FIRE");
    //Material FIREWORK_ROCKET = new ItemMaterial(ItemTypes.FIREWO23841);
    //Material FIREWORK_STAR = new ItemMaterial(ItemTypes.12190);
    Material FIRE_CHARGE = new ItemMaterial(ItemTypes.FIRE_CHARGE, "FIRE_CHARGE");
    /*FIRE_CORAL(29151, Waterlogged.class);
    FIRE_CORAL_BLOCK(12119);
    FIRE_CORAL_FAN(11112, Waterlogged.class);
    FIRE_CORAL_WALL_FAN(20100, CoralWallFan.class);*/
    Material FISHING_ROD = new ItemMaterial(ItemTypes.FISHING_ROD, "FISHING_ROD");
    Material FLINT = new ItemMaterial(ItemTypes.FLINT, "FLINT");
    Material FLINT_AND_STEEL = new ItemMaterial(ItemTypes.FLINT_AND_STEEL, "FLINT_AND_STEEL");
    Material FLOWER_POT = new ItemMaterial(ItemTypes.FLOWER_POT, "FLOWER_POT");
    Material FROSTED_ICE = new BlockMaterial(BlockTypes.FROSTED_ICE, "FROSTED_ICE");
    Material FURNACE = new ItemMaterial(ItemTypes.FURNACE, "FURNACE");
    Material FURNACE_MINECART = new ItemMaterial(ItemTypes.FURNACE_MINECART, "FURNACE_MINECART");
    //GHAST_SPAWN_EGG(9970);
    Material GHAST_TEAR = new ItemMaterial(ItemTypes.GHAST_TEAR, "GHAST_TEAR");
    Material GLASS = new BlockMaterial(BlockTypes.GLASS, "GLASS");
    Material GLASS_BOTTLE = new ItemMaterial(ItemTypes.GLASS_BOTTLE, "GLASS_BOTTLE");
    Material GLASS_PANE = new BlockMaterial(BlockTypes.GLASS_PANE, "GLASS_PANE");
    //GLISTERING_MELON_SLICE(20158);
    Material GLOWSTONE = new BlockMaterial(BlockTypes.GLOWSTONE, "GLOWSTONE");
    Material GLOWSTONE_DUST = new ItemMaterial(ItemTypes.GLOWSTONE_DUST, "GLOWSTONE_DUST");
    Material GOLDEN_APPLE = new ItemMaterial(ItemTypes.GOLDEN_APPLE, "GOLDEN_APPLE");
    Material GOLDEN_AXE = new ItemMaterial(ItemTypes.GOLDEN_AXE, "GOLDEN_AXE");
    Material GOLDEN_BOOTS = new ItemMaterial(ItemTypes.GOLDEN_BOOTS, "GOLDEN_BOOTS");
    //GOLDEN_CARROT(5300);
    Material GOLDEN_CHESTPLATE = new ItemMaterial(ItemTypes.GOLDEN_CHESTPLATE, "GOLDEN_CHESTPLATE");
    Material GOLDEN_HELMET = new ItemMaterial(ItemTypes.GOLDEN_HELMET, "GOLDEN_HELMET");
    Material GOLDEN_HOE = new ItemMaterial(ItemTypes.GOLDEN_HOE, "GOLDEN_HOE");
    /*GOLDEN_HORSE_ARMOR(7996, 1);*/
    Material GOLDEN_LEGGINGS = new ItemMaterial(ItemTypes.GOLDEN_LEGGINGS, "GOLDEN_LEGGINGS");
    Material GOLDEN_PICKAXE = new ItemMaterial(ItemTypes.GOLDEN_PICKAXE, "GOLDEN_PICKAXE");
    Material GOLDEN_SHOVEL = new ItemMaterial(ItemTypes.GOLDEN_SHOVEL, "GOLDEN_SHOVEL");
    Material GOLDEN_SWORD = new ItemMaterial(ItemTypes.GOLDEN_SWORD, "GOLDEN_SWORD");
    Material GOLD_BLOCK = new BlockMaterial(BlockTypes.GOLD_BLOCK, "GOLD_BLOCK");
    Material GOLD_INGOT = new ItemMaterial(ItemTypes.GOLD_INGOT, "GOLD_INGOT");
    Material GOLD_NUGGET = new ItemMaterial(ItemTypes.GOLD_NUGGET, "GOLD_NUGGET");
    Material GOLD_ORE = new BlockMaterial(BlockTypes.GOLD_ORE, "GOLD_ORE");
    //Material GRANITE = new BlockMaterial(BlockTypes.GRANITE, "GRANITE");
    //Material GRASS = new ItemMaterial(BlockTypes.GRASS, "GRASS");
    Material GRASS_BLOCK = new BlockMaterial(BlockTypes.GRASS, "GRASS_BLOCK");
    Material GRASS_PATH = new BlockMaterial(BlockTypes.GRASS_PATH, "GRASS_PATH");
    Material GRAVEL = new BlockMaterial(BlockTypes.GRAVEL, "GRAVEL");
    /*GRAY_BANNER(12053, 16, Rotatable.class);
    GRAY_BED(15745, 1, Bed.class);
    GRAY_CARPET(26991);
    GRAY_CONCRETE(13959);
    GRAY_CONCRETE_POWDER(13031);
    GRAY_DYE(9184);
    GRAY_GLAZED_TERRACOTTA(6256, Directional.class);
    GRAY_SHULKER_BOX(12754, 1, Directional.class);
    GRAY_STAINED_GLASS(29979);
    GRAY_STAINED_GLASS_PANE(25272, GlassPane.class);
    GRAY_TERRACOTTA(18004);
    GRAY_WALL_BANNER(24275, Directional.class);
    GRAY_WOOL(27209);
    GREEN_BANNER(10698, 16, Rotatable.class);
    GREEN_BED(13797, 1, Bed.class);
    GREEN_CARPET(7780);
    GREEN_CONCRETE(17949);
    GREEN_CONCRETE_POWDER(6904);
    GREEN_GLAZED_TERRACOTTA(6958, Directional.class);
    GREEN_SHULKER_BOX(9377, 1, Directional.class);
    GREEN_STAINED_GLASS(22503);
    GREEN_STAINED_GLASS_PANE(4767, GlassPane.class);
    GREEN_TERRACOTTA(4105);
    GREEN_WALL_BANNER(15046, Directional.class);
    GREEN_WOOL(25085);
    GUARDIAN_SPAWN_EGG(20113);*/
    Material GUNPOWDER = new ItemMaterial(ItemTypes.GUNPOWDER, "GUNPOWDER");
    Material HAY_BLOCK = new BlockMaterial(BlockTypes.HAY_BLOCK, "HAY_BLOCK");
    //HEART_OF_THE_SEA(11807);
    Material HEAVY_WEIGHTED_PRESSURE_PLATE = new BlockMaterial(BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE, "HEAVY_WEIGHTED_PRESSURE_PLATE");
    Material HOPPER = new BlockMaterial(BlockTypes.HOPPER, "HOPPER");
    Material HOPPER_MINECART = new ItemMaterial(ItemTypes.HOPPER_MINECART, "HOPPER_MINECART");
    /*HORN_CORAL(19511, Waterlogged.class);
    HORN_CORAL_BLOCK(19958);
    HORN_CORAL_FAN(13610, Waterlogged.class);
    HORN_CORAL_WALL_FAN(28883, CoralWallFan.class);
    HORSE_SPAWN_EGG(25981);
    HUSK_SPAWN_EGG(20178);*/
    Material ICE = new BlockMaterial(BlockTypes.ICE, "ICE");
    /*INFESTED_CHISELED_STONE_BRICKS(4728);
    INFESTED_COBBLESTONE(28798);
    INFESTED_CRACKED_STONE_BRICKS(7476);
    INFESTED_MOSSY_STONE_BRICKS(9850);
    INFESTED_STONE(18440);
    INFESTED_STONE_BRICKS(19749);*/
    //Material INK_SAC = new ItemMaterial();
    Material IRON_AXE = new ItemMaterial(ItemTypes.IRON_AXE, "IRON_AXE");
    Material IRON_BARS = new ItemMaterial(ItemTypes.IRON_BARS, "IRON_BARS");
    Material IRON_BLOCK = new BlockMaterial(BlockTypes.IRON_BLOCK, "IRON_BLOCK");
    Material IRON_BOOTS = new ItemMaterial(ItemTypes.IRON_BOOTS, "IRON_BOOTS");
    Material IRON_CHESTPLATE = new ItemMaterial(ItemTypes.IRON_CHESTPLATE, "IRON_CHESTPLATE");
    Material IRON_DOOR = new BlockMaterial(BlockTypes.IRON_DOOR, "IRON_DOOR");
    Material IRON_HELMET = new ItemMaterial(ItemTypes.IRON_HELMET, "IRON_HELMET");
    Material IRON_HOE = new ItemMaterial(ItemTypes.IRON_HOE, "IRON_HOE");
    Material IRON_HORSE_ARMOR = new ItemMaterial(ItemTypes.IRON_HORSE_ARMOR, "IRON_HORSE_ARMOR");
    Material IRON_INGOT = new ItemMaterial(ItemTypes.IRON_INGOT, "IRON_INGOT");
    Material IRON_LEGGINGS = new ItemMaterial(ItemTypes.IRON_LEGGINGS, "IRON_LEGGINGS");
    Material IRON_NUGGET = new ItemMaterial(ItemTypes.IRON_NUGGET, "IRON_NUGGETS");
    Material IRON_ORE = new BlockMaterial(BlockTypes.IRON_ORE, "IRON_ORE");
    Material IRON_PICKAXE = new ItemMaterial(ItemTypes.IRON_PICKAXE, "IRON_PICKAXE");
    Material IRON_SHOVEL = new ItemMaterial(ItemTypes.IRON_SHOVEL, "IRON_SHOVEL");
    Material IRON_SWORD = new ItemMaterial(ItemTypes.IRON_SWORD, "IRON_SWORD");
    Material IRON_TRAPDOOR = new BlockMaterial(BlockTypes.IRON_TRAPDOOR, "IRON_TRAPDOOR");
    Material ITEM_FRAME = new ItemMaterial(ItemTypes.ITEM_FRAME, "IRON_FRAME");
    Material JACK_O_LANTERN = new ItemMaterial(ItemTypes.LIT_PUMPKIN, "JACK_O_LANTERN");
    Material JUKEBOX = new BlockMaterial(BlockTypes.JUKEBOX, "JUKEBOX");
    /*JUNGLE_BOAT(4495, 1);
    JUNGLE_BUTTON(25317, Switch.class);
    JUNGLE_DOOR(28163, Door.class);
    JUNGLE_FENCE(14358, Fence.class);
    JUNGLE_FENCE_GATE(21360, Gate.class);
    JUNGLE_LEAVES(5133, Leaves.class);
    JUNGLE_LOG(20721, Orientable.class);
    JUNGLE_PLANKS(26445);
    JUNGLE_PRESSURE_PLATE(11376, Powerable.class);
    JUNGLE_SAPLING(17951, Sapling.class);
    JUNGLE_SLAB(19117, Slab.class);
    JUNGLE_STAIRS(20636, Stairs.class);
    JUNGLE_TRAPDOOR(8626, TrapDoor.class);
    JUNGLE_WOOD(10341, Orientable.class);
    KELP(21916, Ageable.class);
    KELP_PLANT(29697);
    KNOWLEDGE_BOOK(12646, 1);*/
    Material LADDER = new BlockMaterial(BlockTypes.LADDER, "LADDER");
    Material LAPIS_BLOCK = new BlockMaterial(BlockTypes.LAPIS_BLOCK, "LAPIS_BLOCK");
    //Material LAPIS_LAZULI = new ItemMaterial(ItemTypes.LAZULI);
    Material LAPIS_ORE = new BlockMaterial(BlockTypes.LAPIS_ORE, "LAPIS_ORE");
    //Material LARGE_FERN = new ItemMaterial(BlockTypes, "LARGE_FERN");
    Material LAVA = new BlockMaterial(BlockTypes.LAVA, "LAVA");
    Material LAVA_BUCKET = new ItemMaterial(ItemTypes.LAVA_BUCKET, "LAVA_BUCKET");
    Material LEAD = new ItemMaterial(ItemTypes.LEAD, "LEAD");
    Material LEATHER = new ItemMaterial(ItemTypes.LEATHER, "LEATHER");
    Material LEATHER_BOOTS = new ItemMaterial(ItemTypes.LEATHER_BOOTS, "LEATHER_BOOTS");
    Material LEATHER_CHESTPLATE = new ItemMaterial(ItemTypes.LEATHER_CHESTPLATE, "LEATHER_CHESTPLATE");
    Material LEATHER_HELMET = new ItemMaterial(ItemTypes.LEATHER_HELMET, "LEATHER_HELMET");
    Material LEATHER_LEGGINGS = new ItemMaterial(ItemTypes.LEATHER_LEGGINGS, "LEATHER_LEGGINGS");
    Material LEVER = new BlockMaterial(BlockTypes.LEVER, "LEVER");
    /*LIGHT_BLUE_BANNER(18060, 16, Rotatable.class);
    LIGHT_BLUE_BED(20957, 1, Bed.class);
    LIGHT_BLUE_CARPET(21194);
    LIGHT_BLUE_CONCRETE(29481);
    LIGHT_BLUE_CONCRETE_POWDER(31206);
    LIGHT_BLUE_DYE(28738);
    LIGHT_BLUE_GLAZED_TERRACOTTA(4336, Directional.class);
    LIGHT_BLUE_SHULKER_BOX(18226, 1, Directional.class);
    LIGHT_BLUE_STAINED_GLASS(17162);
    LIGHT_BLUE_STAINED_GLASS_PANE(18721, GlassPane.class);
    LIGHT_BLUE_TERRACOTTA(31779);
    LIGHT_BLUE_WALL_BANNER(12011, Directional.class);
    LIGHT_BLUE_WOOL(21073);
    LIGHT_GRAY_BANNER(11417, 16, Rotatable.class);
    LIGHT_GRAY_BED(5090, 1, Bed.class);
    LIGHT_GRAY_CARPET(11317);
    LIGHT_GRAY_CONCRETE(14453);
    LIGHT_GRAY_CONCRETE_POWDER(21589);
    LIGHT_GRAY_DYE(27643);
    LIGHT_GRAY_GLAZED_TERRACOTTA(10707, Directional.class);
    LIGHT_GRAY_SHULKER_BOX(21345, 1, Directional.class);
    LIGHT_GRAY_STAINED_GLASS(5843);
    LIGHT_GRAY_STAINED_GLASS_PANE(19008, GlassPane.class);
    LIGHT_GRAY_TERRACOTTA(26388);
    LIGHT_GRAY_WALL_BANNER(31088, Directional.class);
    LIGHT_GRAY_WOOL(22936);*/
    Material LIGHT_WEIGHTED_PRESSURE_PLATE = new BlockMaterial(BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE, "LIGHT_WEIGHTED_PRESSURE_PLATE");
    //Material LILAC = new ItemMaterial(ItemTypes.LILAC, "LILAC");
    Material LILY_PAD = new BlockMaterial(BlockTypes.WATERLILY, "LILY_PAD");
    /*LIME_BANNER(18887, 16, Rotatable.class);
    LIME_BED(27860, 1, Bed.class);
    LIME_CARPET(15443);
    LIME_CONCRETE(5863);
    LIME_CONCRETE_POWDER(28859);
    LIME_DYE(6147);
    LIME_GLAZED_TERRACOTTA(13861, Directional.class);
    LIME_SHULKER_BOX(28360, 1, Directional.class);
    LIME_STAINED_GLASS(24266);
    LIME_STAINED_GLASS_PANE(10610, GlassPane.class);
    LIME_TERRACOTTA(24013);
    LIME_WALL_BANNER(21422, Directional.class);
    LIME_WOOL(10443);
    LINGERING_POTION(25857, 1);
    LLAMA_SPAWN_EGG(23640);
    MAGENTA_BANNER(15591, 16, Rotatable.class);
    MAGENTA_BED(20061, 1, Bed.class);
    MAGENTA_CARPET(6180);
    MAGENTA_CONCRETE(20591);
    MAGENTA_CONCRETE_POWDER(8272);
    MAGENTA_DYE(11788);
    MAGENTA_GLAZED_TERRACOTTA(8067, Directional.class);
    MAGENTA_SHULKER_BOX(21566, 1, Directional.class);
    MAGENTA_STAINED_GLASS(26814);
    MAGENTA_STAINED_GLASS_PANE(14082, GlassPane.class);
    MAGENTA_TERRACOTTA(25900);
    MAGENTA_WALL_BANNER(23291, Directional.class);
    MAGENTA_WOOL(11853);*/
    Material MAGMA_BLOCK = new BlockMaterial(BlockTypes.MAGMA, "MAGMA_BLOCK");
    Material MAGMA_CREAM = new ItemMaterial(ItemTypes.MAGMA_CREAM, "MAGMA_CREAM");
    //MAGMA_CUBE_SPAWN_EGG(26638);
    Material MAP = new ItemMaterial(ItemTypes.MAP, "MAP");
    Material MELON = new BlockMaterial(BlockTypes.MELON_BLOCK, "MELON");
    Material MELON_SEEDS = new ItemMaterial(ItemTypes.MELON_SEEDS, "MELON_SEEDS");
    Material MELON_SLICE = new ItemMaterial(ItemTypes.MELON, "MELON_SLICE");
    //Material MELON_STEM = new BlockMaterial(BlockTypes.8247, Ageable.class);
    Material MILK_BUCKET = new ItemMaterial(ItemTypes.MILK_BUCKET, "MILK_BUCKET");
    Material MINECART = new ItemMaterial(ItemTypes.MINECART, "MINECART");
    //MOOSHROOM_SPAWN_EGG(22125);
    Material MOSSY_COBBLESTONE = new BlockMaterial(BlockTypes.MOSSY_COBBLESTONE, "MOSSY_COBBLESTONE");
    //Material MOSSY_COBBLESTONE_WALL = new BlockMaterial(BlockTypes.COBBLE11536, Fence.class);
    //MOSSY_STONE_BRICKS(16415);
    Material MOVING_PISTON = new BlockMaterial(BlockTypes.PISTON_EXTENSION, "MOVING_PISTON");
    /*MULE_SPAWN_EGG(11229);
    MUSHROOM_STEM(16543, MultipleFacing.class);*/
    Material MUSHROOM_STEW = new ItemMaterial(ItemTypes.MUSHROOM_STEW, "MUSHROOM_STEW");
    Material MUSIC_DISC_11 = new ItemMaterial(ItemTypes.RECORD_11, "MUSIC_DISC_11");
    Material MUSIC_DISC_13 = new ItemMaterial(ItemTypes.RECORD_13, "MUSIC_DISK_13");
    Material MUSIC_DISC_BLOCKS = new ItemMaterial(ItemTypes.RECORD_BLOCKS, "MUSIC_DISK_BLOCKS");
    Material MUSIC_DISC_CAT = new ItemMaterial(ItemTypes.RECORD_CAT, "MUSIC_DISK_CAT");
    Material MUSIC_DISC_CHIRP = new ItemMaterial(ItemTypes.RECORD_CHIRP, "MUSIC_DISC_CHIRP");
    Material MUSIC_DISC_FAR = new ItemMaterial(ItemTypes.RECORD_FAR, "MUSIC_DISC_FAR");
    Material MUSIC_DISC_MALL = new ItemMaterial(ItemTypes.RECORD_MALL, "MUSIC_DISC_MALL");
    Material MUSIC_DISC_MELLOHI = new ItemMaterial(ItemTypes.RECORD_MELLOHI, "MUSIC_DISC_MELLOHI");
    Material MUSIC_DISC_STAL = new ItemMaterial(ItemTypes.RECORD_STAL, "MUSIC_DISC_STAL");
    Material MUSIC_DISC_STRAD = new ItemMaterial(ItemTypes.RECORD_STRAD, "MUSIC_DISC_STRAD");
    Material MUSIC_DISC_WAIT = new ItemMaterial(ItemTypes.RECORD_WAIT, "MUSIC_DISC_WAIT");
    Material MUSIC_DISC_WARD = new ItemMaterial(ItemTypes.RECORD_WARD, "MUSIC_DISC_WARD");
    Material MUTTON = new ItemMaterial(ItemTypes.MUTTON, "MUTTON");
    Material MYCELIUM = new BlockMaterial(BlockTypes.MYCELIUM, "MYCELIM");
    Material NAME_TAG = new ItemMaterial(ItemTypes.NAME_TAG, "NAME_TAG");
    //NAUTILUS_SHELL(19989);
    Material NETHERRACK = new BlockMaterial(BlockTypes.NETHERRACK, "NETHERRACK");
    Material NETHER_BRICK = new BlockMaterial(BlockTypes.NETHER_BRICK, "NETHER_BRICK");
    Material NETHER_BRICKS = new ItemMaterial(ItemTypes.NETHERBRICK, "NETHER_BRICKS");
    Material NETHER_BRICK_FENCE = new BlockMaterial(BlockTypes.NETHER_BRICK_FENCE, "NETHER_BRICK_FENCE");
    //Material NETHER_BRICK_SLAB = new BlockMaterial(26586, Slab.class);
    //NETHER_BRICK_STAIRS(12085, Stairs.class);
    Material NETHER_PORTAL = new BlockMaterial(BlockTypes.PORTAL, "NETHER_PORTAL");
    Material NETHER_QUARTZ_ORE = new BlockMaterial(BlockTypes.QUARTZ_ORE, "NETHER_QUARTZ_ORE");
    Material NETHER_STAR = new ItemMaterial(ItemTypes.NETHER_STAR, "NETHER_STAR");
    Material NETHER_WART = new BlockMaterial(BlockTypes.NETHER_WART, "NETHER_WART");
    Material NETHER_WART_BLOCK = new BlockMaterial(BlockTypes.NETHER_WART_BLOCK, "NETHER_WART_BLOCK");
    Material NOTE_BLOCK = new BlockMaterial(BlockTypes.NOTEBLOCK, "NOTE_BLOCK");
    /*OAK_BOAT(17570, 1);
    OAK_BUTTON(13510, Switch.class);
    OAK_DOOR(20341, Door.class);
    OAK_FENCE(6442, Fence.class);
    OAK_FENCE_GATE(16689, Gate.class);
    OAK_LEAVES(4385, Leaves.class);
    OAK_LOG(26723, Orientable.class);
    OAK_PLANKS(14905);
    OAK_PRESSURE_PLATE(20108, Powerable.class);
    OAK_SAPLING(9636, Sapling.class);
    OAK_SLAB(12002, Slab.class);
    OAK_STAIRS(5449, Stairs.class);
    OAK_TRAPDOOR(16927, TrapDoor.class);
    OAK_WOOD(7378, Orientable.class);*/
    Material OBSERVER = new BlockMaterial(BlockTypes.OBSERVER, "OBSERVER");
    Material OBSIDIAN = new BlockMaterial(BlockTypes.OBSIDIAN, "OBSIDIAN");
    /*OCELOT_SPAWN_EGG(30080);
    ORANGE_BANNER(4839, 16, Rotatable.class);
    ORANGE_BED(11194, 1, Bed.class);
    ORANGE_CARPET(24752);
    ORANGE_CONCRETE(19914);
    ORANGE_CONCRETE_POWDER(30159);
    ORANGE_DYE(13866);
    ORANGE_GLAZED_TERRACOTTA(27451, Directional.class);
    ORANGE_SHULKER_BOX(21673, 1, Directional.class);
    ORANGE_STAINED_GLASS(25142);
    ORANGE_STAINED_GLASS_PANE(21089, GlassPane.class);
    ORANGE_TERRACOTTA(18684);
    ORANGE_TULIP(26038);
    ORANGE_WALL_BANNER(9936, Directional.class);
    ORANGE_WOOL(23957);*/
    //Material OXEYE_DAISY = new BlockMaterial(BlockTypes.DAISY);
    Material PACKED_ICE = new BlockMaterial(BlockTypes.PACKED_ICE, "PACKED_ICE");
    Material PAINTING = new ItemMaterial(ItemTypes.PAINTING, "PAINTING");
    Material PAPER = new ItemMaterial(ItemTypes.PAPER, "PAPER");
    /*PARROT_SPAWN_EGG(23614);
    PEONY(21155, Bisected.class);
    PETRIFIED_OAK_SLAB(18658, Slab.class);
    PHANTOM_MEMBRANE(18398);
    PHANTOM_SPAWN_EGG(24648);
    PIG_SPAWN_EGG(22584);
    PINK_BANNER(19439, 16, Rotatable.class);
    PINK_BED(13795, 1, Bed.class);
    PINK_CARPET(30186);
    PINK_CONCRETE(5227);
    PINK_CONCRETE_POWDER(6421);
    PINK_DYE(31151);
    PINK_GLAZED_TERRACOTTA(10260, Directional.class);
    PINK_SHULKER_BOX(24968, 1, Directional.class);
    PINK_STAINED_GLASS(16164);
    PINK_STAINED_GLASS_PANE(24637, GlassPane.class);
    PINK_TERRACOTTA(23727);
    PINK_TULIP(27319);
    PINK_WALL_BANNER(9421, Directional.class);
    PINK_WOOL(7611);*/
    Material PISTON = new BlockMaterial(BlockTypes.PISTON, "PISTON");
    Material PISTON_HEAD = new BlockMaterial(BlockTypes.PISTON_HEAD, "PISTON_HEAD");
    Material PLAYER_HEAD = new BlockMaterial(BlockTypes.SKULL, "PLAYER_HEAD");
    /*PLAYER_WALL_HEAD = new BlockMaterial(BlockTypes.SKULL);
    PODZOL(24068, Snowable.class);
    POISONOUS_POTATO(32640);
    POLAR_BEAR_SPAWN_EGG(17015);
    POLISHED_ANDESITE(8335);
    POLISHED_DIORITE(31615);
    POLISHED_GRANITE(5477);
    POPPED_CHORUS_FRUIT(27844);
    POPPY(12851);*/
    Material PORKCHOP = new ItemMaterial(ItemTypes.PORKCHOP, "PORKCHOP");
    Material POTATO = new ItemMaterial(ItemTypes.POTATO, "POTATO");
    Material POTATOES = new BlockMaterial(BlockTypes.POTATOES, "POTATOES");
    Material POTION = new ItemMaterial(ItemTypes.POTION, "POTION");
    /*POTTED_ACACIA_SAPLING(14096);
    POTTED_ALLIUM(13184);
    POTTED_AZURE_BLUET(8754);
    POTTED_BIRCH_SAPLING(32484);
    POTTED_BLUE_ORCHID(6599);
    POTTED_BROWN_MUSHROOM(14481);
    POTTED_CACTUS(8777);
    POTTED_DANDELION(9727);
    POTTED_DARK_OAK_SAPLING(6486);
    POTTED_DEAD_BUSH(13020);
    POTTED_FERN(23315);
    POTTED_JUNGLE_SAPLING(7525);
    POTTED_OAK_SAPLING(11905);
    POTTED_ORANGE_TULIP(28807);
    POTTED_OXEYE_DAISY(19707);
    POTTED_PINK_TULIP(10089);
    POTTED_POPPY(7457);
    POTTED_RED_MUSHROOM(22881);
    POTTED_RED_TULIP(28594);
    POTTED_SPRUCE_SAPLING(29498);
    POTTED_WHITE_TULIP(24330);*/
    Material POWERED_RAIL = new BlockMaterial(BlockTypes.GOLDEN_RAIL, "POWERED_RAIL");
    /*PRISMARINE(7539);
    PRISMARINE_BRICKS(29118);
    PRISMARINE_BRICK_SLAB(26672, Slab.class);
    PRISMARINE_BRICK_STAIRS(15445, Stairs.class);
    PRISMARINE_CRYSTALS(31546);
    PRISMARINE_SHARD(10993);
    PRISMARINE_SLAB(31323, Slab.class);
    PRISMARINE_STAIRS(19217, Stairs.class);
    PUFFERFISH(8115);
    PUFFERFISH_BUCKET(8861, 1);
    PUFFERFISH_SPAWN_EGG(24573);*/
    Material PUMPKIN = new ItemMaterial(ItemTypes.PUMPKIN, "PUMPKIN");
    Material PUMPKIN_PIE = new ItemMaterial(ItemTypes.PUMPKIN_PIE, "PUMPKIN_PIE");
    /*PUMPKIN_SEEDS(28985);
    PUMPKIN_STEM(19021, Ageable.class);
    PURPLE_BANNER(29027, 16, Rotatable.class);
    PURPLE_BED(29755, 1, Bed.class);
    PURPLE_CARPET(5574);
    PURPLE_CONCRETE(20623);
    PURPLE_CONCRETE_POWDER(26808);
    PURPLE_DYE(6347);
    PURPLE_GLAZED_TERRACOTTA(4818, Directional.class);
    PURPLE_SHULKER_BOX(10373, 1, Directional.class);
    PURPLE_STAINED_GLASS(21845);
    PURPLE_STAINED_GLASS_PANE(10948, GlassPane.class);
    PURPLE_TERRACOTTA(10387);
    PURPLE_WALL_BANNER(14298, Directional.class);
    PURPLE_WOOL(11922);
    PURPUR_BLOCK(7538);
    PURPUR_PILLAR(26718, Orientable.class);
    PURPUR_SLAB(11487, Slab.class);
    PURPUR_STAIRS(8921, Stairs.class);*/
    Material QUARTZ = new ItemMaterial(ItemTypes.QUARTZ, "QUARTZ");
    Material QUARTZ_BLOCK = new BlockMaterial(BlockTypes.QUARTZ_BLOCK, "QUARTZ_BLOCK");
    //Material QUARTZ_PILLAR = new BlockMaterial(BlockTypes.);
    //QUARTZ_SLAB(4423, Slab.class);
    //QUARTZ_STAIRS(24079, Stairs.class);
    Material RABBIT = new ItemMaterial(ItemTypes.RABBIT, "RABBIT");
    Material RABBIT_FOOT = new ItemMaterial(ItemTypes.RABBIT_FOOT, "RABBIT_FOOT");
    Material RABBIT_HIDE = new ItemMaterial(ItemTypes.RABBIT_HIDE, "RABBIT_HIDE");
    /*RABBIT_SPAWN_EGG(26496);
    RABBIT_STEW(10611, 1);*/
    Material RAIL = new ItemMaterial(ItemTypes.RAIL, "RAIL");
    Material REDSTONE = new ItemMaterial(ItemTypes.REDSTONE, "REDSTONE");
    Material REDSTONE_BLOCK = new BlockMaterial(BlockTypes.REDSTONE_BLOCK, "REDSTONE_BLOCK");
    Material REDSTONE_LAMP = new BlockMaterial(BlockTypes.REDSTONE_LAMP, "REDSTONE_LAMP");
    Material REDSTONE_ORE = new BlockMaterial(BlockTypes.REDSTONE_ORE, "REDSTONE_ORE");
    Material REDSTONE_TORCH = new BlockMaterial(BlockTypes.REDSTONE_TORCH, "REDSTONE_TORCH");
    //REDSTONE_WALL_TORCH(7595, RedstoneWallTorch.class);
    Material REDSTONE_WIRE = new BlockMaterial(BlockTypes.REDSTONE_WIRE, "REDSTONE_WIRE");
    /*RED_BANNER(26961, 16, Rotatable.class);
    RED_BED(30910, 1, Bed.class);
    RED_CARPET(5424);
    RED_CONCRETE(8032);
    RED_CONCRETE_POWDER(13286);
    RED_GLAZED_TERRACOTTA(24989, Directional.class);
    RED_MUSHROOM(19728);
    RED_MUSHROOM_BLOCK(20766, MultipleFacing.class);
    RED_NETHER_BRICKS(18056);
    RED_SAND(16279);
    RED_SANDSTONE(9092);
    RED_SANDSTONE_SLAB(17550, Slab.class);
    RED_SANDSTONE_STAIRS(25466, Stairs.class);
    RED_SHULKER_BOX(32448, 1, Directional.class);
    RED_STAINED_GLASS(9717);
    RED_STAINED_GLASS_PANE(8630, GlassPane.class);
    RED_TERRACOTTA(5086);
    RED_TULIP(16781);
    RED_WALL_BANNER(4378, Directional.class);
    RED_WOOL(11621);*/
    Material REPEATER = new BlockMaterial(BlockTypes.UNPOWERED_REPEATER, "REPEATER");
    /*REPEATING_COMMAND_BLOCK(12405, CommandBlock.class);
    ROSE_BUSH(6080, Bisected.class);
    ROSE_RED(15694);
    ROTTEN_FLESH(21591);
    SADDLE(30206, 1);
    SALMON(18516);
    SALMON_BUCKET(31427, 1);
    SALMON_SPAWN_EGG(18739);*/
    Material SAND = new BlockMaterial(BlockTypes.SAND, "SAND");
    Material SANDSTONE = new BlockMaterial(BlockTypes.SANDSTONE, "SANDSTONE");
    //SANDSTONE_SLAB(29830, Slab.class);
    //SANDSTONE_STAIRS(18474, Stairs.class);
    //SCUTE(11914);
    //SEAGRASS(23942);
    //SEA_LANTERN(16984);
    //SEA_PICKLE(19562, SeaPickle.class);
    Material SHEARS = new ItemMaterial(ItemTypes.SHEARS, "SHEARS");
    //SHEEP_SPAWN_EGG(24488);
    Material SHIELD = new ItemMaterial(ItemTypes.SHIELD, "SHIELD");
    //Material SHULKER_BOX = new BlockMaterial(ItemTypes.SHULKER_BOX);
    Material SHULKER_SHELL = new ItemMaterial(ItemTypes.SHULKER_SHELL, "SHULKER_SHELL");
    //SHULKER_SPAWN_EGG(31848);
    Material SIGN = new BlockMaterial(BlockTypes.STANDING_SIGN, "SIGN");
    /*SILVERFISH_SPAWN_EGG(14537);
    SKELETON_HORSE_SPAWN_EGG(21356);*/
    Material SKELETON_SKULL = new ItemMaterial(ItemTypes.SKULL, "SKELETON_SKULL");
    //SKELETON_SPAWN_EGG(15261);
    Material SKELETON_WALL_SKULL = new ItemMaterial(ItemTypes.SKULL, "SKELETON_WALL_SKULL");
    /*SLIME_BALL(5242);
    SLIME_BLOCK(31892);
    SLIME_SPAWN_EGG(6550);
    SMOOTH_QUARTZ(14415);
    SMOOTH_RED_SANDSTONE(25180);
    SMOOTH_SANDSTONE(30039);
    SMOOTH_STONE(21910);
    SNOW(14146, Snow.class);
    SNOWBALL(19487, 16);
    SNOW_BLOCK(19913);
    SOUL_SAND(16841);
    SPAWNER(7018);
    SPECTRAL_ARROW(4568);
    SPIDER_EYE(9318);
    SPIDER_SPAWN_EGG(14984);*/
    Material SPLASH_POTION = new ItemMaterial(ItemTypes.SPLASH_POTION, "SPLASH_POTION");
    /*SPONGE(15860);
    SPRUCE_BOAT(9606, 1);
    SPRUCE_BUTTON(23281, Switch.class);
    SPRUCE_DOOR(10642, Door.class);
    SPRUCE_FENCE(25416, Fence.class);
    SPRUCE_FENCE_GATE(26423, Gate.class);
    SPRUCE_LEAVES(20039, Leaves.class);
    SPRUCE_LOG(9726, Orientable.class);
    SPRUCE_PLANKS(14593);
    SPRUCE_PRESSURE_PLATE(15932, Powerable.class);
    SPRUCE_SAPLING(19874, Sapling.class);
    SPRUCE_SLAB(4348, Slab.class);
    SPRUCE_STAIRS(11192, Stairs.class);
    SPRUCE_TRAPDOOR(10289, TrapDoor.class);
    SPRUCE_WOOD(32328, Orientable.class);
    SQUID_SPAWN_EGG(10682);
    STICK(9773);*/
    Material STICKY_PISTON = new BlockMaterial(BlockTypes.STICKY_PISTON, "STICKY_PISTON");
    //STONE(22948);
    Material STONE_AXE = new ItemMaterial(ItemTypes.STONE_AXE, "STONE_AXE");
    /*STONE_BRICKS(6962);
    STONE_BRICK_SLAB(19676, Slab.class);
    STONE_BRICK_STAIRS(27032, Stairs.class);
    STONE_BUTTON(12279, Switch.class);*/
    Material STONE_HOE = new ItemMaterial(ItemTypes.STONE_HOE, "STONE_HOE");
    Material STONE_PICKAXE = new ItemMaterial(ItemTypes.STONE_PICKAXE, "STONE_PICKAXE");
    //STONE_PRESSURE_PLATE(22591, Powerable.class);
    Material STONE_SHOVEL = new ItemMaterial(ItemTypes.STONE_SHOVEL, "STONE_SHOVEL");
    //STONE_SLAB(19838, Slab.class);
    Material STONE_SWORD = new ItemMaterial(ItemTypes.STONE_SWORD, "STONE_SWORD");
    /*STRAY_SPAWN_EGG(30153);
    STRING(12806);
    STRIPPED_ACACIA_LOG(18167, Orientable.class);
    STRIPPED_ACACIA_WOOD(27193, Orientable.class);
    STRIPPED_BIRCH_LOG(8838, Orientable.class);
    STRIPPED_BIRCH_WOOD(22350, Orientable.class);
    STRIPPED_DARK_OAK_LOG(6492, Orientable.class);
    STRIPPED_DARK_OAK_WOOD(16000, Orientable.class);
    STRIPPED_JUNGLE_LOG(15476, Orientable.class);
    STRIPPED_JUNGLE_WOOD(30315, Orientable.class);
    STRIPPED_OAK_LOG(20523, Orientable.class);
    STRIPPED_OAK_WOOD(31455, Orientable.class);
    STRIPPED_SPRUCE_LOG(6140, Orientable.class);
    STRIPPED_SPRUCE_WOOD(6467, Orientable.class);
    STRUCTURE_BLOCK(26831, StructureBlock.class);
    STRUCTURE_VOID(30806);
    SUGAR(30638);
    SUGAR_CANE(7726, Ageable.class);
    SUNFLOWER(7408, Bisected.class);
    TALL_GRASS(21559, Bisected.class);
    TALL_SEAGRASS(27189, Bisected.class);
    TERRACOTTA(16544);
    TIPPED_ARROW(25164);*/
    Material TNT = new BlockMaterial(BlockTypes.TNT, "TNT");
    /*TNT_MINECART(4277, 1);
    TORCH(6063);
    TOTEM_OF_UNDYING(10139, 1);*/
    Material TRAPPED_CHEST = new ItemMaterial(ItemTypes.TRAPPED_CHEST, "TRAPPED_CHEST");
    Material TRIDENT = new ItemMaterial(ItemTypes.WOODEN_SWORD, "TRIDENT"); //temp item - 1.12 doesnt have but is required for 1.13 API);
    /*TRIPWIRE(8810, Tripwire.class);
    TRIPWIRE_HOOK(8130, TripwireHook.class);
    TROPICAL_FISH(24879);
    TROPICAL_FISH_BUCKET(29995, 1);
    TROPICAL_FISH_SPAWN_EGG(19713);
    TUBE_CORAL(23048, Waterlogged.class);
    TUBE_CORAL_BLOCK(23723);
    TUBE_CORAL_FAN(19929, Waterlogged.class);
    TUBE_CORAL_WALL_FAN(25282, CoralWallFan.class);
    TURTLE_EGG(32101, TurtleEgg.class);
    TURTLE_HELMET(30120, 1, 275);
    TURTLE_SPAWN_EGG(17324);
    VEX_SPAWN_EGG(27751);
    public static final Material VILLAGER_SPAWN_EGG = new ItemMaterial(ItemTypes.SPAWN_EGG, "VILLAGER_SPAWN_EGG");
    VINDICATOR_SPAWN_EGG(25324);
    VINE(14564, MultipleFacing.class);
    VOID_AIR(13668);*/
    Material WALL_SIGN = new BlockMaterial(BlockTypes.WALL_SIGN, "WALL_SIGN");
    /*WALL_TORCH(25890, Directional.class);*/
    Material WATER = new BlockMaterial(BlockTypes.WATER, "WATER");
    /*WATER_BUCKET(8802, 1);
    WET_SPONGE(9043);
    WHEAT(27709, Ageable.class);
    WHEAT_SEEDS(28742);
    WHITE_BANNER(17562, 16, Rotatable.class);
    WHITE_BED(8185, 1, Bed.class);
    WHITE_CARPET(15117);
    WHITE_CONCRETE(6281);
    WHITE_CONCRETE_POWDER(10363);
    WHITE_GLAZED_TERRACOTTA(11326, Directional.class);
    WHITE_SHULKER_BOX(31750, 1, Directional.class);
    WHITE_STAINED_GLASS(31190);
    WHITE_STAINED_GLASS_PANE(10557, GlassPane.class);
    WHITE_TERRACOTTA(20975);
    WHITE_TULIP(9742);
    WHITE_WALL_BANNER(15967, Directional.class);*/
    Material WHITE_WOOL = new BlockMaterial(BlockTypes.WOOL, "WHITE_WOOL");
    //WITCH_SPAWN_EGG(11837);
    Material WITHER_SKELETON_SKULL = new BlockMaterial(BlockTypes.SKULL, "WITHER_SKELETON_SKULL");
    //WITHER_SKELETON_SPAWN_EGG(10073);
    Material WITHER_SKELETON_WALL_SKULL = new BlockMaterial(BlockTypes.SKULL, "WITHER_SKELETON_WALL_SKULL");
    //WOLF_SPAWN_EGG(21692);
    Material WOODEN_AXE = new ItemMaterial(ItemTypes.WOODEN_AXE, "WOODEN_AXE");
    Material WOODEN_HOE = new ItemMaterial(ItemTypes.WOODEN_HOE, "WOODEN_HOE");
    Material WOODEN_PICKAXE = new ItemMaterial(ItemTypes.WOODEN_PICKAXE, "WOODEN_PICKAXE");
    Material WOODEN_SHOVEL = new ItemMaterial(ItemTypes.WOODEN_SHOVEL, "WOODEN_SHOVEL");
    Material WOODEN_SWORD = new ItemMaterial(ItemTypes.WOODEN_SWORD, "WOODEN_SWORD");
    Material WRITABLE_BOOK = new ItemMaterial(ItemTypes.WRITABLE_BOOK, "WRITABLE_BOOK");
    Material WRITTEN_BOOK = new ItemMaterial(ItemTypes.WRITTEN_BOOK, "WRITTEN_BOOK");
    /*YELLOW_BANNER(30382, 16, Rotatable.class);
    YELLOW_BED(30410, 1, Bed.class);
    YELLOW_CARPET(18149);
    YELLOW_CONCRETE(15722);
    YELLOW_CONCRETE_POWDER(10655);
    YELLOW_GLAZED_TERRACOTTA(10914, Directional.class);
    YELLOW_SHULKER_BOX(28700, 1, Directional.class);
    YELLOW_STAINED_GLASS(12182);
    YELLOW_STAINED_GLASS_PANE(20298, GlassPane.class);
    YELLOW_TERRACOTTA(32129);
    YELLOW_WALL_BANNER(32004, Directional.class);
    YELLOW_WOOL(29507);*/
    Material ZOMBIE_HEAD = new BlockMaterial(BlockTypes.SKULL, "ZOMBIE_HEAD"); //required for Bukkit API 1.13
    /*ZOMBIE_HORSE_SPAWN_EGG(4275);
    ZOMBIE_PIGMAN_SPAWN_EGG(11531);
    ZOMBIE_SPAWN_EGG(5814);
    ZOMBIE_VILLAGER_SPAWN_EGG(10311);
    ZOMBIE_WALL_HEAD = new BlockMaterial(BlockTypes.SKULL);*/
    Material UNKNOWN = new UnknownMaterial();

    @Override
    @NotNull
    NamespacedKey getKey();
    String name();
    int getMaxStackSize();
    short getMaxDurability();
    @Deprecated
    Class<? extends MaterialData> getData();
    @Deprecated
    MaterialData getNewData(final byte raw);
    boolean isBlock();
    boolean isEdible();
    boolean isRecord();
    boolean isSolid();
    @Deprecated
    boolean isTransparent();
    boolean isFlammable();
    boolean isBurnable();
    boolean isFuel();
    boolean isOccluding();
    boolean hasGravity();
    boolean isItem();
    boolean isInteractable();
    float getHardness();
    float getBlastResistance();

    @Deprecated
    default int getId() {
        return -1;
    }

    @Deprecated
    default boolean isLegacy() {
        return false;
    }

    default BlockData createBlockData() {
        return Bukkit.createBlockData(this);
    }

    default BlockData createBlockData(Consumer<BlockData> consumer) {
        return Bukkit.createBlockData(this, consumer);
    }

    default BlockData createBlockData(String data) throws IllegalArgumentException {
        return Bukkit.createBlockData(this, data);
    }

    static Material getMaterial(final String name) {
        return getMaterial(name, false);
    }

    static Material getMaterial(String name, boolean legacyName) {
        return Material.valueOf(name.toUpperCase());
    }

    static Material matchMaterial(final String name) {
        return matchMaterial(name, false);
    }

    static Material matchMaterial(String name, boolean legacyName) {
        return valueOf(m -> {
            NamespacedKey key = m.getKey();
            if(key.toString().equalsIgnoreCase(name)){
                return true;
            }
            return key.getNamespace().equalsIgnoreCase(name);
        });
    }

    static Material valueOf(Predicate<Material> material){
        return Stream.of(values()).filter(material).findAny().orElse(null);
    }

    static Material valueOf(String name){
        return valueOf(m -> m.name().equals(name));
    }

    static Material[] values(){
        Set<Material> set = Bonge.getInstance().getMaterials();
        set.stream().forEach(s -> {
            if(s.getClass().getName().equals(Material.class.getName())){
                System.out.println(s);
            }
        });
        return set.toArray(new Material[set.size()]);
    }
}