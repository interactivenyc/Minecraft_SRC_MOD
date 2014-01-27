package net.minecraft.src;

import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityBeacon;
import net.minecraft.src.World;

public class BlockBeacon extends BlockContainer {

   public BlockBeacon(int p_i2168_1_) {
      super(p_i2168_1_, Material.field_76264_q);
      this.func_71848_c(3.0F);
      this.func_71849_a(CreativeTabs.field_78026_f);
   }

   public TileEntity func_72274_a(World p_72274_1_) {
      return new TileEntityBeacon();
   }

   public boolean func_71903_a(World p_71903_1_, int p_71903_2_, int p_71903_3_, int p_71903_4_, EntityPlayer p_71903_5_, int p_71903_6_, float p_71903_7_, float p_71903_8_, float p_71903_9_) {
      if(p_71903_1_.field_72995_K) {
         return true;
      } else {
         TileEntityBeacon var10 = (TileEntityBeacon)p_71903_1_.func_72796_p(p_71903_2_, p_71903_3_, p_71903_4_);
         if(var10 != null) {
            p_71903_5_.func_82240_a(var10);
         }

         return true;
      }
   }

   public boolean func_71926_d() {
      return false;
   }

   public boolean func_71886_c() {
      return false;
   }

   public int func_71857_b() {
      return 34;
   }

   public void func_71860_a(World p_71860_1_, int p_71860_2_, int p_71860_3_, int p_71860_4_, EntityLivingBase p_71860_5_, ItemStack p_71860_6_) {
      super.func_71860_a(p_71860_1_, p_71860_2_, p_71860_3_, p_71860_4_, p_71860_5_, p_71860_6_);
      if(p_71860_6_.func_82837_s()) {
         ((TileEntityBeacon)p_71860_1_.func_72796_p(p_71860_2_, p_71860_3_, p_71860_4_)).func_94047_a(p_71860_6_.func_82833_r());
      }

   }
}
