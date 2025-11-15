package com.gtnewhorizon.randomboubles.handler;

import net.minecraft.item.ItemStack;

import com.gtnewhorizon.randomboubles.items.IPrimordialGemCrafting;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import thaumcraft.common.entities.EntitySpecialItem;
import thaumcraft.common.tiles.TileInfusionMatrix;

public class EventHandler {

    @SubscribeEvent
    public void onCrafted(ItemCraftedEvent event) {
        ItemStack output = event.crafting;
        if (output.getItem() instanceof IPrimordialGemCrafting && !event.player.worldObj.isRemote) {
            ItemStack returnedItem = ((IPrimordialGemCrafting) output.getItem()).getReturnItem(output);
            if (returnedItem != null) {
                double iX = event.player.posX;
                double iY = event.player.posY + 1;
                double iZ = event.player.posZ;
                for (int yy = -16; yy <= 16; yy++) for (int zz = -16; zz <= 16; zz++)
                    for (int xx = -16; xx <= 16; xx++) if (event.player.worldObj.getTileEntity(
                        (int) event.player.posX + xx,
                        (int) event.player.posY + yy,
                        (int) event.player.posZ + zz) instanceof TileInfusionMatrix) {
                            iX = event.player.posX + xx;
                            iY = event.player.posY + yy - .5;
                            iZ = event.player.posZ + zz;
                        }
                EntitySpecialItem entityitem = new EntitySpecialItem(event.player.worldObj, iX, iY, iZ, returnedItem);
                entityitem.motionX = entityitem.motionY = entityitem.motionZ = 0;
                event.player.worldObj.spawnEntityInWorld(entityitem);
            }
        }
    }
}
