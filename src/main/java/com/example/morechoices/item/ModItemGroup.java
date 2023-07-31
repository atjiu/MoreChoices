package com.example.morechoices.item;

import com.example.morechoices.MoreChoicesMod;
import com.example.morechoices.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MORE_CHOICES = FabricItemGroup.builder(new Identifier(MoreChoicesMod.MOD_ID, "more_choices"))
            .displayName(Text.translatable("itemgroup.more_choices"))
            .icon(() -> new ItemStack(Items.COPPER_INGOT))
            .build();

    public static void add(Item item) {
        ItemGroupEvents.modifyEntriesEvent(MORE_CHOICES).register(entries -> entries.add(item));
    }

    public static void init() {
        add(ModItems.AMETHYST_SWORD);
        add(ModItems.COPPER_SWORD);
        add(ModItems.COPPER_SHOVEL);
        add(ModItems.COPPER_PICKAXE);
        add(ModItems.COPPER_AXE);
        add(ModItems.COPPER_HOE);

        add(ModItems.HELLSTONE_SWORD);
        add(ModItems.HELLSTONE_SHOVEL);
        add(ModItems.HELLSTONE_PICKAXE);
        add(ModItems.HELLSTONE_AXE);
        add(ModItems.HELLSTONE_HOE);

        add(ModItems.COPPER_HELMET);
        add(ModItems.COPPER_CHESTPLATE);
        add(ModItems.COPPER_LEGGINGS);
        add(ModItems.COPPER_BOOTS);

        add(ModItems.HELLSTONE_HELMET);
        add(ModItems.HELLSTONE_CHESTPLATE);
        add(ModItems.HELLSTONE_LEGGINGS);
        add(ModItems.HELLSTONE_BOOTS);

        add(ModItems.SWEET_POTATO);
        add(ModItems.BAKED_SWEET_POTATO);
        add(ModItems.PEPPER);

        add(ModItems.HELLSTONE_INGOT);
        add(ModItems.RAW_HELLSTONE);
        add(ModItems.HELLSTONE_NUGGET);
        add(ModItems.COPPER_NUGGET);

        // FOOD
        add(ModItems.CATPAW_COOKIE);
        add(ModItems.FRIED_DUMPLING);
        add(ModItems.WHEAT_FLOUR);
        add(ModItems.PAPRIKA);
        add(ModItems.SPICY_FRIED_DUMPLING);
        add(ModItems.SPICY_COOKED_BEEF);
        add(ModItems.SPICY_COOKED_CHICKEN);
        add(ModItems.SPICY_COOKED_COD);
        add(ModItems.SPICY_COOKED_MUTTON);
        add(ModItems.SPICY_COOKED_PORKCHOP);
        add(ModItems.SPICY_COOKED_RABBIT);
        add(ModItems.SPICY_COOKED_SALMON);

        add(new BlockItem(ModBlocks.HELLSTONE_ORE, new FabricItemSettings()));
        add(new BlockItem(ModBlocks.HELLSTONE_BLOCK, new FabricItemSettings()));
    }
}