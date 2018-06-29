package com.company;

import java.util.ArrayList;

public class DepartemanBirds extends Departeman {

    static ArrayList<DepartemanBirds> departemanBirds = new ArrayList<DepartemanBirds>();
    static ArrayList<DepartemanBirds> departemanBirds_zookeaper = new ArrayList<DepartemanBirds>();
    static ArrayList<DepartemanBirds> departemanBirds_belit = new ArrayList<DepartemanBirds>();

    private String nationality;
    private String nationalid;
    private String sex;
    private String insurance;
    private String food;
    private String wild;


    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String mail;
    private String phonenum;
    private String address;


    public DepartemanBirds() {
        super();
        this.nationality = null;
        this.nationalid = null;
        this.sex = null;
        this.insurance = null;
        this.food = null;
        this.wild =null;
        this.firstname = null;
        this.lastname = null;
        this.username = null;
        this.password = null;
        this.mail = null;
        this.phonenum = null;
        this.address = null;

    }

    public DepartemanBirds(String firstname, String lastname, String username, String password, String mail, String phonenum, String address, String departeman) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phonenum = phonenum;
        this.address = address;

        super.setName(departeman);
    }

    public DepartemanBirds(String nationality, String nationalid, String sex, String insurance, String food, String wild,String departeman) {

        this.nationality = nationality;
        this.nationalid = nationalid;
        this.sex = sex;
        this.insurance = insurance;
        this.food = food;
        this.wild = wild;
        super.setName(departeman);
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

    public String getWild() {
        return wild;
    }

    public void setWild(String wild) {
        this.wild = wild;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getZookeeperCount(){
        int size=0;
        for (int i=0;i<Manager_ZooKeaper_Add.zooKeapers.size();i++){
            if (Manager_ZooKeaper_Add.zooKeapers.get(i).departeman.equals("Birds")){
                size++;
            }
        }
        return size;
    }


}
