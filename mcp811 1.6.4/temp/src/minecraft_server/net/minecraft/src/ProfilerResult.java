package net.minecraft.src;


public final class ProfilerResult implements Comparable {

   public double field_76332_a;
   public double field_76330_b;
   public String field_76331_c;


   public ProfilerResult(String p_i1554_1_, double p_i1554_2_, double p_i1554_4_) {
      this.field_76331_c = p_i1554_1_;
      this.field_76332_a = p_i1554_2_;
      this.field_76330_b = p_i1554_4_;
   }

   public int func_76328_a(ProfilerResult p_76328_1_) {
      return p_76328_1_.field_76332_a < this.field_76332_a?-1:(p_76328_1_.field_76332_a > this.field_76332_a?1:p_76328_1_.field_76331_c.compareTo(this.field_76331_c));
   }

   // $FF: synthetic method
   public int compareTo(Object p_compareTo_1_) {
      return this.func_76328_a((ProfilerResult)p_compareTo_1_);
   }
}
