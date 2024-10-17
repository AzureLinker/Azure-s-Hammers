package ru.azureplay.azurehammers.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.azureplay.azurehammers.AzureHammers;
import ru.azureplay.azurehammers.item.custom.HammerItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AzureHammers.MODID);

    public static final DeferredItem<HammerItem> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 1f, -3.5f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()){
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip_shift"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip"));
                    }

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
    });
    public static final DeferredItem<HammerItem> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new HammerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 1f, -3.0f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()){
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip_shift"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip"));
                    }

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
    });
    public static final DeferredItem<HammerItem> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1f, -3.0f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()){
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip_shift"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip"));
                    }

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
    });
    public static final DeferredItem<HammerItem> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1f, -3.0f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()){
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip_shift"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.azurehammers.hammer_items.tooltip"));
                    }

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
    });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
