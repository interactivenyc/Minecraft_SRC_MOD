package net.minecraft.src;

import net.minecraft.src.GuiBeacon;
import net.minecraft.src.GuiBeaconButton;
import net.minecraft.src.I18n;

class GuiBeaconButtonConfirm extends GuiBeaconButton {

   // $FF: synthetic field
   final GuiBeacon field_82264_k;


   public GuiBeaconButtonConfirm(GuiBeacon p_i1075_1_, int p_i1075_2_, int p_i1075_3_, int p_i1075_4_) {
      super(p_i1075_2_, p_i1075_3_, p_i1075_4_, GuiBeacon.func_110427_g(), 90, 220);
      this.field_82264_k = p_i1075_1_;
   }

   public void func_82251_b(int p_82251_1_, int p_82251_2_) {
      this.field_82264_k.func_74190_a(I18n.func_135053_a("gui.done"), p_82251_1_, p_82251_2_);
   }
}
