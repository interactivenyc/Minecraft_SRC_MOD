package net.minecraft.src;

import java.util.concurrent.Callable;
import net.minecraft.src.IntegratedServer;

class CallableType3 implements Callable {

   // $FF: synthetic field
   final IntegratedServer field_76974_a;


   CallableType3(IntegratedServer p_i1315_1_) {
      this.field_76974_a = p_i1315_1_;
   }

   public String func_76973_a() {
      return "Integrated Server (map_client.txt)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_76973_a();
   }
}
