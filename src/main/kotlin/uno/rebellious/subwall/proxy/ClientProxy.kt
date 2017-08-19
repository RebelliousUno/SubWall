package uno.rebellious.subwall.proxy

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.relauncher.Side
import uno.rebellious.subwall.block.ModBlocks
import uno.rebellious.subwall.item.ModItems

@Mod.EventBusSubscriber(Side.CLIENT)
class ClientProxy : CommonProxy() {

    override fun preInit(event: FMLPreInitializationEvent) {
        super.preInit(event)
    }

    @SubscribeEvent
    fun registerModels(event: ModelRegistryEvent) {
        ModBlocks.initModels()
        ModItems.initModels()
    }

}