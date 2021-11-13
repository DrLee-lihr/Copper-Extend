package com.drleelihr.copper_extend;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CopperExtendMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("builtin_wiki_viewer");
	public static final Item CopperSword = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM,
				new Identifier("copper_extend", "copper_sword"),CopperSword);
		LOGGER.info("Hello Fabric world!");
	}
}
