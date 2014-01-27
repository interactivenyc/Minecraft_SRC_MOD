package net.minecraft.src;

import net.minecraft.src.BehaviorProjectileDispense;
import net.minecraft.src.DispenserBehaviorPotion;
import net.minecraft.src.EntityPotion;
import net.minecraft.src.IPosition;
import net.minecraft.src.IProjectile;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

class DispenserBehaviorPotionProjectile extends BehaviorProjectileDispense {

   // $FF: synthetic field
   final ItemStack field_96462_b;
   // $FF: synthetic field
   final DispenserBehaviorPotion field_96463_c;


   DispenserBehaviorPotionProjectile(DispenserBehaviorPotion p_i1492_1_, ItemStack p_i1492_2_) {
      this.field_96463_c = p_i1492_1_;
      this.field_96462_b = p_i1492_2_;
   }

   protected IProjectile func_82499_a(World p_82499_1_, IPosition p_82499_2_) {
      return new EntityPotion(p_82499_1_, p_82499_2_.func_82615_a(), p_82499_2_.func_82617_b(), p_82499_2_.func_82616_c(), this.field_96462_b.func_77946_l());
   }

   protected float func_82498_a() {
      return super.func_82498_a() * 0.5F;
   }

   protected float func_82500_b() {
      return super.func_82500_b() * 1.25F;
   }
}
