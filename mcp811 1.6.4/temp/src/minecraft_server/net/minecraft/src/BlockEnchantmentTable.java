package net.minecraft.src;

import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityEnchantmentTable;
import net.minecraft.src.World;

public class BlockEnchantmentTable extends BlockContainer {

   protected BlockEnchantmentTable(int p_i2196_1_) {
      super(p_i2196_1_, Material.field_76246_e);
      this.func_71905_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.func_71868_h(0);
      this.func_71849_a(CreativeTabs.field_78031_c);
   }

   public boolean func_71886_c() {
      return false;
   }

   public boolean func_71926_d() {
      return false;
   }

   public TileEntity func_72274_a(World p_72274_1_) {
      return new TileEntityEnchantmentTable();
   }

   public boolean func_71903_a(World p_71903_1_, int p_71903_2_, int p_71903_3_, int p_71903_4_, EntityPlayer p_71903_5_, int p_71903_6_, float p_71903_7_, float p_71903_8_, float p_71903_9_) {
      if(p_71903_1_.field_72995_K) {
         return true;
      } else {
         TileEntityEnchantmentTable var10 = (TileEntityEnchantmentTable)p_71903_1_.func_72796_p(p_71903_2_, p_71903_3_, p_71903_4_);
         p_71903_5_.func_71002_c(p_71903_2_, p_71903_3_, p_71903_4_, var10.func_94135_b()?var10.func_94133_a():null);
         return true;
      }
   }

   public void func_71860_a(World p_71860_1_, int p_71860_2_, int p_71860_3_, int p_71860_4_, EntityLivingBase p_71860_5_, ItemStack p_71860_6_) {
      super.func_71860_a(p_71860_1_, p_71860_2_, p_71860_3_, p_71860_4_, p_71860_5_, p_71860_6_);
      if(p_71860_6_.func_82837_s()) {
         ((TileEntityEnchantmentTable)p_71860_1_.func_72796_p(p_71860_2_, p_71860_3_, p_71860_4_)).func_94134_a(p_71860_6_.func_82833_r());
      }

   }
}
