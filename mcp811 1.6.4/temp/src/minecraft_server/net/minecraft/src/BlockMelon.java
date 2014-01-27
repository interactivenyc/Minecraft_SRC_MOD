package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class BlockMelon extends Block {

   protected BlockMelon(int p_i2224_1_) {
      super(p_i2224_1_, Material.field_76266_z);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public int func_71885_a(int p_71885_1_, Random p_71885_2_, int p_71885_3_) {
      return Item.field_77738_bf.field_77779_bT;
   }

   public int func_71925_a(Random p_71925_1_) {
      return 3 + p_71925_1_.nextInt(5);
   }

   public int func_71910_a(int p_71910_1_, Random p_71910_2_) {
      int var3 = this.func_71925_a(p_71910_2_) + p_71910_2_.nextInt(1 + p_71910_1_);
      if(var3 > 9) {
         var3 = 9;
      }

      return var3;
   }
}
