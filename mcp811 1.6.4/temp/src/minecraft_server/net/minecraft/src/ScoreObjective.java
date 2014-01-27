package net.minecraft.src;

import net.minecraft.src.ScoreObjectiveCriteria;
import net.minecraft.src.Scoreboard;

public class ScoreObjective {

   private final Scoreboard field_96686_a;
   private final String field_96684_b;
   private final ScoreObjectiveCriteria field_96685_c;
   private String field_96683_d;


   public ScoreObjective(Scoreboard p_i2307_1_, String p_i2307_2_, ScoreObjectiveCriteria p_i2307_3_) {
      this.field_96686_a = p_i2307_1_;
      this.field_96684_b = p_i2307_2_;
      this.field_96685_c = p_i2307_3_;
      this.field_96683_d = p_i2307_2_;
   }

   public String func_96679_b() {
      return this.field_96684_b;
   }

   public ScoreObjectiveCriteria func_96680_c() {
      return this.field_96685_c;
   }

   public String func_96678_d() {
      return this.field_96683_d;
   }

   public void func_96681_a(String p_96681_1_) {
      this.field_96683_d = p_96681_1_;
      this.field_96686_a.func_96532_b(this);
   }
}
