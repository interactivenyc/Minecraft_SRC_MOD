package net.minecraft.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.minecraft.src.StatsComponent;

class StatsComponentINNER1 implements ActionListener {

   // $FF: synthetic field
   final StatsComponent field_120030_a;


   StatsComponentINNER1(StatsComponent p_i2368_1_) {
      this.field_120030_a = p_i2368_1_;
   }

   public void actionPerformed(ActionEvent p_actionPerformed_1_) {
      StatsComponent.func_120033_a(this.field_120030_a);
   }
}
