package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.EntityMinecart;
import net.minecraft.src.EntityMinecartMobSpawnerLogic;
import net.minecraft.src.MobSpawnerBaseLogic;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityMinecartMobSpawner extends EntityMinecart {

   private final MobSpawnerBaseLogic field_98040_a = new EntityMinecartMobSpawnerLogic(this);


   public EntityMinecartMobSpawner(World p_i1725_1_) {
      super(p_i1725_1_);
   }

   public EntityMinecartMobSpawner(World p_i1726_1_, double p_i1726_2_, double p_i1726_4_, double p_i1726_6_) {
      super(p_i1726_1_, p_i1726_2_, p_i1726_4_, p_i1726_6_);
   }

   public int func_94087_l() {
      return 4;
   }

   public Block func_94093_n() {
      return Block.field_72065_as;
   }

   protected void func_70037_a(NBTTagCompound p_70037_1_) {
      super.func_70037_a(p_70037_1_);
      this.field_98040_a.func_98270_a(p_70037_1_);
   }

   protected void func_70014_b(NBTTagCompound p_70014_1_) {
      super.func_70014_b(p_70014_1_);
      this.field_98040_a.func_98280_b(p_70014_1_);
   }

   public void func_70103_a(byte p_70103_1_) {
      this.field_98040_a.func_98268_b(p_70103_1_);
   }

   public void func_70071_h_() {
      super.func_70071_h_();
      this.field_98040_a.func_98278_g();
   }

   public MobSpawnerBaseLogic func_98039_d() {
      return this.field_98040_a;
   }
}
