package com.company;

public abstract class LiveCreature {
    private String name;
    static private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        LiveCreature.id = id;
    }
}
