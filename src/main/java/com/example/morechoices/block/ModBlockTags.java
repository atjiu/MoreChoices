package com.example.morechoices.block;

import com.example.morechoices.MoreChoicesMod;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockTags {

    public static final TagKey<Item> RAW_MEAT = TagKey.of(Registry.ITEM_KEY, new Identifier(MoreChoicesMod.MOD_ID, "raw_meat"));

    public static void init() {
    }
}
