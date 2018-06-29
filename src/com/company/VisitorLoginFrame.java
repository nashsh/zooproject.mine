package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VisitorLoginFrame extends JFrame {
    static ArrayList<Visitor> visitors = new ArrayList<Visitor>();


    public VisitorLoginFrame() {

        setMinimumSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(1000, 500));
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

        setBackground(Color.decode("#CCCC00"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel Panel = new JPanel();

        JTextField nameTxT = new JTextField("name");
        nameTxT.setMinimumSize(new Dimension(10, 10));
        nameTxT.setPreferredSize(new Dimension(10, 10));
        add(nameTxT, BoxLayout.X_AXIS);
        JTextField lnameTxT = new JTextField("last name");
        lnameTxT.setPreferredSize(new Dimension(10, 10));
        add(lnameTxT);
        JTextField userTxT = new JTextField("username");
        userTxT.setMinimumSize(new Dimension(10, 10));
        userTxT.setPreferredSize(new Dimension(10, 10));
        add(userTxT);
        JTextField passTxT = new JTextField("password");
        passTxT.setMinimumSize(new Dimension(10, 10));
        passTxT.setPreferredSize(new Dimension(10, 10));
        add(passTxT);
        JTextField emailTxT = new JTextField("email");
        emailTxT.setMinimumSize(new Dimension(10, 10));
        emailTxT.setPreferredSize(new Dimension(10, 10));
        add(emailTxT);
        JTextField phoneTxT = new JTextField("phone");
        phoneTxT.setMinimumSize(new Dimension(10, 10));
        phoneTxT.setPreferredSize(new Dimension(10, 10));
        add(phoneTxT);

        nameTxT.setEditable(true);
        lnameTxT.setEditable(true);
        userTxT.setEditable(true);
        passTxT.setEditable(true);
        emailTxT.setEditable(true);
        phoneTxT.setEditable(true);

        JPanel Buttun = new JPanel();
        Buttun.setMinimumSize(new Dimension(100, 100));
        Buttun.setPreferredSize(new Dimension(100, 100));
        Buttun.setBackground(Color.decode("#CCCC00"));
        add(Buttun, BorderLayout.SOUTH);

        JButton save = new JButton("Save");
        save.setMinimumSize(new Dimension(80, 30));
        save.setPreferredSize(new Dimension(80, 30));
        Buttun.add(save);





        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = nameTxT.getText();
                String lname = lnameTxT.getText();
                String usern = userTxT.getText();
                String passwo = passTxT.getText();
                String email = emailTxT.getText();
                String phone = phoneTxT.getText();
                Visitor visitor = new Visitor(name, lname, usern, passwo, email, phone);
                visitors.add(visitor);
                System.out.println(name);

                VisitorPageFrame visitorPageFrame = new VisitorPageFrame();
                visitorPageFrame.setVisible(true);
                setVisible(false);

            }
        });
    }
}
