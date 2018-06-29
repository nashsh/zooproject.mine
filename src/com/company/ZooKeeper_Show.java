package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ZooKeeper_Show extends JPanel {
    Login login = new Login();

    public ZooKeeper_Show() {

        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Font font = new Font("arial", Font.BOLD, 20);
        EmptyBorder border = new EmptyBorder(20, 20, 0, 0);

        JLabel status = new JLabel(" You are enter as : ");
        JLabel fname = new JLabel("first name   :" + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getFirstname());
        JLabel lname = new JLabel("last name    :" + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getLastname());
        JLabel username = new JLabel("username  :" + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getUsername());
        JLabel password = new JLabel("password  :" + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getPassword());
        JLabel phone = new JLabel("Phone" + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getPhonenum());
        JLabel mail = new JLabel("Mail  " + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getMail());
        JLabel adress = new JLabel("Adress  " + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getAddress());
        JLabel wage = new JLabel("Wage  " + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getWage());
        JLabel departeman = new JLabel("Departeman  " + Manager_ZooKeaper_Add.zooKeapers.get(Login.userId).getWage());

        fname.setFont(font);
        fname.setBorder(border);
        lname.setBorder(border);
        lname.setFont(font);
        username.setFont(font);
        username.setBorder(border);
        password.setBorder(border);
        password.setFont(font);
        phone.setBorder(border);
        phone.setFont(font);
        mail.setBorder(border);
        mail.setFont(font);
        adress.setBorder(border);
        adress.setFont(font);
        wage.setBorder(border);
        wage.setFont(font);
        departeman.setBorder(border);
        departeman.setFont(font);

        add(fname);
        add(lname);
        add(username);
        add(password);
        add(phone);
        add(mail);
        add(adress);
        add(wage);
        add(departeman);

    }
}



