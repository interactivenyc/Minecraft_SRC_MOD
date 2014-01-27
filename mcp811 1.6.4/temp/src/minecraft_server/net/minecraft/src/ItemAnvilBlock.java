package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.BlockAnvil;
import net.minecraft.src.ItemMultiTextureTile;

public class ItemAnvilBlock extends ItemMultiTextureTile {

   public ItemAnvilBlock(Block p_i1826_1_) {
      super(p_i1826_1_.field_71990_ca - 256, p_i1826_1_, BlockAnvil.field_82522_a);
   }

   public int func_77647_b(int p_77647_1_) {
      return p_77647_1_ << 2;
   }
}
