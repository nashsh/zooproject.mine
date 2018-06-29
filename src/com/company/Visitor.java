package com.company;

import java.util.ArrayList;

public class Visitor extends Person {
    private String etebar;
    private String tedad;
    private String tarikh;
    private String departeman;
    private String coment;
    static ArrayList<VisitorComent> visitorComents = new ArrayList<VisitorComent>();

    public Visitor() {
        super();
        this.etebar = "10000";

    }

    public Visitor(String firstname, String lastname, String username, String password, String mail, String phonenum) {
        super(firstname, lastname, username, password, mail, phonenum);
    }


    public Visitor(String tedad, String tarikh, String departeman) {
        this.tedad = tedad;
        this.tarikh = tarikh;
        this.departeman = departeman;
    }

    public Visitor(String firstname, String lastname, String username, String password, String mail, String phonenum, String tedad, String tarikh, String departeman) {
        super(firstname, lastname, username, password, mail, phonenum);

        this.tedad = tedad;
        this.tarikh = tarikh;
        this.departeman = departeman;
    }

    public Visitor(String firstname, String lastname, String username, String password, String mail, String phonenum, String departeman, String cm) {
        super(firstname, lastname, username, password, mail, phonenum);
        this.coment = cm;
        this.departeman = departeman;
    }

    public String getDeparteman() {
        return departeman;
    }

    public void setDeparteman(String departeman) {
        this.departeman = departeman;
    }

    public Visitor(String username, String coment) {
        this.coment = coment;
        super.setUsername(username);
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public String getEtebar() {
        return etebar;
    }

    public void setEtebar(String etebar) {
        this.etebar = etebar;
    }


    public String etebare(String et) {
        try {
            int etebarnum = Integer.parseInt(this.getEtebar());
            int etebarnewnum = Integer.parseInt(et);
            int jam = etebarnum+etebarnewnum;
            String jameshoon = String.valueOf(jam);
            setEtebar(jameshoon);
            return jameshoon;
        } catch (NumberFormatException e) {

            return "Wrong !";

        }
    }

    public Visitor(String coment) {
        this.coment = coment;
    }
}
