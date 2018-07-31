package com.eamh.birdbreeding.data.models;

public class PuestaItem {

    private Long _id;
    private Long _idEgg;
    private Long _idBabyBird;
    private Long _idGrowBird;

    private Egg egg;
    private BirdBaby birdBaby;
    private Bird birdGrow;

    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    public BirdBaby getBirdBaby() {
        return birdBaby;
    }

    public void setBirdBaby(BirdBaby birdBaby) {
        this.birdBaby = birdBaby;
    }

    public Bird getBirdGrow() {
        return birdGrow;
    }

    public void setBirdGrow(Bird birdGrow) {
        this.birdGrow = birdGrow;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Long get_idEgg() {
        return _idEgg;
    }

    public void set_idEgg(Long _idEgg) {
        this._idEgg = _idEgg;
    }

    public Long get_idBabyBird() {
        return _idBabyBird;
    }

    public void set_idBabyBird(Long _idBabyBird) {
        this._idBabyBird = _idBabyBird;
    }

    public Long get_idGrowBird() {
        return _idGrowBird;
    }

    public void set_idGrowBird(Long _idGrowBird) {
        this._idGrowBird = _idGrowBird;
    }

    @Override
    public String toString() {
        return "PuestaItem{" +
                "_id=" + _id +
                ", _idEgg=" + _idEgg +
                ", _idBabyBird=" + _idBabyBird +
                ", _idGrowBird=" + _idGrowBird +
                ", egg=" + egg +
                ", birdBaby=" + birdBaby +
                ", birdGrow=" + birdGrow +
                '}';
    }
}
