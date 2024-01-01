package me.PianoPenguin471;

import keystrokesmod.client.main.Raven;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.event.EventBus;
import net.weavemc.loader.api.event.StartGameEvent;

public class RavenWeaveLite implements ModInitializer {
    @Override
    public void preInit() {
        EventBus.subscribe(StartGameEvent.Post.class, (startGameEvent) -> Raven.init());
    }
}