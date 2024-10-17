package ru.azureplay.azurehammers.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.azureplay.azurehammers.AzureHammers;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AzureHammers.MODID);

    public static final Supplier<CreativeModeTab> AZURE_HAMMERS_TAB = CREATIVE_MODE_TAB.register("azure_hammers_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.IRON_HAMMER.get()))
            .title(Component.translatable("creativetab.azurehammers.azure_hammers"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.IRON_HAMMER);
                output.accept(ModItems.GOLD_HAMMER);
                output.accept(ModItems.DIAMOND_HAMMER);
                output.accept(ModItems.NETHERITE_HAMMER);
            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
