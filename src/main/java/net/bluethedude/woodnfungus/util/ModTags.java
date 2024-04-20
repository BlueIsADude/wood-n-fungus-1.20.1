package net.bluethedude.woodnfungus.util;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BOULDERBARK_PLANTABLE =
                    createTag("boulderbark_plantable");
        public static final TagKey<Block> PALM_PLANTABLE =
                createTag("boulderbark_plantable");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(WoodNFungus.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SMALL_SAVORSHROOM_COOKABLE =
                createTag("small_savorshroom_cookable");
        public static final TagKey<Item> SAVORSHROOM_COOKABLE =
                createTag("savorshroom_cookable");
        public static final TagKey<Item> LARGE_SAVORSHROOM_COOKABLE =
                createTag("large_savorshroom_cookable");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(WoodNFungus.MOD_ID, name));
        }
    }
}
