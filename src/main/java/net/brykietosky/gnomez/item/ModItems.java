package net.brykietosky.gnomez.item;

import net.brykietosky.gnomez.GnomeZ;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GnomeZ.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
    public static final RegistryObject<Item> Gnome_Summoner = ITEMS.register("gnome_summoner",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
}
