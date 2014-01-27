package net.minecraft.src;

import net.minecraft.src.BlockRotatedPillar;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockHay extends BlockRotatedPillar {

   public BlockHay(int p_i2210_1_) {
      super(p_i2210_1_, Material.field_76247_b);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public int func_71857_b() {
      return 31;
   }
}
