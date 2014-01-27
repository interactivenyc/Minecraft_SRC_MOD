package net.minecraft.src;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class ItemNameTag extends Item {

   public ItemNameTag(int p_i1889_1_) {
      super(p_i1889_1_);
      this.func_77637_a(CreativeTabs.field_78040_i);
   }

   public boolean func_111207_a(ItemStack p_111207_1_, EntityPlayer p_111207_2_, EntityLivingBase p_111207_3_) {
      if(!p_111207_1_.func_82837_s()) {
         return false;
      } else if(p_111207_3_ instanceof EntityLiving) {
         EntityLiving var4 = (EntityLiving)p_111207_3_;
         var4.func_94058_c(p_111207_1_.func_82833_r());
         var4.func_110163_bv();
         --p_111207_1_.field_77994_a;
         return true;
      } else {
         return super.func_111207_a(p_111207_1_, p_111207_2_, p_111207_3_);
      }
   }
}
