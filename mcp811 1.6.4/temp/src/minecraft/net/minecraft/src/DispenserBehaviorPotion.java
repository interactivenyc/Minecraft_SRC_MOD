package net.minecraft.src;

import net.minecraft.src.BehaviorDefaultDispenseItem;
import net.minecraft.src.DispenserBehaviorPotionProjectile;
import net.minecraft.src.IBehaviorDispenseItem;
import net.minecraft.src.IBlockSource;
import net.minecraft.src.ItemPotion;
import net.minecraft.src.ItemStack;

final class DispenserBehaviorPotion implements IBehaviorDispenseItem {

   private final BehaviorDefaultDispenseItem field_96458_b = new BehaviorDefaultDispenseItem();


   public ItemStack func_82482_a(IBlockSource p_82482_1_, ItemStack p_82482_2_) {
      return ItemPotion.func_77831_g(p_82482_2_.func_77960_j())?(new DispenserBehaviorPotionProjectile(this, p_82482_2_)).func_82482_a(p_82482_1_, p_82482_2_):this.field_96458_b.func_82482_a(p_82482_1_, p_82482_2_);
   }
}
