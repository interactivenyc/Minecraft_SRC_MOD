package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.BlockBaseRailLogic;
import net.minecraft.src.BlockRailBase;
import net.minecraft.src.Icon;
import net.minecraft.src.IconRegister;
import net.minecraft.src.World;

public class BlockRail extends BlockRailBase {

   private Icon field_94359_b;


   protected BlockRail(int p_i2244_1_) {
      super(p_i2244_1_, false);
   }

   public Icon func_71858_a(int p_71858_1_, int p_71858_2_) {
      return p_71858_2_ >= 6?this.field_94359_b:this.field_94336_cN;
   }

   public void func_94332_a(IconRegister p_94332_1_) {
      super.func_94332_a(p_94332_1_);
      this.field_94359_b = p_94332_1_.func_94245_a(this.func_111023_E() + "_turned");
   }

   protected void func_94358_a(World p_94358_1_, int p_94358_2_, int p_94358_3_, int p_94358_4_, int p_94358_5_, int p_94358_6_, int p_94358_7_) {
      if(p_94358_7_ > 0 && Block.field_71973_m[p_94358_7_].func_71853_i() && (new BlockBaseRailLogic(this, p_94358_1_, p_94358_2_, p_94358_3_, p_94358_4_)).func_94505_a() == 3) {
         this.func_72181_a(p_94358_1_, p_94358_2_, p_94358_3_, p_94358_4_, false);
      }

   }
}
