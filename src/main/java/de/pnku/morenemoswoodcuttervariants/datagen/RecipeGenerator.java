package de.pnku.morenemoswoodcuttervariants.datagen;

import de.pnku.morenemoswoodcuttervariants.block.ModVariantBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import com.nemonotfound.nemoswoodcutter.block.ModBlocks;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.MOD_ID;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createWoodCutterVariantsRecipe(exporter);
    }

    private void createWoodCutterVariantsRecipe(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.ACACIA_LOGS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.ACACIA_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', Items.ACACIA_LOG)
                .input('+', Ingredient.ofItems(Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_acacia_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', Items.STRIPPED_BAMBOO_BLOCK)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', Items.STRIPPED_BAMBOO_BLOCK)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_bamboo_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.BIRCH_LOGS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.BIRCH_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.BIRCH_LOGS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_birch_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.CHERRY_LOGS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.CHERRY_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.CHERRY_LOGS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_cherry_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.CRIMSON_STEMS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.CRIMSON_STEMS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.CRIMSON_STEMS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_crimson_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', Items.DARK_OAK_LOG)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', Items.DARK_OAK_LOG)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_dark_oak_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.JUNGLE_LOGS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.JUNGLE_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.JUNGLE_LOGS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_jungle_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.MANGROVE_LOGS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.MANGROVE_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.MANGROVE_LOGS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.SPRUCE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_mangrove_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.SPRUCE_LOGS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.SPRUCE_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.SPRUCE_LOGS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.WARPED_STEM))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_spruce_plus"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModVariantBlocks.WARPED_WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.WARPED_STEMS)
                .pattern(" I ")
                .pattern("###")
                .criterion("has_logs", VanillaRecipeProvider.conditionsFromTag(ItemTags.WARPED_STEMS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WOODCUTTER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('#', ItemTags.WARPED_STEMS)
                .input('+', Ingredient.ofItems(Items.ACACIA_LOG, Items.STRIPPED_BAMBOO_BLOCK, Items.BIRCH_LOG, Items.CHERRY_LOG, Items.CRIMSON_STEM, Items.DARK_OAK_LOG, Items.JUNGLE_LOG, Items.MANGROVE_LOG, Items.SPRUCE_LOG))
                .pattern(" I ")
                .pattern("#++")
                .criterion("has_impossible", VanillaRecipeProvider.conditionsFromItem(Items.END_PORTAL_FRAME))
                .offerTo(exporter, Identifier.of(MOD_ID, "nemos_woodcutter_from_warped_plus"));
    }
}
