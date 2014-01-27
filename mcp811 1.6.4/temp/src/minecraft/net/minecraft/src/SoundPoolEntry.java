package net.minecraft.src;

import java.net.URL;

public class SoundPoolEntry {

   private final String field_77385_a;
   private final URL field_77384_b;


   public SoundPoolEntry(String p_i1323_1_, URL p_i1323_2_) {
      this.field_77385_a = p_i1323_1_;
      this.field_77384_b = p_i1323_2_;
   }

   public String func_110458_a() {
      return this.field_77385_a;
   }

   public URL func_110457_b() {
      return this.field_77384_b;
   }
}
