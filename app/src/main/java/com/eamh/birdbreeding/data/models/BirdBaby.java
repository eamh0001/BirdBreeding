package com.eamh.birdbreeding.data.models;

import java.util.Date;

public class BirdBaby {

    private Long _id;
    private Date birthDate;
    private Date anillaDate;
    private boolean isDead;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getAnillaDate() {
        return anillaDate;
    }

    public void setAnillaDate(Date anillaDate) {
        this.anillaDate = anillaDate;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    @Override
    public String toString() {
        return "BirdBaby{" +
                "_id=" + _id +
                ", birthDate=" + birthDate +
                ", anillaDate=" + anillaDate +
                ", isDead=" + isDead +
                '}';
    }
}
