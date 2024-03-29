package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.src.ComponentNetherBridgeCrossing3;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.StructureNetherBridgePieceWeight;
import net.minecraft.src.StructureNetherBridgePieces;

public class ComponentNetherBridgeStartPiece extends ComponentNetherBridgeCrossing3 {

   public StructureNetherBridgePieceWeight field_74970_a;
   public List field_74968_b;
   public List field_74969_c;
   public ArrayList field_74967_d = new ArrayList();


   public ComponentNetherBridgeStartPiece() {}

   public ComponentNetherBridgeStartPiece(Random p_i2059_1_, int p_i2059_2_, int p_i2059_3_) {
      super(p_i2059_1_, p_i2059_2_, p_i2059_3_);
      this.field_74968_b = new ArrayList();
      StructureNetherBridgePieceWeight[] var4 = StructureNetherBridgePieces.func_78739_a();
      int var5 = var4.length;

      int var6;
      StructureNetherBridgePieceWeight var7;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.field_78827_c = 0;
         this.field_74968_b.add(var7);
      }

      this.field_74969_c = new ArrayList();
      var4 = StructureNetherBridgePieces.func_78737_b();
      var5 = var4.length;

      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.field_78827_c = 0;
         this.field_74969_c.add(var7);
      }

   }

   protected void func_143011_b(NBTTagCompound p_143011_1_) {
      super.func_143011_b(p_143011_1_);
   }

   protected void func_143012_a(NBTTagCompound p_143012_1_) {
      super.func_143012_a(p_143012_1_);
   }
}
