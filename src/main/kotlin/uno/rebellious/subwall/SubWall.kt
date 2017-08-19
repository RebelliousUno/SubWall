package uno.rebellious.subwall

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemStack
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger
import uno.rebellious.subwall.proxy.CommonProxy
import uno.rebellious.subwall.item.ModItems


@Mod(
        modid = SubWall.MODID,
        name = SubWall.MODNAME,
        version = SubWall.VERSION,
        acceptedMinecraftVersions = "[1.12, 1.13)",
        useMetadata = true,
        dependencies = "",
        modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter"
)
object SubWall {

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
        proxy!!.preInit(event)
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        proxy!!.init(event)
    }

    @EventHandler
    fun postInit(event: FMLPostInitializationEvent) {
        proxy!!.postInit(event)
    }

    const val MODID: String = "subwall"
    const val MODNAME: String = "SubWall"
    const val VERSION: String = "1.12-0.0.1.0"

    @Mod.Instance
    var instance: SubWall? = null

    @SidedProxy(clientSide = "uno.rebellious.subwall.proxy.ClientProxy", serverSide = "uno.rebellious.subwall.proxy.ServerProxy")
    var proxy: CommonProxy? = null

    var logger: Logger? = null

    val tabSubWall: CreativeTabs = object : CreativeTabs("SubWall") {
        override fun getTabIconItem(): ItemStack {
            return ItemStack(ModItems.sub_wall_piece)
        }
    }
}


