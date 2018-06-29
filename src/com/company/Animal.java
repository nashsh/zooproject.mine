package com.company;

public class Animal extends LiveCreature {

    private String nationality;
    private String nationalid;
    private String sex;
    private String insurance;
    private String food;

    public Animal() {
        super();
        this.nationality=null;
        this.nationalid=null;
        this.sex=null;
        this.insurance=null;
        this.food=null;
    }

    public Animal(String nationality, String nationalid, String sex, String insurance, String food) {

        this.nationality = nationality;
        this.nationalid = nationalid;
        this.sex = sex;
        this.insurance = insurance;
        this.food = food;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalid() {
        return nationalid;
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
