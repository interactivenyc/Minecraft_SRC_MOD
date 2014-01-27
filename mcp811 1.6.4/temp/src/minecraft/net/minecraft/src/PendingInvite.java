package net.minecraft.src;

import argo.jdom.JsonNode;
import net.minecraft.src.ValueObject;

public class PendingInvite extends ValueObject {

   public String field_130094_a;
   public String field_130092_b;
   public String field_130093_c;


   public static PendingInvite func_130091_a(JsonNode p_130091_0_) {
      PendingInvite var1 = new PendingInvite();

      try {
         var1.field_130094_a = p_130091_0_.getStringValue(new Object[]{"invitationId"});
         var1.field_130092_b = p_130091_0_.getStringValue(new Object[]{"worldName"});
         var1.field_130093_c = p_130091_0_.getStringValue(new Object[]{"worldOwnerName"});
      } catch (Exception var3) {
         ;
      }

      return var1;
   }
}
