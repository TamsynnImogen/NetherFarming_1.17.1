package com.tamsynnimogen.netherfarming.block;

import com.tamsynnimogen.netherfarming.NetherFarming;
import com.tamsynnimogen.netherfarming.util.Registration;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> BLOODBARK_BUTTON =
            register("bloodbark_button",
                    () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BLOODBARK_PLANKS =
            register("bloodbark_planks",
                () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BLOODBARK_DOOR =
            register("bloodbark_door",
                    () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD,
                            ModBlocks.BLOODBARK_PLANKS.get().defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> STRIPPED_BLOODBARK_STEM =
            register("stripped_bloodbark_stem",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD).strength(2.0F).sound(SoundType.STEM)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(NetherFarming.CREATIVETAB)));
        return toReturn;
    }
}
