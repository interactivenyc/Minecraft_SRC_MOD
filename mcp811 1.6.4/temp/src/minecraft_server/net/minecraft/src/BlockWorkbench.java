package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockWorkbench extends Block {

   protected BlockWorkbench(int p_i2291_1_) {
      super(p_i2291_1_, Material.field_76245_d);
      this.func_71849_a(CreativeTabs.field_78031_c);
   }

   public boolean func_71903_a(World p_71903_1_, int p_71903_2_, int p_71903_3_, int p_71903_4_, EntityPlayer p_71903_5_, int p_71903_6_, float p_71903_7_, float p_71903_8_, float p_71903_9_) {
      if(p_71903_1_.field_72995_K) {
         return true;
      } else {
         p_71903_5_.func_71058_b(p_71903_2_, p_71903_3_, p_71903_4_);
         return true;
      }
   }
}
