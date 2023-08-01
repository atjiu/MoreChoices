package com.example.morechoices.block;

import com.example.morechoices.MoreChoicesMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final Tag.Identified<Item> RAW_MEAT = createTag("raw_meat");

    private static Tag.Identified<Item> createTag(String name) {
        return TagFactory.ITEM.create(new Identifier(MoreChoicesMod.MOD_ID, name));
    }

    public static void init() {
    }

}
