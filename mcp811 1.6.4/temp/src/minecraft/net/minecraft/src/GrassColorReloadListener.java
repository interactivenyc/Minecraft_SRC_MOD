package net.minecraft.src;

import java.io.IOException;
import net.minecraft.src.ColorizerGrass;
import net.minecraft.src.ResourceLocation;
import net.minecraft.src.ResourceManager;
import net.minecraft.src.ResourceManagerReloadListener;
import net.minecraft.src.TextureUtil;

public class GrassColorReloadListener implements ResourceManagerReloadListener {

   private static final ResourceLocation field_130078_a = new ResourceLocation("textures/colormap/grass.png");


   public void func_110549_a(ResourceManager p_110549_1_) {
      try {
         ColorizerGrass.func_77479_a(TextureUtil.func_110986_a(p_110549_1_, field_130078_a));
      } catch (IOException var3) {
         ;
      }

   }

}
