package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ZooKeeper_Edit extends JPanel {


    public ZooKeeper_Edit() {
        ZooKeaper zooKeaper;
        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        setBackground(Color.decode("#CCCC00"));
        zooKeaper = new ZooKeaper();

        JLabel searchLbL = new JLabel("Search Zookeaper");
        JTextField searchTxT = new JTextField(" username Zookeaper you want search");
        searchTxT.setMinimumSize(new Dimension(50, 30));
        searchTxT.setPreferredSize(new Dimension(50, 30));
        add(searchLbL);
        add(searchTxT);

        JPanel Buttun = new JPanel();
        JButton searchBtn = new JButton("Search");
        add(searchBtn);


        JLabel lbl1 = new JLabel(" First Name");
        JLabel lbl2 = new JLabel(" Last Name");
        JLabel lbl3 = new JLabel(" UserName");
        JLabel lbl4 = new JLabel(" Password");
        JLabel lbl5 = new JLabel(" Email");
        JLabel lbl6 = new JLabel(" PhoneNum");
        JLabel lbl7 = new JLabel(" Adress");


        final JTextField text1 = new JTextField();
        final JTextField text2 = new JTextField();
        final JTextField text3 = new JTextField();
        final JTextField text4 = new JTextField();
        final JTextField text5 = new JTextField();
        final JTextField text6 = new JTextField();
        final JTextField text7 = new JTextField();


        JPanel panel = new JPanel();
        final JButton btnsave = new JButton("Save ");
        final JButton btnedit = new JButton("Edit");


        searchTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                searchTxT.setText("");
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
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0; i < Manager_ZooKeaper_Add.zooKeapers.size(); i++) {
                    String search = searchTxT.getText();
                    if (search.equals(Manager_ZooKeaper_Add.zooKeapers.get(i).getUsername())) {
                        text1.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getFirstname());
                        text2.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getLastname());
                        text3.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getUsername());
                        text4.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getPassword());
                        text5.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getMail());
                        text6.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getPhonenum());
                        text7.setText(Manager_ZooKeaper_Add.zooKeapers.get(i).getAddress());
                        int id = i;

                        btnsave.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setFirstname(text1.getText());
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setLastname(text2.getText());
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setUsername(text3.getText());
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setPassword(text4.getText());
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setMail(text5.getText());
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setPhonenum(text6.getText());
                                Manager_ZooKeaper_Add.zooKeapers.get(id).setAddress(text7.getText());

                                text1.setEditable(false);
                                text2.setEditable(false);
                                text3.setEditable(false);
                                text4.setEditable(false);
                                text5.setEditable(false);
                                text6.setEditable(false);
                                text7.setEditable(false);
                                btnedit.setText("Edit");
                            }
                        });


                    }

                }


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

        panel.add(btnsave);
        panel.add(btnedit);
        add(panel);


    }
}
