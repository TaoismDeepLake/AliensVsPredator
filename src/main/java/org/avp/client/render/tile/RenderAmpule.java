package org.avp.client.render.tile;

import org.avp.AliensVsPredator;
import org.avp.tile.TileEntityAmpule;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.arisux.mdx.lib.client.render.OpenGL;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderAmpule extends TileEntitySpecialRenderer<TileEntityAmpule>
{
    @Override
    public void renderTileEntityAt(TileEntityAmpule tile, double x, double y, double z, float partialTicks, int destroyStage)
    {
        OpenGL.pushMatrix();
        {
            float scale = 0.64F;
            OpenGL.disable(GL11.GL_CULL_FACE);
            OpenGL.translate(x + 0.5F, y + 0.955F, z + 0.5F);
            OpenGL.enable(GL12.GL_RESCALE_NORMAL);
            OpenGL.scale(scale, -scale, scale);
            OpenGL.enable(GL11.GL_ALPHA_TEST);
            OpenGL.disableCullFace();
            OpenGL.rotate(tile);
            AliensVsPredator.resources().models().AMPULE.draw(tile);
            OpenGL.enableCullFace();
        }
        OpenGL.popMatrix();
    }
}
