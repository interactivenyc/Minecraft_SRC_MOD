package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.BlockDispenser;
import net.minecraft.src.DispenserBehaviorArrow;
import net.minecraft.src.DispenserBehaviorBoat;
import net.minecraft.src.DispenserBehaviorDye;
import net.minecraft.src.DispenserBehaviorEgg;
import net.minecraft.src.DispenserBehaviorEmptyBucket;
import net.minecraft.src.DispenserBehaviorExperience;
import net.minecraft.src.DispenserBehaviorFilledBucket;
import net.minecraft.src.DispenserBehaviorFire;
import net.minecraft.src.DispenserBehaviorFireball;
import net.minecraft.src.DispenserBehaviorFireworks;
import net.minecraft.src.DispenserBehaviorMobEgg;
import net.minecraft.src.DispenserBehaviorPotion;
import net.minecraft.src.DispenserBehaviorSnowball;
import net.minecraft.src.DispenserBehaviorTNT;
import net.minecraft.src.Item;

public class DispenserBehaviors {

   public static void func_96467_a() {
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77704_l, new DispenserBehaviorArrow());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77764_aP, new DispenserBehaviorEgg());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77768_aD, new DispenserBehaviorSnowball());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77809_bD, new DispenserBehaviorExperience());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77726_bs, new DispenserBehaviorPotion());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77815_bC, new DispenserBehaviorMobEgg());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_92104_bU, new DispenserBehaviorFireworks());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77811_bE, new DispenserBehaviorFireball());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77769_aE, new DispenserBehaviorBoat());
      DispenserBehaviorFilledBucket var0 = new DispenserBehaviorFilledBucket();
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77775_ay, var0);
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77786_ax, var0);
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77788_aw, new DispenserBehaviorEmptyBucket());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77709_i, new DispenserBehaviorFire());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77756_aW, new DispenserBehaviorDye());
      BlockDispenser.field_82527_a.func_82595_a(Item.field_77698_e[Block.field_72091_am.field_71990_ca], new DispenserBehaviorTNT());
   }
}
