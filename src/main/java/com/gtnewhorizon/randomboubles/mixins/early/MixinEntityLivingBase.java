package com.gtnewhorizon.randomboubles.mixins.early;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.gtnewhorizon.randomboubles.BaubleItems;

import baubles.api.BaublesApi;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {

    @Inject(method = "addPotionEffect", at = @At("HEAD"), cancellable = true)
    private void randomboubles$preventRingDebuffs(PotionEffect effect, CallbackInfo ci) {
        int id = effect.getPotionID();
        if (id != Potion.poison.id && id != Potion.wither.id) {
            return;
        }
        if (!((Object) this instanceof EntityPlayer player)) {
            return;
        }
        IInventory baubles = BaublesApi.getBaubles(player);
        for (int i = 0; i < baubles.getSizeInventory(); i++) {
            ItemStack stack = baubles.getStackInSlot(i);
            if (stack != null && stack.getItem() == BaubleItems.combinationRing
                && stack.getItemDamage() >= 6
                && stack.getItemDamage() <= 8) {
                ci.cancel();
                return;
            }
        }
    }
}
