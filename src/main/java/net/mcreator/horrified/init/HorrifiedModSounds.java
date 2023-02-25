
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horrified.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.horrified.HorrifiedMod;

public class HorrifiedModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HorrifiedMod.MODID);
	public static final RegistryObject<SoundEvent> SCARYTRACK1 = REGISTRY.register("scarytrack1",
			() -> new SoundEvent(new ResourceLocation("horrified", "scarytrack1")));
}
