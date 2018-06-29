package com.company;

import java.util.ArrayList;

public abstract class Departeman {
    private String id;
    private String name;
    private String ticket;
    private String zookeeper;
    private String price;

    public Departeman() {
        this.id = null;
        this.name = null;
        this.ticket = null;
        this.zookeeper = null;
        this.price = null;

    }

    public Departeman(String id, String name, String ticket, String zookeeper, String price) {
        this.id = id;
        this.name = name;
        this.ticket = ticket;
        this.zookeeper = zookeeper;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(String zookeeper) {
        this.zookeeper = zookeeper;
    }


}
