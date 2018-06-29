package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ShowInfoSuperAdmin extends JPanel {
    static SuperAdmin superAdmin;

    public ShowInfoSuperAdmin() {
        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        Font font = new Font("arial", Font.BOLD, 15);
        EmptyBorder border = new EmptyBorder(20, 20, 0, 0);

       // superAdmin = new SuperAdmin(superAdmin.getFname(),superAdmin.getLname(),superAdmin.getUsername(),superAdmin.getPass(),superAdmin.getMail(),superAdmin.getPhone());
       superAdmin = new SuperAdmin(SuperAdmin.superAdmins.get(0).getFname(),SuperAdmin.superAdmins.get(0).getLname(),SuperAdmin.superAdmins.get(0).getUsername(),SuperAdmin.superAdmins.get(0).getPass(),SuperAdmin.superAdmins.get(0).getMail());
        JLabel status = new JLabel(" You are enter as : ");
        JLabel fname = new JLabel("first name   :" + SuperAdmin.superAdmins.get(0).getFname());
        JLabel lname = new JLabel("last name    :" + SuperAdmin.superAdmins.get(0).getLname());
        JLabel username = new JLabel("username  :" + SuperAdmin.superAdmins.get(0).getUsername());
        JLabel password = new JLabel("password  :" + SuperAdmin.superAdmins.get(0).getPass());
        JLabel mail = new JLabel("mail  :" + SuperAdmin.superAdmins.get(0).getMail());


        status.setFont(font);
        status.setBorder(border);
        fname.setFont(font);
        fname.setBorder(border);
        lname.setBorder(border);
        lname.setFont(font);
        username.setFont(font);
        username.setBorder(border);
        password.setFont(font);
        password.setBorder(border);
        mail.setFont(font);
        mail.setBorder(border);


        add(status);
        add(fname);
        add(lname);
        add(username);
        add(password);
        add(mail);


    }
}
