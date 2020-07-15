package org.bukkit;

import org.bonge.Bonge;
import org.bonge.bukkit.r1_14.material.BongeMaterial;
import org.bonge.bukkit.r1_14.material.block.BlockMaterial;
import org.bonge.bukkit.r1_14.material.item.ItemMaterial;
import org.bonge.bukkit.r1_14.material.UnknownMaterial;
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
public abstract class Material implements Keyed {

    public static final Material ACACIA_BOAT = new ItemMaterial(ItemTypes.ACACIA_BOAT.get(), "ACACIA_BOAT");
    public static final Material ACACIA_BUTTON = new BlockMaterial(BlockTypes.ACACIA_BUTTON.get(), "ACACIA_BUTTON");
    public static final Material ACACIA_DOOR = new BlockMaterial(BlockTypes.ACACIA_DOOR.get(), "ACACIA_DOOR");
    public static final Material ACACIA_FENCE = new BlockMaterial(BlockTypes.ACACIA_FENCE.get(), "ACACIA_FENCE");
    public static final Material ACACIA_FENCE_GATE = new BlockMaterial(BlockTypes.ACACIA_FENCE_GATE.get(), "ACACIA_FENCE_GATE");
    public static final Material ACACIA_LEAVES = new BlockMaterial(BlockTypes.ACACIA_LEAVES.get(), "ACACIA_LEAVES");
    public static final Material ACACIA_LOG = new BlockMaterial(BlockTypes.ACACIA_LOG.get(), "ACACIA_LOG");
    public static final Material ACACIA_PLANKS = new BlockMaterial(BlockTypes.ACACIA_PLANKS.get(), "ACACIA_PLANKS");
    public static final Material ACACIA_PRESSURE_PLATE = new BlockMaterial(BlockTypes.ACACIA_PRESSURE_PLATE.get(), "ACACIA_PRESSURE_PLATE");
    public static final Material ACACIA_SAPLING = new BlockMaterial(BlockTypes.ACACIA_SAPLING.get(), "ACACIA_SAPLING");
    public static final Material ACACIA_SLAB = new BlockMaterial(BlockTypes.ACACIA_SLAB.get(), "ACACIA_SLAB");
    public static final Material ACACIA_STAIRS = new BlockMaterial(BlockTypes.ACACIA_STAIRS.get(), "ACACIA_STAIRS");
    public static final Material ACACIA_TRAPDOOR = new BlockMaterial(BlockTypes.ACACIA_TRAPDOOR.get(), "ACACIA_TRAPDOOR");
    public static final Material ACACIA_WOOD = new BlockMaterial(BlockTypes.ACACIA_WOOD.get(), "ACACIA_WOOD");
    public static final Material ACTIVATOR_RAIL = new BlockMaterial(BlockTypes.ACTIVATOR_RAIL.get(), "ACTIVATOR_RAIL");
    public static final Material AIR = new BlockMaterial(BlockTypes.AIR.get(), "AIR");
    public static final Material ALLIUM = new BlockMaterial(BlockTypes.ALLIUM.get(), "ALLIUM");
    public static final Material ANDESITE = new BlockMaterial(BlockTypes.ANDESITE.get(), "ANDESITE");
    public static final Material ANVIL = new BlockMaterial(BlockTypes.ANVIL.get(), "ANVIL");
    public static final Material APPLE = new ItemMaterial(ItemTypes.APPLE.get(), "APPLE");
    public static final Material ARMOR_STAND = new ItemMaterial(ItemTypes.ARMOR_STAND.get(), "ARMOR_STAND");
    public static final Material ARROW = new ItemMaterial(ItemTypes.ARROW.get(), "ARROW");
    public static final Material ATTACHED_MELON_STEM = new BlockMaterial(BlockTypes.MELON_STEM.get(), "ATTACHED_MELON_STEM");
    public static final Material ATTACHED_PUMPKIN_STEM = new BlockMaterial(BlockTypes.PUMPKIN_STEM.get(), "ATTACHED_PUMPKIN_STEM");
    public static final Material AZURE_BLUET = new ItemMaterial(ItemTypes.AZURE_BLUET.get(), "AZURE_BLUET");
    public static final Material BAKED_POTATO = new ItemMaterial(ItemTypes.BAKED_POTATO.get(), "BAKED_POTATO");
    public static final Material BARRIER = new BlockMaterial(BlockTypes.BARRIER.get(), "BARRIER");
    public static final Material BAT_SPAWN_EGG = new ItemMaterial(ItemTypes.BAT_SPAWN_EGG.get(), "BAT_SPAWN_EGG");
    public static final Material BEACON = new BlockMaterial(BlockTypes.BEACON.get(), "BEACON");
    public static final Material BEDROCK = new BlockMaterial(BlockTypes.BEDROCK.get(), "BEDROCK");
    public static final Material BEEF = new ItemMaterial(ItemTypes.BEEF.get(), "BEEF");
    public static final Material BEETROOT = new ItemMaterial(ItemTypes.BEETROOT.get(), "BEETROOT");
    public static final Material BEETROOTS = new BlockMaterial(BlockTypes.BEETROOTS.get(), "BEETROOTS");
    public static final Material BEETROOT_SEEDS = new ItemMaterial(ItemTypes.BEETROOT_SEEDS.get(), "BEETROOT_SEEDS");
    public static final Material BEETROOT_SOUP = new ItemMaterial(ItemTypes.BEETROOT_SOUP.get(), "BEETROOT_SOUP");
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
    BLACK_WALL_BANNER(4919, Directional.class);*/
    public static final Material BLACK_WOOL = new BlockMaterial(BlockTypes.BLACK_WOOL.get(), "BLACK_WOOL");
    /*BLAZE_POWDER(18941);
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
    BLUE_WALL_BANNER(17757, Directional.class);*/
    public static final Material BLUE_WOOL = new BlockMaterial(BlockTypes.BLUE_WOOL.get(), "BLUE_WOOL");
    public static final Material BONE = new ItemMaterial(ItemTypes.BONE.get(), "BONE");
    public static final Material BONE_BLOCK = new BlockMaterial(BlockTypes.BONE_BLOCK.get(), "BONE_BLOCK");
    //BONE_MEAL();
    public static final Material BOOK = new ItemMaterial(ItemTypes.BOOK.get(), "BOOK");
    public static final Material BOOKSHELF = new ItemMaterial(ItemTypes.BOOKSHELF.get(), "BOOKSHELF");
    public static final Material BOW = new ItemMaterial(ItemTypes.BOW.get(), "BOW");
    public static final Material BOWL = new ItemMaterial(ItemTypes.BOWL.get(), "BOWL");
    /*BRAIN_CORAL(31316, Waterlogged.class);
    BRAIN_CORAL_BLOCK(30618);
    BRAIN_CORAL_FAN(13849, Waterlogged.class);
    BRAIN_CORAL_WALL_FAN(22685, CoralWallFan.class);*/
    public static final Material BREAD = new ItemMaterial(ItemTypes.BREAD.get(), "BREAD");
    public static final Material BREWING_STAND = new ItemMaterial(ItemTypes.BREWING_STAND.get(), "BREWING_STAND");
    public static final Material BRICK = new ItemMaterial(ItemTypes.BRICK.get(), "BRICK");
    public static final Material BRICKS = new BlockMaterial(BlockTypes.BRICKS.get(), "BRICKS");
    //public static final Material BRICK_SLAB = new BlockMaterial(BlockTypes.BRICK_);
    public static final Material BRICK_STAIRS = new BlockMaterial(BlockTypes.BRICK_STAIRS.get(), "BRICK_STAIRS");
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
    BROWN_WALL_BANNER(14731, Directional.class);*/
    public static final Material BROWN_WOOL = new BlockMaterial(BlockTypes.BROWN_WOOL.get(), "BROWN_WOOL");
    /*BUBBLE_COLUMN(13758, BubbleColumn.class);
    BUBBLE_CORAL(12464, Waterlogged.class);
    BUBBLE_CORAL_BLOCK(15437);
    BUBBLE_CORAL_FAN(10795, Waterlogged.class);
    BUBBLE_CORAL_WALL_FAN(20382, CoralWallFan.class);*/
    public static final Material BUCKET = new ItemMaterial(ItemTypes.BUCKET.get(), "BUCKET");
    public static final Material CACTUS = new BlockMaterial(BlockTypes.CACTUS.get(), "CACTUS");
    //CACTUS_GREEN(17296);
    public static final Material CAKE = new BlockMaterial(BlockTypes.CAKE.get(), "CAKE");
    public static final Material CARROT = new ItemMaterial(ItemTypes.CARROT.get(), "CARROT");
    public static final Material CARROTS = new BlockMaterial(BlockTypes.CARROTS.get(), "CARROTS");
    public static final Material CARROT_ON_A_STICK = new ItemMaterial(ItemTypes.CARROT_ON_A_STICK.get(), "CARROT_ON_A_STICK");
    public static final Material CARVED_PUMPKIN = new ItemMaterial(ItemTypes.PUMPKIN.get(), "CARVED_PUMPKIN");
    public static final Material CAULDRON = new BlockMaterial(BlockTypes.CAULDRON.get(), "CAULDRON");
    public static final Material CAVE_AIR = new BlockMaterial(BlockTypes.CAVE_AIR.get(), "CAVE_AIR");
    //CAVE_SPIDER_SPAWN_EGG(23341);
    public static final Material CHAINMAIL_BOOTS = new ItemMaterial(ItemTypes.CHAINMAIL_BOOTS.get(), "CHAINMAIL_BOOTS");
    public static final Material CHAINMAIL_CHESTPLATE = new ItemMaterial(ItemTypes.CHAINMAIL_CHESTPLATE.get(), "CHAINMAIL_CHESTPLATE");
    public static final Material CHAINMAIL_HELMET = new ItemMaterial(ItemTypes.CHAINMAIL_HELMET.get(), "CHAINMAIL_HELMET");
    public static final Material CHAINMAIL_LEGGINGS = new ItemMaterial(ItemTypes.CHAINMAIL_LEGGINGS.get(), "CHAINMAIL_LEGGINGS");
    /*CHAIN_COMMAND_BLOCK(26798, CommandBlock.class);
    CHARCOAL(5390);*/
    public static final Material CHEST = new BlockMaterial(BlockTypes.CHEST.get(), "CHEST");
    public static final Material CHEST_MINECART = new ItemMaterial(ItemTypes.CHEST_MINECART.get(), "CHEST_MINECART");
    public static final Material CHICKEN = new ItemMaterial(ItemTypes.CHICKEN.get(), "CHICKEN");
    /*CHICKEN_SPAWN_EGG(5462);
    CHIPPED_ANVIL(10623, Directional.class);
    CHISELED_QUARTZ_BLOCK(30964);
    CHISELED_RED_SANDSTONE(15529);
    CHISELED_SANDSTONE(31763);
    CHISELED_STONE_BRICKS(9087);
    CHORUS_FLOWER(28542, Ageable.class);*/
    public static final Material CHORUS_FRUIT = new ItemMaterial(ItemTypes.CHORUS_FRUIT.get(), "CHORUS_FRUIT");
    public static final Material CHORUS_PLANT = new BlockMaterial(BlockTypes.CHORUS_PLANT.get(), "CHORUS_PLANT");
    public static final Material CLAY = new ItemMaterial(ItemTypes.CLAY.get(), "CLAY");
    public static final Material CLAY_BALL = new ItemMaterial(ItemTypes.CLAY_BALL.get(), "CLAY_BALL");
    public static final Material CLOCK = new ItemMaterial(ItemTypes.CLOCK.get(), "CLOCK");
    public static final Material COAL = new ItemMaterial(ItemTypes.COAL.get(), "COAL");
    public static final Material COAL_BLOCK = new ItemMaterial(ItemTypes.COAL_BLOCK.get(), "COAL_BLOCK");
    public static final Material COAL_ORE = new BlockMaterial(BlockTypes.COAL_ORE.get(), "COAL_ORE");
    //public static final Material COARSE_DIRT = new BlockMaterial(BlockTypes.COARSE_DIRT, "COARSE_DIRT");
    public static final Material COBBLESTONE = new BlockMaterial(BlockTypes.COBBLESTONE.get(), "COBBLESTONE");
    //public static final Material COBBLESTONE_SLAB = new BlockMaterial(BlockTypes.COBBLESTONE_SLAB, "COBBLESTONE_SLAB");
    //public static final Material COBBLESTONE_STAIRS = new BlockMaterial(BlockTypes.COBBLESTONE_STAIRS, "COBBLESTONE_STAIRS");
    public static final Material COBBLESTONE_WALL = new BlockMaterial(BlockTypes.COBBLESTONE_WALL.get(), "COBBLESTONE_WALL");
    public static final Material COBWEB = new BlockMaterial(BlockTypes.COBWEB.get(), "COBWEB");
    public static final Material COCOA = new BlockMaterial(BlockTypes.COCOA.get(), "COCOA");
    //public static final Material COCOA_BEANS = new BlockMaterial(BlockTypes.COC);
    /*COD(24691);
    COD_BUCKET(28601, 1);
    COD_SPAWN_EGG(27248);
    COMMAND_BLOCK(4355, CommandBlock.class);*/
    public static final Material COMMAND_BLOCK_MINECART = new ItemMaterial(ItemTypes.COMMAND_BLOCK_MINECART.get(), "COMMAND_BLOCK_MINECART");
    public static final Material COMPARATOR = new BlockMaterial(BlockTypes.COMPARATOR.get(), "COMPARATOR");
    public static final Material COMPASS = new ItemMaterial(ItemTypes.COMPASS.get(), "COMPASS");
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
    public static final Material CRAFTING_TABLE = new BlockMaterial(BlockTypes.CRAFTING_TABLE.get(), "CRAFTING_TABLE");
    public static final Material CREEPER_HEAD = new BlockMaterial(BlockTypes.CREEPER_HEAD.get(), "CREEPER_HEAD"); //required for Bukkit API 1.13
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
    CYAN_WALL_BANNER(10889, Directional.class);*/
    public static final Material CYAN_WOOL = new BlockMaterial(BlockTypes.CYAN_WOOL.get(), "CYAN_WOOL");
    /*DAMAGED_ANVIL(10274, Directional.class);
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
    public static final Material DETECTOR_RAIL = new BlockMaterial(BlockTypes.DETECTOR_RAIL.get(), "DETECTOR_RAIL");
    public static final Material DIAMOND = new ItemMaterial(ItemTypes.DIAMOND.get(), "DIAMOND");
    public static final Material DIAMOND_AXE = new ItemMaterial(ItemTypes.DIAMOND_AXE.get(), "DIAMOND_AXE");
    public static final Material DIAMOND_BLOCK = new BlockMaterial(BlockTypes.DIAMOND_BLOCK.get(), "DIAMOND_BLOCK");
    public static final Material DIAMOND_BOOTS = new ItemMaterial(ItemTypes.DIAMOND_BOOTS.get(), "DIAMOND_BOOTS");
    public static final Material DIAMOND_CHESTPLATE = new ItemMaterial(ItemTypes.DIAMOND_CHESTPLATE.get(), "DIAMOND_CHESTPLATE");
    public static final Material DIAMOND_HELMET = new ItemMaterial(ItemTypes.DIAMOND_HELMET.get(), "DIAMOND_HELMET");
    public static final Material DIAMOND_HOE = new ItemMaterial(ItemTypes.DIAMOND_HOE.get(), "DIAMOND_HOE");
    public static final Material DIAMOND_HORSE_ARMOR = new ItemMaterial(ItemTypes.DIAMOND_HORSE_ARMOR.get(), "DIAMOND_HORSE_ARMOR");
    public static final Material DIAMOND_LEGGINGS = new ItemMaterial(ItemTypes.DIAMOND_LEGGINGS.get(), "DIAMOND_LEGGINGS");
    public static final Material DIAMOND_ORE = new BlockMaterial(BlockTypes.DIAMOND_ORE.get(), "DIAMOND_ORE");
    public static final Material DIAMOND_PICKAXE = new ItemMaterial(ItemTypes.DIAMOND_PICKAXE.get(), "DIAMOND_PICKAXE");
    public static final Material DIAMOND_SHOVEL = new ItemMaterial(ItemTypes.DIAMOND_SHOVEL.get(), "DIAMOND_SHOVEL");
    public static final Material DIAMOND_SWORD = new ItemMaterial(ItemTypes.DIAMOND_SWORD.get(), "DIAMOND_SWORD");
    //public static final Material DIORITE = new BlockMaterial(BlockTypes.DIORITE, "DIORITE");
    public static final Material DIRT = new BlockMaterial(BlockTypes.DIRT.get(), "DIRT");
    public static final Material DISPENSER = new BlockMaterial(BlockTypes.DISPENSER.get(), "DISPENSER");
    /*DOLPHIN_SPAWN_EGG(20787);
    DONKEY_SPAWN_EGG(14513);
    DRAGON_BREATH(20154);*/
    public static final Material DRAGON_EGG = new BlockMaterial(BlockTypes.DRAGON_EGG.get(), "DRAGON_EGG");
    public static final Material DRAGON_HEAD = new BlockMaterial(BlockTypes.DRAGON_HEAD.get(), "DRAGON_HEAD"); //required for Bukkit API 1.13
    /*DRAGON_WALL_HEAD = new BlockMaterial(BlockTypes.SKULL);
    DRIED_KELP(21042);
    DRIED_KELP_BLOCK(12966);*/
    public static final Material DROPPER = new BlockMaterial(BlockTypes.DROPPER.get(), "DROPPER");
    //DROWNED_SPAWN_EGG(19368);
    public static final Material EGG = new ItemMaterial(ItemTypes.EGG.get(), "EGG");
    //ELDER_GUARDIAN_SPAWN_EGG(11418);
    public static final Material ELYTRA = new ItemMaterial(ItemTypes.ELYTRA.get(), "ELYTRA");
    public static final Material EMERALD = new ItemMaterial(ItemTypes.EMERALD.get(), "EMERALD");
    public static final Material EMERALD_BLOCK = new BlockMaterial(BlockTypes.EMERALD_BLOCK.get(), "EMERALD_BLOCK");
    public static final Material EMERALD_ORE = new BlockMaterial(BlockTypes.EMERALD_ORE.get(), "EMERALD_ORE");
    public static final Material ENCHANTED_BOOK = new ItemMaterial(ItemTypes.ENCHANTED_BOOK.get(), "ENCHANTED_BOOK");
    //ENCHANTED_GOLDEN_APPLE(8280);
    public static final Material ENCHANTING_TABLE = new BlockMaterial(BlockTypes.ENCHANTING_TABLE.get(), "ENCHANTING_TABLE");
    /*ENDERMAN_SPAWN_EGG(29488);
    ENDERMITE_SPAWN_EGG(16617);*/
    public static final Material ENDER_CHEST = new BlockMaterial(BlockTypes.ENDER_CHEST.get(), "ENDER_CHEST");
    public static final Material ENDER_EYE = new ItemMaterial(ItemTypes.ENDER_EYE.get(), "ENDER_EYE");
    public static final Material ENDER_PEARL = new ItemMaterial(ItemTypes.ENDER_PEARL.get(), "ENDER_PEARL");
    public static final Material END_CRYSTAL = new ItemMaterial(ItemTypes.END_CRYSTAL.get(), "END_CRYSTAL");
    public static final Material END_GATEWAY = new BlockMaterial(BlockTypes.END_GATEWAY.get(), "END_GATEWAY");
    public static final Material END_PORTAL = new BlockMaterial(BlockTypes.END_PORTAL.get(), "END_PORTAL");
    public static final Material END_PORTAL_FRAME = new BlockMaterial(BlockTypes.END_PORTAL_FRAME.get(), "END_PORTAL_FRAME");
    public static final Material END_ROD = new ItemMaterial(ItemTypes.END_ROD.get(), "END_ROD");
    public static final Material END_STONE = new ItemMaterial(ItemTypes.END_STONE.get(), "END_STONE");
    public static final Material END_STONE_BRICKS = new BlockMaterial(BlockTypes.END_STONE.get(), "END_STONE_BRICKS");
    //EVOKER_SPAWN_EGG(21271);
    public static final Material EXPERIENCE_BOTTLE = new ItemMaterial(ItemTypes.EXPERIENCE_BOTTLE.get(), "EXPERIENCE_BOTTLE");
    public static final Material FARMLAND = new BlockMaterial(BlockTypes.FARMLAND.get(), "FARMLAND");
    public static final Material FEATHER = new ItemMaterial(ItemTypes.FEATHER.get(), "FEATHER");
    /*FERMENTED_SPIDER_EYE(19386);
    FERN(15794);*/
    public static final Material FILLED_MAP = new ItemMaterial(ItemTypes.FILLED_MAP.get(), "FILLED_MAP");
    public static final Material FIRE = new BlockMaterial(BlockTypes.FIRE.get(), "FIRE");
    //public static final Material FIREWORK_ROCKET = new ItemMaterial(ItemTypes.FIREWO23841);
    //public static final Material FIREWORK_STAR = new ItemMaterial(ItemTypes.12190);
    public static final Material FIRE_CHARGE = new ItemMaterial(ItemTypes.FIRE_CHARGE.get(), "FIRE_CHARGE");
    /*FIRE_CORAL(29151, Waterlogged.class);
    FIRE_CORAL_BLOCK(12119);
    FIRE_CORAL_FAN(11112, Waterlogged.class);
    FIRE_CORAL_WALL_FAN(20100, CoralWallFan.class);*/
    public static final Material FISHING_ROD = new ItemMaterial(ItemTypes.FISHING_ROD.get(), "FISHING_ROD");
    public static final Material FLINT = new ItemMaterial(ItemTypes.FLINT.get(), "FLINT");
    public static final Material FLINT_AND_STEEL = new ItemMaterial(ItemTypes.FLINT_AND_STEEL.get(), "FLINT_AND_STEEL");
    public static final Material FLOWER_POT = new ItemMaterial(ItemTypes.FLOWER_POT.get(), "FLOWER_POT");
    public static final Material FROSTED_ICE = new BlockMaterial(BlockTypes.FROSTED_ICE.get(), "FROSTED_ICE");
    public static final Material FURNACE = new ItemMaterial(ItemTypes.FURNACE.get(), "FURNACE");
    public static final Material FURNACE_MINECART = new ItemMaterial(ItemTypes.FURNACE_MINECART.get(), "FURNACE_MINECART");
    //GHAST_SPAWN_EGG(9970);
    public static final Material GHAST_TEAR = new ItemMaterial(ItemTypes.GHAST_TEAR.get(), "GHAST_TEAR");
    public static final Material GLASS = new BlockMaterial(BlockTypes.GLASS.get(), "GLASS");
    public static final Material GLASS_BOTTLE = new ItemMaterial(ItemTypes.GLASS_BOTTLE.get(), "GLASS_BOTTLE");
    public static final Material GLASS_PANE = new BlockMaterial(BlockTypes.GLASS_PANE.get(), "GLASS_PANE");
    //GLISTERING_MELON_SLICE(20158);
    public static final Material GLOWSTONE = new BlockMaterial(BlockTypes.GLOWSTONE.get(), "GLOWSTONE");
    public static final Material GLOWSTONE_DUST = new ItemMaterial(ItemTypes.GLOWSTONE_DUST.get(), "GLOWSTONE_DUST");
    public static final Material GOLDEN_APPLE = new ItemMaterial(ItemTypes.GOLDEN_APPLE.get(), "GOLDEN_APPLE");
    public static final Material GOLDEN_AXE = new ItemMaterial(ItemTypes.GOLDEN_AXE.get(), "GOLDEN_AXE");
    public static final Material GOLDEN_BOOTS = new ItemMaterial(ItemTypes.GOLDEN_BOOTS.get(), "GOLDEN_BOOTS");
    //GOLDEN_CARROT(5300);
    public static final Material GOLDEN_CHESTPLATE = new ItemMaterial(ItemTypes.GOLDEN_CHESTPLATE.get(), "GOLDEN_CHESTPLATE");
    public static final Material GOLDEN_HELMET = new ItemMaterial(ItemTypes.GOLDEN_HELMET.get(), "GOLDEN_HELMET");
    public static final Material GOLDEN_HOE = new ItemMaterial(ItemTypes.GOLDEN_HOE.get(), "GOLDEN_HOE");
    /*GOLDEN_HORSE_ARMOR(7996, 1);*/
    public static final Material GOLDEN_LEGGINGS = new ItemMaterial(ItemTypes.GOLDEN_LEGGINGS.get(), "GOLDEN_LEGGINGS");
    public static final Material GOLDEN_PICKAXE = new ItemMaterial(ItemTypes.GOLDEN_PICKAXE.get(), "GOLDEN_PICKAXE");
    public static final Material GOLDEN_SHOVEL = new ItemMaterial(ItemTypes.GOLDEN_SHOVEL.get(), "GOLDEN_SHOVEL");
    public static final Material GOLDEN_SWORD = new ItemMaterial(ItemTypes.GOLDEN_SWORD.get(), "GOLDEN_SWORD");
    public static final Material GOLD_BLOCK = new BlockMaterial(BlockTypes.GOLD_BLOCK.get(), "GOLD_BLOCK");
    public static final Material GOLD_INGOT = new ItemMaterial(ItemTypes.GOLD_INGOT.get(), "GOLD_INGOT");
    public static final Material GOLD_NUGGET = new ItemMaterial(ItemTypes.GOLD_NUGGET.get(), "GOLD_NUGGET");
    public static final Material GOLD_ORE = new BlockMaterial(BlockTypes.GOLD_ORE.get(), "GOLD_ORE");
    //public static final Material GRANITE = new BlockMaterial(BlockTypes.GRANITE, "GRANITE");
    public static final Material GRASS = new BlockMaterial(BlockTypes.GRASS.get(), "GRASS");
    public static final Material GRASS_BLOCK = new BlockMaterial(BlockTypes.GRASS_BLOCK.get(), "GRASS_BLOCK");
    public static final Material GRASS_PATH = new BlockMaterial(BlockTypes.GRASS_PATH.get(), "GRASS_PATH");
    public static final Material GRAVEL = new BlockMaterial(BlockTypes.GRAVEL.get(), "GRAVEL");
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
    GRAY_WALL_BANNER(24275, Directional.class);*/
    public static final Material GRAY_WOOL = new BlockMaterial(BlockTypes.GRAY_WOOL.get(), "GRAY_WOOL");
    /*GREEN_BANNER(10698, 16, Rotatable.class);
    GREEN_BED(13797, 1, Bed.class);
    GREEN_CARPET(7780);
    GREEN_CONCRETE(17949);
    GREEN_CONCRETE_POWDER(6904);
    GREEN_GLAZED_TERRACOTTA(6958, Directional.class);
    GREEN_SHULKER_BOX(9377, 1, Directional.class);
    GREEN_STAINED_GLASS(22503);
    GREEN_STAINED_GLASS_PANE(4767, GlassPane.class);
    GREEN_TERRACOTTA(4105);
    GREEN_WALL_BANNER(15046, Directional.class);*/
    public static final Material GREEN_WOOL = new BlockMaterial(BlockTypes.GREEN_WOOL.get(), "GREEN_WOOL");
    //GUARDIAN_SPAWN_EGG(20113);
    public static final Material GUNPOWDER = new ItemMaterial(ItemTypes.GUNPOWDER.get(), "GUNPOWDER");
    public static final Material HAY_BLOCK = new BlockMaterial(BlockTypes.HAY_BLOCK.get(), "HAY_BLOCK");
    //HEART_OF_THE_SEA(11807);
    public static final Material HEAVY_WEIGHTED_PRESSURE_PLATE = new BlockMaterial(BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE.get(), "HEAVY_WEIGHTED_PRESSURE_PLATE");
    public static final Material HOPPER = new BlockMaterial(BlockTypes.HOPPER.get(), "HOPPER");
    public static final Material HOPPER_MINECART = new ItemMaterial(ItemTypes.HOPPER_MINECART.get(), "HOPPER_MINECART");
    /*HORN_CORAL(19511, Waterlogged.class);
    HORN_CORAL_BLOCK(19958);
    HORN_CORAL_FAN(13610, Waterlogged.class);
    HORN_CORAL_WALL_FAN(28883, CoralWallFan.class);
    HORSE_SPAWN_EGG(25981);
    HUSK_SPAWN_EGG(20178);*/
    public static final Material ICE = new BlockMaterial(BlockTypes.ICE.get(), "ICE");
    /*INFESTED_CHISELED_STONE_BRICKS(4728);
    INFESTED_COBBLESTONE(28798);
    INFESTED_CRACKED_STONE_BRICKS(7476);
    INFESTED_MOSSY_STONE_BRICKS(9850);
    INFESTED_STONE(18440);
    INFESTED_STONE_BRICKS(19749);*/
    //public static final Material INK_SAC = new ItemMaterial();
    public static final Material IRON_AXE = new ItemMaterial(ItemTypes.IRON_AXE.get(), "IRON_AXE");
    public static final Material IRON_BARS = new ItemMaterial(ItemTypes.IRON_BARS.get(), "IRON_BARS");
    public static final Material IRON_BLOCK = new BlockMaterial(BlockTypes.IRON_BLOCK.get(), "IRON_BLOCK");
    public static final Material IRON_BOOTS = new ItemMaterial(ItemTypes.IRON_BOOTS.get(), "IRON_BOOTS");
    public static final Material IRON_CHESTPLATE = new ItemMaterial(ItemTypes.IRON_CHESTPLATE.get(), "IRON_CHESTPLATE");
    public static final Material IRON_DOOR = new BlockMaterial(BlockTypes.IRON_DOOR.get(), "IRON_DOOR");
    public static final Material IRON_HELMET = new ItemMaterial(ItemTypes.IRON_HELMET.get(), "IRON_HELMET");
    public static final Material IRON_HOE = new ItemMaterial(ItemTypes.IRON_HOE.get(), "IRON_HOE");
    public static final Material IRON_HORSE_ARMOR = new ItemMaterial(ItemTypes.IRON_HORSE_ARMOR.get(), "IRON_HORSE_ARMOR");
    public static final Material IRON_INGOT = new ItemMaterial(ItemTypes.IRON_INGOT.get(), "IRON_INGOT");
    public static final Material IRON_LEGGINGS = new ItemMaterial(ItemTypes.IRON_LEGGINGS.get(), "IRON_LEGGINGS");
    public static final Material IRON_NUGGET = new ItemMaterial(ItemTypes.IRON_NUGGET.get(), "IRON_NUGGETS");
    public static final Material IRON_ORE = new BlockMaterial(BlockTypes.IRON_ORE.get(), "IRON_ORE");
    public static final Material IRON_PICKAXE = new ItemMaterial(ItemTypes.IRON_PICKAXE.get(), "IRON_PICKAXE");
    public static final Material IRON_SHOVEL = new ItemMaterial(ItemTypes.IRON_SHOVEL.get(), "IRON_SHOVEL");
    public static final Material IRON_SWORD = new ItemMaterial(ItemTypes.IRON_SWORD.get(), "IRON_SWORD");
    public static final Material IRON_TRAPDOOR = new BlockMaterial(BlockTypes.IRON_TRAPDOOR.get(), "IRON_TRAPDOOR");
    public static final Material ITEM_FRAME = new ItemMaterial(ItemTypes.ITEM_FRAME.get(), "IRON_FRAME");
    public static final Material JACK_O_LANTERN = new ItemMaterial(ItemTypes.JACK_O_LANTERN.get(), "JACK_O_LANTERN");
    public static final Material JUKEBOX = new BlockMaterial(BlockTypes.JUKEBOX.get(), "JUKEBOX");
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
    public static final Material LADDER = new BlockMaterial(BlockTypes.LADDER.get(), "LADDER");
    public static final Material LAPIS_BLOCK = new BlockMaterial(BlockTypes.LAPIS_BLOCK.get(), "LAPIS_BLOCK");
    //public static final Material LAPIS_LAZULI = new ItemMaterial(ItemTypes.LAZULI);
    public static final Material LAPIS_ORE = new BlockMaterial(BlockTypes.LAPIS_ORE.get(), "LAPIS_ORE");
    //public static final Material LARGE_FERN = new ItemMaterial(BlockTypes, "LARGE_FERN");
    public static final Material LAVA = new BlockMaterial(BlockTypes.LAVA.get(), "LAVA");
    public static final Material LAVA_BUCKET = new ItemMaterial(ItemTypes.LAVA_BUCKET.get(), "LAVA_BUCKET");
    public static final Material LEAD = new ItemMaterial(ItemTypes.LEAD.get(), "LEAD");
    public static final Material LEATHER = new ItemMaterial(ItemTypes.LEATHER.get(), "LEATHER");
    public static final Material LEATHER_BOOTS = new ItemMaterial(ItemTypes.LEATHER_BOOTS.get(), "LEATHER_BOOTS");
    public static final Material LEATHER_CHESTPLATE = new ItemMaterial(ItemTypes.LEATHER_CHESTPLATE.get(), "LEATHER_CHESTPLATE");
    public static final Material LEATHER_HELMET = new ItemMaterial(ItemTypes.LEATHER_HELMET.get(), "LEATHER_HELMET");
    public static final Material LEATHER_LEGGINGS = new ItemMaterial(ItemTypes.LEATHER_LEGGINGS.get(), "LEATHER_LEGGINGS");
    public static final Material LEVER = new BlockMaterial(BlockTypes.LEVER.get(), "LEVER");
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
    LIGHT_BLUE_WALL_BANNER(12011, Directional.class);*/
    public static final Material LIGHT_BLUE_WOOL = new BlockMaterial(BlockTypes.LIGHT_BLUE_WOOL.get(), "LIGHT_BLUE_WOOL");
    /*LIGHT_GRAY_BANNER(11417, 16, Rotatable.class);
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
    LIGHT_GRAY_WALL_BANNER(31088, Directional.class);*/
    public static final Material LIGHT_GRAY_WOOL = new BlockMaterial(BlockTypes.LIGHT_GRAY_WOOL.get(), "LIGHT_GRAY_WOOL");
    public static final Material LIGHT_WEIGHTED_PRESSURE_PLATE = new BlockMaterial(BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE.get(), "LIGHT_WEIGHTED_PRESSURE_PLATE");
    //public static final Material LILAC = new ItemMaterial(ItemTypes.LILAC, "LILAC");
    public static final Material LILY_PAD = new BlockMaterial(BlockTypes.LILY_PAD.get(), "LILY_PAD");
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
    LIME_WALL_BANNER(21422, Directional.class);*/
    public static final Material LIME_WOOL = new BlockMaterial(BlockTypes.LIME_WOOL.get(), "LIME_WOOL");
    /*LINGERING_POTION(25857, 1);
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
    MAGENTA_WALL_BANNER(23291, Directional.class);*/
    public static final Material MAGENTA_WOOL = new BlockMaterial(BlockTypes.MAGENTA_WOOL.get(), "MAGENTA_WOOL");
    public static final Material MAGMA_BLOCK = new BlockMaterial(BlockTypes.MAGMA_BLOCK.get(), "MAGMA_BLOCK");
    public static final Material MAGMA_CREAM = new ItemMaterial(ItemTypes.MAGMA_CREAM.get(), "MAGMA_CREAM");
    //MAGMA_CUBE_SPAWN_EGG(26638);
    public static final Material MAP = new ItemMaterial(ItemTypes.MAP.get(), "MAP");
    public static final Material MELON = new BlockMaterial(BlockTypes.MELON.get(), "MELON");
    public static final Material MELON_SEEDS = new ItemMaterial(ItemTypes.MELON_SEEDS.get(), "MELON_SEEDS");
    public static final Material MELON_SLICE = new ItemMaterial(ItemTypes.MELON.get(), "MELON_SLICE");
    //public static final Material MELON_STEM = new BlockMaterial(BlockTypes.8247, Ageable.class);
    public static final Material MILK_BUCKET = new ItemMaterial(ItemTypes.MILK_BUCKET.get(), "MILK_BUCKET");
    public static final Material MINECART = new ItemMaterial(ItemTypes.MINECART.get(), "MINECART");
    //MOOSHROOM_SPAWN_EGG(22125);
    public static final Material MOSSY_COBBLESTONE = new BlockMaterial(BlockTypes.MOSSY_COBBLESTONE.get(), "MOSSY_COBBLESTONE");
    //public static final Material MOSSY_COBBLESTONE_WALL = new BlockMaterial(BlockTypes.COBBLE11536, Fence.class);
    //MOSSY_STONE_BRICKS(16415);
    public static final Material MOVING_PISTON = new BlockMaterial(BlockTypes.MOVING_PISTON.get(), "MOVING_PISTON");
    /*MULE_SPAWN_EGG(11229);
    MUSHROOM_STEM(16543, MultipleFacing.class);*/
    public static final Material MUSHROOM_STEW = new ItemMaterial(ItemTypes.MUSHROOM_STEW.get(), "MUSHROOM_STEW");
    public static final Material MUSIC_DISC_11 = new ItemMaterial(ItemTypes.MUSIC_DISC_11.get(), "MUSIC_DISC_11");
    public static final Material MUSIC_DISC_13 = new ItemMaterial(ItemTypes.MUSIC_DISC_13.get(), "MUSIC_DISK_13");
    public static final Material MUSIC_DISC_BLOCKS = new ItemMaterial(ItemTypes.MUSIC_DISC_BLOCKS.get(), "MUSIC_DISK_BLOCKS");
    public static final Material MUSIC_DISC_CAT = new ItemMaterial(ItemTypes.MUSIC_DISC_CAT.get(), "MUSIC_DISK_CAT");
    public static final Material MUSIC_DISC_CHIRP = new ItemMaterial(ItemTypes.MUSIC_DISC_CHIRP.get(), "MUSIC_DISC_CHIRP");
    public static final Material MUSIC_DISC_FAR = new ItemMaterial(ItemTypes.MUSIC_DISC_FAR.get(), "MUSIC_DISC_FAR");
    public static final Material MUSIC_DISC_MALL = new ItemMaterial(ItemTypes.MUSIC_DISC_MALL.get(), "MUSIC_DISC_MALL");
    public static final Material MUSIC_DISC_MELLOHI = new ItemMaterial(ItemTypes.MUSIC_DISC_MELLOHI.get(), "MUSIC_DISC_MELLOHI");
    public static final Material MUSIC_DISC_STAL = new ItemMaterial(ItemTypes.MUSIC_DISC_STAL.get(), "MUSIC_DISC_STAL");
    public static final Material MUSIC_DISC_STRAD = new ItemMaterial(ItemTypes.MUSIC_DISC_STRAD.get(), "MUSIC_DISC_STRAD");
    public static final Material MUSIC_DISC_WAIT = new ItemMaterial(ItemTypes.MUSIC_DISC_WAIT.get(), "MUSIC_DISC_WAIT");
    public static final Material MUSIC_DISC_WARD = new ItemMaterial(ItemTypes.MUSIC_DISC_WARD.get(), "MUSIC_DISC_WARD");
    public static final Material MUTTON = new ItemMaterial(ItemTypes.MUTTON.get(), "MUTTON");
    public static final Material MYCELIUM = new BlockMaterial(BlockTypes.MYCELIUM.get(), "MYCELIM");
    public static final Material NAME_TAG = new ItemMaterial(ItemTypes.NAME_TAG.get(), "NAME_TAG");
    //NAUTILUS_SHELL(19989);
    public static final Material NETHERRACK = new BlockMaterial(BlockTypes.NETHERRACK.get(), "NETHERRACK");
    public static final Material NETHER_BRICK = new ItemMaterial(ItemTypes.NETHER_BRICK.get(), "NETHER_BRICK");
    public static final Material NETHER_BRICKS = new BlockMaterial(BlockTypes.NETHER_BRICKS.get(), "NETHER_BRICKS");
    public static final Material NETHER_BRICK_FENCE = new BlockMaterial(BlockTypes.NETHER_BRICK_FENCE.get(), "NETHER_BRICK_FENCE");
    //public static final Material NETHER_BRICK_SLAB = new BlockMaterial(26586, Slab.class);
    //NETHER_BRICK_STAIRS(12085, Stairs.class);
    public static final Material NETHER_PORTAL = new BlockMaterial(BlockTypes.NETHER_PORTAL.get(), "NETHER_PORTAL");
    public static final Material NETHER_QUARTZ_ORE = new BlockMaterial(BlockTypes.NETHER_QUARTZ_ORE.get(), "NETHER_QUARTZ_ORE");
    public static final Material NETHER_STAR = new ItemMaterial(ItemTypes.NETHER_STAR.get(), "NETHER_STAR");
    public static final Material NETHER_WART = new BlockMaterial(BlockTypes.NETHER_WART.get(), "NETHER_WART");
    public static final Material NETHER_WART_BLOCK = new BlockMaterial(BlockTypes.NETHER_WART_BLOCK.get(), "NETHER_WART_BLOCK");
    public static final Material NOTE_BLOCK = new BlockMaterial(BlockTypes.NOTE_BLOCK.get(), "NOTE_BLOCK");
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
    public static final Material OBSERVER = new BlockMaterial(BlockTypes.OBSERVER.get(), "OBSERVER");
    public static final Material OBSIDIAN = new BlockMaterial(BlockTypes.OBSIDIAN.get(), "OBSIDIAN");
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
    ORANGE_WALL_BANNER(9936, Directional.class);*/
    public static final Material ORANGE_WOOL = new BlockMaterial(BlockTypes.ORANGE_WOOL.get(), "ORANGE_WOOL");
    //public static final Material OXEYE_DAISY = new BlockMaterial(BlockTypes.DAISY);
    public static final Material PACKED_ICE = new BlockMaterial(BlockTypes.PACKED_ICE.get(), "PACKED_ICE");
    public static final Material PAINTING = new ItemMaterial(ItemTypes.PAINTING.get(), "PAINTING");
    public static final Material PAPER = new ItemMaterial(ItemTypes.PAPER.get(), "PAPER");
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
    PINK_WALL_BANNER(9421, Directional.class);*/
    public static final Material PINK_WOOL = new BlockMaterial(BlockTypes.PINK_WOOL.get(), "PINK_WOOL");
    public static final Material PISTON = new BlockMaterial(BlockTypes.PISTON.get(), "PISTON");
    public static final Material PISTON_HEAD = new BlockMaterial(BlockTypes.PISTON_HEAD.get(), "PISTON_HEAD");
    public static final Material PLAYER_HEAD = new BlockMaterial(BlockTypes.PLAYER_HEAD.get(), "PLAYER_HEAD");
    public static final Material PLAYER_WALL_HEAD = new BlockMaterial(BlockTypes.PLAYER_WALL_HEAD.get(), "PLAYER_WALL_HEAD");
    /*PODZOL(24068, Snowable.class);
    POISONOUS_POTATO(32640);
    POLAR_BEAR_SPAWN_EGG(17015);
    POLISHED_ANDESITE(8335);
    POLISHED_DIORITE(31615);
    POLISHED_GRANITE(5477);
    POPPED_CHORUS_FRUIT(27844);
    POPPY(12851);*/
    public static final Material PORKCHOP = new ItemMaterial(ItemTypes.PORKCHOP.get(), "PORKCHOP");
    public static final Material POTATO = new ItemMaterial(ItemTypes.POTATO.get(), "POTATO");
    public static final Material POTATOES = new BlockMaterial(BlockTypes.POTATOES.get(), "POTATOES");
    public static final Material POTION = new ItemMaterial(ItemTypes.POTION.get(), "POTION");
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
    public static final Material POWERED_RAIL = new BlockMaterial(BlockTypes.POWERED_RAIL.get(), "POWERED_RAIL");
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
    public static final Material PUMPKIN = new ItemMaterial(ItemTypes.PUMPKIN.get(), "PUMPKIN");
    public static final Material PUMPKIN_PIE = new ItemMaterial(ItemTypes.PUMPKIN_PIE.get(), "PUMPKIN_PIE");
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
    PURPLE_WALL_BANNER(14298, Directional.class);*/
    public static final Material PURPLE_WOOL = new BlockMaterial(BlockTypes.PURPLE_WOOL.get(), "PURPLE_WOOL");
    /*PURPUR_BLOCK(7538);
    PURPUR_PILLAR(26718, Orientable.class);
    PURPUR_SLAB(11487, Slab.class);
    PURPUR_STAIRS(8921, Stairs.class);*/
    public static final Material QUARTZ = new ItemMaterial(ItemTypes.QUARTZ.get(), "QUARTZ");
    public static final Material QUARTZ_BLOCK = new BlockMaterial(BlockTypes.QUARTZ_BLOCK.get(), "QUARTZ_BLOCK");
    //public static final Material QUARTZ_PILLAR = new BlockMaterial(BlockTypes.);
    //QUARTZ_SLAB(4423, Slab.class);
    //QUARTZ_STAIRS(24079, Stairs.class);
    public static final Material RABBIT = new ItemMaterial(ItemTypes.RABBIT.get(), "RABBIT");
    public static final Material RABBIT_FOOT = new ItemMaterial(ItemTypes.RABBIT_FOOT.get(), "RABBIT_FOOT");
    public static final Material RABBIT_HIDE = new ItemMaterial(ItemTypes.RABBIT_HIDE.get(), "RABBIT_HIDE");
    /*RABBIT_SPAWN_EGG(26496);
    RABBIT_STEW(10611, 1);*/
    public static final Material RAIL = new ItemMaterial(ItemTypes.RAIL.get(), "RAIL");
    public static final Material REDSTONE = new ItemMaterial(ItemTypes.REDSTONE.get(), "REDSTONE");
    public static final Material REDSTONE_BLOCK = new BlockMaterial(BlockTypes.REDSTONE_BLOCK.get(), "REDSTONE_BLOCK");
    public static final Material REDSTONE_LAMP = new BlockMaterial(BlockTypes.REDSTONE_LAMP.get(), "REDSTONE_LAMP");
    public static final Material REDSTONE_ORE = new BlockMaterial(BlockTypes.REDSTONE_ORE.get(), "REDSTONE_ORE");
    public static final Material REDSTONE_TORCH = new BlockMaterial(BlockTypes.REDSTONE_TORCH.get(), "REDSTONE_TORCH");
    //REDSTONE_WALL_TORCH(7595, RedstoneWallTorch.class);
    public static final Material REDSTONE_WIRE = new BlockMaterial(BlockTypes.REDSTONE_WIRE.get(), "REDSTONE_WIRE");
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
    RED_WALL_BANNER(4378, Directional.class);*/
    public static final Material RED_WOOL = new BlockMaterial(BlockTypes.RED_WOOL.get(), "RED_WOOL");
    public static final Material REPEATER = new BlockMaterial(BlockTypes.REPEATER.get(), "REPEATER");
    /*REPEATING_COMMAND_BLOCK(12405, CommandBlock.class);
    ROSE_BUSH(6080, Bisected.class);
    ROSE_RED(15694);
    ROTTEN_FLESH(21591);
    SADDLE(30206, 1);
    SALMON(18516);
    SALMON_BUCKET(31427, 1);
    SALMON_SPAWN_EGG(18739);*/
    public static final Material SAND = new BlockMaterial(BlockTypes.SAND.get(), "SAND");
    public static final Material SANDSTONE = new BlockMaterial(BlockTypes.SANDSTONE.get(), "SANDSTONE");
    //SANDSTONE_SLAB(29830, Slab.class);
    //SANDSTONE_STAIRS(18474, Stairs.class);
    //SCUTE(11914);
    //SEAGRASS(23942);
    //SEA_LANTERN(16984);
    //SEA_PICKLE(19562, SeaPickle.class);
    public static final Material SHEARS = new ItemMaterial(ItemTypes.SHEARS.get(), "SHEARS");
    //SHEEP_SPAWN_EGG(24488);
    public static final Material SHIELD = new ItemMaterial(ItemTypes.SHIELD.get(), "SHIELD");
    //public static final Material SHULKER_BOX = new BlockMaterial(ItemTypes.SHULKER_BOX);
    public static final Material SHULKER_SHELL = new ItemMaterial(ItemTypes.SHULKER_SHELL.get(), "SHULKER_SHELL");
    //SHULKER_SPAWN_EGG(31848);
    //public static final Material SIGN = new BlockMaterial(BlockTypes.STANDING_SIGN, "SIGN");
    /*SILVERFISH_SPAWN_EGG(14537);
    SKELETON_HORSE_SPAWN_EGG(21356);*/
    public static final Material SKELETON_SKULL = new BlockMaterial(BlockTypes.SKELETON_SKULL.get(), "SKELETON_SKULL");
    //SKELETON_SPAWN_EGG(15261);
    public static final Material SKELETON_WALL_SKULL = new BlockMaterial(BlockTypes.SKELETON_WALL_SKULL.get(), "SKELETON_WALL_SKULL");
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
    SOUL_SAND(16841);*/
    public static final Material SPAWNER = new BlockMaterial(BlockTypes.SPAWNER.get(), "SPAWNER");
    /*SPECTRAL_ARROW(4568);
    SPIDER_EYE(9318);
    SPIDER_SPAWN_EGG(14984);*/
    public static final Material SPLASH_POTION = new ItemMaterial(ItemTypes.SPLASH_POTION.get(), "SPLASH_POTION");
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
    public static final Material STICKY_PISTON = new BlockMaterial(BlockTypes.STICKY_PISTON.get(), "STICKY_PISTON");
    public static final Material STONE = new BlockMaterial(BlockTypes.STONE.get(), "STONE");
    public static final Material STONE_AXE = new ItemMaterial(ItemTypes.STONE_AXE.get(), "STONE_AXE");
    /*STONE_BRICKS(6962);
    STONE_BRICK_SLAB(19676, Slab.class);
    STONE_BRICK_STAIRS(27032, Stairs.class);*/
    public static final Material STONE_BUTTON = new BlockMaterial(BlockTypes.STONE_BUTTON.get(), "STONE_BUTTON");
    public static final Material STONE_HOE = new ItemMaterial(ItemTypes.STONE_HOE.get(), "STONE_HOE");
    public static final Material STONE_PICKAXE = new ItemMaterial(ItemTypes.STONE_PICKAXE.get(), "STONE_PICKAXE");
    public static final Material STONE_PRESSURE_PLATE = new BlockMaterial(BlockTypes.STONE_PRESSURE_PLATE.get(), "STONE_PRESSURE_PLATE");
    public static final Material STONE_SHOVEL = new ItemMaterial(ItemTypes.STONE_SHOVEL.get(), "STONE_SHOVEL");
    //STONE_SLAB(19838, Slab.class);
    public static final Material STONE_SWORD = new ItemMaterial(ItemTypes.STONE_SWORD.get(), "STONE_SWORD");
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
    SUNFLOWER(7408, Bisected.class);*/
    public static final Material TALL_GRASS = new BlockMaterial(BlockTypes.TALL_GRASS.get(), "TALL_GRASS");
    /*TALL_SEAGRASS(27189, Bisected.class);
    TERRACOTTA(16544);
    TIPPED_ARROW(25164);*/
    public static final Material TNT = new BlockMaterial(BlockTypes.TNT.get(), "TNT");
    public static final Material TNT_MINECART = new ItemMaterial(ItemTypes.TNT_MINECART.get(), "TNT_MINECART");
    /*TORCH(6063);
    TOTEM_OF_UNDYING(10139, 1);*/
    public static final Material TRAPPED_CHEST = new ItemMaterial(ItemTypes.TRAPPED_CHEST.get(), "TRAPPED_CHEST");
    public static final Material TRIDENT = new ItemMaterial(ItemTypes.WOODEN_SWORD.get(), "TRIDENT"); //temp item - 1.12 doesnt have but is required for 1.13 API);
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
    public static final public static final Material VILLAGER_SPAWN_EGG = new ItemMaterial(ItemTypes.SPAWN_EGG, "VILLAGER_SPAWN_EGG");
    VINDICATOR_SPAWN_EGG(25324);
    VINE(14564, MultipleFacing.class);
    VOID_AIR(13668);*/
    //public static final Material WALL_SIGN = new BlockMaterial(BlockTypes.WALL_SIGN, "WALL_SIGN");
    /*WALL_TORCH(25890, Directional.class);*/
    public static final Material WATER = new BlockMaterial(BlockTypes.WATER.get(), "WATER");
    /*WATER_BUCKET(8802, 1);
    WET_SPONGE(9043);*/
    public static final Material WHEAT = new BlockMaterial(BlockTypes.WHEAT.get(), "WHEAT");
    /*WHEAT_SEEDS(28742);
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
    public static final Material WHITE_WOOL = new BlockMaterial(BlockTypes.WHITE_WOOL.get(), "WHITE_WOOL");
    //WITCH_SPAWN_EGG(11837);
    public static final Material WITHER_SKELETON_SKULL = new BlockMaterial(BlockTypes.WITHER_SKELETON_SKULL.get(), "WITHER_SKELETON_SKULL");
    //WITHER_SKELETON_SPAWN_EGG(10073);
    public static final Material WITHER_SKELETON_WALL_SKULL = new BlockMaterial(BlockTypes.WITHER_SKELETON_WALL_SKULL.get(), "WITHER_SKELETON_WALL_SKULL");
    //WOLF_SPAWN_EGG(21692);
    public static final Material WOODEN_AXE = new ItemMaterial(ItemTypes.WOODEN_AXE.get(), "WOODEN_AXE");
    public static final Material WOODEN_HOE = new ItemMaterial(ItemTypes.WOODEN_HOE.get(), "WOODEN_HOE");
    public static final Material WOODEN_PICKAXE = new ItemMaterial(ItemTypes.WOODEN_PICKAXE.get(), "WOODEN_PICKAXE");
    public static final Material WOODEN_SHOVEL = new ItemMaterial(ItemTypes.WOODEN_SHOVEL.get(), "WOODEN_SHOVEL");
    public static final Material WOODEN_SWORD = new ItemMaterial(ItemTypes.WOODEN_SWORD.get(), "WOODEN_SWORD");
    public static final Material WRITABLE_BOOK = new ItemMaterial(ItemTypes.WRITABLE_BOOK.get(), "WRITABLE_BOOK");
    public static final Material WRITTEN_BOOK = new ItemMaterial(ItemTypes.WRITTEN_BOOK.get(), "WRITTEN_BOOK");
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
    YELLOW_WALL_BANNER(32004, Directional.class);*/
    public static final Material YELLOW_WOOL = new BlockMaterial(BlockTypes.YELLOW_WOOL.get(), "YELLOW_WOOL");
    public static final Material ZOMBIE_HEAD = new BlockMaterial(BlockTypes.ZOMBIE_HEAD.get(), "ZOMBIE_HEAD"); //required for Bukkit API 1.13
    /*ZOMBIE_HORSE_SPAWN_EGG(4275);
    ZOMBIE_PIGMAN_SPAWN_EGG(11531);
    ZOMBIE_SPAWN_EGG(5814);
    ZOMBIE_VILLAGER_SPAWN_EGG(10311);
    ZOMBIE_WALL_HEAD = new BlockMaterial(BlockTypes.SKULL);*/
    public static final Material UNKNOWN = new UnknownMaterial();

