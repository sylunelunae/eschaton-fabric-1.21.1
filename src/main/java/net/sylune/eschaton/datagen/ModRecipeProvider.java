package net.sylune.eschaton.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.sylune.eschaton.block.ModBlocks;
import net.sylune.eschaton.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // AMETHYST LAMP BLOCK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_LAMP_BLOCK)
                .pattern("ICI")
                .pattern("ITI")
                .pattern("ICI")
                .input('C', Items.IRON_NUGGET)
                .input('I', Items.IRON_INGOT)
                .input('T', Items.AMETHYST_CLUSTER)
                .criterion(hasItem(Items.AMETHYST_CLUSTER), conditionsFromItem(Items.AMETHYST_CLUSTER))
                .offerTo(exporter);

        // AMETHYST LANTERN
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AMETHYST_LANTERN)
                .pattern("III")
                .pattern("ITI")
                .pattern("III")
                .input('I', Items.IRON_NUGGET)
                .input('T', Items.AMETHYST_CLUSTER)
                .criterion(hasItem(Items.AMETHYST_CLUSTER), conditionsFromItem(Items.AMETHYST_CLUSTER))
                .offerTo(exporter);

        // CRIMSON SHROOM LAMP
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRIMSON_SHROOM_LAMP_BLOCK)
                .pattern("CIC")
                .pattern("ITI")
                .pattern("CIC")
                .input('C', Items.CRIMSON_PLANKS)
                .input('I', Items.STICK)
                .input('T', Items.SHROOMLIGHT)
                .criterion(hasItem(Items.SHROOMLIGHT), conditionsFromItem(Items.SHROOMLIGHT))
                .offerTo(exporter);

        // ELIXIR BOTTLE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELIXIR_BOTTLE)
                .pattern(" F ")
                .pattern("F F")
                .pattern("FFF")
                .input('F', Items.GLASS)
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter);

        // FALLIUM PLATING
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FALLIUM_PLATING)
                .pattern("FFF")
                .pattern(" F ")
                .input('F', ModItems.FALLIUM_PEBBLES)
                .criterion(hasItem(ModItems.FALLIUM_PEBBLES), conditionsFromItem(ModItems.FALLIUM_PEBBLES))
                .offerTo(exporter);

        // LAMP BLOCK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LAMP_BLOCK)
                .pattern("ICI")
                .pattern("ITI")
                .pattern("ICI")
                .input('C', Items.IRON_NUGGET)
                .input('I', Items.IRON_INGOT)
                .input('T', Items.TORCH)
                .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                .offerTo(exporter);

        // REDSTONE LAMP BLOCK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REDSTONE_POWERED_LAMP_BLOCK)
                .pattern("ICI")
                .pattern("ITI")
                .pattern("ICI")
                .input('C', Items.IRON_NUGGET)
                .input('I', Items.IRON_INGOT)
                .input('T', Items.REDSTONE_TORCH)
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter);

        // REDSTONE LANTERN
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REDSTONE_POWERED_LANTERN)
                .pattern("III")
                .pattern("ITI")
                .pattern("III")
                .input('I', Items.IRON_NUGGET)
                .input('T', Items.REDSTONE_TORCH)
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter);

        // SOUL LAMP BLOCK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUL_LAMP_BLOCK)
                .pattern("ICI")
                .pattern("ITI")
                .pattern("ICI")
                .input('C', Items.IRON_NUGGET)
                .input('I', Items.IRON_INGOT)
                .input('T', Items.SOUL_TORCH)
                .criterion(hasItem(Items.SOUL_TORCH), conditionsFromItem(Items.SOUL_TORCH))
                .offerTo(exporter);

        // WARPED SHROOM LAMP
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WARPED_SHROOM_LAMP_BLOCK)
                .pattern("CIC")
                .pattern("ITI")
                .pattern("CIC")
                .input('C', Items.WARPED_PLANKS)
                .input('I', Items.STICK)
                .input('T', Items.SHROOMLIGHT)
                .criterion(hasItem(Items.SHROOMLIGHT), conditionsFromItem(Items.SHROOMLIGHT))
                .offerTo(exporter);

        // 2x2 COMPRESSED WOOL (FIXED)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WHITE_COMPRESSED_WOOL)
                .pattern("WW")
                .pattern("WW")
                .input('W', Items.WHITE_WOOL)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(exporter);
    }
}
