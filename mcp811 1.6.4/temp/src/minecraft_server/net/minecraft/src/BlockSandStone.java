package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockSandStone extends Block {

   public static final String[] field_72189_a = new String[]{"default", "chiseled", "smooth"};
   private static final String[] field_94405_b = new String[]{"normal", "carved", "smooth"};


   public BlockSandStone(int p_i2251_1_) {
      super(p_i2251_1_, Material.field_76246_e);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public int func_71899_b(int p_71899_1_) {
      return p_71899_1_;
   }

}
