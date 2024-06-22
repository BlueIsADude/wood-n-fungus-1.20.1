package net.bluethedude.woodnfungus.datagen;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.item.ModItems;
import net.bluethedude.woodnfungus.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

import static net.minecraft.data.family.BlockFamilies.register;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Blocks.CAKE)
                .pattern("MMM")
                .pattern("CEC")
                .pattern("FFF")
                .input('M', ModItems.COCONUT_MILK)
                .input('E', Items.EGG)
                .input('F', Items.WHEAT)
                .input('C', Items.SUGAR)
                .criterion(hasItem(ModItems.COCONUT_MILK), conditionsFromItem(ModItems.COCONUT_MILK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COCONUT_HELMET)
                .pattern("LCL")
                .pattern("I I")
                .input('L', Items.LEATHER)
                .input('C', ModItems.COCONUT_SHELL)
                .input('I', Items.IRON_NUGGET)
                .criterion(hasItem(ModItems.COCONUT_SHELL), conditionsFromItem(ModItems.COCONUT_SHELL))
                .offerTo(exporter);


        BlockFamily palmFamily = register(ModBlocks.PALM_PLANKS)
                .button(ModBlocks.PALM_BUTTON)
                .fence(ModBlocks.PALM_FENCE)
                .fenceGate(ModBlocks.PALM_FENCE_GATE)
                .pressurePlate(ModBlocks.PALM_PRESSURE_PLATE)
                .sign(ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN)
                .slab(ModBlocks.PALM_SLAB)
                .stairs(ModBlocks.PALM_STAIRS)
                .door(ModBlocks.PALM_DOOR)
                .trapdoor(ModBlocks.PALM_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        generateFamily(exporter, palmFamily);
        offerPlanksRecipe(exporter, ModBlocks.PALM_PLANKS, ModTags.Items.PALM_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.PALM_WOOD, ModBlocks.PALM_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_PALM_WOOD, ModBlocks.STRIPPED_PALM_LOG);
        offerBoatRecipe(exporter, ModItems.PALM_BOAT, ModBlocks.PALM_PLANKS);
        offerHangingSignRecipe(exporter, ModBlocks.PALM_HANGING_SIGN, ModBlocks.STRIPPED_PALM_LOG);

        BlockFamily boulderbarkFamily = register(ModBlocks.BOULDERBARK_PLANKS)
                .button(ModBlocks.BOULDERBARK_BUTTON)
                .fence(ModBlocks.BOULDERBARK_FENCE)
                .fenceGate(ModBlocks.BOULDERBARK_FENCE_GATE)
                .pressurePlate(ModBlocks.BOULDERBARK_PRESSURE_PLATE)
                .sign(ModBlocks.BOULDERBARK_SIGN, ModBlocks.BOULDERBARK_WALL_SIGN)
                .slab(ModBlocks.BOULDERBARK_SLAB)
                .stairs(ModBlocks.BOULDERBARK_STAIRS)
                .door(ModBlocks.BOULDERBARK_DOOR)
                .trapdoor(ModBlocks.BOULDERBARK_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        generateFamily(exporter, boulderbarkFamily);
        offerPlanksRecipe(exporter, ModBlocks.BOULDERBARK_PLANKS, ModTags.Items.BOULDERBARK_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.BOULDERBARK_WOOD, ModBlocks.BOULDERBARK_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_BOULDERBARK_WOOD, ModBlocks.STRIPPED_BOULDERBARK_LOG);
        offerBoatRecipe(exporter, ModItems.BOULDERBARK_BOAT, ModBlocks.BOULDERBARK_PLANKS);
        offerHangingSignRecipe(exporter, ModBlocks.BOULDERBARK_HANGING_SIGN, ModBlocks.STRIPPED_BOULDERBARK_LOG);

        BlockFamily savorshroomFamily = register(ModBlocks.SAVORSHROOM_PLANKS)
                .button(ModBlocks.SAVORSHROOM_BUTTON)
                .fence(ModBlocks.SAVORSHROOM_FENCE)
                .fenceGate(ModBlocks.SAVORSHROOM_FENCE_GATE)
                .pressurePlate(ModBlocks.SAVORSHROOM_PRESSURE_PLATE)
                .sign(ModBlocks.SAVORSHROOM_SIGN, ModBlocks.SAVORSHROOM_WALL_SIGN)
                .slab(ModBlocks.SAVORSHROOM_SLAB)
                .stairs(ModBlocks.SAVORSHROOM_STAIRS)
                .door(ModBlocks.SAVORSHROOM_DOOR)
                .trapdoor(ModBlocks.SAVORSHROOM_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        generateFamily(exporter, savorshroomFamily);
        offerPlanksRecipe(exporter, ModBlocks.SAVORSHROOM_PLANKS, ModTags.Items.SAVORSHROOM_STEMS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.SAVORSHROOM_HYPHAE, ModBlocks.SAVORSHROOM_STEM);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE, ModBlocks.STRIPPED_SAVORSHROOM_STEM);
        offerHangingSignRecipe(exporter, ModBlocks.SAVORSHROOM_HANGING_SIGN, ModBlocks.STRIPPED_SAVORSHROOM_STEM);

    }
}
