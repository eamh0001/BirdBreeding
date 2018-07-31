package com.eamh.birdbreeding.data.models;

import java.util.List;

public class Breed {

    private long _id;
    private long _idMaleProgenitor;
    private long _idFemaleProgenitor;

    private List<Puesta> puestas;

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

    public List<Puesta> getPuestas() {
        return puestas;
    }

    public void setPuestas(List<Puesta> puestas) {
        this.puestas = puestas;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "_id=" + _id +
                ", _idMaleProgenitor=" + _idMaleProgenitor +
                ", _idFemaleProgenitor=" + _idFemaleProgenitor +
                ", puestas=" + puestas +
                '}';
    }
}
