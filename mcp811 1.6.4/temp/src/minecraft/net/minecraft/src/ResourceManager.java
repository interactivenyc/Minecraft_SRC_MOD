package net.minecraft.src;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import net.minecraft.src.Resource;
import net.minecraft.src.ResourceLocation;

public interface ResourceManager {

   Set func_135055_a();

   Resource func_110536_a(ResourceLocation var1) throws IOException;

   List func_135056_b(ResourceLocation var1) throws IOException;
}
