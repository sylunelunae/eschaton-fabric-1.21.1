package net.sylune.eschaton.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.sylune.eschaton.block.ModBlocks;
import net.sylune.eschaton.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_LAMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMETHYST_LAMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_POWERED_LAMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_SHROOM_LAMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_SHROOM_LAMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMETHYST_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_POWERED_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCULK_JAW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_CHISELED_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_COMPRESSED_WOOL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ASYSTOLE_BLOOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.FALLIUM_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.FALLIUM_PEBBLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.FALLIUM_PLATING, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELIXIR_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.WATER_ELIXIR, Models.GENERATED);
    }
}