package net.minecraft.src;

import java.io.OutputStream;
import net.minecraft.src.ExceptionMcoHttp;
import net.minecraft.src.Request;

public class RequestPut extends Request {

   private byte[] field_96369_c;


   public RequestPut(String p_i1143_1_, byte[] p_i1143_2_, int p_i1143_3_, int p_i1143_4_) {
      super(p_i1143_1_, p_i1143_3_, p_i1143_4_);
      this.field_96369_c = p_i1143_2_;
   }

   public RequestPut func_96368_f() {
      try {
         this.field_96367_a.setDoOutput(true);
         this.field_96367_a.setDoInput(true);
         this.field_96367_a.setRequestMethod("PUT");
         OutputStream var1 = this.field_96367_a.getOutputStream();
         var1.write(this.field_96369_c);
         var1.flush();
         return this;
      } catch (Exception var2) {
         throw new ExceptionMcoHttp("Failed URL: " + this.field_96365_b, var2);
      }
   }

   // $FF: synthetic method
   public Request func_96359_e() {
      return this.func_96368_f();
   }
}
