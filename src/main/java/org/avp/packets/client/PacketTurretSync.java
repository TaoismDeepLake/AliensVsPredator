package org.avp.packets.client;

import org.avp.tile.TileEntityTurret;

import com.arisux.mdx.lib.client.render.Rotation;
import com.arisux.mdx.lib.game.Game;
import com.arisux.mdx.lib.world.storage.NBTStorage;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketTurretSync implements IMessage, IMessageHandler<PacketTurretSync, PacketTurretSync>
{
    public int        x, y, z;
    public NBTTagList targets;
    public Rotation   rotation;

    public PacketTurretSync()
    {
        ;
    }

    public PacketTurretSync(TileEntityTurret turret)
    {
        this.x = turret.getPos().getX();
        this.y = turret.getPos().getY();
        this.z = turret.getPos().getZ();
        this.targets = turret.getTargetListTag();
        this.rotation = turret.getRotation();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.rotation = new Rotation(0F, 0F).readFromBuffer(buf);
        this.targets = (NBTTagList) NBTStorage.readFromBuffer(buf);
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        rotation.writeToBuffer(buf);
        NBTStorage.writeToBuffer(this.targets, buf);
    }

    @Override
    public PacketTurretSync onMessage(PacketTurretSync packet, MessageContext ctx)
    {
        System.out.println("Sent packet " + this.getClass().getName());
        Game.minecraft().addScheduledTask(new Runnable()
        {
            @Override
            public void run()
            {
                TileEntityTurret tile = (TileEntityTurret) Game.minecraft().world.getTileEntity(new BlockPos(packet.x, packet.y, packet.z));

                if (tile != null)
                {
                    tile.onReceiveInitPacket(packet, ctx);
                }
            }
        });
        return null;
    }
}
