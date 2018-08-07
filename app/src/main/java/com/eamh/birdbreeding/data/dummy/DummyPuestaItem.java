package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.LayEggItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyPuestaItem {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<LayEggItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, LayEggItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(LayEggItem item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.get_id(), item);
    }

    public static LayEggItem createDummyItem(int position) {
        LayEggItem layEggItem = new LayEggItem();
        layEggItem.set_id((long) position);
        layEggItem.setEgg(DummyEgg.createDummyItem(position));
        layEggItem.setChick(DummyBirdBaby.createDummyItem(position));
        layEggItem.setBirdGrow(DummyBird.createDummyItem(position));
        return layEggItem;
    }
}
