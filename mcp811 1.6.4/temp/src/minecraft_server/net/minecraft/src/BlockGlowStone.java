package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;

public class BlockGlowStone extends Block {

   public BlockGlowStone(int p_i2205_1_, Material p_i2205_2_) {
      super(p_i2205_1_, p_i2205_2_);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public int func_71910_a(int p_71910_1_, Random p_71910_2_) {
      return MathHelper.func_76125_a(this.func_71925_a(p_71910_2_) + p_71910_2_.nextInt(p_71910_1_ + 1), 1, 4);
   }

   public int func_71925_a(Random p_71925_1_) {
      return 2 + p_71925_1_.nextInt(3);
   }

   public int func_71885_a(int p_71885_1_, Random p_71885_2_, int p_71885_3_) {
      return Item.field_77751_aT.field_77779_bT;
   }
}
