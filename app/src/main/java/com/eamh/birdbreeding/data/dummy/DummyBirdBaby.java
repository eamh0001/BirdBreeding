package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.Chick;

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
    public static final List<Chick> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Chick> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Chick item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.get_id(), item);
    }

    public static Chick createDummyItem(int position) {
        Chick chick = new Chick();
        chick.set_id((long) position);
        chick.setBirthDate(new Date());
        chick.setAnillaDate(new Date());
        chick.setDead(false);
        return chick;
    }
}
