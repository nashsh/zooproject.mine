package com.company;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Person {
    String address;
    String wage;
    static ArrayList<Manager> managers = new ArrayList<Manager>();

    public Manager() {
        super();
        this.address = null;
        this.wage = null;
    }

    public Manager(String firstname, String lastname, String username, String password, String mail, String phonenum, String address, String wage) {
        super(firstname, lastname, username, password, mail, phonenum);
        this.address = address;
        this.wage = wage;
    }


    public static void write() throws IOException {
        String line;
        FileWriter fw = new FileWriter("Admin.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < AddManager.managers.size(); i++) {
            line = AddManager.managers.get(i).getFirstname() + "     " + AddManager.managers.get(i).getLastname() + "     " + AddManager.managers.get(i).getUsername()
                    + "     " + AddManager.managers.get(i).getPassword() + "     " + AddManager.managers.get(i).getMail() + "     " + AddManager.managers.get(i).getPhonenum();

            bw.write(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println("All files Of Admin have been Write!!!");
    }

    public static void read() throws Exception {
        try {


            FileReader fr = new FileReader("Admin.txt");
            BufferedReader br = new BufferedReader(fr);
            String line, str[];

            while ((line = br.readLine()) != null) {

                str = line.split("     ");
                Manager m1 = new Manager(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]);
                AddManager.managers.add(m1);
            }
            System.out.println("All files Of Admin have been read!!!");

            br.close();
            System.out.println("All files Of Admin have been read!!!");
        } catch (IOException e) {
            System.out.println("read exception");

        }
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
