package me.imtoggle.template.plugin

import com.bawnorton.mixinsquared.MixinSquaredBootstrap
import org.objectweb.asm.tree.ClassNode
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
import org.spongepowered.asm.mixin.extensibility.IMixinInfo

class TemplateMixinPlugin : IMixinConfigPlugin {

    override fun onLoad(mixinPackage: String) {
        MixinSquaredBootstrap.init()
    }

    override fun getRefMapperConfig() = null

    override fun shouldApplyMixin(targetClassName: String, mixinClassName: String) = true

    override fun acceptTargets(myTargets: Set<String>, otherTargets: Set<String>) {
    }

    override fun getMixins() = buildList {
        MixinSquaredBootstrap.reOrderExtensions()
        add("ExampleMixin")
    }

    override fun preApply(targetClassName: String, targetClass: ClassNode, mixinClassName: String, mixinInfo: IMixinInfo) {
    }

    override fun postApply(targetClassName: String, targetClass: ClassNode, mixinClassName: String, mixinInfo: IMixinInfo) {
    }
}