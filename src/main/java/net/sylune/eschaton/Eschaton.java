package net.sylune.eschaton;

import net.fabricmc.api.ModInitializer;

import net.sylune.eschaton.block.ModBlocks;
import net.sylune.eschaton.item.ModItemGroup;
import net.sylune.eschaton.item.ModItems;
import net.sylune.eschaton.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eschaton implements ModInitializer {
	public static final String MOD_ID = "eschaton";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModSounds.registerAll();
    }
}