package net.plaus.magiccraft.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.plaus.magiccraft.MagicCraftMod;
import net.plaus.magiccraft.entity.custom.FireballProjectileEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MagicCraftMod.MOD_ID);

    public static final Supplier<EntityType<FireballProjectileEntity>> FIREBALL =
            ENTITY_TYPES.register("fireball", () -> EntityType.Builder.<FireballProjectileEntity>of(FireballProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 1.15f).build("fireball"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
