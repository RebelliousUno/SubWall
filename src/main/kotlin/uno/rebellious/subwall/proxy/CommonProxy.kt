package uno.rebellious.subwall.proxy

import java.io.File
import net.minecraft.item.ItemBlock
import net.minecraftforge.common.config.Configuration
import net.minecraftforge.event.RegistryEvent
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import uno.rebellious.subwall.Config
import uno.rebellious.subwall.block.BlockSubWallPiece
import uno.rebellious.subwall.block.ModBlocks
import uno.rebellious.subwall.item.ModItems


@Mod.EventBusSubscriber
open class CommonProxy {
    companion object {
        var config: Configuration? = null

        val blocks = ModBlocks
        val itesm = ModItems

        @SubscribeEvent
        fun registerBlocks(event: RegistryEvent.Register<Block>) {
            event.registry.registerAll(blocks.sub_wall_piece)
        }

        @SubscribeEvent
        fun registerItems(event: RegistryEvent.Register<Item>) {
            event.registry.registerAll(Item.getItemFromBlock(blocks.sub_wall_piece))
        }

    }

    open fun preInit(event: FMLPreInitializationEvent) {
        val configDir = event.modConfigurationDirectory
        config = Configuration(File(configDir.path, "subwall.cfg"))
        Config.readConfig()
    }

    fun init(event: FMLInitializationEvent) {

    }

    fun postInit(event: FMLPostInitializationEvent) {
        if (config?.hasChanged()!!) config?.save()
    }


}