package me.imtoggle.template

import me.imtoggle.template.config.ModConfig
import net.fabricmc.api.ClientModInitializer

class TemplateMod : ClientModInitializer {

    override fun onInitializeClient() {
        ModConfig.preload()
    }

}