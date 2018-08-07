package com.eamh.birdbreeding.data;

import com.eamh.birdbreeding.data.models.Bird;
import com.eamh.birdbreeding.data.models.Breed;

public interface PersistenceManager {
    void createBird(Bird bird);

    void retrieveBird(long idBird);

    void updateBird(long idBird, Bird bird);

    void removeBird(long idBird);

    void createBreed(Breed breed);

    void retrieveBreed(long idBreed);

    void updateBreed(long idBreed, Breed breed);

    void removeBreed(long idBreed);

    void createChick(Bird bird);

    void retrieveChick(long idBird);

    void updateChick(long idBird, Bird bird);

    void removeChick(long idBird);


    final class ErrorCode {
        public static final int CREATE = 0;
        public static final int RETRIEVE = 1;
        public static final int UPDATE = 2;
        public static final int DELETE = 3;
    }
}
