package com.eamh.birdbreeding.data.models;

import java.util.Date;
import java.util.List;

public class LayEgg {

    private Long _id;
    private Long _idBreeding;
    private int jaulaNumber;
    private Date puestaDate;
    private List<LayEggItem> layEggItems;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Long get_idBreeding() {
        return _idBreeding;
    }

    public void set_idBreeding(Long _idBreeding) {
        this._idBreeding = _idBreeding;
    }

    public int getJaulaNumber() {
        return jaulaNumber;
    }

    public void setJaulaNumber(int jaulaNumber) {
        this.jaulaNumber = jaulaNumber;
    }

    public Date getPuestaDate() {
        return puestaDate;
    }

    public void setPuestaDate(Date puestaDate) {
        this.puestaDate = puestaDate;
    }

    public List<LayEggItem> getLayEggItems() {
        return layEggItems;
    }

    public void setLayEggItems(List<LayEggItem> layEggItems) {
        this.layEggItems = layEggItems;
    }

    @Override
    public String toString() {
        return "LayEgg{" +
                "_id=" + _id +
                ", _idBreeding=" + _idBreeding +
                ", jaulaNumber=" + jaulaNumber +
                ", puestaDate=" + puestaDate +
                ", layEggItems=" + layEggItems +
                '}';
    }
}
