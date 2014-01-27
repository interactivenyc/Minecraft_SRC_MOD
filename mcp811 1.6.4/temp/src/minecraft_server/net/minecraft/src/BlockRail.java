package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.BlockBaseRailLogic;
import net.minecraft.src.BlockRailBase;
import net.minecraft.src.World;

public class BlockRail extends BlockRailBase {

   protected BlockRail(int p_i2244_1_) {
      super(p_i2244_1_, false);
   }

   protected void func_94358_a(World p_94358_1_, int p_94358_2_, int p_94358_3_, int p_94358_4_, int p_94358_5_, int p_94358_6_, int p_94358_7_) {
      if(p_94358_7_ > 0 && Block.field_71973_m[p_94358_7_].func_71853_i() && (new BlockBaseRailLogic(this, p_94358_1_, p_94358_2_, p_94358_3_, p_94358_4_)).func_94505_a() == 3) {
         this.func_72181_a(p_94358_1_, p_94358_2_, p_94358_3_, p_94358_4_, false);
      }

   }
}
