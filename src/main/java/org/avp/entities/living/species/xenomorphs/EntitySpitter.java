package org.avp.entities.living.species.xenomorphs;

import org.avp.ItemHandler;
import org.avp.client.Sounds;
import org.avp.entities.EntityAcidProjectile;
import org.avp.entities.EntityBullet;
import org.avp.entities.living.species.SpeciesXenomorph;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntitySpitter extends SpeciesXenomorph implements IRangedAttackMob
{
    EntityAIBase rangedAttackAI = new EntityAIAttackRanged(this, 0.4D, 16, 40);
    
    public EntitySpitter(World par1World)
    {
        super(par1World);
        this.experienceValue = 275;
        this.setSize(1.0F, 3.0F);
        
        
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, rangedAttackAI);
        this.addStandardXenomorphAISet();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5500000238418579D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return Sounds.ALIEN_HURT.event();
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return Sounds.ALIEN_LIVING.event();
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return Sounds.ALIEN_DEATH.event();
    }

    @Override
    public int getTotalArmorValue()
    {
        return 2;
    }

    @Override
    public boolean attackEntityAsMob(Entity entity)
    {
        this.attackEntityWithRangedAttack((EntityLivingBase) entity, 0.2f);
        return true;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase targetEntity, float damage)
    {
        if (this.getAttackTarget() != null)
        {
            this.getLookHelper().setLookPosition(targetEntity.posX, targetEntity.posY + targetEntity.getEyeHeight(), targetEntity.posZ, 10.0F, this.getVerticalFaceSpeed());

            if (this.canEntityBeSeen(targetEntity))
            {
                EntityAcidProjectile entityacid = new EntityAcidProjectile(this.world, this, targetEntity, 1.6F, 14 - damage * 4);
                entityacid.setDamage(damage * 2.0F + this.rand.nextGaussian() * 0.25D + damage * 0.11F);
                this.world.spawnEntity(entityacid);
            }
        }
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
    }

    @Override
    public void setSwingingArms(boolean swingingArms)
    {
        ;
    }
    
    @Override
    public ItemStack getPickedResult(RayTraceResult target)
    {
        return new ItemStack(ItemHandler.summonerSpitter);
    }
}
