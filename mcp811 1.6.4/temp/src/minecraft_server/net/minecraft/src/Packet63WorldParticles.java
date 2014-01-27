package net.minecraft.src;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.src.NetHandler;
import net.minecraft.src.Packet;

public class Packet63WorldParticles extends Packet {

   private String field_98209_a;
   private float field_98207_b;
   private float field_98208_c;
   private float field_98205_d;
   private float field_98206_e;
   private float field_98203_f;
   private float field_98204_g;
   private float field_98210_h;
   private int field_98211_i;


   public void func_73267_a(DataInput p_73267_1_) throws IOException {
      this.field_98209_a = func_73282_a(p_73267_1_, 64);
      this.field_98207_b = p_73267_1_.readFloat();
      this.field_98208_c = p_73267_1_.readFloat();
      this.field_98205_d = p_73267_1_.readFloat();
      this.field_98206_e = p_73267_1_.readFloat();
      this.field_98203_f = p_73267_1_.readFloat();
      this.field_98204_g = p_73267_1_.readFloat();
      this.field_98210_h = p_73267_1_.readFloat();
      this.field_98211_i = p_73267_1_.readInt();
   }

   public void func_73273_a(DataOutput p_73273_1_) throws IOException {
      func_73271_a(this.field_98209_a, p_73273_1_);
      p_73273_1_.writeFloat(this.field_98207_b);
      p_73273_1_.writeFloat(this.field_98208_c);
      p_73273_1_.writeFloat(this.field_98205_d);
      p_73273_1_.writeFloat(this.field_98206_e);
      p_73273_1_.writeFloat(this.field_98203_f);
      p_73273_1_.writeFloat(this.field_98204_g);
      p_73273_1_.writeFloat(this.field_98210_h);
      p_73273_1_.writeInt(this.field_98211_i);
   }

   public void func_73279_a(NetHandler p_73279_1_) {
      p_73279_1_.func_98182_a(this);
   }

   public int func_73284_a() {
      return 64;
   }
}
