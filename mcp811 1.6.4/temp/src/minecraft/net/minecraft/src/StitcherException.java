package net.minecraft.src;

import net.minecraft.src.StitchHolder;

public class StitcherException extends RuntimeException {

   private final StitchHolder field_98149_a;


   public StitcherException(StitchHolder p_i2344_1_, String p_i2344_2_) {
      super(p_i2344_2_);
      this.field_98149_a = p_i2344_1_;
   }
}
