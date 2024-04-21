package net.bluethedude.woodnfungus.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.entity.ModBoats;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COCONUT = registerItem("coconut", new Item(new FabricItemSettings()));
    public static final Item COCONUT_MILK = registerItem("coconut_milk", new Item(new FabricItemSettings().food(ModFoodComponents.COCONUT_MILK)));
    public static final Item COCONUT_SHELL = registerItem("coconut_shell", new Item(new FabricItemSettings()));
    public static final Item COCONUT_HELMET = registerItem("coconut_helmet",
            new ArmorItem(ModArmorMaterials.COCONUT, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item PALM_SIGN = registerItem("palm_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PALM_SIGN, ModBlocks.WALL_PALM_SIGN));
    public static final Item PALM_HANGING_SIGN = registerItem("palm_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PALM_SIGN, ModBlocks.WALL_HANGING_PALM_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PALM_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALM_BOAT_ID, ModBoats.PALM_BOAT_KEY, false);
    public static final Item PALM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALM_CHEST_BOAT_ID, ModBoats.PALM_BOAT_KEY, true);

    public static final Item BOULDERBARK_SIGN = registerItem("boulderbark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BOULDERBARK_SIGN, ModBlocks.WALL_BOULDERBARK_SIGN));
    public static final Item BOULDERBARK_HANGING_SIGN = registerItem("boulderbark_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_BOULDERBARK_SIGN, ModBlocks.WALL_HANGING_BOULDERBARK_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item BOULDERBARK_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.BOULDERBARK_BOAT_ID, ModBoats.BOULDERBARK_BOAT_KEY, false);
    public static final Item BOULDERBARK_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.BOULDERBARK_CHEST_BOAT_ID, ModBoats.BOULDERBARK_BOAT_KEY, true);

    public static final Item ROASTED_SAVORSHROOM_CHUNKS = registerItem("roasted_savorshroom_chunks", new Item(new FabricItemSettings().food(ModFoodComponents.SAVORSHROOM_CHUNKS)));
    public static final Item ROASTED_SAVORSHROOM_SCRAPS = registerItem("roasted_savorshroom_scraps", new Item(new FabricItemSettings().food(ModFoodComponents.SAVORSHROOM_SCRAPS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WoodNFungus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WoodNFungus.LOGGER.info("Registering Mod Items for " + WoodNFungus.MOD_ID);

    }
}
