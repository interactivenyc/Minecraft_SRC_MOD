package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityList;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityLivingData;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Facing;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.StatCollector;
import net.minecraft.src.World;

public class ItemMonsterPlacer extends Item {

   public ItemMonsterPlacer(int p_i1906_1_) {
      super(p_i1906_1_);
      this.func_77627_a(true);
      this.func_77637_a(CreativeTabs.field_78026_f);
   }

   public String func_77628_j(ItemStack p_77628_1_) {
      String var2 = ("" + StatCollector.func_74838_a(this.func_77658_a() + ".name")).trim();
      String var3 = EntityList.func_75617_a(p_77628_1_.func_77960_j());
      if(var3 != null) {
         var2 = var2 + " " + StatCollector.func_74838_a("entity." + var3 + ".name");
      }

      return var2;
   }

   public boolean func_77648_a(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
      if(p_77648_3_.field_72995_K) {
         return true;
      } else {
         int var11 = p_77648_3_.func_72798_a(p_77648_4_, p_77648_5_, p_77648_6_);
         p_77648_4_ += Facing.field_71586_b[p_77648_7_];
         p_77648_5_ += Facing.field_71587_c[p_77648_7_];
         p_77648_6_ += Facing.field_71585_d[p_77648_7_];
         double var12 = 0.0D;
         if(p_77648_7_ == 1 && Block.field_71973_m[var11] != null && Block.field_71973_m[var11].func_71857_b() == 11) {
            var12 = 0.5D;
         }

         Entity var14 = func_77840_a(p_77648_3_, p_77648_1_.func_77960_j(), (double)p_77648_4_ + 0.5D, (double)p_77648_5_ + var12, (double)p_77648_6_ + 0.5D);
         if(var14 != null) {
            if(var14 instanceof EntityLivingBase && p_77648_1_.func_82837_s()) {
               ((EntityLiving)var14).func_94058_c(p_77648_1_.func_82833_r());
            }

            if(!p_77648_2_.field_71075_bZ.field_75098_d) {
               --p_77648_1_.field_77994_a;
            }
         }

         return true;
      }
   }

   public ItemStack func_77659_a(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
      if(p_77659_2_.field_72995_K) {
         return p_77659_1_;
      } else {
         MovingObjectPosition var4 = this.func_77621_a(p_77659_2_, p_77659_3_, true);
         if(var4 == null) {
            return p_77659_1_;
         } else {
            if(var4.field_72313_a == EnumMovingObjectType.TILE) {
               int var5 = var4.field_72311_b;
               int var6 = var4.field_72312_c;
               int var7 = var4.field_72309_d;
               if(!p_77659_2_.func_72962_a(p_77659_3_, var5, var6, var7)) {
                  return p_77659_1_;
               }

               if(!p_77659_3_.func_82247_a(var5, var6, var7, var4.field_72310_e, p_77659_1_)) {
                  return p_77659_1_;
               }

               if(p_77659_2_.func_72803_f(var5, var6, var7) == Material.field_76244_g) {
                  Entity var8 = func_77840_a(p_77659_2_, p_77659_1_.func_77960_j(), (double)var5, (double)var6, (double)var7);
                  if(var8 != null) {
                     if(var8 instanceof EntityLivingBase && p_77659_1_.func_82837_s()) {
                        ((EntityLiving)var8).func_94058_c(p_77659_1_.func_82833_r());
                     }

                     if(!p_77659_3_.field_71075_bZ.field_75098_d) {
                        --p_77659_1_.field_77994_a;
                     }
                  }
               }
            }

            return p_77659_1_;
         }
      }
   }

   public static Entity func_77840_a(World p_77840_0_, int p_77840_1_, double p_77840_2_, double p_77840_4_, double p_77840_6_) {
      if(!EntityList.field_75627_a.containsKey(Integer.valueOf(p_77840_1_))) {
         return null;
      } else {
         Entity var8 = null;

         for(int var9 = 0; var9 < 1; ++var9) {
            var8 = EntityList.func_75616_a(p_77840_1_, p_77840_0_);
            if(var8 != null && var8 instanceof EntityLivingBase) {
               EntityLiving var10 = (EntityLiving)var8;
               var8.func_70012_b(p_77840_2_, p_77840_4_, p_77840_6_, MathHelper.func_76142_g(p_77840_0_.field_73012_v.nextFloat() * 360.0F), 0.0F);
               var10.field_70759_as = var10.field_70177_z;
               var10.field_70761_aq = var10.field_70177_z;
               var10.func_110161_a((EntityLivingData)null);
               p_77840_0_.func_72838_d(var8);
               var10.func_70642_aH();
            }
         }

         return var8;
      }
   }
}
