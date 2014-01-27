package net.minecraft.src;

import java.util.List;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Icon;
import net.minecraft.src.IconRegister;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BlockStoneBrick extends Block {

   public static final String[] field_72188_a = new String[]{"default", "mossy", "cracked", "chiseled"};
   public static final String[] field_94407_b = new String[]{null, "mossy", "cracked", "carved"};
   private Icon[] field_94408_c;


   public BlockStoneBrick(int p_i2255_1_) {
      super(p_i2255_1_, Material.field_76246_e);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public Icon func_71858_a(int p_71858_1_, int p_71858_2_) {
      if(p_71858_2_ < 0 || p_71858_2_ >= field_94407_b.length) {
         p_71858_2_ = 0;
      }

      return this.field_94408_c[p_71858_2_];
   }

   public int func_71899_b(int p_71899_1_) {
      return p_71899_1_;
   }

   public void func_71879_a(int p_71879_1_, CreativeTabs p_71879_2_, List p_71879_3_) {
      for(int var4 = 0; var4 < 4; ++var4) {
         p_71879_3_.add(new ItemStack(p_71879_1_, 1, var4));
      }

   }

   public void func_94332_a(IconRegister p_94332_1_) {
      this.field_94408_c = new Icon[field_94407_b.length];

      for(int var2 = 0; var2 < this.field_94408_c.length; ++var2) {
         String var3 = this.func_111023_E();
         if(field_94407_b[var2] != null) {
            var3 = var3 + "_" + field_94407_b[var2];
         }

         this.field_94408_c[var2] = p_94332_1_.func_94245_a(var3);
      }

   }

}
