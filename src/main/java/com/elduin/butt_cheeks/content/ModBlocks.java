package com.elduin.butt_cheeks.content;

import com.elduin.butt_cheeks.ModTemplate;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class ModBlocks {

	/** A squishy peach-colored block. It is a slime block underneath, so it bounces you. */
	public static final Block BUTT_CHEEKS = registerBlock("butt_cheeks",
			BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).friction(0.8f).strength(0.5f)
					.sound(SoundType.SLIME_BLOCK));

	public static final Item BUTT_CHEEKS_ITEM = registerBlockItem("butt_cheeks", BUTT_CHEEKS);

	private ModBlocks() {
	}

	/** Loads this class, which registers everything above. */
	public static void init() {
	}

	private static Block registerBlock(String name, BlockBehaviour.Properties properties) {
		ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, ModTemplate.id(name));
		return Registry.register(BuiltInRegistries.BLOCK, key, new SlimeBlock(properties.setId(key)));
	}

	private static Item registerBlockItem(String name, Block block) {
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, ModTemplate.id(name));
		return Registry.register(BuiltInRegistries.ITEM, key,
				new BlockItem(block, new Item.Properties().setId(key).useBlockDescriptionPrefix()));
	}
}
