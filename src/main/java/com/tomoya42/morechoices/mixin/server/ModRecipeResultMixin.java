package com.tomoya42.morechoices.mixin.server;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.StringNbtReader;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.JsonHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ShapedRecipe.class)
public class ModRecipeResultMixin {

    private final static Gson GSON = new Gson().newBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    @Inject(method = "outputFromJson", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;<init>(Lnet/minecraft/item/ItemConvertible;I)V"), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private static void outputFromJson(JsonObject json, CallbackInfoReturnable<ItemStack> cir, Item item, int count) throws CommandSyntaxException {
        if (json.has("nbt")) {
            JsonElement nbtElement = json.get("nbt");
            NbtCompound nbt = nbtElement.isJsonObject() ? StringNbtReader.parse(GSON.toJson(nbtElement)) : StringNbtReader.parse(JsonHelper.asString(nbtElement, "nbt"));
            NbtCompound itemNbt = new NbtCompound();
            itemNbt.put("tag", nbt);
            itemNbt.putString("id", JsonHelper.getString(json, "item"));
            itemNbt.putInt("Count", count);
            cir.setReturnValue(ItemStack.fromNbt(itemNbt));
        }
    }

}
