package com.tamsynnimogen.netherfarming.item;

import com.tamsynnimogen.netherfarming.NetherFarming;
import com.tamsynnimogen.netherfarming.util.Registration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> NETHER_FARMING_ICON =
            Registration.ITEMS.register("nether_farming_icon",
                    () -> new Item(new Item.Properties()));

    public static void register() { }
}
