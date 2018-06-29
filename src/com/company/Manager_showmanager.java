package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Manager_showmanager extends JPanel {
    public Manager_showmanager() {
        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Font font = new Font("arial", Font.BOLD, 20);
        EmptyBorder border = new EmptyBorder(20, 20, 0, 0);
        for (int i = 0; i < AddManager.managers.size(); i++) {

            JLabel status = new JLabel(" You are enter as : ");
            JLabel fname = new JLabel("first name   :" + AddManager.managers.get(i).getFirstname());
            JLabel lname = new JLabel("last name    :" + AddManager.managers.get(i).getLastname());
            JLabel username = new JLabel("username  :" + AddManager.managers.get(i).getUsername());
            JLabel password = new JLabel("password  :" + AddManager.managers.get(i).getPassword());
            JLabel phone = new JLabel("Phone" + AddManager.managers.get(i).getPhonenum());
            JLabel mail = new JLabel("Mail" + AddManager.managers.get(i).getMail());
            JLabel adress = new JLabel("Adress" + AddManager.managers.get(i).getAddress());
            JLabel wage = new JLabel("Wage" + AddManager.managers.get(i).getWage());


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

            add(fname);
            add(lname);
            add(username);
            add(password);
            add(phone);
            add(mail);
            add(adress);
            add(wage);


        }

    }
}