package thaumic.tinkerer.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import thaumic.tinkerer.common.lib.LibBlockNames;
import thaumic.tinkerer.common.potion.TileForcefield;
import thaumic.tinkerer.common.registry.ThaumicTinkererRecipe;
import thaumic.tinkerer.common.research.IRegisterableResearch;

/**
 * Created by pixlepix on 4/19/14.
 */
public class BlockForcefield extends BlockMod {
	public BlockForcefield() {
		super(Material.air);
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileForcefield();
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public String getBlockName() {
		return LibBlockNames.FORCEFIELD;
	}

	@Override
	public IRegisterableResearch getResearchItem() {
		return null;
	}

	@Override
	public ThaumicTinkererRecipe getRecipeItem() {
		return null;
	}

	@Override
	public boolean shouldDisplayInTab() {
		return false;
	}
}
