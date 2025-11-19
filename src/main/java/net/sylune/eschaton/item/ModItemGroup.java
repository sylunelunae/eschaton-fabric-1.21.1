package net.sylune.eschaton.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.sylune.eschaton.Eschaton;
import net.sylune.eschaton.block.ModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ESCHATON_ADDITIONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Eschaton.MOD_ID, "eschaton_additions"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.LAMP_BLOCK))
                    .displayName(Text.translatable("itemgroups.eschaton.eschaton_additions"))
                    .entries((displayContext, entries) -> {entries.add(ModBlocks.LAMP_BLOCK);
                        entries.add(ModBlocks.SOUL_LAMP_BLOCK);
                        entries.add(ModBlocks.AMETHYST_LAMP_BLOCK);
                        entries.add(ModBlocks.AMETHYST_LANTERN);
                        entries.add(ModBlocks.REDSTONE_POWERED_LAMP_BLOCK);
                        entries.add(ModBlocks.REDSTONE_POWERED_LANTERN);
                        entries.add(ModBlocks.WARPED_SHROOM_LAMP_BLOCK);
                        entries.add(ModBlocks.CRIMSON_SHROOM_LAMP_BLOCK);
                        entries.add(ModBlocks.SCULK_JAW);
                        entries.add(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
                        entries.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                        entries.add(ModBlocks.MOSSY_CHISELED_DEEPSLATE);
                        entries.add(ModBlocks.DEEPSLATE_PILLAR);
                        entries.add(ModBlocks.END_STONE_PILLAR);
                        entries.add(ModBlocks.CHISELED_END_STONE);
                        entries.add(ModBlocks.CRACKED_END_STONE_BRICKS);
                        entries.add(ModBlocks.POLISHED_END_STONE);
                        entries.add(ModBlocks.FALLIUM_ORE_BLOCK);

                        entries.add(ModBlocks.WHITE_COMPRESSED_WOOL);
                        entries.add(ModBlocks.RED_COMPRESSED_WOOL);
                        entries.add(ModBlocks.ORANGE_COMPRESSED_WOOL);
                        entries.add(ModBlocks.YELLOW_COMPRESSED_WOOL);
                        entries.add(ModBlocks.GREEN_COMPRESSED_WOOL);
                        entries.add(ModBlocks.LIME_COMPRESSED_WOOL);
                        entries.add(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
                        entries.add(ModBlocks.BLUE_COMPRESSED_WOOL);
                        entries.add(ModBlocks.CYAN_COMPRESSED_WOOL);
                        entries.add(ModBlocks.PURPLE_COMPRESSED_WOOL);
                        entries.add(ModBlocks.MAGENTA_COMPRESSED_WOOL);
                        entries.add(ModBlocks.PINK_COMPRESSED_WOOL);
                        entries.add(ModBlocks.BROWN_COMPRESSED_WOOL);
                        entries.add(ModBlocks.GRAY_COMPRESSED_WOOL);
                        entries.add(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
                        entries.add(ModBlocks.BLACK_COMPRESSED_WOOL);


                        entries.add(ModItems.FALLIUM_KEY);
                        entries.add(ModItems.FALLIUM_PEBBLES);
                        entries.add(ModItems.FALLIUM_PLATING);
                        entries.add(ModItems.ASYSTOLE_BLOOM);
                        entries.add(ModItems.ELIXIR_BOTTLE);
                        entries.add(ModItems.WATER_ELIXIR);

                    }).build());

    public static void registerItemGroups() {
        Eschaton.LOGGER.info("Registering Item Groups for " + Eschaton.MOD_ID);
    }
}