    @Override
    @NotNull
    public abstract NamespacedKey getKey();
    public abstract String name();
    public abstract int getMaxStackSize();
    public abstract short getMaxDurability();
    @Deprecated
    public abstract Class<? extends MaterialData> getData();
    @Deprecated
    public abstract MaterialData getNewData(final byte raw);
    public abstract boolean isBlock();
    public abstract boolean isEdible();
    public abstract boolean isRecord();
    public abstract boolean isSolid();
    @Deprecated
    public abstract boolean isTransparent();
    public abstract boolean isFlammable();
    public abstract boolean isBurnable();
    public abstract boolean isFuel();
    public abstract boolean isOccluding();
    public abstract boolean hasGravity();
    public abstract boolean isItem();
    public abstract boolean isInteractable();
    public abstract float getHardness();
    public abstract float getBlastResistance();

    @Deprecated
    public int getId() {
        return -1;
    }

    @Deprecated
    public boolean isLegacy() {
        return false;
    }

    public abstract BlockData createBlockData();

    public abstract BlockData createBlockData(Consumer<BlockData> consumer);

    public abstract BlockData createBlockData(String data) throws IllegalArgumentException;

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Material)){
            return false;
        }
        Material material = (Material)obj;
        return material.name().equalsIgnoreCase(this.name());
    }

    @Override
    public String toString(){
        return this.name();
    }

    public static final Material getMaterial(final String name) {
        return getMaterial(name, false);
    }

    public static Material getMaterial(String name, boolean legacyName) {
        return Material.valueOf(name.toUpperCase());
    }

    public static Material matchMaterial(final String name) {
        return matchMaterial(name, false);
    }

    public static Material matchMaterial(String name, boolean legacyName) {
        return valueOf(m -> {
            NamespacedKey key = m.getKey();
            if(key.toString().equalsIgnoreCase(name)){
                return true;
            }
            return key.getNamespace().equalsIgnoreCase(name);
        });
    }

    public static final Material valueOf(Predicate<Material> material){
        return Stream.of(values()).filter(material).findAny().orElse(null);
    }

    public static final Material valueOf(String name){
        return valueOf(m -> m.name().equals(name));
    }

    public static final Material[] values(){
        Set<BongeMaterial> set = Bonge.getInstance().getMaterials();
        return set.toArray(new Material[set.size()]);
    }
}