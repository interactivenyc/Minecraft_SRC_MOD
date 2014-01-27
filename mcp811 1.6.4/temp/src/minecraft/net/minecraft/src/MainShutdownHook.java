package net.minecraft.src;

import net.minecraft.src.Minecraft;

public final class MainShutdownHook extends Thread {

   public void run() {
      Minecraft.func_71363_D();
   }
}
