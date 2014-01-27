package net.minecraft.src;

import java.util.concurrent.Callable;
import net.minecraft.src.Minecraft;

class CallableParticleScreenName implements Callable {

   // $FF: synthetic field
   final Minecraft field_90053_a;


   CallableParticleScreenName(Minecraft p_i1008_1_) {
      this.field_90053_a = p_i1008_1_;
   }

   public String func_90052_a() {
      return this.field_90053_a.field_71462_r.getClass().getCanonicalName();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_90052_a();
   }
}
