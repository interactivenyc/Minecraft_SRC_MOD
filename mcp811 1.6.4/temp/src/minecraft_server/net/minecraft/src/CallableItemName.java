package net.minecraft.src;

import java.util.concurrent.Callable;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;

class CallableItemName implements Callable {

   // $FF: synthetic field
   final ItemStack field_96634_a;
   // $FF: synthetic field
   final InventoryPlayer field_96633_b;


   CallableItemName(InventoryPlayer p_i1749_1_, ItemStack p_i1749_2_) {
      this.field_96633_b = p_i1749_1_;
      this.field_96634_a = p_i1749_2_;
   }

   public String func_96632_a() {
      return this.field_96634_a.func_82833_r();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_96632_a();
   }
}
