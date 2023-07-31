package com.example.morechoices.block;

import com.example.morechoices.MoreChoicesMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final TagKey<Item> RAW_MEAT = TagKey.of(RegistryKeys.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "raw_meat"));

    public static void init() {
    }
}
