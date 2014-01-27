package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Icon;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class BlockBookshelf extends Block {

   public BlockBookshelf(int p_i2170_1_) {
      super(p_i2170_1_, Material.field_76245_d);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public Icon func_71858_a(int p_71858_1_, int p_71858_2_) {
      return p_71858_1_ != 1 && p_71858_1_ != 0?super.func_71858_a(p_71858_1_, p_71858_2_):Block.field_71988_x.func_71851_a(p_71858_1_);
   }

   public int func_71925_a(Random p_71925_1_) {
      return 3;
   }

   public int func_71885_a(int p_71885_1_, Random p_71885_2_, int p_71885_3_) {
      return Item.field_77760_aL.field_77779_bT;
   }
}
