package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditSuperAdmin extends JPanel {

    static SuperAdmin superAdmin;

    public EditSuperAdmin() {
        setMinimumSize(new Dimension(200, 300));
        setPreferredSize(new Dimension(200, 300));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        superAdmin = new SuperAdmin("najme", "shayeste", "najme", 123, "najmeshayeste77", 12345678);

        JLabel lbl1 = new JLabel(" First Name");
        JLabel lbl2 = new JLabel(" Last Name");
        JLabel lbl3 = new JLabel(" UserName");
        JLabel lbl4 = new JLabel(" Password");
        JLabel lbl5 = new JLabel(" Email");


        final JTextField text1 = new JTextField(superAdmin.getFname());
        final JTextField text2 = new JTextField(superAdmin.getLname());
        final JTextField text3 = new JTextField(superAdmin.getUsername());
        final JTextField text4 = new JTextField(superAdmin.getPass());
        final JTextField text5 = new JTextField(superAdmin.getMail());

        JPanel panel = new JPanel();
        final JButton btnsave = new JButton("Save ");
        final JButton btnedit = new JButton("Edit");
        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text4.setEditable(false);
        text5.setEditable(false);
        btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (btnedit.getText().equals("Edit")) {
                    btnedit.setText("Cancel");
                    text1.setEditable(true);
                    text2.setEditable(true);
                    text3.setEditable(true);
                    text4.setEditable(true);
                    text5.setEditable(true);

                } else if (btnedit.getText().equals("Cancel")) {
                    btnedit.setText("Edit");
                    text1.setEditable(false);
                    text2.setEditable(false);
                    text3.setEditable(false);
                    text4.setEditable(false);
                    text5.setEditable(false);

                }

            }
        });
        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String te1=text1.getText();
                String te2=text2.getText();
                String te3=text3.getText();
               int te4=Integer.parseInt(text4.getText());
                String te5=text5.getText();
                SuperAdmin.superAdmins.get(0).setFname(te1);
                SuperAdmin.superAdmins.get(0).setLname(te2);
                SuperAdmin.superAdmins.get(0).setUsername(te3);
                SuperAdmin.superAdmins.get(0).setPass(te4);
                SuperAdmin.superAdmins.get(0).setMail(te5);

//                SuperAdmin spa = new SuperAdmin(te1,te2,te3,te4,te5);
//                SuperAdmin.superAdmins.add(spa);
//                superAdmin.setFname(text1.getText());
//                superAdmin.setLname(text2.getText());
//                superAdmin.setUsername(text3.getText());
//                int pass = Integer.parseInt(text4.getText());
//                superAdmin.setPass(pass);
//                superAdmin.setMail(text5.getText());
                text1.setEditable(false);
                text2.setEditable(false);
                text3.setEditable(false);
                text4.setEditable(false);
                text5.setEditable(false);
                btnedit.setText("Edit");
            }
        });

        add(lbl1);
        add(text1);
        add(lbl2);
        add(text2);
        add(lbl3);
        add(text3);
        add(lbl4);
        add(text4);
        add(lbl5);
        add(text5);

        panel.add(btnsave);
        panel.add(btnedit);
        add(panel);
    }
}
