package net.minecraft.src;

import java.util.concurrent.Callable;
import net.minecraft.src.Minecraft;
import org.lwjgl.opengl.GL11;

class CallableGLInfo implements Callable {

   // $FF: synthetic field
   final Minecraft field_79002_a;


   CallableGLInfo(Minecraft p_i1011_1_) {
      this.field_79002_a = p_i1011_1_;
   }

   public String func_79001_a() {
      return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_79001_a();
   }
}
