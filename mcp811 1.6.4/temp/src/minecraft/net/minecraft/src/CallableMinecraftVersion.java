package net.minecraft.src;

import java.util.concurrent.Callable;
import net.minecraft.src.CrashReport;

class CallableMinecraftVersion implements Callable {

   // $FF: synthetic field
   final CrashReport field_71494_a;


   CallableMinecraftVersion(CrashReport p_i1338_1_) {
      this.field_71494_a = p_i1338_1_;
   }

   public String func_71493_a() {
      return "1.6.4";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_71493_a();
   }
}
