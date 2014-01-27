package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.EntityMinecart;
import net.minecraft.src.EntityMinecartMobSpawner;
import net.minecraft.src.RenderMinecart;
import net.minecraft.src.TileEntityMobSpawnerRenderer;

public class RenderMinecartMobSpawner extends RenderMinecart {

   protected void func_98192_a(EntityMinecartMobSpawner p_98192_1_, float p_98192_2_, Block p_98192_3_, int p_98192_4_) {
      super.func_94144_a(p_98192_1_, p_98192_2_, p_98192_3_, p_98192_4_);
      if(p_98192_3_ == Block.field_72065_as) {
         TileEntityMobSpawnerRenderer.func_98144_a(p_98192_1_.func_98039_d(), p_98192_1_.field_70165_t, p_98192_1_.field_70163_u, p_98192_1_.field_70161_v, p_98192_2_);
      }

   }

   // $FF: synthetic method
   // $FF: bridge method
   protected void func_94144_a(EntityMinecart p_94144_1_, float p_94144_2_, Block p_94144_3_, int p_94144_4_) {
      this.func_98192_a((EntityMinecartMobSpawner)p_94144_1_, p_94144_2_, p_94144_3_, p_94144_4_);
   }
}
