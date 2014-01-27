package net.minecraft.src;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemWritableBook;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagString;
import net.minecraft.src.World;

public class ItemEditableBook extends Item {

   public ItemEditableBook(int p_i1915_1_) {
      super(p_i1915_1_);
      this.func_77625_d(1);
   }

   public static boolean func_77828_a(NBTTagCompound p_77828_0_) {
      if(!ItemWritableBook.func_77829_a(p_77828_0_)) {
         return false;
      } else if(!p_77828_0_.func_74764_b("title")) {
         return false;
      } else {
         String var1 = p_77828_0_.func_74779_i("title");
         return var1 != null && var1.length() <= 16?p_77828_0_.func_74764_b("author"):false;
      }
   }

   public String func_77628_j(ItemStack p_77628_1_) {
      if(p_77628_1_.func_77942_o()) {
         NBTTagCompound var2 = p_77628_1_.func_77978_p();
         NBTTagString var3 = (NBTTagString)var2.func_74781_a("title");
         if(var3 != null) {
            return var3.toString();
         }
      }

      return super.func_77628_j(p_77628_1_);
   }

   public ItemStack func_77659_a(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
      p_77659_3_.func_71048_c(p_77659_1_);
      return p_77659_1_;
   }

   public boolean func_77651_p() {
      return true;
   }
}
