package net.minecraft.src;

import net.minecraft.src.BehaviorDefaultDispenseItem;
import net.minecraft.src.BlockDispenser;
import net.minecraft.src.BlockSourceImpl;
import net.minecraft.src.Facing;
import net.minecraft.src.IBehaviorDispenseItem;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityDispenser;
import net.minecraft.src.TileEntityDropper;
import net.minecraft.src.TileEntityHopper;
import net.minecraft.src.World;

public class BlockDropper extends BlockDispenser {

   private final IBehaviorDispenseItem field_96474_cR = new BehaviorDefaultDispenseItem();


   protected BlockDropper(int p_i2194_1_) {
      super(p_i2194_1_);
   }

   protected IBehaviorDispenseItem func_96472_a(ItemStack p_96472_1_) {
      return this.field_96474_cR;
   }

   public TileEntity func_72274_a(World p_72274_1_) {
      return new TileEntityDropper();
   }

   protected void func_82526_n(World p_82526_1_, int p_82526_2_, int p_82526_3_, int p_82526_4_) {
      BlockSourceImpl var5 = new BlockSourceImpl(p_82526_1_, p_82526_2_, p_82526_3_, p_82526_4_);
      TileEntityDispenser var6 = (TileEntityDispenser)var5.func_82619_j();
      if(var6 != null) {
         int var7 = var6.func_70361_i();
         if(var7 < 0) {
            p_82526_1_.func_72926_e(1001, p_82526_2_, p_82526_3_, p_82526_4_, 0);
         } else {
            ItemStack var8 = var6.func_70301_a(var7);
            int var9 = p_82526_1_.func_72805_g(p_82526_2_, p_82526_3_, p_82526_4_) & 7;
            IInventory var10 = TileEntityHopper.func_96117_b(p_82526_1_, (double)(p_82526_2_ + Facing.field_71586_b[var9]), (double)(p_82526_3_ + Facing.field_71587_c[var9]), (double)(p_82526_4_ + Facing.field_71585_d[var9]));
            ItemStack var11;
            if(var10 != null) {
               var11 = TileEntityHopper.func_94117_a(var10, var8.func_77946_l().func_77979_a(1), Facing.field_71588_a[var9]);
               if(var11 == null) {
                  var11 = var8.func_77946_l();
                  if(--var11.field_77994_a == 0) {
                     var11 = null;
                  }
               } else {
                  var11 = var8.func_77946_l();
               }
            } else {
               var11 = this.field_96474_cR.func_82482_a(var5, var8);
               if(var11 != null && var11.field_77994_a == 0) {
                  var11 = null;
               }
            }

            var6.func_70299_a(var7, var11);
         }

      }
   }
}
