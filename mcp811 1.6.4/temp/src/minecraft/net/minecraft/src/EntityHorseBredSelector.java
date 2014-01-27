package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityHorse;
import net.minecraft.src.IEntitySelector;

final class EntityHorseBredSelector implements IEntitySelector {

   public boolean func_82704_a(Entity p_82704_1_) {
      return p_82704_1_ instanceof EntityHorse && ((EntityHorse)p_82704_1_).func_110205_ce();
   }
}
