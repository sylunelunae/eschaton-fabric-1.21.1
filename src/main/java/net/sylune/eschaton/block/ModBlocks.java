package net.sylune.eschaton.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.sylune.eschaton.Eschaton;
import net.sylune.eschaton.block.SculkJawBlock;

public class ModBlocks {
    public static Block LAMP_BLOCK;
    public static Block SOUL_LAMP_BLOCK;
    public static Block AMETHYST_LAMP_BLOCK;
    public static Block WARPED_SHROOM_LAMP_BLOCK;
    public static Block CRIMSON_SHROOM_LAMP_BLOCK;
    public static Block REDSTONE_POWERED_LAMP_BLOCK;

    public static Block FALLIUM_ORE_BLOCK;

    public static Block SCULK_JAW;

    public static Block MOSSY_DEEPSLATE_BRICKS;
    public static Block MOSSY_CHISELED_DEEPSLATE;
    public static Block DEEPSLATE_PILLAR;
    public static Block MOSSY_COBBLED_DEEPSLATE;

    public static Block END_STONE_PILLAR;

    public static Block AMETHYST_LANTERN;
    public static Block REDSTONE_POWERED_LANTERN;

    public static Block WHITE_COMPRESSED_WOOL;
    public static Block PINK_COMPRESSED_WOOL;
    public static Block RED_COMPRESSED_WOOL;
    public static Block ORANGE_COMPRESSED_WOOL;
    public static Block YELLOW_COMPRESSED_WOOL;
    public static Block GREEN_COMPRESSED_WOOL;
    public static Block LIME_COMPRESSED_WOOL;
    public static Block CYAN_COMPRESSED_WOOL;
    public static Block BLUE_COMPRESSED_WOOL;
    public static Block LIGHT_BLUE_COMPRESSED_WOOL;
    public static Block MAGENTA_COMPRESSED_WOOL;
    public static Block PURPLE_COMPRESSED_WOOL;
    public static Block BROWN_COMPRESSED_WOOL;
    public static Block BLACK_COMPRESSED_WOOL;
    public static Block GRAY_COMPRESSED_WOOL;
    public static Block LIGHT_GRAY_COMPRESSED_WOOL;

    public static Block CHISELED_END_STONE;
    public static Block CRACKED_END_STONE_BRICKS;
    public static Block POLISHED_END_STONE;
    public static Block TWILIGHT_PURPUR;
    public static Block CHISELED_PURPUR;

