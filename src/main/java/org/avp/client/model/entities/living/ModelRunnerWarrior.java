package org.avp.client.model.entities.living;

import com.arisux.mdx.lib.client.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;


public class ModelRunnerWarrior extends Model
{
    public ModelRenderer chest;
    public ModelRenderer abdomen;
    public ModelRenderer backSpines1;
    public ModelRenderer backSpines2;
    public ModelRenderer neck;
    public ModelRenderer headBase;
    public ModelRenderer lThigh;
    public ModelRenderer rThigh;
    public ModelRenderer lArm1;
    public ModelRenderer rArm1;
    public ModelRenderer tail1;
    public ModelRenderer lShoulderBlade;
    public ModelRenderer rShoulderBlade;
    public ModelRenderer headTop;
    public ModelRenderer rHead;
    public ModelRenderer lHead;
    public ModelRenderer jaw2;
    public ModelRenderer jawLower;
    public ModelRenderer innerJaw;
    public ModelRenderer lShin1;
    public ModelRenderer lShin2;
    public ModelRenderer lFoot;
    public ModelRenderer lBLongClaw1;
    public ModelRenderer lBLongClaw2;
    public ModelRenderer lBLongClaw3;
    public ModelRenderer rShin1;
    public ModelRenderer rShin2;
    public ModelRenderer rFoot;
    public ModelRenderer rBLongClaw1;
    public ModelRenderer rBLongClaw2;
    public ModelRenderer rBLongClaw3;
    public ModelRenderer lArm2;
    public ModelRenderer lClaw1;
    public ModelRenderer lClaw2;
    public ModelRenderer lLongClaw1;
    public ModelRenderer lLongClaw2;
    public ModelRenderer lLongClaw3;
    public ModelRenderer rArm2;
    public ModelRenderer rClaw1;
    public ModelRenderer rClaw2;
    public ModelRenderer rLongClaw1;
    public ModelRenderer rLongClaw2;
    public ModelRenderer rLongClaw3;
    public ModelRenderer tail2;
    public ModelRenderer tailSpines1;
    public ModelRenderer tailSpines2;
    public ModelRenderer tail3;
    public ModelRenderer tailSpines3;
    public ModelRenderer tail4;
    public ModelRenderer tailSpines4;
    public ModelRenderer tail5;
    public ModelRenderer tailSpines5;
    public ModelRenderer tailStabber;

