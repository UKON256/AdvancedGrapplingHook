package jp.ukon.agh;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import jp.ukon.agh.patches.init.*;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "agh", name="Advanced Grappling Hook", version="1.0.0")
public class AdvancedGrapplingHook {
    //変数たち
    public static final String ModId = "agh";
    public static final String ModName = "Advanced Grappling Hook";
    public static final String Version = "1.0.0";

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        InitCreativeTab.Init();
        InitItem.Init();
    }

    public AdvancedGrapplingHook() { MinecraftForge.EVENT_BUS.register(this); }
}
