package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.Icon;
import net.minecraft.src.ItemBlock;

public class ItemBlockWithMetadata extends ItemBlock {

   private Block field_96601_a;


   public ItemBlockWithMetadata(int p_i1829_1_, Block p_i1829_2_) {
      super(p_i1829_1_);
      this.field_96601_a = p_i1829_2_;
      this.func_77656_e(0);
      this.func_77627_a(true);
   }

   public Icon func_77617_a(int p_77617_1_) {
      return this.field_96601_a.func_71858_a(2, p_77617_1_);
   }

   public int func_77647_b(int p_77647_1_) {
      return p_77647_1_;
   }
}
