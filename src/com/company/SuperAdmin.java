package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class SuperAdmin extends Person {
    static ArrayList<SuperAdmin>superAdmins=new ArrayList<SuperAdmin>();
    private String fname;
    private String lname ;
    private String username ;
    private int pass;
    private String mail ;
    private long phone ;

//    public SuperAdmin() {
//
//        fname = "najme";
//        lname = "shayeste";
//        username = "najme";
//        pass = 123;
//        mail = "najmeshayeste77";
//        phone = 12345678;
//
//    }

    public SuperAdmin(String fname, String lname, String username, int pass, String mail, long phone) {
        this.fname=fname;
        this.lname=lname;
        this.mail=mail;
        this.username=username;
        this.pass=pass;
        this.phone=phone;
    }

    public SuperAdmin(String fname, String lname, String username, int pass, String mail) {
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.pass = pass;
        this.mail = mail;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    public int getPass() {
        return pass;
    }


    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}
