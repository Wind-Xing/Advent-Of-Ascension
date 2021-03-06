package net.tslat.aoa3.structure.crystevia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class BlueCrystalChunk2 extends AoAStructure { //StructureSize: 2x4x2
	private static final IBlockState blueCrystal = BlockRegister.crystalBlue.getDefaultState();

	public BlueCrystalChunk2() {
		super("BlueCrystalChunk2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, blueCrystal);
		addBlock(world, basePos, 0, 0, 1, blueCrystal);
		addBlock(world, basePos, 1, 0, 0, blueCrystal);
		addBlock(world, basePos, 1, 0, 1, blueCrystal);
		addBlock(world, basePos, 0, 1, 0, blueCrystal);
		addBlock(world, basePos, 0, 1, 1, blueCrystal);
		addBlock(world, basePos, 1, 1, 0, blueCrystal);
		addBlock(world, basePos, 1, 1, 1, blueCrystal);
		addBlock(world, basePos, 0, 2, 0, blueCrystal);
		addBlock(world, basePos, 0, 2, 1, blueCrystal);
		addBlock(world, basePos, 1, 2, 0, blueCrystal);
		addBlock(world, basePos, 1, 2, 1, blueCrystal);
		addBlock(world, basePos, 0, 3, 0, blueCrystal);
		addBlock(world, basePos, 0, 3, 1, blueCrystal);
		addBlock(world, basePos, 1, 3, 0, blueCrystal);
		addBlock(world, basePos, 1, 3, 1, blueCrystal);
	}
}
