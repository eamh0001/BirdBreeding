package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.Egg;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyEgg {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Egg> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Egg> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Egg item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.get_id(), item);
    }

    public static Egg createDummyItem(int position) {
        Egg egg = new Egg();
        egg.set_id((long) position);
        egg.setDateEggLay(new Date());
        egg.setBadEgg(false);
        return egg;
    }
}
