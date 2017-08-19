package uno.rebellious.subwall.item

import net.minecraft.item.ItemBlock
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import uno.rebellious.subwall.SubWall

@GameRegistry.ObjectHolder(SubWall.MODID)
object ModItems {
    val sub_wall_piece: ItemBlock? = null

    @SideOnly(Side.CLIENT)
    fun initModels() {}
}