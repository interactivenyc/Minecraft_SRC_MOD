package net.minecraft.src;

import net.minecraft.src.ContainerEnchantment;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;

class SlotEnchantment extends Slot {

   // $FF: synthetic field
   final ContainerEnchantment field_75227_a;


   SlotEnchantment(ContainerEnchantment p_i1810_1_, IInventory p_i1810_2_, int p_i1810_3_, int p_i1810_4_, int p_i1810_5_) {
      super(p_i1810_2_, p_i1810_3_, p_i1810_4_, p_i1810_5_);
      this.field_75227_a = p_i1810_1_;
   }

   public boolean func_75214_a(ItemStack p_75214_1_) {
      return true;
   }
}
