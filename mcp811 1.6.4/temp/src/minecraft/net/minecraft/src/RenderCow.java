package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityCow;
import net.minecraft.src.ModelBase;
import net.minecraft.src.RenderLiving;
import net.minecraft.src.ResourceLocation;

public class RenderCow extends RenderLiving {

   private static final ResourceLocation field_110833_a = new ResourceLocation("textures/entity/cow/cow.png");


   public RenderCow(ModelBase p_i1253_1_, float p_i1253_2_) {
      super(p_i1253_1_, p_i1253_2_);
   }

   protected ResourceLocation func_110832_a(EntityCow p_110832_1_) {
      return field_110833_a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected ResourceLocation func_110775_a(Entity p_110775_1_) {
      return this.func_110832_a((EntityCow)p_110775_1_);
   }

}
