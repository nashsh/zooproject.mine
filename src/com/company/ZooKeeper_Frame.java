package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZooKeeper_Frame extends JFrame {
    ZooKeeper_Show zooKeeper_show = new ZooKeeper_Show();
    ZooKeeper_Edit zooKeeper_edit = new ZooKeeper_Edit();

    public ZooKeeper_Frame() {


        setMinimumSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(1000, 500));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.decode("#CCCC00"));
        Panel.setMinimumSize(new Dimension(1000, 500));
        Panel.setPreferredSize(new Dimension(1000, 500));
        add(Panel);

        JPanel upPanel = new JPanel();
        upPanel.setBackground(Color.decode("#CCCC00"));
        upPanel.setMinimumSize(new Dimension(50, 400));
        upPanel.setPreferredSize(new Dimension(50, 400));
        Panel.add(upPanel, BorderLayout.NORTH);
        Panel.add(upPanel, BorderLayout.NORTH);


        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(zooKeeper_show);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(zooKeeper_show);
        zooKeeper_show.setVisible(false);
        ZooKeeper_Show panel = new ZooKeeper_Show();
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(zooKeeper_edit);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(zooKeeper_edit);
        zooKeeper_edit.setVisible(false);
        ZooKeeper_Edit ze = new ZooKeeper_Edit();//  zookeaper edit
        centerPanel.add(Panel);
//
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.add(manager_zooKeaper_edit);
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.setBackground(Color.decode("#CCCC00"));
//        centerPanel.add(manager_zooKeaper_edit);
//        manager_zooKeaper_edit.setVisible(false);
//        Manager_ZooKeaper_edit mze = new Manager_ZooKeaper_edit();//manager  zookeaper edit
//        centerPanel.add(Panel);


        JButton btn1 = new JButton("Logout ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);

        JButton btn2 = new JButton("Show");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn3 = new JButton("Edit");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Login login = new Login();
                login.setVisible(true);
                setVisible(false);
            }
        });


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zooKeeper_show.setVisible(true);

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zooKeeper_show.setVisible(false);
                zooKeeper_edit.setVisible(true);
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

}
