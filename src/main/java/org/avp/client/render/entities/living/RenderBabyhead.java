package org.avp.client.render.entities.living;

import org.avp.AliensVsPredator;
import org.avp.client.model.entities.living.ModelBabyhead;
import org.avp.entities.living.EntityBabyhead;

import com.arisux.mdx.lib.client.RenderLivingWrapper;
import com.arisux.mdx.lib.client.TexturedModel;
import com.arisux.mdx.lib.client.render.OpenGL;

public class RenderBabyhead extends RenderLivingWrapper<EntityBabyhead, ModelBabyhead>
{
    public RenderBabyhead()
    {
        super(AliensVsPredator.resources().models().BABYHEAD);
    }
    
    public RenderBabyhead(TexturedModel<ModelBabyhead> model)
    {
        super(model);
    }

    public void doRender(EntityBabyhead entity, double posX, double posY, double posZ, float yaw, float renderPartialTicks)
    {
        super.doRender(entity, posX, posY, posZ, yaw, renderPartialTicks);
    }

    @Override
    protected void preRenderCallback(EntityBabyhead entityliving, float renderPartialTicks)
    {
        float scale = 1.25F;
        OpenGL.scale(scale, scale, scale);
        super.preRenderCallback(entityliving, renderPartialTicks);
    }
}
