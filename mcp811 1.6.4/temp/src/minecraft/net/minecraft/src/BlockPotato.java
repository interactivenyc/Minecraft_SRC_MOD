package net.minecraft.src;

import net.minecraft.src.BlockCrops;
import net.minecraft.src.Icon;
import net.minecraft.src.IconRegister;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class BlockPotato extends BlockCrops {

   private Icon[] field_94365_a;


   public BlockPotato(int p_i2237_1_) {
      super(p_i2237_1_);
   }

   public Icon func_71858_a(int p_71858_1_, int p_71858_2_) {
      if(p_71858_2_ < 7) {
         if(p_71858_2_ == 6) {
            p_71858_2_ = 5;
         }

         return this.field_94365_a[p_71858_2_ >> 1];
      } else {
         return this.field_94365_a[3];
      }
   }

   protected int func_82532_h() {
      return Item.field_82794_bL.field_77779_bT;
   }

   protected int func_82533_j() {
      return Item.field_82794_bL.field_77779_bT;
   }

   public void func_71914_a(World p_71914_1_, int p_71914_2_, int p_71914_3_, int p_71914_4_, int p_71914_5_, float p_71914_6_, int p_71914_7_) {
      super.func_71914_a(p_71914_1_, p_71914_2_, p_71914_3_, p_71914_4_, p_71914_5_, p_71914_6_, p_71914_7_);
      if(!p_71914_1_.field_72995_K) {
         if(p_71914_5_ >= 7 && p_71914_1_.field_73012_v.nextInt(50) == 0) {
            this.func_71929_a(p_71914_1_, p_71914_2_, p_71914_3_, p_71914_4_, new ItemStack(Item.field_82800_bN));
         }

      }
   }

   public void func_94332_a(IconRegister p_94332_1_) {
      this.field_94365_a = new Icon[4];

      for(int var2 = 0; var2 < this.field_94365_a.length; ++var2) {
         this.field_94365_a[var2] = p_94332_1_.func_94245_a(this.func_111023_E() + "_stage_" + var2);
      }

   }
}
