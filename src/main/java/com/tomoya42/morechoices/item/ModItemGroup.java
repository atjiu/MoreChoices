package com.tomoya42.morechoices.item;

import com.tomoya42.morechoices.MoreChoicesMod;
import com.tomoya42.morechoices.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MORE_CHOICES = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreChoicesMod.MOD_ID, "more_choices"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_choices"))
                    .icon(() -> new ItemStack(Items.COPPER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_HOE);

                        entries.add(ModItems.HELLSTONE_SWORD);
                        entries.add(ModItems.HELLSTONE_SHOVEL);
                        entries.add(ModItems.HELLSTONE_PICKAXE);
                        entries.add(ModItems.HELLSTONE_AXE);
                        entries.add(ModItems.HELLSTONE_HOE);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);

                        entries.add(ModItems.HELLSTONE_HELMET);
                        entries.add(ModItems.HELLSTONE_CHESTPLATE);
                        entries.add(ModItems.HELLSTONE_LEGGINGS);
                        entries.add(ModItems.HELLSTONE_BOOTS);

                        entries.add(ModItems.SWEET_POTATO);
                        entries.add(ModItems.BAKED_SWEET_POTATO);

                        entries.add(ModItems.HELLSTONE_INGOT);
                        entries.add(ModItems.RAW_HELLSTONE);
                        entries.add(ModItems.HELLSTONE_NUGGET);
                        entries.add(ModItems.COPPER_NUGGET);

                        entries.add(ModBlocks.HELLSTONE_ORE);
                        entries.add(ModBlocks.HELLSTONE_BLOCK);

                    }).build());

//    public static void registerItemGroups() {
//        // Example of adding to existing Item Group
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//            entries.add(ModItems.CITRINE);
//            entries.add(ModItems.RAW_CITRINE);
//        });
//    }

    public static void init() {
    }
}