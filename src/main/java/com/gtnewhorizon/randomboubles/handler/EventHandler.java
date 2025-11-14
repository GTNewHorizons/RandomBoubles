package com.gtnewhorizon.randomboubles.handler;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import com.gtnewhorizon.randomboubles.items.IPrimordialGemCrafting;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.entities.EntitySpecialItem;
import thaumcraft.common.tiles.TileInfusionMatrix;

public class EventHandler {

    @SubscribeEvent
    public void onCrafted(ItemCraftedEvent event) {
        ItemStack output = event.crafting;
        IInventory craftMatrix = event.craftMatrix;
        if (output.getItem() instanceof IPrimordialGemCrafting && !event.player.worldObj.isRemote) {
            if (((IPrimordialGemCrafting) output.getItem()).getReturnedPearls(output) > 0) {
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
                EntitySpecialItem entityitem = new EntitySpecialItem(
                    event.player.worldObj,
                    iX,
                    iY,
                    iZ,
                    new ItemStack(
                        ConfigItems.itemEldritchObject,
                        ((IPrimordialGemCrafting) output.getItem()).getReturnedPearls(output),
                        3));
                entityitem.motionX = entityitem.motionY = entityitem.motionZ = 0;
            }
        }
    }
}
