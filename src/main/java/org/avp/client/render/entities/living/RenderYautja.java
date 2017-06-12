package org.avp.client.render.entities.living;

import org.avp.entities.living.EntitySpeciesYautja;

import com.arisux.mdx.lib.client.Model;
import com.arisux.mdx.lib.client.RenderLivingWrapper;
import com.arisux.mdx.lib.client.TexturedModel;
import com.arisux.mdx.lib.client.render.OpenGL;

import net.minecraft.client.renderer.entity.RenderManager;

public class RenderYautja<T extends EntitySpeciesYautja, MODEL extends Model> extends RenderLivingWrapper<T, MODEL>
{
    public RenderYautja(RenderManager m, TexturedModel<MODEL> texturedModel)
    {
        super(m, texturedModel);
    }

    @Override
    protected void preRenderCallback(EntitySpeciesYautja yautja, float renderPartialTicks)
    {
        OpenGL.scale(0.85F, 0.85F, 0.85F);
    }
}
