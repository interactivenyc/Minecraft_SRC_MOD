package net.minecraft.src;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NetHandler;
import net.minecraft.src.Packet;

public class Packet102WindowClick extends Packet {

   public int field_73444_a;
   public int field_73442_b;
   public int field_73443_c;
   public short field_73440_d;
   public ItemStack field_73441_e;
   public int field_73439_f;


   public void func_73279_a(NetHandler p_73279_1_) {
      p_73279_1_.func_72523_a(this);
   }

   public void func_73267_a(DataInput p_73267_1_) throws IOException {
      this.field_73444_a = p_73267_1_.readByte();
      this.field_73442_b = p_73267_1_.readShort();
      this.field_73443_c = p_73267_1_.readByte();
      this.field_73440_d = p_73267_1_.readShort();
      this.field_73439_f = p_73267_1_.readByte();
      this.field_73441_e = func_73276_c(p_73267_1_);
   }

   public void func_73273_a(DataOutput p_73273_1_) throws IOException {
      p_73273_1_.writeByte(this.field_73444_a);
      p_73273_1_.writeShort(this.field_73442_b);
      p_73273_1_.writeByte(this.field_73443_c);
      p_73273_1_.writeShort(this.field_73440_d);
      p_73273_1_.writeByte(this.field_73439_f);
      func_73270_a(this.field_73441_e, p_73273_1_);
   }

   public int func_73284_a() {
      return 11;
   }
}