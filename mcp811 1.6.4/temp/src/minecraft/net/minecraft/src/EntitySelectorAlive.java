package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.IEntitySelector;

final class EntitySelectorAlive implements IEntitySelector {

   public boolean func_82704_a(Entity p_82704_1_) {
      return p_82704_1_.func_70089_S();
   }
}
