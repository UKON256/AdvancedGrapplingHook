package jp.ukon.agh.modules.base.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AdvancedGrapplingHookTab extends CreativeTabs {
    public AdvancedGrapplingHookTab(String label)
    {
        super(label);
    }

    @Override
    public Item getTabIconItem()
    {
        return Items.lava_bucket;
    }
}
