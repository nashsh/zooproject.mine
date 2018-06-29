package com.company;

import java.util.ArrayList;

public class ZooKeaper extends Person {

    String address;
    String wage;
    String departeman;


    public ZooKeaper() {
        super();
        this.address = null;
        this.wage = null;

    }

    public ZooKeaper(String firstname, String lastname, String username, String password, String mail, String phonenum, String address, String wage,String departeman) {
        super(firstname, lastname, username, password, mail, phonenum);
        this.address = address;
        this.wage = wage;
        this.departeman=departeman;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }
}
