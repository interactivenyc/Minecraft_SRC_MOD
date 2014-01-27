package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockLeavesBase extends Block {

   protected boolean field_72131_c;


   protected BlockLeavesBase(int p_i2277_1_, Material p_i2277_2_, boolean p_i2277_3_) {
      super(p_i2277_1_, p_i2277_2_);
      this.field_72131_c = p_i2277_3_;
   }

   public boolean func_71926_d() {
      return false;
   }
}
