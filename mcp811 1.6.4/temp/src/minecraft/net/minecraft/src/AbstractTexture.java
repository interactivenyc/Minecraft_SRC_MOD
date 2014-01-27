package net.minecraft.src;

import net.minecraft.src.TextureObject;
import net.minecraft.src.TextureUtil;

public abstract class AbstractTexture implements TextureObject {

   protected int field_110553_a = -1;


   public int func_110552_b() {
      if(this.field_110553_a == -1) {
         this.field_110553_a = TextureUtil.func_110996_a();
      }

      return this.field_110553_a;
   }
}
