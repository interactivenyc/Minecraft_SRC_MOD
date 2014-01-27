package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityGiantZombie;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.ModelBase;
import net.minecraft.src.RenderLiving;
import net.minecraft.src.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGiantZombie extends RenderLiving {

   private static final ResourceLocation field_110871_a = new ResourceLocation("textures/entity/zombie/zombie.png");
   private float field_77073_a;


   public RenderGiantZombie(ModelBase p_i1255_1_, float p_i1255_2_, float p_i1255_3_) {
      super(p_i1255_1_, p_i1255_2_ * p_i1255_3_);
      this.field_77073_a = p_i1255_3_;
   }

   protected void func_77072_a(EntityGiantZombie p_77072_1_, float p_77072_2_) {
      GL11.glScalef(this.field_77073_a, this.field_77073_a, this.field_77073_a);
   }

   protected ResourceLocation func_110870_a(EntityGiantZombie p_110870_1_) {
      return field_110871_a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected void func_77041_b(EntityLivingBase p_77041_1_, float p_77041_2_) {
      this.func_77072_a((EntityGiantZombie)p_77041_1_, p_77041_2_);
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected ResourceLocation func_110775_a(Entity p_110775_1_) {
      return this.func_110870_a((EntityGiantZombie)p_110775_1_);
   }

}
