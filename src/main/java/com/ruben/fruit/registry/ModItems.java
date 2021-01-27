package com.ruben.fruit.registry;

import com.ruben.fruit.Banana;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    public static final Item ORANGE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f).alwaysEdible().build()));
    public static final Item ORANGE_SMOOTHIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(12f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,20*5),.5f).build()));
    public static final Item STRAWBERRY = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f).alwaysEdible().build()));
    public static final Item STRAWBERRY_SMOOTHIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(12f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,20*5),.5f).build()));
    public static final Item BANANA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f).alwaysEdible().build()));
    public static final Item BANANA_SMOOTHIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(12f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,20*5),.5f).build()));
    public static final Item MANGO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f).alwaysEdible().build()));
    public static final Item MANGO_SMOOTHIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(12f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,20*5),.5f).build()));
    public static final Item CACTUS_POWDER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(0f).alwaysEdible().build()));
    public static final Item CACTUS_SMOOTHIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(12f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON,20*5),.5f).build()));

    public static void registerItems()
    {

        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "orange"), ORANGE);
        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "orange_smoothie"), ORANGE_SMOOTHIE);

        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "strawberry"), STRAWBERRY);
        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "strawberry_smoothie"), STRAWBERRY_SMOOTHIE);

        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "banana_smoothie"), BANANA_SMOOTHIE);

        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "mango"), MANGO);
        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "mango_smoothie"), MANGO_SMOOTHIE);

        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "cactus_powder"), CACTUS_POWDER);
        Registry.register(Registry.ITEM, new Identifier(Banana.MOD_ID, "cactus_smoothie"), CACTUS_SMOOTHIE);



    }



}
