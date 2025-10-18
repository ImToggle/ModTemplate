package me.imtoggle.modtemplate

import me.imtoggle.modtemplate.client.ModClient
import net.fabricmc.api.ClientModInitializer

class ModEntrypoint : ClientModInitializer {

    override fun onInitializeClient() {
        ModClient.initialize()
    }

}