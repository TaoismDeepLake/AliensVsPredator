package org.avp.block;

import org.avp.item.ItemMaintenanceJack;
import org.avp.tile.TileEntityBlastdoor;

import com.arisux.mdx.MDX;
import com.arisux.mdx.lib.client.Notification;
import com.arisux.mdx.lib.client.Notification.DynamicNotification;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.property.IUnlistedProperty;

public class BlockBlastdoor extends Block
{
    private DynamicNotification notification = new DynamicNotification();

    public BlockBlastdoor(Material material)
    {
        super(material);
        setTickRandomly(true);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        TileEntity tile = world.getTileEntity(pos);

        if (tile != null && tile instanceof TileEntityBlastdoor)
        {
            TileEntityBlastdoor blastdoor = (TileEntityBlastdoor) tile;

            if (blastdoor.isChild() && blastdoor.getParent() != null && canOpen(blastdoor.getParent(), player))
            {
                this.onOpen(blastdoor.getParent(), world, player);
            }
            else if (blastdoor.isParent() && canOpen(blastdoor, player))
            {
                this.onOpen(blastdoor, world, player);
            }
        }

        return true;
    }

    private void onOpen(TileEntityBlastdoor blastdoor, World world, EntityPlayer player)
    {
        if (isOpenedByJack(blastdoor, player))
        {
            blastdoor.setBeingPryedOpen(true);
            blastdoor.setDoorProgress(blastdoor.getDoorProgress() + 0.05F);
            int percentOpen = (int) (((blastdoor.getDoorProgress() >= blastdoor.getMaxDoorPryProgress() ? blastdoor.getMaxDoorPryProgress() : blastdoor.getDoorProgress()) * 100) / blastdoor.getMaxDoorPryProgress());

            ItemMaintenanceJack jack = (ItemMaintenanceJack) player.getHeldItemMainhand().getItem();
            jack.onPryBlastDoor(player, player.getHeldItemMainhand());

            if (percentOpen >= 100)
            {
                jack.onOpenBlastDoor(player, player.getHeldItemMainhand());
            }

            if (world.isRemote)
            {
                this.notification.setDisplayTimeout(3);
                this.notification.setMessage("\u00A77 The blast door is \u00A7a" + percentOpen + "% open.");
                MDX.sendNotification(this.notification);
            }
        }
        else
        {
            blastdoor.setOpen(!blastdoor.isOpen());

            if (world.isRemote)
            {
                final String value = (blastdoor.isOpen() ? "opened" : "closed");
                MDX.sendNotification(new Notification()
                {
                    @Override
                    public String getMessage()
                    {
                        return "\u00A77 Blast door \u00A7a" + value + ".";
                    }

                    @Override
                    public int displayTimeout()
                    {
                        return 20;
                    }
                });
            }
        }
    }

    private boolean isOpenedByJack(TileEntityBlastdoor blastdoor, EntityPlayer player)
    {
        return player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemMaintenanceJack && !blastdoor.isOperational() && !blastdoor.isOpen();
    }

    private boolean canOpen(TileEntityBlastdoor blastdoor, EntityPlayer player)
    {
        return blastdoor.isOperational() || isOpenedByJack(blastdoor, player);
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        TileEntity tile = world.getTileEntity(pos);

        if (tile != null && tile instanceof TileEntityBlastdoor && placer != null)
        {
            TileEntityBlastdoor blastdoor = (TileEntityBlastdoor) tile;

            blastdoor.setDirection(getFacing(placer));

            if (!blastdoor.setup(true))
            {
                world.setBlockToAir(pos);
            }
        }
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state)
    {
        TileEntity tile = world.getTileEntity(pos);

        if (tile != null && tile instanceof TileEntityBlastdoor)
        {
            TileEntityBlastdoor blastdoor = (TileEntityBlastdoor) tile;

            if (blastdoor.isChild())
            {
                if (blastdoor.getParent() != null)
                {
                    world.setBlockToAir(blastdoor.getParent().getPos());
                    blastdoor.getParent().breakChildren();
                }
            }
            else
            {
                blastdoor.breakChildren();
            }
        }

        world.removeTileEntity(pos);

        super.breakBlock(world, pos, state);
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[0])
        {
            @Override
            protected StateImplementation createState(Block block, ImmutableMap<IProperty<?>, Comparable<?>> properties, ImmutableMap<IUnlistedProperty<?>, Optional<?>> unlistedProperties)
            {
                return new StateImplementation(block, properties)
                {
                    @Override
                    public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos)
                    {
                        TileEntity tileEntity = world.getTileEntity(pos);

                        if (tileEntity != null && tileEntity instanceof TileEntityBlastdoor)
                        {
                            TileEntityBlastdoor tile = (TileEntityBlastdoor) tileEntity;

                            if (tile.isOpen())
                            {
                                return null;
                            }
                            else
                            {
                                return super.getCollisionBoundingBox(world, pos);
                            }
                        }
                        return super.getCollisionBoundingBox(world, pos);
                    }
                    
                    @Override
                    public EnumBlockRenderType getRenderType()
                    {
                        return EnumBlockRenderType.INVISIBLE;
                    }
                };
            }
        };
    }
    
    @Override
    public TileEntity createTileEntity(World world, IBlockState state)
    {
        return new TileEntityBlastdoor();
    }
    
    @Override
    public boolean hasTileEntity(IBlockState state)
    {
        return true;
    }

    public static EnumFacing getFacing(Entity entity)
    {
        int dir = MathHelper.floor((entity.rotationYaw / 90) + 0.5) & 3;
        return EnumFacing.getFront(dir);
    }
}
