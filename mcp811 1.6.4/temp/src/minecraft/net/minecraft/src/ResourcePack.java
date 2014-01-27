package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import net.minecraft.src.MetadataSection;
import net.minecraft.src.MetadataSerializer;
import net.minecraft.src.ResourceLocation;

public interface ResourcePack {

   InputStream func_110590_a(ResourceLocation var1) throws IOException;

   boolean func_110589_b(ResourceLocation var1);

   Set func_110587_b();

   MetadataSection func_135058_a(MetadataSerializer var1, String var2) throws IOException;

   BufferedImage func_110586_a() throws IOException;

   String func_130077_b();
}
