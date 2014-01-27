package net.minecraft.src;

import net.minecraft.src.GameSettings;
import net.minecraft.src.IStatStringFormat;
import net.minecraft.src.Minecraft;

class StatStringFormatKeyInv implements IStatStringFormat {

   // $FF: synthetic field
   final Minecraft field_74536_a;


   StatStringFormatKeyInv(Minecraft p_i1006_1_) {
      this.field_74536_a = p_i1006_1_;
   }

   public String func_74535_a(String p_74535_1_) {
      try {
         return String.format(p_74535_1_, new Object[]{GameSettings.func_74298_c(this.field_74536_a.field_71474_y.field_74315_B.field_74512_d)});
      } catch (Exception var3) {
         return "Error: " + var3.getLocalizedMessage();
      }
   }
}
