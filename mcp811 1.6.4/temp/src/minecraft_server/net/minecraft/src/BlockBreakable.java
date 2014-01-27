package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockBreakable extends Block {

   private boolean field_72245_a;
   private String field_94430_b;


   protected BlockBreakable(int p_i2209_1_, String p_i2209_2_, Material p_i2209_3_, boolean p_i2209_4_) {
      super(p_i2209_1_, p_i2209_3_);
      this.field_72245_a = p_i2209_4_;
      this.field_94430_b = p_i2209_2_;
   }

   public boolean func_71926_d() {
      return false;
   }
}
