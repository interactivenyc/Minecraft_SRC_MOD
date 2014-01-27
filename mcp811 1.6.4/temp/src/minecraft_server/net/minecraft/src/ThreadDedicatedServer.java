package net.minecraft.src;

import net.minecraft.src.DedicatedServer;

public final class ThreadDedicatedServer extends Thread {

   // $FF: synthetic field
   final DedicatedServer field_96244_a;


   public ThreadDedicatedServer(DedicatedServer p_i2361_1_) {
      this.field_96244_a = p_i2361_1_;
   }

   public void run() {
      this.field_96244_a.func_71260_j();
   }
}
