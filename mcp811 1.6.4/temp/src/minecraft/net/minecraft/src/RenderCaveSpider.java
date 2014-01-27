package net.minecraft.src;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityCaveSpider;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.EntitySpider;
import net.minecraft.src.RenderSpider;
import net.minecraft.src.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCaveSpider extends RenderSpider {

   private static final ResourceLocation field_110893_a = new ResourceLocation("textures/entity/spider/cave_spider.png");


   public RenderCaveSpider() {
      this.field_76989_e *= 0.7F;
   }

   protected void func_77096_a(EntityCaveSpider p_77096_1_, float p_77096_2_) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
   }

   protected ResourceLocation func_110892_a(EntityCaveSpider p_110892_1_) {
      return field_110893_a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected ResourceLocation func_110889_a(EntitySpider p_110889_1_) {
      return this.func_110892_a((EntityCaveSpider)p_110889_1_);
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected void func_77041_b(EntityLivingBase p_77041_1_, float p_77041_2_) {
      this.func_77096_a((EntityCaveSpider)p_77041_1_, p_77041_2_);
   }

   // $FF: synthetic method
   // $FF: bridge method
   protected ResourceLocation func_110775_a(Entity p_110775_1_) {
      return this.func_110892_a((EntityCaveSpider)p_110775_1_);
   }

}
