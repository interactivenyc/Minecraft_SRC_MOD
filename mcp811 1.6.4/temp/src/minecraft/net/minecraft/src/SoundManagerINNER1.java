package net.minecraft.src;

import net.minecraft.src.SoundManager;
import paulscode.sound.SoundSystem;

class SoundManagerINNER1 implements Runnable {

   // $FF: synthetic field
   final SoundManager field_130090_a;


   SoundManagerINNER1(SoundManager p_i1324_1_) {
      this.field_130090_a = p_i1324_1_;
   }

   public void run() {
      SoundManager.func_130080_a(this.field_130090_a, new SoundSystem());
      SoundManager.func_130082_a(this.field_130090_a, true);
   }
}
