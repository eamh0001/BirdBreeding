package com.eamh.birdbreeding.data.dummy;

import com.eamh.birdbreeding.data.models.Breed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyBreed {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Breed> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Breed> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Breed item) {
        ITEMS.add(item);
        ITEM_MAP.put(("" + item.get_id()), item);
    }

    private static Breed createDummyItem(int position) {
        Breed breed = new Breed();
        breed.set_id(position);
        breed.set_idMaleProgenitor(position);
        breed.set_idFemaleProgenitor(position);
        breed.setPuestas(DummyPuesta.ITEMS);
        return breed;
    }
}
