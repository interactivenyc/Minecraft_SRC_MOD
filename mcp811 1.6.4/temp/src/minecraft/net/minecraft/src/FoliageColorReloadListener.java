package net.minecraft.src;

import java.io.IOException;
import net.minecraft.src.ColorizerFoliage;
import net.minecraft.src.ResourceLocation;
import net.minecraft.src.ResourceManager;
import net.minecraft.src.ResourceManagerReloadListener;
import net.minecraft.src.TextureUtil;

public class FoliageColorReloadListener implements ResourceManagerReloadListener {

   private static final ResourceLocation field_130079_a = new ResourceLocation("textures/colormap/foliage.png");


   public void func_110549_a(ResourceManager p_110549_1_) {
      try {
         ColorizerFoliage.func_77467_a(TextureUtil.func_110986_a(p_110549_1_, field_130079_a));
      } catch (IOException var3) {
         ;
      }

   }

}
