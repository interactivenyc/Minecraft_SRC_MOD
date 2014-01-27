package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.Chunk;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.Vec3Pool;
import net.minecraft.src.World;

public class ChunkCache implements IBlockAccess {

   private int field_72818_a;
   private int field_72816_b;
   private Chunk[][] field_72817_c;
   private boolean field_72814_d;
   private World field_72815_e;


   public ChunkCache(World p_i1964_1_, int p_i1964_2_, int p_i1964_3_, int p_i1964_4_, int p_i1964_5_, int p_i1964_6_, int p_i1964_7_, int p_i1964_8_) {
      this.field_72815_e = p_i1964_1_;
      this.field_72818_a = p_i1964_2_ - p_i1964_8_ >> 4;
      this.field_72816_b = p_i1964_4_ - p_i1964_8_ >> 4;
      int var9 = p_i1964_5_ + p_i1964_8_ >> 4;
      int var10 = p_i1964_7_ + p_i1964_8_ >> 4;
      this.field_72817_c = new Chunk[var9 - this.field_72818_a + 1][var10 - this.field_72816_b + 1];
      this.field_72814_d = true;

      int var11;
      int var12;
      Chunk var13;
      for(var11 = this.field_72818_a; var11 <= var9; ++var11) {
         for(var12 = this.field_72816_b; var12 <= var10; ++var12) {
            var13 = p_i1964_1_.func_72964_e(var11, var12);
            if(var13 != null) {
               this.field_72817_c[var11 - this.field_72818_a][var12 - this.field_72816_b] = var13;
            }
         }
      }

      for(var11 = p_i1964_2_ >> 4; var11 <= p_i1964_5_ >> 4; ++var11) {
         for(var12 = p_i1964_4_ >> 4; var12 <= p_i1964_7_ >> 4; ++var12) {
            var13 = this.field_72817_c[var11 - this.field_72818_a][var12 - this.field_72816_b];
            if(var13 != null && !var13.func_76606_c(p_i1964_3_, p_i1964_6_)) {
               this.field_72814_d = false;
            }
         }
      }

   }

   public int func_72798_a(int p_72798_1_, int p_72798_2_, int p_72798_3_) {
      if(p_72798_2_ < 0) {
         return 0;
      } else if(p_72798_2_ >= 256) {
         return 0;
      } else {
         int var4 = (p_72798_1_ >> 4) - this.field_72818_a;
         int var5 = (p_72798_3_ >> 4) - this.field_72816_b;
         if(var4 >= 0 && var4 < this.field_72817_c.length && var5 >= 0 && var5 < this.field_72817_c[var4].length) {
            Chunk var6 = this.field_72817_c[var4][var5];
            return var6 == null?0:var6.func_76610_a(p_72798_1_ & 15, p_72798_2_, p_72798_3_ & 15);
         } else {
            return 0;
         }
      }
   }

   public TileEntity func_72796_p(int p_72796_1_, int p_72796_2_, int p_72796_3_) {
      int var4 = (p_72796_1_ >> 4) - this.field_72818_a;
      int var5 = (p_72796_3_ >> 4) - this.field_72816_b;
      return this.field_72817_c[var4][var5].func_76597_e(p_72796_1_ & 15, p_72796_2_, p_72796_3_ & 15);
   }

   public int func_72805_g(int p_72805_1_, int p_72805_2_, int p_72805_3_) {
      if(p_72805_2_ < 0) {
         return 0;
      } else if(p_72805_2_ >= 256) {
         return 0;
      } else {
         int var4 = (p_72805_1_ >> 4) - this.field_72818_a;
         int var5 = (p_72805_3_ >> 4) - this.field_72816_b;
         return this.field_72817_c[var4][var5].func_76628_c(p_72805_1_ & 15, p_72805_2_, p_72805_3_ & 15);
      }
   }

   public Material func_72803_f(int p_72803_1_, int p_72803_2_, int p_72803_3_) {
      int var4 = this.func_72798_a(p_72803_1_, p_72803_2_, p_72803_3_);
      return var4 == 0?Material.field_76249_a:Block.field_71973_m[var4].field_72018_cp;
   }

   public boolean func_72809_s(int p_72809_1_, int p_72809_2_, int p_72809_3_) {
      Block var4 = Block.field_71973_m[this.func_72798_a(p_72809_1_, p_72809_2_, p_72809_3_)];
      return var4 == null?false:var4.field_72018_cp.func_76230_c() && var4.func_71886_c();
   }

   public Vec3Pool func_82732_R() {
      return this.field_72815_e.func_82732_R();
   }

   public int func_72879_k(int p_72879_1_, int p_72879_2_, int p_72879_3_, int p_72879_4_) {
      int var5 = this.func_72798_a(p_72879_1_, p_72879_2_, p_72879_3_);
      return var5 == 0?0:Block.field_71973_m[var5].func_71855_c(this, p_72879_1_, p_72879_2_, p_72879_3_, p_72879_4_);
   }
}
