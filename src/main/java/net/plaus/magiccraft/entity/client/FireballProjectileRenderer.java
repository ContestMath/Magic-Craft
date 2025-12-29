package net.plaus.magiccraft.entity.client;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.plaus.magiccraft.MagicCraftMod;
import net.plaus.magiccraft.entity.custom.FireballProjectileEntity;

public class FireballProjectileRenderer extends EntityRenderer<FireballProjectileEntity> {
    public FireballProjectileRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public ResourceLocation getTextureLocation(FireballProjectileEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(MagicCraftMod.MOD_ID, "textures/item/fireball.png");
    }
}
