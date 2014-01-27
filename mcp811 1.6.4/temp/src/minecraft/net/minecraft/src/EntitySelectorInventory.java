package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.IEntitySelector;
import net.minecraft.src.IInventory;

final class EntitySelectorInventory implements IEntitySelector {

   public boolean func_82704_a(Entity p_82704_1_) {
      return p_82704_1_ instanceof IInventory && p_82704_1_.func_70089_S();
   }
}
