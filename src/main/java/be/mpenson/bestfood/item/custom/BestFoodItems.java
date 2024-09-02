package be.mpenson.bestfood.item.custom;

import be.mpenson.bestfood.Bestfood;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class BestFoodItems {
    public static final Item CRAZY_POTATO = registerItem("crazy_potato", new Item(new Item.Settings().food(BestfoodComponent.CRAZY_POTATO )));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Bestfood.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Bestfood.LOGGER.info("Adding Mod Items for " + Bestfood.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CRAZY_POTATO);
        });
    }
}
