package net.plaus.magiccraft.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.plaus.magiccraft.MagicCraftMod;
import net.plaus.magiccraft.items.custom.FireballItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MagicCraftMod.MOD_ID);

    public static final DeferredItem<Item> FIREBALL = ITEMS.register("fireball",
            () -> new FireballItem(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
