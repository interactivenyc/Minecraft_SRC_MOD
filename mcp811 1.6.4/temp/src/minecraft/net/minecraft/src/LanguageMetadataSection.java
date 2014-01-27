package net.minecraft.src;

import java.util.Collection;
import net.minecraft.src.MetadataSection;

public class LanguageMetadataSection implements MetadataSection {

   private final Collection field_135019_a;


   public LanguageMetadataSection(Collection p_i1311_1_) {
      this.field_135019_a = p_i1311_1_;
   }

   public Collection func_135018_a() {
      return this.field_135019_a;
   }
}
