package net.minecraft.src;

import net.minecraft.src.CreativeTabBlock;
import net.minecraft.src.CreativeTabBrewing;
import net.minecraft.src.CreativeTabCombat;
import net.minecraft.src.CreativeTabDeco;
import net.minecraft.src.CreativeTabFood;
import net.minecraft.src.CreativeTabInventory;
import net.minecraft.src.CreativeTabMaterial;
import net.minecraft.src.CreativeTabMisc;
import net.minecraft.src.CreativeTabRedstone;
import net.minecraft.src.CreativeTabSearch;
import net.minecraft.src.CreativeTabTools;
import net.minecraft.src.CreativeTabTransport;
import net.minecraft.src.EnumEnchantmentType;

public class CreativeTabs {

   public static final CreativeTabs[] field_78032_a = new CreativeTabs[12];
   public static final CreativeTabs field_78030_b = new CreativeTabCombat(0, "buildingBlocks");
   public static final CreativeTabs field_78031_c = new CreativeTabBlock(1, "decorations");
   public static final CreativeTabs field_78028_d = new CreativeTabDeco(2, "redstone");
   public static final CreativeTabs field_78029_e = new CreativeTabRedstone(3, "transportation");
   public static final CreativeTabs field_78026_f = (new CreativeTabTransport(4, "misc")).func_111229_a(new EnumEnchantmentType[]{EnumEnchantmentType.all});
   public static final CreativeTabs field_78027_g = (new CreativeTabMisc(5, "search")).func_78025_a("item_search.png");
   public static final CreativeTabs field_78039_h = new CreativeTabSearch(6, "food");
   public static final CreativeTabs field_78040_i = (new CreativeTabFood(7, "tools")).func_111229_a(new EnumEnchantmentType[]{EnumEnchantmentType.digger});
   public static final CreativeTabs field_78037_j = (new CreativeTabTools(8, "combat")).func_111229_a(new EnumEnchantmentType[]{EnumEnchantmentType.armor, EnumEnchantmentType.armor_feet, EnumEnchantmentType.armor_head, EnumEnchantmentType.armor_legs, EnumEnchantmentType.armor_torso, EnumEnchantmentType.bow, EnumEnchantmentType.weapon});
   public static final CreativeTabs field_78038_k = new CreativeTabBrewing(9, "brewing");
   public static final CreativeTabs field_78035_l = new CreativeTabMaterial(10, "materials");
   public static final CreativeTabs field_78036_m = (new CreativeTabInventory(11, "inventory")).func_78025_a("inventory.png").func_78022_j().func_78014_h();
   private final int field_78033_n;
   private final String field_78034_o;
   private String field_78043_p = "items.png";
   private boolean field_78042_q = true;
   private boolean field_78041_r = true;
   private EnumEnchantmentType[] field_111230_s;


   public CreativeTabs(int p_i1853_1_, String p_i1853_2_) {
      this.field_78033_n = p_i1853_1_;
      this.field_78034_o = p_i1853_2_;
      field_78032_a[p_i1853_1_] = this;
   }

   public CreativeTabs func_78025_a(String p_78025_1_) {
      this.field_78043_p = p_78025_1_;
      return this;
   }

   public CreativeTabs func_78014_h() {
      this.field_78041_r = false;
      return this;
   }

   public CreativeTabs func_78022_j() {
      this.field_78042_q = false;
      return this;
   }

   public CreativeTabs func_111229_a(EnumEnchantmentType ... p_111229_1_) {
      this.field_111230_s = p_111229_1_;
      return this;
   }

}
