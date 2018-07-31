package com.eamh.birdbreeding.data.models;

import java.util.Date;

public class Egg {
    private Long _id;
    private Date dateEggLay;
    private boolean isBadEgg;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Date getDateEggLay() {
        return dateEggLay;
    }

    public void setDateEggLay(Date dateEggLay) {
        this.dateEggLay = dateEggLay;
    }

    public boolean isBadEgg() {
        return isBadEgg;
    }

    public void setBadEgg(boolean badEgg) {
        isBadEgg = badEgg;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "_id=" + _id +
                ", dateEggLay=" + dateEggLay +
                ", isBadEgg=" + isBadEgg +
                '}';
    }
}
