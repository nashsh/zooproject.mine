package com.company;

import java.util.ArrayList;

public class DepartemanAquatic extends Departeman {
    static ArrayList<DepartemanAquatic> departemanAquatics = new ArrayList<DepartemanAquatic>();
    static ArrayList<DepartemanAquatic> departemanAquatics_zookeaper = new ArrayList<DepartemanAquatic>();
    static ArrayList<DepartemanAquatic> departemanAquatics_belit = new ArrayList<DepartemanAquatic>();
    private String nationality;
    private String nationalid;
    private String sex;
    private String insurance;
    private String food;
    private String camivorous;

    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String mail;
    private String phonenum;
    private String address;


    public DepartemanAquatic() {
        super();
        this.nationality = null;
        this.nationalid = null;
        this.sex = null;
        this.insurance = null;
        this.food = null;
        this.camivorous = null;
        this.firstname = null;
        this.lastname = null;
        this.username = null;
        this.password = null;
        this.mail = null;
        this.phonenum = null;
        this.address = null;

    }

    public DepartemanAquatic(String nationality, String nationalid, String sex, String insurance, String food, String camivorous, String departeman) {
        this.nationality = nationality;
        this.nationalid = nationalid;
        this.sex = sex;
        this.insurance = insurance;
        this.food = food;
        this.camivorous = camivorous;
        super.setName(departeman);
    }

    public DepartemanAquatic(String firstname, String lastname, String username, String password, String mail, String phonenum, String address, String departeman) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phonenum = phonenum;
        this.address = address;
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

    public String getCamivorous() {
        return camivorous;
    }

    public void setCamivorous(String camivorous) {
        this.camivorous = camivorous;
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
            if (Manager_ZooKeaper_Add.zooKeapers.get(i).departeman.equals("Aquatic")){
                size++;
            }
        }
        return size;
    }
}
