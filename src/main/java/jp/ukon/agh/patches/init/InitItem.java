package jp.ukon.agh.patches.init;

import jp.ukon.agh.common.item.base.BaseItem;
import net.minecraft.item.Item;
import java.util.*;

public class InitItem {
    public static List<Item> Items = new ArrayList<Item>();

    //===== メイン =====//
    public static Item Handle;              //ハンドル
    public static Item TimedThunderSpear;   //時限式雷槍
    public static Item WiredThunderSpear;   //ワイヤ式雷槍
    public static Item Blade;               //ブレード
    public static Item BrokenBlade;         //折れたブレード

    //===== 中間素材 =====//
    public static Item IronSpear;           //雷槍の先っぽ(共通)
    public static Item IronHole;            //雷槍の中間  (共通)
    public static Item Accelerator;         //雷槍の加速部(共通)
    public static Item Wire;                //雷槍の中間素材(ワイヤータイプ)

    public static void PreInit()
    {
        //===== メイン =====//
        //Handle = new HandleNormal();

        //===== 中間素材 =====//
        IronSpear = new BaseItem("IronSpear");
        IronHole = new BaseItem("IronHole");
        Accelerator = new BaseItem("Accelerator");
        Wire = new BaseItem("Wire");
    }
}
