package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.BlockRedstoneLogic;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.World;

public class BlockRedstoneRepeater extends BlockRedstoneLogic {

   public static final double[] field_72223_a = new double[]{-0.0625D, 0.0625D, 0.1875D, 0.3125D};
   private static final int[] field_72221_b = new int[]{1, 2, 3, 4};


   protected BlockRedstoneRepeater(int p_i2249_1_, boolean p_i2249_2_) {
      super(p_i2249_1_, p_i2249_2_);
   }

   public boolean func_71903_a(World p_71903_1_, int p_71903_2_, int p_71903_3_, int p_71903_4_, EntityPlayer p_71903_5_, int p_71903_6_, float p_71903_7_, float p_71903_8_, float p_71903_9_) {
      int var10 = p_71903_1_.func_72805_g(p_71903_2_, p_71903_3_, p_71903_4_);
      int var11 = (var10 & 12) >> 2;
      var11 = var11 + 1 << 2 & 12;
      p_71903_1_.func_72921_c(p_71903_2_, p_71903_3_, p_71903_4_, var11 | var10 & 3, 3);
      return true;
   }

   protected int func_94481_j_(int p_94481_1_) {
      return field_72221_b[(p_94481_1_ & 12) >> 2] * 2;
   }

   protected BlockRedstoneLogic func_94485_e() {
      return Block.field_72011_bi;
   }

   protected BlockRedstoneLogic func_94484_i() {
      return Block.field_72010_bh;
   }

   public int func_71885_a(int p_71885_1_, Random p_71885_2_, int p_71885_3_) {
      return Item.field_77742_bb.field_77779_bT;
   }

   public int func_71857_b() {
      return 15;
   }

   public boolean func_94476_e(IBlockAccess p_94476_1_, int p_94476_2_, int p_94476_3_, int p_94476_4_, int p_94476_5_) {
      return this.func_94482_f(p_94476_1_, p_94476_2_, p_94476_3_, p_94476_4_, p_94476_5_) > 0;
   }

   protected boolean func_94477_d(int p_94477_1_) {
      return func_82524_c(p_94477_1_);
   }

   public void func_71852_a(World p_71852_1_, int p_71852_2_, int p_71852_3_, int p_71852_4_, int p_71852_5_, int p_71852_6_) {
      super.func_71852_a(p_71852_1_, p_71852_2_, p_71852_3_, p_71852_4_, p_71852_5_, p_71852_6_);
      this.func_94483_i_(p_71852_1_, p_71852_2_, p_71852_3_, p_71852_4_);
   }

}
