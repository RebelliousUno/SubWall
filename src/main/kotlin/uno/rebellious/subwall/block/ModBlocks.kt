package uno.rebellious.subwall.block

import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

object ModBlocks {
    val sub_wall_piece: BlockSubWallPiece? = null

    @SideOnly(Side.CLIENT)
    fun initModels() {
        sub_wall_piece!!.initModel()
    }

}
