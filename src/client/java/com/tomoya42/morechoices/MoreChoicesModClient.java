package com.tomoya42.morechoices;

import com.tomoya42.morechoices.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MoreChoicesModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEET_POTATOES, RenderLayer.getCutout());
        
    }
}