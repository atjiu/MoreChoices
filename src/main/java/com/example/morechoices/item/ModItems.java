package com.example.morechoices.item;

import com.example.morechoices.MoreChoicesMod;
import com.example.morechoices.block.ModBlocks;
import com.example.morechoices.material.ModArmorMaterial;
import com.example.morechoices.material.ModToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // WEAPON & TOOL
    public final static Item AMETHYST_SWORD = register("amethyst_sword", new SwordItem(ModToolMaterial.AMETHYST, 3, -2.4f, new Item.Settings()));
    public final static Item COPPER_SWORD = register("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new Item.Settings()));
    public final static Item COPPER_SHOVEL = register("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3.0f, new Item.Settings()));
    public final static Item COPPER_PICKAXE = register("copper_pickaxe", new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new Item.Settings()));
    public final static Item COPPER_AXE = register("copper_axe", new AxeItem(ModToolMaterial.COPPER, 6.0f, -3.1f, new Item.Settings()));
    public final static Item COPPER_HOE = register("copper_hoe", new HoeItem(ModToolMaterial.COPPER, -2, -1.0f, new Item.Settings()));

    public final static Item HELLSTONE_SWORD = register("hellstone_sword", new SwordItem(ModToolMaterial.HELLSTONE, 3, -2.4f, new Item.Settings()));
    public final static Item HELLSTONE_SHOVEL = register("hellstone_shovel", new ShovelItem(ModToolMaterial.HELLSTONE, 1.5f, -3.0f, new Item.Settings()));
    public final static Item HELLSTONE_PICKAXE = register("hellstone_pickaxe", new PickaxeItem(ModToolMaterial.HELLSTONE, 1, -2.8f, new Item.Settings()));
    public final static Item HELLSTONE_AXE = register("hellstone_axe", new AxeItem(ModToolMaterial.HELLSTONE, 6.0f, -3.1f, new Item.Settings()));
    public final static Item HELLSTONE_HOE = register("hellstone_hoe", new HoeItem(ModToolMaterial.HELLSTONE, -2, -1.0f, new Item.Settings()));

    // ARMOR
    public final static Item COPPER_HELMET = register("copper_helmet", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.HELMET, new Item.Settings()));
    public final static Item COPPER_CHESTPLATE = register("copper_chestplate", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public final static Item COPPER_LEGGINGS = register("copper_leggings", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public final static Item COPPER_BOOTS = register("copper_boots", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()));

    public final static Item HELLSTONE_HELMET = register("hellstone_helmet", new ArmorItem(ModArmorMaterial.HELLSTONE, ArmorItem.Type.HELMET, new Item.Settings()));
    public final static Item HELLSTONE_CHESTPLATE = register("hellstone_chestplate", new ArmorItem(ModArmorMaterial.HELLSTONE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public final static Item HELLSTONE_LEGGINGS = register("hellstone_leggings", new ArmorItem(ModArmorMaterial.HELLSTONE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public final static Item HELLSTONE_BOOTS = register("hellstone_boots", new ArmorItem(ModArmorMaterial.HELLSTONE, ArmorItem.Type.BOOTS, new Item.Settings()));

    // CROP
    public final static Item SWEET_POTATO = register("sweet_potato", new AliasedBlockItem(ModBlocks.SWEET_POTATOES, (new Item.Settings()).food(ModFoodComponents.SWEET_POTATO)));
    public final static Item BAKED_SWEET_POTATO = register("baked_sweet_potato", new AliasedBlockItem(ModBlocks.SWEET_POTATOES, (new Item.Settings()).food(ModFoodComponents.BAKED_SWEET_POTATO)));

    // ORE
    public final static Item HELLSTONE_INGOT = register("hellstone_ingot", new Item(new Item.Settings()));
    public final static Item RAW_HELLSTONE = register("raw_hellstone", new Item(new Item.Settings()));
    public final static Item HELLSTONE_ORE = register("hellstone_ore", new BlockItem(ModBlocks.HELLSTONE_ORE, new Item.Settings()));
    public final static Item HELLSTONE_NUGGET = register("hellstone_nugget", new Item(new Item.Settings()));
    public final static Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Settings()));
    public final static Item HELLSTONE_BLOCK = register("hellstone_block", new BlockItem(ModBlocks.HELLSTONE_BLOCK, new Item.Settings()));

    // FOOD
    public final static Item CATPAW_COOKIE = register("catpaw_cookie", new Item(new Item.Settings().food(ModFoodComponents.CATPAW_COOKIE)));
    public final static Item FRIED_DUMPLING = register("fried_dumpling", new Item(new Item.Settings().food(ModFoodComponents.FRIED_DUMPLING)));
    public final static Item WHEAT_FLOUR = register("wheat_flour", new Item(new Item.Settings()));

    private static Item register(String name, Item item) {
        return register(new Identifier(MoreChoicesMod.MOD_ID, name), item);
    }

    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void init() {

    }

}
