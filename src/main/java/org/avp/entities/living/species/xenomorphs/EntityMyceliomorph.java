package org.avp.entities.living.species.xenomorphs;

import org.avp.ItemHandler;
import org.avp.entities.living.species.SpeciesXenomorph;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityMyceliomorph extends SpeciesXenomorph
{
    public EntityMyceliomorph(World world)
    {
        super(world);
        this.addStandardXenomorphAISet();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
    }
    
    @Override
    public ItemStack getPickedResult(RayTraceResult target)
    {
        return new ItemStack(ItemHandler.Experimental.summonerMyceliomorph);
    }
}
