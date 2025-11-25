package net.sylune.eschaton.sound;

import net.sylune.eschaton.Eschaton;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent LAMP_TOGGLE = register("lamp_toggle");

    private static SoundEvent register(String name) {
        Identifier id = Identifier.of(Eschaton.MOD_ID, name);
        SoundEvent sound = SoundEvent.of(id);
        return Registry.register(Registries.SOUND_EVENT, id, sound);
    }

    public static void registerSounds() {
        Eschaton.LOGGER.info("Registering Mod Sounds for " + Eschaton.MOD_ID);
    }
}
