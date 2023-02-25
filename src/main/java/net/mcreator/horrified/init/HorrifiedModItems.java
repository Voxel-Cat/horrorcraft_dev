
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horrified.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.horrified.HorrifiedMod;

public class HorrifiedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HorrifiedMod.MODID);
	public static final RegistryObject<Item> HORDESPAWNGENBLOCK = block(HorrifiedModBlocks.HORDESPAWNGENBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HORDESPAWNER = REGISTRY.register("hordespawner_spawn_egg",
			() -> new ForgeSpawnEggItem(HorrifiedModEntities.HORDESPAWNER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HORDESPAWNERCORRUPTION = block(HorrifiedModBlocks.HORDESPAWNERCORRUPTION,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
