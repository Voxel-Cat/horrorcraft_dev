
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horrified.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.horrified.block.HordespawngenblockBlock;
import net.mcreator.horrified.block.HordespawnercorruptionBlock;
import net.mcreator.horrified.HorrifiedMod;

public class HorrifiedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HorrifiedMod.MODID);
	public static final RegistryObject<Block> HORDESPAWNGENBLOCK = REGISTRY.register("hordespawngenblock", () -> new HordespawngenblockBlock());
	public static final RegistryObject<Block> HORDESPAWNERCORRUPTION = REGISTRY.register("hordespawnercorruption",
			() -> new HordespawnercorruptionBlock());
}
