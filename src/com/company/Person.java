package com.company;

public abstract class Person {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String mail;
    private String phonenum;

    public Person() {
        this.firstname=null;
        this.lastname=null;
        this.username=null;
        this.password=null;
        this.mail=null;
        this.phonenum=null;
    }

    public Person(String firstname, String lastname, String username, String password, String mail, String phonenum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.phonenum = phonenum;
    }

    public void ChangePass(){}


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
}
