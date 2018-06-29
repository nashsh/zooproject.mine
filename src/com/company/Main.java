package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main {
static SuperAdmin superAdmin;
static ArrayList<Manager> managers=new ArrayList<Manager>();
    public static void main(String[] args) {

        superAdmin = new SuperAdmin("najme","shayeste","najme",123,"najme77");
        SuperAdmin.superAdmins.add(superAdmin);
        Login login = new Login();
        login.setVisible(true);
    }
}
