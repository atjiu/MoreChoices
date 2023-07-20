package com.tomoya42.morechoices.util;

import com.tomoya42.morechoices.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerCustomTraders() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.SWEET_POTATO, 24),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
        });
    }
}
