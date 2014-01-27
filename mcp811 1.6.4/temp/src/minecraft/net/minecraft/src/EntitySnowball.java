package net.minecraft.src;

import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityBlaze;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntityThrowable;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;

public class EntitySnowball extends EntityThrowable {

   public EntitySnowball(World p_i1773_1_) {
      super(p_i1773_1_);
   }

   public EntitySnowball(World p_i1774_1_, EntityLivingBase p_i1774_2_) {
      super(p_i1774_1_, p_i1774_2_);
   }

   public EntitySnowball(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_) {
      super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
   }

   protected void func_70184_a(MovingObjectPosition p_70184_1_) {
      if(p_70184_1_.field_72308_g != null) {
         byte var2 = 0;
         if(p_70184_1_.field_72308_g instanceof EntityBlaze) {
            var2 = 3;
         }

         p_70184_1_.field_72308_g.func_70097_a(DamageSource.func_76356_a(this, this.func_85052_h()), (float)var2);
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.field_70170_p.func_72869_a("snowballpoof", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0D, 0.0D, 0.0D);
      }

      if(!this.field_70170_p.field_72995_K) {
         this.func_70106_y();
      }

   }
}
