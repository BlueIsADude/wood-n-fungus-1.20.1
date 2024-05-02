package net.bluethedude.woodnfungus.item;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup WOOD_N_FUNGUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WoodNFungus.MOD_ID, "boulderbark_sapling"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.woodnfungusgroup"))
                    .icon(() -> new ItemStack(ModBlocks.BOULDERBARK_SAPLING)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COCONUT);
                        entries.add(ModItems.COCONUT_MILK);
                        entries.add(ModItems.COCONUT_SHELL);
                        entries.add(ModItems.COCONUT_HELMET);

                        entries.add(ModBlocks.PALM_SAPLING);
                        entries.add(ModBlocks.PALM_LEAVES);
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.PALM_CORE_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_CORE_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_DOOR);
                        entries.add(ModBlocks.PALM_TRAPDOOR);
                        entries.add(ModItems.PALM_SIGN);
                        entries.add(ModItems.PALM_HANGING_SIGN);
                        entries.add(ModItems.PALM_BOAT);
                        entries.add(ModItems.PALM_CHEST_BOAT);

                        entries.add(ModBlocks.BOULDERBARK_SAPLING);
                        entries.add(ModBlocks.BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.BOULDERBARK_LOG);
                        entries.add(ModBlocks.STRIPPED_BOULDERBARK_LOG);
                        entries.add(ModBlocks.BOULDERBARK_WOOD);
                        entries.add(ModBlocks.STRIPPED_BOULDERBARK_WOOD);
                        entries.add(ModBlocks.BOULDERBARK_PLANKS);
                        entries.add(ModBlocks.BOULDERBARK_STAIRS);
                        entries.add(ModBlocks.BOULDERBARK_SLAB);
                        entries.add(ModBlocks.BOULDERBARK_FENCE);
                        entries.add(ModBlocks.BOULDERBARK_FENCE_GATE);
                        entries.add(ModBlocks.BOULDERBARK_BUTTON);
                        entries.add(ModBlocks.BOULDERBARK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BOULDERBARK_DOOR);
                        entries.add(ModBlocks.BOULDERBARK_TRAPDOOR);
                        entries.add(ModItems.BOULDERBARK_SIGN);
                        entries.add(ModItems.BOULDERBARK_HANGING_SIGN);
                        entries.add(ModItems.BOULDERBARK_BOAT);
                        entries.add(ModItems.BOULDERBARK_CHEST_BOAT);

                        entries.add(ModBlocks.WHITE_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.LIGHT_GRAY_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.GRAY_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.BLACK_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.BROWN_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.RED_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.ORANGE_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.YELLOW_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.LIME_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.GREEN_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.CYAN_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.LIGHT_BLUE_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.BLUE_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.PURPLE_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.MAGENTA_BOULDERBARK_LEAVES);
                        entries.add(ModBlocks.PINK_BOULDERBARK_LEAVES);

                        entries.add(ModItems.ROASTED_SAVORSHROOM);
                        entries.add(ModItems.ROASTED_SAVORSHROOM_CHUNKS);
                        entries.add(ModItems.ROASTED_SAVORSHROOM_SCRAPS);

                        entries.add(ModBlocks.SAVORSHROOM_BLOCK);
                        entries.add(ModBlocks.SAVORSHROOM_STEM);
                        entries.add(ModBlocks.STRIPPED_SAVORSHROOM_STEM);
                        entries.add(ModBlocks.SAVORSHROOM_HYPHAE);
                        entries.add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE);
                        entries.add(ModBlocks.SAVORSHROOM_PLANKS);
                        entries.add(ModBlocks.SAVORSHROOM_STAIRS);
                        entries.add(ModBlocks.SAVORSHROOM_SLAB);
                        entries.add(ModBlocks.SAVORSHROOM_FENCE);
                        entries.add(ModBlocks.SAVORSHROOM_FENCE_GATE);
                        entries.add(ModBlocks.SAVORSHROOM_BUTTON);
                        entries.add(ModBlocks.SAVORSHROOM_PRESSURE_PLATE);
                        entries.add(ModBlocks.SAVORSHROOM_DOOR);
                        entries.add(ModBlocks.SAVORSHROOM_TRAPDOOR);
                        entries.add(ModItems.SAVORSHROOM_SIGN);
                        entries.add(ModItems.SAVORSHROOM_HANGING_SIGN);

                    }).build());
    public static void registerItemGroups() {
        WoodNFungus.LOGGER.info("Registering Item Groups for " + WoodNFungus.MOD_ID);
    }
}
