package com.example.flywheeladdon;

import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class FlywheelBlockEntity extends KineticBlockEntity {

    private float storedMomentum = 0;

    public FlywheelBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public void tick() {

        super.tick();

        float speed = getSpeed();

        if (speed != 0) {
            storedMomentum += speed * 0.05f;
        }

        else if (storedMomentum > 0) {

            storedMomentum *= 0.98f;

            setSpeed(storedMomentum);

        }

    }

}