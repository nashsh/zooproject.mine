package com.company;

public class Aquatic extends Animal implements ShowAble {
     String camivorous;

    public Aquatic() {
    super();
    camivorous=null;
    }

    public Aquatic(String nationality, String nationalid, String sex, String insurance, String food, String camivorous) {
        super(nationality, nationalid, sex, insurance, food);
        this.camivorous = camivorous;
    }

    public String getCamivorous() {
        return camivorous;
    }

    public void setCamivorous(String camivorous) {
        this.camivorous = camivorous;
    }

    public void show(){
        System.out.println("showable aquatic");
    }
}
