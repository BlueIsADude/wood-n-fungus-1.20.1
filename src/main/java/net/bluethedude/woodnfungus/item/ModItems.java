package net.bluethedude.woodnfungus.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.block.entities.ModEntities;
import net.bluethedude.woodnfungus.entity.ModBoats;
import net.bluethedude.woodnfungus.item.custom.CoconutHelmetItem;
import net.bluethedude.woodnfungus.item.custom.CoconutMilkItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PETRIFIED_SEEDS = registerItem("petrified_seeds", new Item(new FabricItemSettings()));
    public static final Item AMBER_FUNGUS = registerItem("amber_fungus", new Item(new FabricItemSettings()));

    public static final Item COCONUT_MILK = registerItem("coconut_milk",
            new CoconutMilkItem(new FabricItemSettings().recipeRemainder(ModItems.COCONUT_SHELL).maxCount(16)));
    public static final Item COCONUT_SHELL = registerItem("coconut_shell", new Item(new FabricItemSettings()));
    public static final Item COCONUT_HELMET = registerItem("coconut_helmet",
            new CoconutHelmetItem(ModArmorMaterials.COCONUT, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item PALM_SIGN = registerItem("palm_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN));
    public static final Item PALM_HANGING_SIGN = registerItem("palm_hanging_sign",
            new HangingSignItem(ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item PALM_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALM_BOAT_ID, ModBoats.PALM_BOAT_KEY, false);
    public static final Item PALM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALM_CHEST_BOAT_ID, ModBoats.PALM_BOAT_KEY, true);

    public static final Item BOULDERBARK_SIGN = registerItem("boulderbark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.BOULDERBARK_SIGN, ModBlocks.BOULDERBARK_WALL_SIGN));
    public static final Item BOULDERBARK_HANGING_SIGN = registerItem("boulderbark_hanging_sign",
            new HangingSignItem(ModBlocks.BOULDERBARK_HANGING_SIGN, ModBlocks.BOULDERBARK_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item BOULDERBARK_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.BOULDERBARK_BOAT_ID, ModBoats.BOULDERBARK_BOAT_KEY, false);
    public static final Item BOULDERBARK_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.BOULDERBARK_CHEST_BOAT_ID, ModBoats.BOULDERBARK_BOAT_KEY, true);

    public static final Item ROASTED_SAVORSHROOM = registerItem("roasted_savorshroom", new Item(new FabricItemSettings().food(ModFoodComponents.SAVORSHROOM)));
    public static final Item ROASTED_SAVORSHROOM_CHUNKS = registerItem("roasted_savorshroom_chunks", new Item(new FabricItemSettings().food(ModFoodComponents.SAVORSHROOM_CHUNKS)));
    public static final Item ROASTED_SAVORSHROOM_SCRAPS = registerItem("roasted_savorshroom_scraps", new Item(new FabricItemSettings().food(ModFoodComponents.SAVORSHROOM_SCRAPS)));

    public static final Item SAVORSHROOM_SIGN = registerItem("savorshroom_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.SAVORSHROOM_SIGN, ModBlocks.SAVORSHROOM_WALL_SIGN));
    public static final Item SAVORSHROOM_HANGING_SIGN = registerItem("savorshroom_hanging_sign",
            new HangingSignItem(ModBlocks.SAVORSHROOM_HANGING_SIGN, ModBlocks.SAVORSHROOM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item MUSHER_SPAWN_EGG = registerItem("musher_spawn_egg",
            new SpawnEggItem(ModEntities.MUSHER, 0xfcd3a9, 0xd5264e, new FabricItemSettings()));
    public static final Item BLOPPO = registerItem("bloppo", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WoodNFungus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WoodNFungus.LOGGER.info("Registering Mod Items for " + WoodNFungus.MOD_ID);

    }
}
