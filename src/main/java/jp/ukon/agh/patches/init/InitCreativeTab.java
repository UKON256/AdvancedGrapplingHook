package jp.ukon.agh.patches.init;

import jp.ukon.agh.modules.base.creativetab.AdvancedGrapplingHookTab;
import net.minecraft.creativetab.CreativeTabs;

public class InitCreativeTab {
    public static CreativeTabs TabGrapplingHook;

    public static void Init()
    {
        TabGrapplingHook = new AdvancedGrapplingHookTab("Advanced Grappling Hook");
    }
}
