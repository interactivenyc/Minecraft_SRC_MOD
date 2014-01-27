package net.minecraft.src;

import net.minecraft.src.ExceptionMcoService;
import net.minecraft.src.GuiScreenPendingInvitation;
import net.minecraft.src.McoClient;
import net.minecraft.src.PendingInvite;

class GuiScreenPendingInvitationINNER3 extends Thread {

   // $FF: synthetic field
   final GuiScreenPendingInvitation field_130131_a;


   GuiScreenPendingInvitationINNER3(GuiScreenPendingInvitation p_i1127_1_) {
      this.field_130131_a = p_i1127_1_;
   }

   public void run() {
      try {
         McoClient var1 = new McoClient(GuiScreenPendingInvitation.func_130046_h(this.field_130131_a).func_110432_I());
         var1.func_130107_a(((PendingInvite)GuiScreenPendingInvitation.func_130042_e(this.field_130131_a).get(GuiScreenPendingInvitation.func_130049_d(this.field_130131_a))).field_130094_a);
         GuiScreenPendingInvitation.func_130040_f(this.field_130131_a);
      } catch (ExceptionMcoService var2) {
         GuiScreenPendingInvitation.func_130055_i(this.field_130131_a).func_98033_al().func_98232_c(var2.toString());
      }

   }
}
