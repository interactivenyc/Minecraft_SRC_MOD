package net.minecraft.src;

import net.minecraft.src.ChatMessageComponent;
import net.minecraft.src.CommandBase;
import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.ICommandSender;

public class CommandKill extends CommandBase {

   public String func_71517_b() {
      return "kill";
   }

   public int func_82362_a() {
      return 0;
   }

   public String func_71518_a(ICommandSender p_71518_1_) {
      return "commands.kill.usage";
   }

   public void func_71515_b(ICommandSender p_71515_1_, String[] p_71515_2_) {
      EntityPlayerMP var3 = func_71521_c(p_71515_1_);
      var3.func_70097_a(DamageSource.field_76380_i, Float.MAX_VALUE);
      p_71515_1_.func_70006_a(ChatMessageComponent.func_111077_e("commands.kill.success"));
   }
}
