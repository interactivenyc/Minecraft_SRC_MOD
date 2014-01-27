package net.minecraft.src;

import net.minecraft.src.FontRenderer;
import net.minecraft.src.ResourceLocation;
import net.minecraft.src.TextureManager;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityRenderer;
import net.minecraft.src.World;

public abstract class TileEntitySpecialRenderer {

   protected TileEntityRenderer field_76898_b;


   public abstract void func_76894_a(TileEntity var1, double var2, double var4, double var6, float var8);

   protected void func_110628_a(ResourceLocation p_110628_1_) {
      TextureManager var2 = this.field_76898_b.field_76960_e;
      if(var2 != null) {
         var2.func_110577_a(p_110628_1_);
      }

   }

   public void func_76893_a(TileEntityRenderer p_76893_1_) {
      this.field_76898_b = p_76893_1_;
   }

   public void func_76896_a(World p_76896_1_) {}

   public FontRenderer func_76895_b() {
      return this.field_76898_b.func_76954_a();
   }
}
