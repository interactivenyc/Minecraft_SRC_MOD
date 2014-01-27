package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.EntitySelectorAlive;
import net.minecraft.src.EntitySelectorInventory;

public interface IEntitySelector {

   IEntitySelector field_94557_a = new EntitySelectorAlive();
   IEntitySelector field_96566_b = new EntitySelectorInventory();


   boolean func_82704_a(Entity var1);

}
