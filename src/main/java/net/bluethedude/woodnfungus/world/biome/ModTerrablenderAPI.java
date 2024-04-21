package net.bluethedude.woodnfungus.world.biome;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(WoodNFungus.MOD_ID, "overworld"), 4));
    }
}
