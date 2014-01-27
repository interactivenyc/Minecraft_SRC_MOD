package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class BlockTorch extends Block {

   protected BlockTorch(int p_i2276_1_) {
      super(p_i2276_1_, Material.field_76265_p);
      this.func_71907_b(true);
      this.func_71849_a(CreativeTabs.field_78031_c);
   }

   public AxisAlignedBB func_71872_e(World p_71872_1_, int p_71872_2_, int p_71872_3_, int p_71872_4_) {
      return null;
   }

   public boolean func_71926_d() {
      return false;
   }

   public boolean func_71886_c() {
      return false;
   }

   public int func_71857_b() {
      return 2;
   }

   private boolean func_72125_l(World p_72125_1_, int p_72125_2_, int p_72125_3_, int p_72125_4_) {
      if(p_72125_1_.func_72797_t(p_72125_2_, p_72125_3_, p_72125_4_)) {
         return true;
      } else {
         int var5 = p_72125_1_.func_72798_a(p_72125_2_, p_72125_3_, p_72125_4_);
         return var5 == Block.field_72031_aZ.field_71990_ca || var5 == Block.field_72098_bB.field_71990_ca || var5 == Block.field_71946_M.field_71990_ca || var5 == Block.field_82515_ce.field_71990_ca;
      }
   }

   public boolean func_71930_b(World p_71930_1_, int p_71930_2_, int p_71930_3_, int p_71930_4_) {
      return p_71930_1_.func_72887_b(p_71930_2_ - 1, p_71930_3_, p_71930_4_, true)?true:(p_71930_1_.func_72887_b(p_71930_2_ + 1, p_71930_3_, p_71930_4_, true)?true:(p_71930_1_.func_72887_b(p_71930_2_, p_71930_3_, p_71930_4_ - 1, true)?true:(p_71930_1_.func_72887_b(p_71930_2_, p_71930_3_, p_71930_4_ + 1, true)?true:this.func_72125_l(p_71930_1_, p_71930_2_, p_71930_3_ - 1, p_71930_4_))));
   }

   public int func_85104_a(World p_85104_1_, int p_85104_2_, int p_85104_3_, int p_85104_4_, int p_85104_5_, float p_85104_6_, float p_85104_7_, float p_85104_8_, int p_85104_9_) {
      int var10 = p_85104_9_;
      if(p_85104_5_ == 1 && this.func_72125_l(p_85104_1_, p_85104_2_, p_85104_3_ - 1, p_85104_4_)) {
         var10 = 5;
      }

      if(p_85104_5_ == 2 && p_85104_1_.func_72887_b(p_85104_2_, p_85104_3_, p_85104_4_ + 1, true)) {
         var10 = 4;
      }

      if(p_85104_5_ == 3 && p_85104_1_.func_72887_b(p_85104_2_, p_85104_3_, p_85104_4_ - 1, true)) {
         var10 = 3;
      }

      if(p_85104_5_ == 4 && p_85104_1_.func_72887_b(p_85104_2_ + 1, p_85104_3_, p_85104_4_, true)) {
         var10 = 2;
      }

      if(p_85104_5_ == 5 && p_85104_1_.func_72887_b(p_85104_2_ - 1, p_85104_3_, p_85104_4_, true)) {
         var10 = 1;
      }

      return var10;
   }

   public void func_71847_b(World p_71847_1_, int p_71847_2_, int p_71847_3_, int p_71847_4_, Random p_71847_5_) {
      super.func_71847_b(p_71847_1_, p_71847_2_, p_71847_3_, p_71847_4_, p_71847_5_);
      if(p_71847_1_.func_72805_g(p_71847_2_, p_71847_3_, p_71847_4_) == 0) {
         this.func_71861_g(p_71847_1_, p_71847_2_, p_71847_3_, p_71847_4_);
      }

   }

   public void func_71861_g(World p_71861_1_, int p_71861_2_, int p_71861_3_, int p_71861_4_) {
      if(p_71861_1_.func_72805_g(p_71861_2_, p_71861_3_, p_71861_4_) == 0) {
         if(p_71861_1_.func_72887_b(p_71861_2_ - 1, p_71861_3_, p_71861_4_, true)) {
            p_71861_1_.func_72921_c(p_71861_2_, p_71861_3_, p_71861_4_, 1, 2);
         } else if(p_71861_1_.func_72887_b(p_71861_2_ + 1, p_71861_3_, p_71861_4_, true)) {
            p_71861_1_.func_72921_c(p_71861_2_, p_71861_3_, p_71861_4_, 2, 2);
         } else if(p_71861_1_.func_72887_b(p_71861_2_, p_71861_3_, p_71861_4_ - 1, true)) {
            p_71861_1_.func_72921_c(p_71861_2_, p_71861_3_, p_71861_4_, 3, 2);
         } else if(p_71861_1_.func_72887_b(p_71861_2_, p_71861_3_, p_71861_4_ + 1, true)) {
            p_71861_1_.func_72921_c(p_71861_2_, p_71861_3_, p_71861_4_, 4, 2);
         } else if(this.func_72125_l(p_71861_1_, p_71861_2_, p_71861_3_ - 1, p_71861_4_)) {
            p_71861_1_.func_72921_c(p_71861_2_, p_71861_3_, p_71861_4_, 5, 2);
         }
      }

      this.func_72126_n(p_71861_1_, p_71861_2_, p_71861_3_, p_71861_4_);
   }

   public void func_71863_a(World p_71863_1_, int p_71863_2_, int p_71863_3_, int p_71863_4_, int p_71863_5_) {
      this.func_94397_d(p_71863_1_, p_71863_2_, p_71863_3_, p_71863_4_, p_71863_5_);
   }

   protected boolean func_94397_d(World p_94397_1_, int p_94397_2_, int p_94397_3_, int p_94397_4_, int p_94397_5_) {
      if(this.func_72126_n(p_94397_1_, p_94397_2_, p_94397_3_, p_94397_4_)) {
         int var6 = p_94397_1_.func_72805_g(p_94397_2_, p_94397_3_, p_94397_4_);
         boolean var7 = false;
         if(!p_94397_1_.func_72887_b(p_94397_2_ - 1, p_94397_3_, p_94397_4_, true) && var6 == 1) {
            var7 = true;
         }

         if(!p_94397_1_.func_72887_b(p_94397_2_ + 1, p_94397_3_, p_94397_4_, true) && var6 == 2) {
            var7 = true;
         }

         if(!p_94397_1_.func_72887_b(p_94397_2_, p_94397_3_, p_94397_4_ - 1, true) && var6 == 3) {
            var7 = true;
         }

         if(!p_94397_1_.func_72887_b(p_94397_2_, p_94397_3_, p_94397_4_ + 1, true) && var6 == 4) {
            var7 = true;
         }

         if(!this.func_72125_l(p_94397_1_, p_94397_2_, p_94397_3_ - 1, p_94397_4_) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.func_71897_c(p_94397_1_, p_94397_2_, p_94397_3_, p_94397_4_, p_94397_1_.func_72805_g(p_94397_2_, p_94397_3_, p_94397_4_), 0);
            p_94397_1_.func_94571_i(p_94397_2_, p_94397_3_, p_94397_4_);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   protected boolean func_72126_n(World p_72126_1_, int p_72126_2_, int p_72126_3_, int p_72126_4_) {
      if(!this.func_71930_b(p_72126_1_, p_72126_2_, p_72126_3_, p_72126_4_)) {
         if(p_72126_1_.func_72798_a(p_72126_2_, p_72126_3_, p_72126_4_) == this.field_71990_ca) {
            this.func_71897_c(p_72126_1_, p_72126_2_, p_72126_3_, p_72126_4_, p_72126_1_.func_72805_g(p_72126_2_, p_72126_3_, p_72126_4_), 0);
            p_72126_1_.func_94571_i(p_72126_2_, p_72126_3_, p_72126_4_);
         }

         return false;
      } else {
         return true;
      }
   }

   public MovingObjectPosition func_71878_a(World p_71878_1_, int p_71878_2_, int p_71878_3_, int p_71878_4_, Vec3 p_71878_5_, Vec3 p_71878_6_) {
      int var7 = p_71878_1_.func_72805_g(p_71878_2_, p_71878_3_, p_71878_4_) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.func_71905_a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.func_71905_a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.func_71905_a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.func_71905_a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.func_71905_a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.func_71878_a(p_71878_1_, p_71878_2_, p_71878_3_, p_71878_4_, p_71878_5_, p_71878_6_);
   }
}