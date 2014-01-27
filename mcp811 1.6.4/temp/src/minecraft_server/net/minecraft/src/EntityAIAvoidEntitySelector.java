package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityAIAvoidEntity;
import net.minecraft.src.IEntitySelector;

class EntityAIAvoidEntitySelector implements IEntitySelector {

   // $FF: synthetic field
   final EntityAIAvoidEntity field_98219_c;


   EntityAIAvoidEntitySelector(EntityAIAvoidEntity p_i1615_1_) {
      this.field_98219_c = p_i1615_1_;
   }

   public boolean func_82704_a(Entity p_82704_1_) {
      return p_82704_1_.func_70089_S() && EntityAIAvoidEntity.func_98217_a(this.field_98219_c).func_70635_at().func_75522_a(p_82704_1_);
   }
}
