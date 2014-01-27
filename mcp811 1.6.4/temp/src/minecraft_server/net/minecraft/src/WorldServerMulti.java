package net.minecraft.src;

import net.minecraft.server.MinecraftServer;
import net.minecraft.src.DerivedWorldInfo;
import net.minecraft.src.ILogAgent;
import net.minecraft.src.ISaveHandler;
import net.minecraft.src.MinecraftException;
import net.minecraft.src.Profiler;
import net.minecraft.src.WorldServer;
import net.minecraft.src.WorldSettings;

public class WorldServerMulti extends WorldServer {

   public WorldServerMulti(MinecraftServer p_i1514_1_, ISaveHandler p_i1514_2_, String p_i1514_3_, int p_i1514_4_, WorldSettings p_i1514_5_, WorldServer p_i1514_6_, Profiler p_i1514_7_, ILogAgent p_i1514_8_) {
      super(p_i1514_1_, p_i1514_2_, p_i1514_3_, p_i1514_4_, p_i1514_5_, p_i1514_7_, p_i1514_8_);
      this.field_72988_C = p_i1514_6_.field_72988_C;
      this.field_96442_D = p_i1514_6_.func_96441_U();
      this.field_72986_A = new DerivedWorldInfo(p_i1514_6_.func_72912_H());
   }

   protected void func_73042_a() throws MinecraftException {}
}
