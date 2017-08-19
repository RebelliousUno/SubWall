package uno.rebellious.subwall

import net.minecraftforge.common.config.Configuration
import org.apache.logging.log4j.Level
import uno.rebellious.subwall.proxy.CommonProxy

class Config {
    companion object {
        private val catGeneral: String = "general"

        fun readConfig() {
            val cfg = CommonProxy.config
            try {
                cfg?.load()
                initGeneralConfig(cfg!!)
            } catch (e: Exception) {
                SubWall.logger.log(Level.ERROR, "Problem loading config file", e)
            } finally {
                if (cfg?.hasChanged()!!) cfg.save()
            }
        }

        private fun initGeneralConfig(cfg: Configuration) {
            cfg.addCustomCategoryComment(catGeneral, "General Configuration")
        }
    }
}