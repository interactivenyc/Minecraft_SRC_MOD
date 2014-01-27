package net.minecraft.src;

import net.minecraft.src.BehaviorDispenseArmor;
import net.minecraft.src.BlockDispenser;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.IBehaviorDispenseItem;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class ItemArmor extends Item {

   private static final int[] field_77882_bY = new int[]{11, 16, 15, 13};
   private static final String[] field_94606_cu = new String[]{"leather_helmet_overlay", "leather_chestplate_overlay", "leather_leggings_overlay", "leather_boots_overlay"};
   public static final String[] field_94603_a = new String[]{"empty_armor_slot_helmet", "empty_armor_slot_chestplate", "empty_armor_slot_leggings", "empty_armor_slot_boots"};
   private static final IBehaviorDispenseItem field_96605_cw = new BehaviorDispenseArmor();
   public final int field_77881_a;
   public final int field_77879_b;
   public final int field_77880_c;
   private final EnumArmorMaterial field_77878_bZ;


   public ItemArmor(int p_i1828_1_, EnumArmorMaterial p_i1828_2_, int p_i1828_3_, int p_i1828_4_) {
      super(p_i1828_1_);
      this.field_77878_bZ = p_i1828_2_;
      this.field_77881_a = p_i1828_4_;
      this.field_77880_c = p_i1828_3_;
      this.field_77879_b = p_i1828_2_.func_78044_b(p_i1828_4_);
      this.func_77656_e(p_i1828_2_.func_78046_a(p_i1828_4_));
      this.field_77777_bU = 1;
      this.func_77637_a(CreativeTabs.field_78037_j);
      BlockDispenser.field_82527_a.func_82595_a(this, field_96605_cw);
   }

   public int func_77619_b() {
      return this.field_77878_bZ.func_78045_a();
   }

   public EnumArmorMaterial func_82812_d() {
      return this.field_77878_bZ;
   }

   public boolean func_82816_b_(ItemStack p_82816_1_) {
      return this.field_77878_bZ != EnumArmorMaterial.CLOTH?false:(!p_82816_1_.func_77942_o()?false:(!p_82816_1_.func_77978_p().func_74764_b("display")?false:p_82816_1_.func_77978_p().func_74775_l("display").func_74764_b("color")));
   }

   public int func_82814_b(ItemStack p_82814_1_) {
      if(this.field_77878_bZ != EnumArmorMaterial.CLOTH) {
         return -1;
      } else {
         NBTTagCompound var2 = p_82814_1_.func_77978_p();
         if(var2 == null) {
            return 10511680;
         } else {
            NBTTagCompound var3 = var2.func_74775_l("display");
            return var3 == null?10511680:(var3.func_74764_b("color")?var3.func_74762_e("color"):10511680);
         }
      }
   }

   public void func_82815_c(ItemStack p_82815_1_) {
      if(this.field_77878_bZ == EnumArmorMaterial.CLOTH) {
         NBTTagCompound var2 = p_82815_1_.func_77978_p();
         if(var2 != null) {
            NBTTagCompound var3 = var2.func_74775_l("display");
            if(var3.func_74764_b("color")) {
               var3.func_82580_o("color");
            }

         }
      }
   }

   public void func_82813_b(ItemStack p_82813_1_, int p_82813_2_) {
      if(this.field_77878_bZ != EnumArmorMaterial.CLOTH) {
         throw new UnsupportedOperationException("Can\'t dye non-leather!");
      } else {
         NBTTagCompound var3 = p_82813_1_.func_77978_p();
         if(var3 == null) {
            var3 = new NBTTagCompound();
            p_82813_1_.func_77982_d(var3);
         }

         NBTTagCompound var4 = var3.func_74775_l("display");
         if(!var3.func_74764_b("display")) {
            var3.func_74766_a("display", var4);
         }

         var4.func_74768_a("color", p_82813_2_);
      }
   }

   public boolean func_82789_a(ItemStack p_82789_1_, ItemStack p_82789_2_) {
      return this.field_77878_bZ.func_82845_b() == p_82789_2_.field_77993_c?true:super.func_82789_a(p_82789_1_, p_82789_2_);
   }

   public ItemStack func_77659_a(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
      int var4 = EntityLiving.func_82159_b(p_77659_1_) - 1;
      ItemStack var5 = p_77659_3_.func_82169_q(var4);
      if(var5 == null) {
         p_77659_3_.func_70062_b(var4, p_77659_1_.func_77946_l());
         p_77659_1_.field_77994_a = 0;
      }

      return p_77659_1_;
   }

   // $FF: synthetic method
   static int[] func_77877_c() {
      return field_77882_bY;
   }

}
