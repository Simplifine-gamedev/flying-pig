package com.orca.flyingpig.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class PigEntityMixin {

    @Inject(method = "tickMovement", at = @At("TAIL"))
    private void flyingPig_onTickMovement(CallbackInfo ci) {
        LivingEntity self = (LivingEntity)(Object)this;

        if (!(self instanceof PigEntity)) {
            return;
        }

        PigEntity pig = (PigEntity) self;

        // Make the pig float/fly - slow down falling
        if (!pig.isOnGround() && pig.getVelocity().y < 0) {
            pig.setVelocity(pig.getVelocity().x, pig.getVelocity().y * 0.6 + 0.08, pig.getVelocity().z);
        }

        // Randomly make pigs jump/fly upward
        if (pig.isOnGround() && pig.getRandom().nextFloat() < 0.03) {
            pig.setVelocity(pig.getVelocity().x, 0.5 + pig.getRandom().nextFloat() * 0.5, pig.getVelocity().z);
        }

        // No fall damage for flying pigs
        pig.fallDistance = 0;
    }
}
