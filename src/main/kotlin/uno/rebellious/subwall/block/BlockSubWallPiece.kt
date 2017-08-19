package uno.rebellious.subwall.block

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import uno.rebellious.subwall.SubWall

class BlockSubWallPiece : Block(Material.IRON) {
    init {
        setRegistryName(SubWall.MODID, "sub_wall_piece")
        unlocalizedName = "sub_wall_piece"
        setCreativeTab(SubWall.tabSubWall)

        setHarvestLevel("pickaxe", 1)
        setHardness(2.0f)
    }

    @SideOnly(Side.CLIENT)
    fun initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, ModelResourceLocation(registryName, "inventory"))
    }
}
