package net.plaus.magiccraft.items;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.plaus.magiccraft.MagicCraftMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicCraftMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MAGIC_CRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("magic_craft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FIREBALL.get()))
                    .title(Component.translatable("creativetab.plausmagiccraft.bismuth_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FIREBALL);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
