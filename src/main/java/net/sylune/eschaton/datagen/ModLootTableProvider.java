package net.sylune.eschaton.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.sylune.eschaton.block.ModBlocks;
import net.sylune.eschaton.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LAMP_BLOCK);
        addDrop(ModBlocks.AMETHYST_LAMP_BLOCK);
        addDrop(ModBlocks.AMETHYST_LANTERN);
        addDrop(ModBlocks.REDSTONE_POWERED_LAMP_BLOCK);
        addDrop(ModBlocks.REDSTONE_POWERED_LANTERN);
        addDrop(ModBlocks.SOUL_LAMP_BLOCK);
        addDrop(ModBlocks.SCULK_JAW);
        addDrop(ModBlocks.WARPED_SHROOM_LAMP_BLOCK);
        addDrop(ModBlocks.CRIMSON_SHROOM_LAMP_BLOCK);

        addDrop(ModBlocks.MOSSY_CHISELED_DEEPSLATE);
        addDrop(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
        addDrop(ModBlocks.DEEPSLATE_PILLAR);
        addDrop(ModBlocks.MOSSY_DEEPSLATE_BRICKS);

        addDrop(ModBlocks.WHITE_COMPRESSED_WOOL);
        addDrop(ModBlocks.RED_COMPRESSED_WOOL);
        addDrop(ModBlocks.ORANGE_COMPRESSED_WOOL);
        addDrop(ModBlocks.YELLOW_COMPRESSED_WOOL);
        addDrop(ModBlocks.GREEN_COMPRESSED_WOOL);
        addDrop(ModBlocks.LIME_COMPRESSED_WOOL);
        addDrop(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
        addDrop(ModBlocks.BLUE_COMPRESSED_WOOL);
        addDrop(ModBlocks.CYAN_COMPRESSED_WOOL);
        addDrop(ModBlocks.PURPLE_COMPRESSED_WOOL);
        addDrop(ModBlocks.MAGENTA_COMPRESSED_WOOL);
        addDrop(ModBlocks.PINK_COMPRESSED_WOOL);
        addDrop(ModBlocks.BROWN_COMPRESSED_WOOL);
        addDrop(ModBlocks.GRAY_COMPRESSED_WOOL);
        addDrop(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
        addDrop(ModBlocks.BLACK_COMPRESSED_WOOL);

        // Only this one — REMOVE the other
        addDrop(ModBlocks.FALLIUM_ORE_BLOCK,
                oreDrops(ModBlocks.FALLIUM_ORE_BLOCK, ModItems.FALLIUM_PEBBLES));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}