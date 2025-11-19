package net.sylune.eschaton.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.sylune.eschaton.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LAMP_BLOCK)
                .add(ModBlocks.AMETHYST_LAMP_BLOCK)
                .add(ModBlocks.AMETHYST_LANTERN)
                .add(ModBlocks.REDSTONE_POWERED_LAMP_BLOCK)
                .add(ModBlocks.REDSTONE_POWERED_LANTERN)
                .add(ModBlocks.SOUL_LAMP_BLOCK)
                .add(ModBlocks.SCULK_JAW)
                .add(ModBlocks.WARPED_SHROOM_LAMP_BLOCK)
                .add(ModBlocks.CRIMSON_SHROOM_LAMP_BLOCK)
                .add(ModBlocks.FALLIUM_ORE_BLOCK)
                .add(ModBlocks.MOSSY_CHISELED_DEEPSLATE)
                .add(ModBlocks.MOSSY_COBBLED_DEEPSLATE)
                .add(ModBlocks.DEEPSLATE_PILLAR)
                .add(ModBlocks.MOSSY_DEEPSLATE_BRICKS)
                .add(ModBlocks.WHITE_COMPRESSED_WOOL)
                .add(ModBlocks.RED_COMPRESSED_WOOL)
                .add(ModBlocks.ORANGE_COMPRESSED_WOOL)
                .add(ModBlocks.YELLOW_COMPRESSED_WOOL)
                .add(ModBlocks.GREEN_COMPRESSED_WOOL)
                .add(ModBlocks.LIME_COMPRESSED_WOOL)
                .add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL)
                .add(ModBlocks.BLUE_COMPRESSED_WOOL)
                .add(ModBlocks.CYAN_COMPRESSED_WOOL)
                .add(ModBlocks.PURPLE_COMPRESSED_WOOL)
                .add(ModBlocks.MAGENTA_COMPRESSED_WOOL)
                .add(ModBlocks.PINK_COMPRESSED_WOOL)
                .add(ModBlocks.BROWN_COMPRESSED_WOOL)
                .add(ModBlocks.GRAY_COMPRESSED_WOOL)
                .add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL)
                .add(ModBlocks.BLACK_COMPRESSED_WOOL)

                .add(ModBlocks.CHISELED_END_STONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LAMP_BLOCK)
                .add(ModBlocks.AMETHYST_LAMP_BLOCK)
                .add(ModBlocks.AMETHYST_LANTERN)
                .add(ModBlocks.REDSTONE_POWERED_LAMP_BLOCK)
                .add(ModBlocks.REDSTONE_POWERED_LANTERN)
                .add(ModBlocks.SOUL_LAMP_BLOCK)
                .add(ModBlocks.SCULK_JAW)
                .add(ModBlocks.WARPED_SHROOM_LAMP_BLOCK)
                .add(ModBlocks.CRIMSON_SHROOM_LAMP_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.FALLIUM_ORE_BLOCK);

    }
}