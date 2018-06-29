package com.company;

public class Wild extends Animal {
    private String home;

    public Wild() {
        super();
        this.home = null;
    }

    public Wild(String nationality, String nationalid, String sex, String insurance, String food, String home) {
        super(nationality, nationalid, sex, insurance, food);
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

}
