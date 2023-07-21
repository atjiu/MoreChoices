package com.tomoya42.morechoices.item;

import com.tomoya42.morechoices.MoreChoicesMod;
import com.tomoya42.morechoices.block.ModBlocks;
import com.tomoya42.morechoices.material.ModArmorMaterial;
import com.tomoya42.morechoices.material.ModToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // WEAPON & TOOL
    public final static Item AMETHYST_SWORD = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "amethyst_sword"),
            new SwordItem(ModToolMaterial.AMETHYST, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item COPPER_SWORD = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_sword"),
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item COPPER_SHOVEL = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_shovel"),
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS)));
    public final static Item COPPER_PICKAXE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_pickaxe"),
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)));
    public final static Item COPPER_AXE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_axe"),
            new AxeItem(ModToolMaterial.COPPER, 6.0f, -3.1f, new Item.Settings().group(ItemGroup.TOOLS)));
    public final static Item COPPER_HOE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_hoe"),
            new CopperHoeItem(ModToolMaterial.COPPER, -2, -1.0f, new Item.Settings().group(ItemGroup.TOOLS)));

    public final static Item HELLSTONE_SWORD = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_sword"),
            new SwordItem(ModToolMaterial.HELLSTONE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item HELLSTONE_SHOVEL = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_shovel"),
            new ShovelItem(ModToolMaterial.HELLSTONE, 1.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS)));
    public final static Item HELLSTONE_PICKAXE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_pickaxe"),
            new PickaxeItem(ModToolMaterial.HELLSTONE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)));
    public final static Item HELLSTONE_AXE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_axe"),
            new AxeItem(ModToolMaterial.HELLSTONE, 6.0f, -3.1f, new Item.Settings().group(ItemGroup.TOOLS)));
    public final static Item HELLSTONE_HOE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_hoe"),
            new CopperHoeItem(ModToolMaterial.HELLSTONE, -2, -1.0f, new Item.Settings().group(ItemGroup.TOOLS)));

    // ARMOR
    public final static Item COPPER_HELMET = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_helmet"),
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item COPPER_CHESTPLATE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_chestplate"),
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item COPPER_LEGGINGS = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_leggings"),
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item COPPER_BOOTS = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_boots"),
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

    public final static Item HELLSTONE_HELMET = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_helmet"),
            new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item HELLSTONE_CHESTPLATE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_chestplate"),
            new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item HELLSTONE_LEGGINGS = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_leggings"),
            new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
    public final static Item HELLSTONE_BOOTS = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_boots"),
            new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

    // CROP
    public final static Item SWEET_POTATO = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "sweet_potato"),
            new AliasedBlockItem(ModBlocks.SWEET_POTATOES, new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build())));
    public final static Item BAKED_SWEET_POTATO = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "baked_sweet_potato"),
            new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));

    // ORE
    public final static Item HELLSTONE_INGOT = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_ingot"),
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public final static Item RAW_HELLSTONE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "raw_hellstone"),
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public final static Item HELLSTONE_ORE = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_ore"),
            new BlockItem(ModBlocks.HELLSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public final static Item HELLSTONE_NUGGET = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_nugget"),
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public final static Item COPPER_NUGGET = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "copper_nugget"),
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public final static Item HELLSTONE_BLOCK = Registry.register(Registry.ITEM, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_block"),
            new BlockItem(ModBlocks.HELLSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    public static void init() {

    }
}
