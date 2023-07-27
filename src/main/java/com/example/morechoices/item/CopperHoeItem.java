package com.example.morechoices.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class CopperHoeItem extends HoeItem {
    protected CopperHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public CopperHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, Object... args) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
