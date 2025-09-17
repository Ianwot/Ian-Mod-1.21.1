package com.gmail.siskian4000.ianmod.entity;

import com.gmail.siskian4000.ianmod.IanMod;
import com.gmail.siskian4000.ianmod.entity.custom.LionEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, IanMod.MOD_ID);

    public static final Supplier<EntityType<LionEntity>> LION =
            ENTITY_TYPES.register("lion", () -> EntityType.Builder.of(LionEntity::new, MobCategory.CREATURE).sized(0.625f,1.3125f).build("lion"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
