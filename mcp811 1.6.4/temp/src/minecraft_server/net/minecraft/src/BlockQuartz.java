package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockQuartz extends Block {

   public static final String[] field_94420_a = new String[]{"default", "chiseled", "lines"};
   private static final String[] field_94418_b = new String[]{"side", "chiseled", "lines", null, null};


   public BlockQuartz(int p_i2243_1_) {
      super(p_i2243_1_, Material.field_76246_e);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public int func_85104_a(World p_85104_1_, int p_85104_2_, int p_85104_3_, int p_85104_4_, int p_85104_5_, float p_85104_6_, float p_85104_7_, float p_85104_8_, int p_85104_9_) {
      if(p_85104_9_ == 2) {
         switch(p_85104_5_) {
         case 0:
         case 1:
            p_85104_9_ = 2;
            break;
         case 2:
         case 3:
            p_85104_9_ = 4;
            break;
         case 4:
         case 5:
            p_85104_9_ = 3;
         }
      }

      return p_85104_9_;
   }

   public int func_71899_b(int p_71899_1_) {
      return p_71899_1_ != 3 && p_71899_1_ != 4?p_71899_1_:2;
   }

   protected ItemStack func_71880_c_(int p_71880_1_) {
      return p_71880_1_ != 3 && p_71880_1_ != 4?super.func_71880_c_(p_71880_1_):new ItemStack(this.field_71990_ca, 1, 2);
   }

   public int func_71857_b() {
      return 39;
   }

}
