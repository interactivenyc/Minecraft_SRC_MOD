package net.minecraft.src;

import java.util.List;
import net.minecraft.src.ResourceManager;
import net.minecraft.src.ResourceManagerReloadListener;

public interface ReloadableResourceManager extends ResourceManager {

   void func_110541_a(List var1);

   void func_110542_a(ResourceManagerReloadListener var1);
}
