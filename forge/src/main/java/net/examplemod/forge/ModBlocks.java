package com.example.flywheeladdon;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FlywheelAddon.MODID);

    public static final RegistryObject<Block> FLYWHEEL =
            BLOCKS.register("flywheel",
                    () -> new FlywheelBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.METAL)
                            .strength(4f)
                    ));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}