package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockMushroomCap extends Block {

   private static final String[] field_94429_a = new String[]{"skin_brown", "skin_red"};
   private final int field_72197_a;


   public BlockMushroomCap(int p_i2214_1_, Material p_i2214_2_, int p_i2214_3_) {
      super(p_i2214_1_, p_i2214_2_);
      this.field_72197_a = p_i2214_3_;
   }

   public int func_71925_a(Random p_71925_1_) {
      int var2 = p_71925_1_.nextInt(10) - 7;
      if(var2 < 0) {
         var2 = 0;
      }

      return var2;
   }

   public int func_71885_a(int p_71885_1_, Random p_71885_2_, int p_71885_3_) {
      return Block.field_72109_af.field_71990_ca + this.field_72197_a;
   }

}
