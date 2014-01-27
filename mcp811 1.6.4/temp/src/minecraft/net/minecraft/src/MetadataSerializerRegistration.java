package net.minecraft.src;

import net.minecraft.src.MetadataSectionSerializer;
import net.minecraft.src.MetadataSerializer;
import net.minecraft.src.MetadataSerializerEmptyAnon;

class MetadataSerializerRegistration {

   final MetadataSectionSerializer field_110502_a;
   final Class field_110500_b;
   // $FF: synthetic field
   final MetadataSerializer field_110501_c;


   private MetadataSerializerRegistration(MetadataSerializer p_i1305_1_, MetadataSectionSerializer p_i1305_2_, Class p_i1305_3_) {
      this.field_110501_c = p_i1305_1_;
      this.field_110502_a = p_i1305_2_;
      this.field_110500_b = p_i1305_3_;
   }

   // $FF: synthetic method
   MetadataSerializerRegistration(MetadataSerializer p_i1306_1_, MetadataSectionSerializer p_i1306_2_, Class p_i1306_3_, MetadataSerializerEmptyAnon p_i1306_4_) {
      this(p_i1306_1_, p_i1306_2_, p_i1306_3_);
   }
}
