package jp.ukon.agh.client.gui.slots;

import jp.ukon.agh.client.gui.slots.base.BaseSlot;
import jp.ukon.agh.patches.init.InitItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;

public class SlotThunderspear extends BaseSlot {
    public SlotThunderspear(IInventory inventory, int id, int xPosition, int yPosition) {
        super(inventory, id, xPosition, yPosition, 1, new Item[] {InitItem.TimedThunderSpear, InitItem.WiredThunderSpear});
    }
}
