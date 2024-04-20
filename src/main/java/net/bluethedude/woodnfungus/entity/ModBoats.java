package net.bluethedude.woodnfungus.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier PALM_BOAT_ID = new Identifier(WoodNFungus.MOD_ID, "palm_boat");
    public static final Identifier PALM_CHEST_BOAT_ID = new Identifier(WoodNFungus.MOD_ID, "palm_chest_boat");
    public static final Identifier BOULDERBARK_BOAT_ID = new Identifier(WoodNFungus.MOD_ID, "boulderbark_boat");
    public static final Identifier BOULDERBARK_CHEST_BOAT_ID = new Identifier(WoodNFungus.MOD_ID, "boulderbark_chest_boat");

    public static final RegistryKey<TerraformBoatType> PALM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PALM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BOULDERBARK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BOULDERBARK_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType palmBoat = new TerraformBoatType.Builder()
                .item(ModItems.PALM_BOAT)
                .chestItem(ModItems.PALM_CHEST_BOAT)
                .planks(ModBlocks.PALM_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE,PALM_BOAT_KEY, palmBoat);

        TerraformBoatType boulderbarkBoat = new TerraformBoatType.Builder()
                .item(ModItems.BOULDERBARK_BOAT)
                .chestItem(ModItems.BOULDERBARK_CHEST_BOAT)
                .planks(ModBlocks.BOULDERBARK_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE,BOULDERBARK_BOAT_KEY, boulderbarkBoat);
    }
}
