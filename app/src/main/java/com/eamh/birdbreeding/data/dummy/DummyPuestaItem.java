package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.PuestaItem;

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
    public static final List<PuestaItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, PuestaItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(PuestaItem item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.get_id(), item);
    }

    public static PuestaItem createDummyItem(int position) {
        PuestaItem puestaItem = new PuestaItem();
        puestaItem.set_id((long) position);
        puestaItem.setEgg(DummyEgg.createDummyItem(position));
        puestaItem.setBirdBaby(DummyBirdBaby.createDummyItem(position));
        puestaItem.setBirdGrow(DummyBird.createDummyItem(position));
        return puestaItem;
    }
}
