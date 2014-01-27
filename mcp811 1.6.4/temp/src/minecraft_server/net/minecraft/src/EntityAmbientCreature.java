package net.minecraft.src;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IAnimals;
import net.minecraft.src.World;

public abstract class EntityAmbientCreature extends EntityLiving implements IAnimals {

   public EntityAmbientCreature(World p_i1679_1_) {
      super(p_i1679_1_);
   }

   public boolean func_110164_bC() {
      return false;
   }

   protected boolean func_70085_c(EntityPlayer p_70085_1_) {
      return false;
   }
}
