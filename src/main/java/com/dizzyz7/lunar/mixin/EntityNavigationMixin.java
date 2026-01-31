package com.dizzyz7.lunar.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class EntityNavigationMixin {

    @Inject(method = "travel", at = @At("HEAD"))
    private void applyLunarGravity(Vec3d movementInput, CallbackInfo ci) {
        LivingEntity entity = (LivingEntity) (Object) this;

        // Проверяем, надеты ли золотые ботинки
        if (entity.getEquippedStack(EquipmentSlot.FEET).isOf(Items.GOLDEN_BOOTS)) {
            Vec3d velocity = entity.getVelocity();
            
            // Если сущность падает (velocity.y < 0), замедляем падение на 50%
            if (velocity.y < 0) {
                entity.setVelocity(velocity.multiply(1.0, 0.5, 1.0));
            }
        }
    }
}
