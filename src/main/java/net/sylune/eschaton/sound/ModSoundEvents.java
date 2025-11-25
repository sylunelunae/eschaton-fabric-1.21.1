package net.sylune.eschaton.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.sylune.eschaton.Eschaton;

public class ModSoundEvents {

    public static final SoundEvent LAMP_TOGGLE = register(
            "lamp_toggle",
            SoundEvent.of(id("lamp_toggle"))
    );

    private static SoundEvent register(String name, SoundEvent soundEvent) {
        return Registry.register(Registries.SOUND_EVENT, id(name), soundEvent);
    }

    private static Identifier id(String name) {
        return Identifier.of(Eschaton.MOD_ID, name);
    }

    public static void registerModSoundEvents() {
        Eschaton.LOGGER.info("Registering Mod Sound Events for " + Eschaton.MOD_ID);
    }
}
