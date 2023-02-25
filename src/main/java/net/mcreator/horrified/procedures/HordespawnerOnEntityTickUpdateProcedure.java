package net.mcreator.horrified.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.horrified.init.HorrifiedModBlocks;

import java.util.Map;

public class HordespawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		while (entity.isAlive()) {
			if (Math.random() == 1) {
				if (!((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == HorrifiedModBlocks.HORDESPAWNGENBLOCK.get())) {
					if (!((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == HorrifiedModBlocks.HORDESPAWNERCORRUPTION.get())) {
						{
							BlockPos _bp = new BlockPos(x, y - 2, z);
							BlockState _bs = HorrifiedModBlocks.HORDESPAWNGENBLOCK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
			} else {
				if (!((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == HorrifiedModBlocks.HORDESPAWNGENBLOCK.get())) {
					if (!((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == HorrifiedModBlocks.HORDESPAWNERCORRUPTION.get())) {
						{
							BlockPos _bp = new BlockPos(x, y, y - 2);
							BlockState _bs = HorrifiedModBlocks.HORDESPAWNERCORRUPTION.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
			}
		}
	}
}
