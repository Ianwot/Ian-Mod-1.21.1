package com.gmail.siskian4000.ianmod.event;

import com.gmail.siskian4000.ianmod.IanMod;
import com.gmail.siskian4000.ianmod.entity.ModEntities;
import com.gmail.siskian4000.ianmod.entity.client.LionModel;
import com.gmail.siskian4000.ianmod.entity.custom.LionEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = IanMod.MOD_ID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(LionModel.LAYER_LOCATION, LionModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.LION.get(), LionEntity.createAttributes().build());
    }
}
