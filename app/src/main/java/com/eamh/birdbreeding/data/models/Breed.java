package com.eamh.birdbreeding.data.models;

import java.util.List;

public class Breed {

    private long _id;
    private long _idMaleProgenitor;
    private long _idFemaleProgenitor;

    private List<LayEgg> layEggs;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public long get_idMaleProgenitor() {
        return _idMaleProgenitor;
    }

    public void set_idMaleProgenitor(long _idMaleProgenitor) {
        this._idMaleProgenitor = _idMaleProgenitor;
    }

    public long get_idFemaleProgenitor() {
        return _idFemaleProgenitor;
    }

    public void set_idFemaleProgenitor(long _idFemaleProgenitor) {
        this._idFemaleProgenitor = _idFemaleProgenitor;
    }

    public List<LayEgg> getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(List<LayEgg> layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "_id=" + _id +
                ", _idMaleProgenitor=" + _idMaleProgenitor +
                ", _idFemaleProgenitor=" + _idFemaleProgenitor +
                ", layEggs=" + layEggs +
                '}';
    }
}
