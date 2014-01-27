package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Enchantment;
import net.minecraft.src.EnchantmentData;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.WeightedRandomChestContent;

public class ItemEnchantedBook extends Item {

   public ItemEnchantedBook(int p_i1859_1_) {
      super(p_i1859_1_);
   }

   public boolean func_77616_k(ItemStack p_77616_1_) {
      return false;
   }

   public NBTTagList func_92110_g(ItemStack p_92110_1_) {
      return p_92110_1_.field_77990_d != null && p_92110_1_.field_77990_d.func_74764_b("StoredEnchantments")?(NBTTagList)p_92110_1_.field_77990_d.func_74781_a("StoredEnchantments"):new NBTTagList();
   }

   public void func_92115_a(ItemStack p_92115_1_, EnchantmentData p_92115_2_) {
      NBTTagList var3 = this.func_92110_g(p_92115_1_);
      boolean var4 = true;

      for(int var5 = 0; var5 < var3.func_74745_c(); ++var5) {
         NBTTagCompound var6 = (NBTTagCompound)var3.func_74743_b(var5);
         if(var6.func_74765_d("id") == p_92115_2_.field_76302_b.field_77352_x) {
            if(var6.func_74765_d("lvl") < p_92115_2_.field_76303_c) {
               var6.func_74777_a("lvl", (short)p_92115_2_.field_76303_c);
            }

            var4 = false;
            break;
         }
      }

      if(var4) {
         NBTTagCompound var7 = new NBTTagCompound();
         var7.func_74777_a("id", (short)p_92115_2_.field_76302_b.field_77352_x);
         var7.func_74777_a("lvl", (short)p_92115_2_.field_76303_c);
         var3.func_74742_a(var7);
      }

      if(!p_92115_1_.func_77942_o()) {
         p_92115_1_.func_77982_d(new NBTTagCompound());
      }

      p_92115_1_.func_77978_p().func_74782_a("StoredEnchantments", var3);
   }

   public ItemStack func_92111_a(EnchantmentData p_92111_1_) {
      ItemStack var2 = new ItemStack(this);
      this.func_92115_a(var2, p_92111_1_);
      return var2;
   }

   public WeightedRandomChestContent func_92114_b(Random p_92114_1_) {
      return this.func_92112_a(p_92114_1_, 1, 1, 1);
   }

   public WeightedRandomChestContent func_92112_a(Random p_92112_1_, int p_92112_2_, int p_92112_3_, int p_92112_4_) {
      Enchantment var5 = Enchantment.field_92090_c[p_92112_1_.nextInt(Enchantment.field_92090_c.length)];
      ItemStack var6 = new ItemStack(this.field_77779_bT, 1, 0);
      int var7 = MathHelper.func_76136_a(p_92112_1_, var5.func_77319_d(), var5.func_77325_b());
      this.func_92115_a(var6, new EnchantmentData(var5, var7));
      return new WeightedRandomChestContent(var6, p_92112_2_, p_92112_3_, p_92112_4_);
   }
}
