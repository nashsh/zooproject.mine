package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Manager_ZooKeaper_Add extends JPanel {
    static ZooKeaper zooKeaper;
    static ArrayList<ZooKeaper> zooKeapers = new ArrayList<ZooKeaper>();

    public Manager_ZooKeaper_Add() {

        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        ZooKeaper zooKeaper = new ZooKeaper();


        JPanel Panel = new JPanel();

        JTextField NameTxT = new JTextField("Name");
        NameTxT.setMinimumSize(new Dimension(10, 10));
        NameTxT.setPreferredSize(new Dimension(10, 10));
        add(NameTxT);
        JTextField lastnameTxT = new JTextField(" Last Name");
        lastnameTxT.setPreferredSize(new Dimension(10, 10));
        add(lastnameTxT);
        JTextField usernameTxT = new JTextField("UserName");
        usernameTxT.setMinimumSize(new Dimension(10, 10));
        usernameTxT.setPreferredSize(new Dimension(10, 10));
        add(usernameTxT);
        JTextField passTxT = new JTextField("Pass");
        passTxT.setMinimumSize(new Dimension(10, 10));
        passTxT.setPreferredSize(new Dimension(10, 10));
        add(passTxT);
        JTextField mailTxT = new JTextField("Email");
        mailTxT.setMinimumSize(new Dimension(10, 10));
        mailTxT.setPreferredSize(new Dimension(10, 10));
        add(mailTxT);
        JTextField phoneTxT = new JTextField("Phone Num");
        phoneTxT.setMinimumSize(new Dimension(10, 10));
        phoneTxT.setPreferredSize(new Dimension(10, 10));
        add(phoneTxT);
        JTextField adressTxT = new JTextField("Adress");
        adressTxT.setMinimumSize(new Dimension(10, 10));
        adressTxT.setPreferredSize(new Dimension(10, 10));
        add(adressTxT);
        JTextField wageTxT = new JTextField("Wage ");
        wageTxT.setMinimumSize(new Dimension(10, 10));
        wageTxT.setPreferredSize(new Dimension(10, 10));
        add(wageTxT);

        JTextField departemanTxT = new JTextField("Departeman ");
        departemanTxT.setMinimumSize(new Dimension(10, 10));
        departemanTxT.setPreferredSize(new Dimension(10, 10));
        add(departemanTxT);


        JPanel Buttun = new JPanel();
        Buttun.setMinimumSize(new Dimension(100, 100));
        Buttun.setPreferredSize(new Dimension(100, 100));
        Buttun.setBackground(Color.decode("#CCCC00"));
        add(Buttun, BorderLayout.SOUTH);

        JButton save = new JButton("Save");
        save.setMinimumSize(new Dimension(80, 30));
        save.setPreferredSize(new Dimension(80, 30));

        JButton add = new JButton("Add");
        add.setMinimumSize(new Dimension(80, 30));
        add.setPreferredSize(new Dimension(80, 30));

        add(NameTxT);
        add(lastnameTxT);

        add(Buttun);
        Buttun.add(save);
        Buttun.add(add);
        NameTxT.setEditable(false);
        lastnameTxT.setEditable(false);
        phoneTxT.setEditable(false);
        usernameTxT.setEditable(false);
        passTxT.setEditable(false);
        mailTxT.setEditable(false);
        adressTxT.setEditable(false);
        wageTxT.setEditable(false);
        departemanTxT.setEditable(false);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                NameTxT.setEditable(true);
                lastnameTxT.setEditable(true);
                phoneTxT.setEditable(true);
                usernameTxT.setEditable(true);
                passTxT.setEditable(true);
                mailTxT.setEditable(true);
                adressTxT.setEditable(true);
                wageTxT.setEditable(true);
                departemanTxT.setEditable(true);


                NameTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        NameTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                lastnameTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        lastnameTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                usernameTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        usernameTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                phoneTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        phoneTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                passTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        passTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                mailTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        mailTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                adressTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        adressTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                wageTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        wageTxT.setText("");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });
                departemanTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        departemanTxT.setText(" ");
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });


                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String name = NameTxT.getText();
                        String lname = lastnameTxT.getText();
                        String user = usernameTxT.getText();
                        String phone = phoneTxT.getText();
                        String pass = passTxT.getText();
                        String mail = mailTxT.getText();
                        String adress = adressTxT.getText();
                        String wage = wageTxT.getText();
                        String depart = departemanTxT.getText();


                        ZooKeaper zooKeaper = new ZooKeaper(name, lname, user, pass, mail, phone, adress, wage, depart);
                        zooKeapers.add(zooKeaper);
                        //System.out.println(zooKeapers.get(0).getFirstname());

                        NameTxT.setEditable(false);
                        lastnameTxT.setEditable(false);
                        phoneTxT.setEditable(false);
                        usernameTxT.setEditable(false);
                        passTxT.setEditable(false);
                        mailTxT.setEditable(false);
                        adressTxT.setEditable(false);
                        wageTxT.setEditable(false);
                        departemanTxT.setEditable(false);


                        if (departemanTxT.getText().equals("Aquatic")) {
                            DepartemanAquatic departemanAquatic = new DepartemanAquatic(name, lname, user, pass, mail, phone, adress, depart);
                            DepartemanAquatic.departemanAquatics_zookeaper.add(departemanAquatic);
                        }
                        if (departemanTxT.getText().equals("Birds")) {
                            DepartemanBirds departemanBirds = new DepartemanBirds(name, lname, user, pass, mail, phone, adress, depart);
                            DepartemanBirds.departemanBirds_zookeaper.add(departemanBirds);
                        }
                        if (departemanTxT.getText().equals("Wild")) {
                            DepartemanWild departemanWilds = new DepartemanWild(name, lname, user, pass, mail, phone, adress, depart);
                            DepartemanWild.departemanWilds_zookeaper.add(departemanWilds);
                        }

                    }
                });
            }

        });

    }
}