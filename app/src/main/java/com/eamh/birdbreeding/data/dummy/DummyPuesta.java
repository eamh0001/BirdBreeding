package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.Puesta;

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
public class DummyPuesta {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Puesta> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Puesta> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 6;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Puesta item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.get_id(), item);
    }

    private static Puesta createDummyItem(int position) {
        Puesta puesta = new Puesta();
        puesta.set_id((long) position);
        puesta.setJaulaNumber(position);
        puesta.setPuestaDate(new Date());
        puesta.setPuestaItems(DummyPuestaItem.ITEMS);
        return puesta;
    }
}