    public static void registerModBlocks() {
        Eschaton.LOGGER.info("Registering Mod Blocks for " + Eschaton.MOD_ID);

        CHISELED_PURPUR = registerBlock("chiseled_purpur",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        TWILIGHT_PURPUR = registerBlock("twilight_purpur",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        POLISHED_END_STONE = registerBlock("polished_end_stone",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        CHISELED_END_STONE = registerBlock("chiseled_end_stone",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        END_STONE_PILLAR = registerBlock("end_stone_pillar",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(3f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));



        WHITE_COMPRESSED_WOOL = registerBlock("white_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));

        PINK_COMPRESSED_WOOL = registerBlock("pink_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        RED_COMPRESSED_WOOL = registerBlock("red_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        ORANGE_COMPRESSED_WOOL = registerBlock("orange_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        YELLOW_COMPRESSED_WOOL = registerBlock("yellow_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        GREEN_COMPRESSED_WOOL = registerBlock("green_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        LIME_COMPRESSED_WOOL = registerBlock("lime_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        LIGHT_BLUE_COMPRESSED_WOOL = registerBlock("light_blue_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        BLUE_COMPRESSED_WOOL = registerBlock("blue_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        CYAN_COMPRESSED_WOOL = registerBlock("cyan_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        MAGENTA_COMPRESSED_WOOL = registerBlock("magenta_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));
        BROWN_COMPRESSED_WOOL = registerBlock("brown_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));

        PURPLE_COMPRESSED_WOOL = registerBlock("purple_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));

        BLACK_COMPRESSED_WOOL = registerBlock("black_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));

        GRAY_COMPRESSED_WOOL = registerBlock("gray_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));

        LIGHT_GRAY_COMPRESSED_WOOL = registerBlock("light_gray_compressed_wool",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(1.25f)
                        .sounds(BlockSoundGroup.WOOL)));



        DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",
                new PillarBlock(AbstractBlock.Settings.create()
                        .strength(2f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        MOSSY_DEEPSLATE_BRICKS= registerBlock("mossy_deepslate_bricks",
                new Block(AbstractBlock.Settings.create()
                        .strength(2f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
                new Block(AbstractBlock.Settings.create()
                        .strength(2f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        MOSSY_CHISELED_DEEPSLATE= registerBlock("mossy_chiseled_deepslate",
                new Block(AbstractBlock.Settings.create()
                        .strength(2f)
                        .requiresTool()
                        .sounds(BlockSoundGroup.STONE)));

        SCULK_JAW = registerBlock("sculk_jaw",
                new SculkJawBlock(AbstractBlock.Settings.create()
                        .strength(0.15f)
                        .sounds(BlockSoundGroup.SCULK)
                        .luminance(state -> 3)
                        .nonOpaque()));



        FALLIUM_ORE_BLOCK = registerBlock("fallium_ore_block",
                new ExperienceDroppingBlock(UniformIntProvider.create(5, 7),
                        AbstractBlock.Settings.create()
                                .strength(3.5f)
                                .sounds(BlockSoundGroup.STONE)
                                .requiresTool()));




        LAMP_BLOCK = registerBlock("lamp_block",
                new LampBlock(AbstractBlock.Settings.create()
                        .strength(3f)
                        .sounds(BlockSoundGroup.LANTERN)
                        .requiresTool()
                        .luminance(state -> 13)));

        SOUL_LAMP_BLOCK = registerBlock("soul_lamp_block",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .sounds(BlockSoundGroup.LANTERN)
                        .luminance(state -> 13)
                        .requiresTool()));

        AMETHYST_LAMP_BLOCK = registerBlock("amethyst_lamp_block",
                new Block(AbstractBlock.Settings.create()
                        .strength(3f)
                        .sounds(BlockSoundGroup.LANTERN)
                        .luminance(state -> 14)
                        .requiresTool()));

        AMETHYST_LANTERN = registerBlock("amethyst_lantern",
                new LanternBlock(AbstractBlock.Settings.create()
                        .strength(1.8f)
                        .sounds(BlockSoundGroup.LANTERN)
                        .luminance(state -> 14)
                        .requiresTool()));

        REDSTONE_POWERED_LANTERN = registerBlock("redstone_powered_lantern",
                new LanternBlock(AbstractBlock.Settings.create()
                        .nonOpaque()
                        .strength(1.8f)
                        .sounds(BlockSoundGroup.LANTERN)
                        .luminance(state -> 12)
                        .solid()
                        .requiresTool()) {

                    @Override
                    public boolean emitsRedstonePower(BlockState state) {
                        return true;
                    }

                    @Override
                    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
                        return 15;
                    }

                    @Override
                    public int getStrongRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
                        return 15;
                    }
                });

        WARPED_SHROOM_LAMP_BLOCK = registerBlock("warped_shroom_lamp_block",
                new Block(AbstractBlock.Settings.create()
                        .strength(1.5f)
                        .sounds(BlockSoundGroup.SHROOMLIGHT)
                        .luminance(state -> 15)));

        CRIMSON_SHROOM_LAMP_BLOCK = registerBlock("crimson_shroom_lamp_block",
                new Block(AbstractBlock.Settings.create()
                        .strength(1.5f)
                        .sounds(BlockSoundGroup.SHROOMLIGHT)
                        .luminance(state -> 15)));

        REDSTONE_POWERED_LAMP_BLOCK = registerBlock("redstone_powered_lamp_block",
                new Block(AbstractBlock.Settings.create()
                        .requiresTool()
                        .strength(3f)
                        .sounds(BlockSoundGroup.LANTERN)
                        .luminance(state -> 10)
                        .solid()) {
                    @Override
                    public boolean emitsRedstonePower(BlockState state) {
                        return true;
                    }

                    @Override
                    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
                        return 15;
                    }

                    @Override
                    public int getStrongRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
                        return 15;
                    }
                });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(REDSTONE_POWERED_LAMP_BLOCK);
            entries.add(REDSTONE_POWERED_LANTERN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(LAMP_BLOCK);
            entries.add(SOUL_LAMP_BLOCK);
            entries.add(AMETHYST_LAMP_BLOCK);
            entries.add(AMETHYST_LANTERN);
            entries.add(WARPED_SHROOM_LAMP_BLOCK);
            entries.add(CRIMSON_SHROOM_LAMP_BLOCK);
            entries.add(REDSTONE_POWERED_LAMP_BLOCK);
            entries.add(REDSTONE_POWERED_LANTERN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(FALLIUM_ORE_BLOCK);
            entries.add(SCULK_JAW);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MOSSY_DEEPSLATE_BRICKS);
            entries.add(MOSSY_CHISELED_DEEPSLATE);
            entries.add(DEEPSLATE_PILLAR);
            entries.add(END_STONE_PILLAR);
            entries.add(CHISELED_END_STONE);
            entries.add(CRACKED_END_STONE_BRICKS);
            entries.add(POLISHED_END_STONE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(WHITE_COMPRESSED_WOOL);
            entries.add(PINK_COMPRESSED_WOOL);
            entries.add(RED_COMPRESSED_WOOL);
            entries.add(ORANGE_COMPRESSED_WOOL);
            entries.add(YELLOW_COMPRESSED_WOOL);
            entries.add(LIME_COMPRESSED_WOOL);
            entries.add(GREEN_COMPRESSED_WOOL);
            entries.add(BLUE_COMPRESSED_WOOL);
            entries.add(CYAN_COMPRESSED_WOOL);
            entries.add(LIGHT_BLUE_COMPRESSED_WOOL);
            entries.add(MAGENTA_COMPRESSED_WOOL);
            entries.add(PURPLE_COMPRESSED_WOOL);
            entries.add(BROWN_COMPRESSED_WOOL);
            entries.add(GRAY_COMPRESSED_WOOL);
            entries.add(LIGHT_GRAY_COMPRESSED_WOOL);
            entries.add(BLACK_COMPRESSED_WOOL);
        });
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Eschaton.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Eschaton.MOD_ID, name), new BlockItem(block, new Item.Settings()));

    }}