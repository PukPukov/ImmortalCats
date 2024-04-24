package ru.ancap.immortalcats;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.passive.CatEntity;

public class ImmortalCats implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> !(entity instanceof CatEntity));
    }
    
}