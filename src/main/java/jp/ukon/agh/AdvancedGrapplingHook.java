package jp.ukon.agh;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
//import jp.ukon.agh.common.CommonProxy;
import jp.ukon.agh.patches.init.InitBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import jp.ukon.agh.patches.init.*;
import org.apache.logging.log4j.*;

@Mod(modid = "agh", name="Advanced Grappling Hook", version="1.0.0")
public class AdvancedGrapplingHook {
    public static final String ModId = "agh";
    public static final String ModName = "Advanced Grappling Hook";
    public static final String Version = "1.0.0";
    public static final Logger Logger = LogManager.getLogger("AdvancedGrapplingHook");
    @Instance("AdvancedGrapplingHook")
    public static AdvancedGrapplingHook Instance;
    /*@SidedProxy(
        clientSide = "jp.ukon.agh.client.ClientProxy",
        serverSide = "jp.ukon.agh.common.CommonProxy"
    )
    public static CommonProxy proxy;*/


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        InitBlock.PreInit();
        InitItem.PreInit();
        //NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
    }
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        InitInventoryTab.PostInit();
    }


    public AdvancedGrapplingHook() { MinecraftForge.EVENT_BUS.register(this); }

    public static final CreativeTabs tabAGH = new CreativeTabs("tabAGH") {
        @SideOnly(Side.CLIENT)
        @Override
        public Item getTabIconItem() {
            return Items.compass;
        }
    };
}
