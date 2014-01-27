package net.minecraft.src;

import java.io.File;
import java.io.FileFilter;

final class ResourcePackRepositoryFilter implements FileFilter {

   public boolean accept(File p_accept_1_) {
      boolean var2 = p_accept_1_.isFile() && p_accept_1_.getName().endsWith(".zip");
      boolean var3 = p_accept_1_.isDirectory() && (new File(p_accept_1_, "pack.mcmeta")).isFile();
      return var2 || var3;
   }
}
