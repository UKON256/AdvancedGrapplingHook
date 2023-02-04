package jp.ukon.agh.modules.base.item;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import jp.ukon.agh.patches.init.InitCreativeTab;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class GrapplingHook extends Item {
    public GrapplingHook()
    {
        super();
        maxStackSize = 1;
        setFull3D();
        setUnlocalizedName("GrapplingHook");
        setCreativeTab(InitCreativeTab.TabGrapplingHook);

        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons()
    {
        
    }
}
