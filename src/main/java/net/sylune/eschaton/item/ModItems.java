package net.sylune.eschaton.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.sylune.eschaton.Eschaton;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ELIXIR_BOTTLE = registerItem("elixir_bottle", new Item(new Item.Settings()));
    public static final Item FALLIUM_KEY = registerItem("fallium_key", new Item(new Item.Settings()));
    public static final Item FALLIUM_PEBBLES = registerItem("fallium_pebbles", new Item(new Item.Settings()));
    public static final Item FALLIUM_PLATING = registerItem("fallium_plating", new Item(new Item.Settings()));
    public static final Item ASYSTOLE_BLOOM = registerItem("asystole_bloom", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Eschaton.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Eschaton.LOGGER.info("Registering Mod Items for " + Eschaton.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ELIXIR_BOTTLE);
            entries.add(FALLIUM_KEY);
            entries.add(FALLIUM_PLATING);
            entries.add(FALLIUM_PEBBLES);
            entries.add(ASYSTOLE_BLOOM);
        });
    }
}