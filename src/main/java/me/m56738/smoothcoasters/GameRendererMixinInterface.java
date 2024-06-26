package me.m56738.smoothcoasters;

import net.minecraft.entity.Entity;

public interface GameRendererMixinInterface extends Rotatable {
    /**
     * Updates the local rotation.
     * Called when the global rotation is modified by other sources (e.g. teleport).
     */
    void smoothcoasters$updateRotation(Entity entity);

    /**
     * Set the entity to its local yaw/pitch.
     * Called before processing mouse movement.
     */
    void smoothcoasters$loadLocalRotation(Entity entity);

    /**
     * Apply the entity's current yaw/pitch as the local yaw/pitch.
     * Set the entity back to the global yaw/pitch.
     * Called after processing mouse movement.
     */
    void smoothcoasters$applyLocalRotation(Entity entity);

    void smoothcoasters$setRotationLimit(float minYaw, float maxYaw, float minPitch, float maxPitch);

    boolean smoothcoasters$getRotationToggle();

    void smoothcoasters$setRotationToggle(boolean enabled);
}
