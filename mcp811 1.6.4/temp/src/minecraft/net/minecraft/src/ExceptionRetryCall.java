package net.minecraft.src;

import net.minecraft.src.ExceptionMcoService;

public class ExceptionRetryCall extends ExceptionMcoService {

   public final int field_96393_c;


   public ExceptionRetryCall(int p_i1146_1_) {
      super(503, "Retry operation", -1);
      this.field_96393_c = p_i1146_1_;
   }
}
