package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditManager extends JPanel {
    static Manager manager;

    public EditManager() {
        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        manager = new Manager();

        JLabel lbl1 = new JLabel(" First Name");
        JLabel lbl2 = new JLabel(" Last Name");
        JLabel lbl3 = new JLabel(" UserName");
        JLabel lbl4 = new JLabel(" Password");
        JLabel lbl5 = new JLabel(" Email");
        JLabel lbl6 = new JLabel(" PhoneNum");
        JLabel lbl7 = new JLabel(" Adress");
        JLabel lbl8 = new JLabel(" Wage");


        final JTextField text1 = new JTextField(manager.getFirstname());
        final JTextField text2 = new JTextField(manager.getLastname());
        final JTextField text3 = new JTextField(manager.getUsername());
        final JTextField text4 = new JTextField(manager.getPassword());
        final JTextField text5 = new JTextField(manager.getMail());
        final JTextField text6 = new JTextField(manager.getPhonenum());
        final JTextField text7 = new JTextField(manager.getAddress());
        final JTextField text8 = new JTextField(manager.getWage());

        JPanel panel = new JPanel();
        final JButton btnsave = new JButton("Save ");
        final JButton btnedit = new JButton("Edit");
        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text4.setEditable(false);
        text5.setEditable(false);
        text6.setEditable(false);
        text7.setEditable(false);
        text8.setEditable(false);

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
                    text6.setEditable(true);
                    text7.setEditable(true);
                    text8.setEditable(true);
                } else if (btnedit.getText().equals("Cancel")) {
                    btnedit.setText("Edit");
                    text1.setEditable(false);
                    text2.setEditable(false);
                    text3.setEditable(false);
                    text4.setEditable(false);
                    text5.setEditable(false);
                    text6.setEditable(false);
                    text7.setEditable(false);
                    text8.setEditable(false);
                }

            }
        });
        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                manager.setFirstname(text1.getText());
                manager.setLastname(text2.getText());
                manager.setUsername(text3.getText());
                manager.setPassword(text4.getText());
                manager.setMail(text5.getText());
                manager.setPhonenum(text6.getText());
                manager.setAddress(text7.getText());
                manager.setWage(text8.getText());

                text1.setEditable(false);
                text2.setEditable(false);
                text3.setEditable(false);
                text4.setEditable(false);
                text5.setEditable(false);
                text6.setEditable(false);
                text7.setEditable(false);
                text8.setEditable(false);
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
        add(lbl6);
        add(text6);
        add(lbl7);
        add(text7);
        add(lbl8);
        add(text8);


        panel.add(btnsave);
        panel.add(btnedit);
        add(panel);
    }
}

