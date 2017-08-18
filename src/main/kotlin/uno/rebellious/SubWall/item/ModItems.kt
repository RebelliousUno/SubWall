package uno.rebellious.subwall.item

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.ItemBlock
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

@GameRegistry.ObjectHolder("subwall")
class ModItems {
    companion object {
        val sub_wall_piece: ItemBlock? = null

        @SideOnly(Side.CLIENT)
        fun initModels() {
            ModelLoader.setCustomModelResourceLocation(sub_wall_piece, 0, ModelResourceLocation(sub_wall_piece?.registryName, "inventory"))
        }
    }
}