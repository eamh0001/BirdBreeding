package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.BirdBaby;

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
public class DummyBirdBaby {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<BirdBaby> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, BirdBaby> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(BirdBaby item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.get_id(), item);
    }

    public static BirdBaby createDummyItem(int position) {
        BirdBaby birdBaby = new BirdBaby();
        birdBaby.set_id((long) position);
        birdBaby.setBirthDate(new Date());
        birdBaby.setAnillaDate(new Date());
        birdBaby.setDead(false);
        return birdBaby;
    }
}
