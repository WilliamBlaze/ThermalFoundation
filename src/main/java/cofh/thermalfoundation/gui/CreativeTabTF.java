package cofh.thermalfoundation.gui;

import cofh.thermalfoundation.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabTF extends CreativeTabs {

	private final String label;

	public CreativeTabTF() {

		this("");
	}

	public CreativeTabTF(String label) {

		super("ThermalFoundation" + label);
		this.label = label;
	}

	protected ItemStack getStack() {

		return BlockOre.oreCopper;
	}

	@Override
	@SideOnly (Side.CLIENT)
	public ItemStack getIconItemStack() {

		return getStack();
	}

	@Override
	@SideOnly (Side.CLIENT)
	public ItemStack getTabIconItem() {

		return getIconItemStack();
	}

	@Override
	@SideOnly (Side.CLIENT)
	public String getTabLabel() {

		return "thermalfoundation.creativeTab" + label;
	}

}
