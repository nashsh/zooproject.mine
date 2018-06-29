package com.company;

public class Birds extends Animal{

    private String wild;

    public Birds() {
        super();
        this.wild=null;
    }

    public Birds(String nationality, String nationalid, String sex, String insurance, String food, String wild) {
        super(nationality, nationalid, sex, insurance, food);
        this.wild = wild;
    }

    public String getWild() {
        return wild;
    }

    public void setWild(String wild) {
        this.wild = wild;
    }
}
