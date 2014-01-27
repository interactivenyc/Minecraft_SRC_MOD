package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockLockedChest extends Block {

   protected BlockLockedChest(int p_i2223_1_) {
      super(p_i2223_1_, Material.field_76245_d);
   }

   public boolean func_71930_b(World p_71930_1_, int p_71930_2_, int p_71930_3_, int p_71930_4_) {
      return true;
   }

   public void func_71847_b(World p_71847_1_, int p_71847_2_, int p_71847_3_, int p_71847_4_, Random p_71847_5_) {
      p_71847_1_.func_94571_i(p_71847_2_, p_71847_3_, p_71847_4_);
   }
}
