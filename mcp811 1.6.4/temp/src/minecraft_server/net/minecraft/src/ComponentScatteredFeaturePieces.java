package net.minecraft.src;

import net.minecraft.src.ComponentScatteredFeatureDesertPyramid;
import net.minecraft.src.ComponentScatteredFeatureJunglePyramid;
import net.minecraft.src.ComponentScatteredFeatureSwampHut;
import net.minecraft.src.MapGenStructureIO;

public class ComponentScatteredFeaturePieces {

   public static void func_143045_a() {
      MapGenStructureIO.func_143031_a(ComponentScatteredFeatureDesertPyramid.class, "TeDP");
      MapGenStructureIO.func_143031_a(ComponentScatteredFeatureJunglePyramid.class, "TeJP");
      MapGenStructureIO.func_143031_a(ComponentScatteredFeatureSwampHut.class, "TeSH");
   }
}
