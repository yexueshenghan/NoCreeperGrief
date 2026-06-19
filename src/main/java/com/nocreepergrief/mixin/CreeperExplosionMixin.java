package com.nocreepergrief.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.world.explosion.ExplosionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ExplosionImpl.class)
public class CreeperExplosionMixin {

    @Inject(method = "shouldDestroyBlocks", at = @At("HEAD"), cancellable = true)
    private void onShouldDestroyBlocks(CallbackInfoReturnable<Boolean> cir) {
        ExplosionImpl explosion = (ExplosionImpl) (Object) this;
        Entity source = explosion.getEntity();

        if (source instanceof CreeperEntity) {
            cir.setReturnValue(false);
        }
    }
}
