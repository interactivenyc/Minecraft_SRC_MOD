package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.ContainerPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;

class SlotArmor extends Slot {

   // $FF: synthetic field
   final int field_75236_a;
   // $FF: synthetic field
   final ContainerPlayer field_75235_b;


   SlotArmor(ContainerPlayer p_i1818_1_, IInventory p_i1818_2_, int p_i1818_3_, int p_i1818_4_, int p_i1818_5_, int p_i1818_6_) {
      super(p_i1818_2_, p_i1818_3_, p_i1818_4_, p_i1818_5_);
      this.field_75235_b = p_i1818_1_;
      this.field_75236_a = p_i1818_6_;
   }

   public int func_75219_a() {
      return 1;
   }

   public boolean func_75214_a(ItemStack p_75214_1_) {
      return p_75214_1_ == null?false:(p_75214_1_.func_77973_b() instanceof ItemArmor?((ItemArmor)p_75214_1_.func_77973_b()).field_77881_a == this.field_75236_a:(p_75214_1_.func_77973_b().field_77779_bT != Block.field_72061_ba.field_71990_ca && p_75214_1_.func_77973_b().field_77779_bT != Item.field_82799_bQ.field_77779_bT?false:this.field_75236_a == 0));
   }
}