    public ModelRunnerWarrior()
    {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.rShoulderBlade = new ModelRenderer(this, 171, 34);
        this.rShoulderBlade.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rShoulderBlade.addBox(-5.3F, -0.9F, -7.2F, 2, 3, 10, 0.0F);
        this.setRotation(rShoulderBlade, 1.4114477660878142F, 0.18203784098300857F, -0.136659280431156F);
        this.innerJaw = new ModelRenderer(this, 0, 18);
        this.innerJaw.setRotationPoint(0.0F, 6.4F, 1.2F);
        this.innerJaw.addBox(-1.0F, -0.7F, -4.6F, 2, 2, 5, 0.0F);
        this.setRotation(innerJaw, 0.7740535232594852F, 0.0F, 0.0F);
        this.rLongClaw1 = new ModelRenderer(this, 192, 120);
        this.rLongClaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLongClaw1.addBox(-0.9F, -1.0F, -5.1F, 0, 2, 3, 0.0F);
        this.rHead = new ModelRenderer(this, 34, 0);
        this.rHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHead.addBox(-2.51F, 4.1F, -6.7F, 3, 3, 5, 0.0F);
        this.setRotation(rHead, 0.5009094953223726F, -0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 50, 66);
        this.tail1.setRotationPoint(0.0F, 3.5F, 18.5F);
        this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11, 0.0F);
        this.setRotation(tail1, -0.40142572795869574F, -0.0F, 0.0F);
        this.headTop = new ModelRenderer(this, 28, 10);
        this.headTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headTop.addBox(-2.5F, -11.8F, -4.7F, 5, 10, 5, 0.0F);
        this.setRotation(headTop, -0.31869712141416456F, -0.0F, 0.0F);
        this.lArm2 = new ModelRenderer(this, 71, 9);
        this.lArm2.setRotationPoint(0.9F, 12.9F, 0.6F);
        this.lArm2.addBox(-0.9F, -1.1F, -10.6F, 2, 2, 11, 0.0F);
        this.setRotation(lArm2, 0.9560913642424937F, -0.0F, -0.045553093477052F);
        this.rClaw2 = new ModelRenderer(this, 60, 38);
        this.rClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rClaw2.addBox(-1.1F, 1.0F, -5.8F, 3, 0, 6, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 27);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.abdomen.addBox(-3.5F, 0.5F, 8.0F, 7, 6, 12, 0.0F);
        this.backSpines1 = new ModelRenderer(this, 0, 67);
        this.backSpines1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backSpines1.addBox(0.0F, -5.8F, 0.0F, 0, 6, 10, 0.0F);
        this.rBLongClaw2 = new ModelRenderer(this, 177, 118);
        this.rBLongClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rBLongClaw2.addBox(0.2F, -2.3F, -7.7F, 0, 3, 4, 0.0F);
        this.chest = new ModelRenderer(this, 0, 46);
        this.chest.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.chest.addBox(-4.5F, 0.0F, 0.0F, 9, 8, 10, 0.0F);
        this.lShin1 = new ModelRenderer(this, 79, 49);
        this.lShin1.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.lShin1.addBox(-2.0F, 0.0F, -0.5F, 3, 3, 12, 0.0F);
        this.tailSpines5 = new ModelRenderer(this, 177, 96);
        this.tailSpines5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines5.addBox(0.0F, -0.9F, 0.4F, 0, 3, 11, 0.0F);
        this.lClaw2 = new ModelRenderer(this, 60, 30);
        this.lClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lClaw2.addBox(-1.9F, 1.0F, -5.8F, 3, 0, 6, 0.0F);
        this.lLongClaw1 = new ModelRenderer(this, 192, 120);
        this.lLongClaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLongClaw1.addBox(1.0F, -1.0F, -5.1F, 0, 2, 3, 0.0F);
        this.tailStabber = new ModelRenderer(this, 207, 55);
        this.tailStabber.setRotationPoint(0.0F, 0.3F, 10.2F);
        this.tailStabber.addBox(0.0F, -2.0F, -0.4F, 0, 3, 20, 0.0F);
        this.rBLongClaw3 = new ModelRenderer(this, 177, 118);
        this.rBLongClaw3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rBLongClaw3.addBox(0.8F, -2.3F, -7.7F, 0, 3, 4, 0.0F);
        this.rShin1 = new ModelRenderer(this, 79, 33);
        this.rShin1.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.rShin1.addBox(-1.0F, 0.0F, -0.5F, 3, 3, 12, 0.0F);
        this.jaw2 = new ModelRenderer(this, 52, 20);
        this.jaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addBox(-1.5F, 5.0F, -8.4F, 3, 1, 5, 0.0F);
        this.setRotation(jaw2, 0.7740535232594852F, -0.0F, 0.0F);
        this.lFoot = new ModelRenderer(this, 110, 24);
        this.lFoot.setRotationPoint(1.0F, 8.2F, 0.0F);
        this.lFoot.addBox(-1.0F, -1.0F, -4.4F, 2, 2, 5, 0.0F);
        this.setRotation(lFoot, 0.5462880558742251F, 0.0F, 0.136659280431156F);
        this.rThigh = new ModelRenderer(this, 59, 45);
        this.rThigh.setRotationPoint(-4.5F, 3.5F, 16.0F);
        this.rThigh.addBox(-1.5F, -2.0F, -1.0F, 4, 14, 5, 0.0F);
        this.setRotation(rThigh, -0.4923573819876004F, 0.2228785454796759F, 0.43022366061660217F);
        this.tailSpines2 = new ModelRenderer(this, 90, 93);
        this.tailSpines2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines2.addBox(0.0F, -4.5F, 0.2F, 0, 8, 11, 0.0F);
        this.tail5 = new ModelRenderer(this, 178, 66);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addBox(-0.5F, -0.2F, 0.0F, 1, 1, 11, 0.0F);
        this.setRotation(tail5, 0.091106186954104F, -0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 23, 86);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotation(neck, -0.19198621771937624F, -0.0F, 0.0F);
        this.backSpines2 = new ModelRenderer(this, 23, 65);
        this.backSpines2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backSpines2.addBox(0.0F, -5.5F, 8.5F, 0, 6, 12, 0.0F);
        this.tailSpines4 = new ModelRenderer(this, 149, 96);
        this.tailSpines4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines4.addBox(0.0F, -2.1F, 1.1F, 0, 4, 10, 0.0F);
        this.tail2 = new ModelRenderer(this, 85, 66);
        this.tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail2.addBox(-2.0F, -2.5F, -0.1F, 4, 4, 11, 0.0F);
        this.setRotation(tail2, 0.091106186954104F, -0.0F, 0.0F);
        this.tailSpines3 = new ModelRenderer(this, 118, 94);
        this.tailSpines3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines3.addBox(0.0F, -2.9F, 1.3F, 0, 6, 10, 0.0F);
        this.headBase = new ModelRenderer(this, 0, 0);
        this.headBase.setRotationPoint(0.0F, 0.4F, -1.4F);
        this.headBase.addBox(-2.5F, -3.2F, -3.9F, 5, 10, 5, 0.0F);
        this.setRotation(headBase, -0.6017895260876448F, -0.0F, 0.0F);
        this.rFoot = new ModelRenderer(this, 95, 24);
        this.rFoot.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.rFoot.addBox(-1.0F, -1.0F, -4.4F, 2, 2, 5, 0.0F);
        this.setRotation(rFoot, 0.5462880558742251F, 0.0F, -0.136659280431156F);
        this.lLongClaw3 = new ModelRenderer(this, 192, 120);
        this.lLongClaw3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLongClaw3.addBox(-0.4F, -1.0F, -5.1F, 0, 2, 3, 0.0F);
        this.lThigh = new ModelRenderer(this, 40, 45);
        this.lThigh.setRotationPoint(4.5F, 3.5F, 16.0F);
        this.lThigh.addBox(-2.5F, -2.0F, -1.0F, 4, 14, 5, 0.0F);
        this.setRotation(lThigh, -0.4923573819876004F, -0.2228785454796759F, -0.43022366061660217F);
        this.lBLongClaw2 = new ModelRenderer(this, 177, 118);
        this.lBLongClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lBLongClaw2.addBox(-0.2F, -2.3F, -7.7F, 0, 3, 4, 0.0F);
        this.lArm1 = new ModelRenderer(this, 40, 29);
        this.lArm1.setRotationPoint(3.5F, 3.5F, 3.5F);
        this.lArm1.addBox(0.0F, 0.0F, -0.5F, 2, 13, 2, 0.0F);
        this.setRotation(lArm1, 0.12217304763960307F, -0.0F, -0.24434609527920614F);
        this.lLongClaw2 = new ModelRenderer(this, 192, 120);
        this.lLongClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLongClaw2.addBox(0.3F, -1.0F, -5.1F, 0, 2, 3, 0.0F);
        this.tailSpines1 = new ModelRenderer(this, 58, 93);
        this.tailSpines1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailSpines1.addBox(0.0F, -4.7F, 0.0F, 0, 8, 11, 0.0F);
        this.lBLongClaw1 = new ModelRenderer(this, 177, 118);
        this.lBLongClaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lBLongClaw1.addBox(0.5F, -2.3F, -7.7F, 0, 3, 4, 0.0F);
        this.rArm1 = new ModelRenderer(this, 50, 29);
        this.rArm1.setRotationPoint(-3.5F, 3.5F, 3.5F);
        this.rArm1.addBox(-2.0F, 0.0F, -0.5F, 2, 13, 2, 0.0F);
        this.setRotation(rArm1, 0.12217304763960307F, -0.0F, 0.24434609527920614F);
        this.tail3 = new ModelRenderer(this, 118, 66);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.4F);
        this.tail3.addBox(-1.5F, -1.8F, 0.0F, 3, 3, 11, 0.0F);
        this.setRotation(tail3, 0.10175269539126941F, -0.0F, 0.0F);
        this.lShin2 = new ModelRenderer(this, 113, 40);
        this.lShin2.setRotationPoint(-1.3F, 1.5F, 10.4F);
        this.lShin2.addBox(0.0F, -0.2F, -1.1F, 2, 9, 2, 0.0F);
        this.setRotation(lShin2, 0.0F, 0.0F, 0.36425021489121656F);
        this.lBLongClaw3 = new ModelRenderer(this, 177, 118);
        this.lBLongClaw3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lBLongClaw3.addBox(-0.8F, -2.3F, -7.7F, 0, 3, 4, 0.0F);
        this.lHead = new ModelRenderer(this, 53, 0);
        this.lHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHead.addBox(-0.5F, 4.1F, -6.7F, 3, 3, 5, 0.0F);
        this.setRotation(lHead, 0.5009094953223726F, -0.0F, 0.0F);
        this.lClaw1 = new ModelRenderer(this, 83, 24);
        this.lClaw1.setRotationPoint(0.0F, -0.1F, -10.3F);
        this.lClaw1.addBox(-0.9F, 0.0F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotation(lClaw1, -1.0471975511965976F, 0.18203784098300857F, 0.22759093446006054F);
        this.rLongClaw2 = new ModelRenderer(this, 192, 120);
        this.rLongClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLongClaw2.addBox(-0.3F, -1.0F, -5.1F, 0, 2, 3, 0.0F);
        this.rBLongClaw1 = new ModelRenderer(this, 177, 118);
        this.rBLongClaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rBLongClaw1.addBox(-0.5F, -2.3F, -7.7F, 0, 3, 4, 0.0F);
        this.rArm2 = new ModelRenderer(this, 98, 9);
        this.rArm2.setRotationPoint(-0.9F, 12.9F, 0.6F);
        this.rArm2.addBox(-1.2F, -1.1F, -10.6F, 2, 2, 11, 0.0F);
        this.setRotation(rArm2, 0.9560913642424937F, -0.0F, -0.045553093477052F);
        this.rShin2 = new ModelRenderer(this, 113, 53);
        this.rShin2.setRotationPoint(0.3F, 1.5F, 10.4F);
        this.rShin2.addBox(-1.0F, -0.2F, -1.1F, 2, 9, 2, 0.0F);
        this.setRotation(rShin2, 0.0F, 0.0F, -0.36425021489121656F);
        this.jawLower = new ModelRenderer(this, 88, 1);
        this.jawLower.setRotationPoint(0.0F, 6.7F, 2.3F);
        this.jawLower.addBox(-1.5F, -0.5F, -5.2F, 3, 1, 5, 0.0F);
        this.setRotation(jawLower, 0.7740535232594852F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 149, 66);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F);
        this.setRotation(tail4, 0.091106186954104F, -0.0F, 0.0F);
        this.rClaw1 = new ModelRenderer(this, 72, 24);
        this.rClaw1.setRotationPoint(0.0F, -0.1F, -10.3F);
        this.rClaw1.addBox(-1.1F, 0.0F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotation(rClaw1, -1.0471975511965976F, -0.091106186954104F, -0.22759093446006054F);
        this.rLongClaw3 = new ModelRenderer(this, 192, 120);
        this.rLongClaw3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLongClaw3.addBox(0.5F, -1.0F, -5.1F, 0, 2, 3, 0.0F);
        this.lShoulderBlade = new ModelRenderer(this, 146, 34);
        this.lShoulderBlade.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lShoulderBlade.addBox(3.4F, -0.9F, -7.2F, 2, 3, 10, 0.0F);
        this.setRotation(lShoulderBlade, 1.4114477660878142F, -0.18203784098300857F, 0.136659280431156F);
        this.chest.addChild(this.rShoulderBlade);
        this.headBase.addChild(this.innerJaw);
        this.rClaw1.addChild(this.rLongClaw1);
        this.headBase.addChild(this.rHead);
        this.chest.addChild(this.tail1);
        this.headBase.addChild(this.headTop);
        this.lArm1.addChild(this.lArm2);
        this.rClaw1.addChild(this.rClaw2);
        this.chest.addChild(this.abdomen);
        this.chest.addChild(this.backSpines1);
        this.rFoot.addChild(this.rBLongClaw2);
        this.lThigh.addChild(this.lShin1);
        this.tail5.addChild(this.tailSpines5);
        this.lClaw1.addChild(this.lClaw2);
        this.lClaw1.addChild(this.lLongClaw1);
        this.tail5.addChild(this.tailStabber);
        this.rFoot.addChild(this.rBLongClaw3);
        this.rThigh.addChild(this.rShin1);
        this.headBase.addChild(this.jaw2);
        this.lShin2.addChild(this.lFoot);
        this.chest.addChild(this.rThigh);
        this.tail2.addChild(this.tailSpines2);
        this.tail4.addChild(this.tail5);
        this.chest.addChild(this.neck);
        this.chest.addChild(this.backSpines2);
        this.tail4.addChild(this.tailSpines4);
        this.tail1.addChild(this.tail2);
        this.tail3.addChild(this.tailSpines3);
        this.chest.addChild(this.headBase);
        this.rShin2.addChild(this.rFoot);
        this.lClaw1.addChild(this.lLongClaw3);
        this.chest.addChild(this.lThigh);
        this.lFoot.addChild(this.lBLongClaw2);
        this.chest.addChild(this.lArm1);
        this.lClaw1.addChild(this.lLongClaw2);
        this.tail1.addChild(this.tailSpines1);
        this.lFoot.addChild(this.lBLongClaw1);
        this.chest.addChild(this.rArm1);
        this.tail2.addChild(this.tail3);
        this.lShin1.addChild(this.lShin2);
        this.lFoot.addChild(this.lBLongClaw3);
        this.headBase.addChild(this.lHead);
        this.lArm2.addChild(this.lClaw1);
        this.rClaw1.addChild(this.rLongClaw2);
        this.rFoot.addChild(this.rBLongClaw1);
        this.rArm1.addChild(this.rArm2);
        this.rShin1.addChild(this.rShin2);
        this.headBase.addChild(this.jawLower);
        this.tail3.addChild(this.tail4);
        this.rArm2.addChild(this.rClaw1);
        this.rClaw1.addChild(this.rLongClaw3);
        this.chest.addChild(this.lShoulderBlade);
    }
    
    @Override
    public void render(Object obj)
    {
        EntityLivingBase base = (EntityLivingBase) obj;;

        float newangle = MathHelper.cos(idleProgress(obj) * 4.0F * 0.1F) * (float) Math.PI * 0.9F * swingProgressPrev(obj);
        float distMult = 0.05F;

        if (base != null && base.prevPosX == base.posX && base.prevPosY == base.posY && base.prevPosZ == base.posZ)
        {
            newangle = newangle + MathHelper.cos(idleProgress(obj) * 0.15F);
            distMult = 0.05F;
        }

        this.tail1.rotateAngleY = newangle * distMult;
        this.tail2.rotateAngleY = newangle * distMult;
        this.tail3.rotateAngleY = newangle * distMult;
        this.tail4.rotateAngleY = newangle * distMult;
        this.tail5.rotateAngleY = newangle * distMult;

        this.headBase.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
        this.lThigh.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.5F;
        this.rThigh.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.5F;
        this.rArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.lArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        
        draw(chest);
    }
}
