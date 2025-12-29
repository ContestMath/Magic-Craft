package net.plaus.magiccraft.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.plaus.magiccraft.MagicCraftMod;
import net.plaus.magiccraft.entity.ModEntities;
import net.plaus.magiccraft.entity.client.FireballProjectileRenderer;

/*@Mod.EventBusSubscriber(modid = MagicCraftMod.MOD_ID, value = Dist.CLIENT)
public static class ClientSetup {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.FIREBALL.get(),FireballProjectileRenderer::new);
    }
}*/

@EventBusSubscriber(modid = MagicCraftMod.MOD_ID, value = Dist.CLIENT)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.FIREBALL.get(),FireballProjectileRenderer::new);
    }
}
