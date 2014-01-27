package net.minecraft.src;

import java.util.List;
import java.util.Random;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.Icon;
import net.minecraft.src.IconRegister;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class BlockEndPortalFrame extends Block {

   private Icon field_94400_a;
   private Icon field_94399_b;


   public BlockEndPortalFrame(int p_i2267_1_) {
      super(p_i2267_1_, Material.field_76246_e);
   }

   public Icon func_71858_a(int p_71858_1_, int p_71858_2_) {
      return p_71858_1_ == 1?this.field_94400_a:(p_71858_1_ == 0?Block.field_72082_bJ.func_71851_a(p_71858_1_):this.field_94336_cN);
   }

   public void func_94332_a(IconRegister p_94332_1_) {
      this.field_94336_cN = p_94332_1_.func_94245_a(this.func_111023_E() + "_side");
      this.field_94400_a = p_94332_1_.func_94245_a(this.func_111023_E() + "_top");
      this.field_94399_b = p_94332_1_.func_94245_a(this.func_111023_E() + "_eye");
   }

   public Icon func_94398_p() {
      return this.field_94399_b;
   }

   public boolean func_71926_d() {
      return false;
   }

   public int func_71857_b() {
      return 26;
   }

   public void func_71919_f() {
      this.func_71905_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   public void func_71871_a(World p_71871_1_, int p_71871_2_, int p_71871_3_, int p_71871_4_, AxisAlignedBB p_71871_5_, List p_71871_6_, Entity p_71871_7_) {
      this.func_71905_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      super.func_71871_a(p_71871_1_, p_71871_2_, p_71871_3_, p_71871_4_, p_71871_5_, p_71871_6_, p_71871_7_);
      int var8 = p_71871_1_.func_72805_g(p_71871_2_, p_71871_3_, p_71871_4_);
      if(func_72165_e(var8)) {
         this.func_71905_a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
         super.func_71871_a(p_71871_1_, p_71871_2_, p_71871_3_, p_71871_4_, p_71871_5_, p_71871_6_, p_71871_7_);
      }

      this.func_71919_f();
   }

   public static boolean func_72165_e(int p_72165_0_) {
      return (p_72165_0_ & 4) != 0;
   }

   public int func_71885_a(int p_71885_1_, Random p_71885_2_, int p_71885_3_) {
      return 0;
   }

   public void func_71860_a(World p_71860_1_, int p_71860_2_, int p_71860_3_, int p_71860_4_, EntityLivingBase p_71860_5_, ItemStack p_71860_6_) {
      int var7 = ((MathHelper.func_76128_c((double)(p_71860_5_.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      p_71860_1_.func_72921_c(p_71860_2_, p_71860_3_, p_71860_4_, var7, 2);
   }

   public boolean func_96468_q_() {
      return true;
   }

   public int func_94328_b_(World p_94328_1_, int p_94328_2_, int p_94328_3_, int p_94328_4_, int p_94328_5_) {
      int var6 = p_94328_1_.func_72805_g(p_94328_2_, p_94328_3_, p_94328_4_);
      return func_72165_e(var6)?15:0;
   }
}
