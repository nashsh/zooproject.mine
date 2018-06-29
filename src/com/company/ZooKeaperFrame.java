package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZooKeaperFrame extends JFrame {

    Manager_ZooKeaper_Add manager_zooKeaper_add = new Manager_ZooKeaper_Add();
    Manager_ZooKeaper_Delete manager_zooKeaper_delete = new Manager_ZooKeaper_Delete();
    Manager_ZooKeaper_Show manager_zooKeaper_show = new Manager_ZooKeaper_Show();
    Manager_ZooKeaper_edit manager_zooKeaper_edit = new Manager_ZooKeaper_edit();


    public ZooKeaperFrame() {

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
        centerPanel.add(manager_zooKeaper_add);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(manager_zooKeaper_add);
        manager_zooKeaper_add.setVisible(false);
        Manager_ZooKeaper_Add panel = new Manager_ZooKeaper_Add();
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(manager_zooKeaper_delete);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(manager_zooKeaper_delete);
        manager_zooKeaper_delete.setVisible(false);
        Manager_ZooKeaper_Delete mzd = new Manager_ZooKeaper_Delete();//manager  zookeaper delete
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(manager_zooKeaper_edit);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(manager_zooKeaper_edit);
        manager_zooKeaper_edit.setVisible(false);
        Manager_ZooKeaper_edit mze = new Manager_ZooKeaper_edit();//manager  zookeaper edit
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(manager_zooKeaper_show);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(manager_zooKeaper_show);
        manager_zooKeaper_show.setVisible(false);
        Manager_ZooKeaper_Show mzsh = new Manager_ZooKeaper_Show();//manager  zookeaper edit
        centerPanel.add(Panel);


        JButton btn1 = new JButton("Back ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);

        JButton btn2 = new JButton("Add");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn3 = new JButton("Edit");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);

        JButton btn4 = new JButton("Show");
        btn4.setMinimumSize(new Dimension(120, 65));
        btn4.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn4, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("Delete");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Manager_manager manager_manager = new Manager_manager();
                manager_manager.setVisible(true);
                setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                manager_zooKeaper_add.setVisible(true);
                manager_zooKeaper_delete.setVisible(false);
                manager_zooKeaper_show.setVisible(false);
                manager_zooKeaper_edit.setVisible(false);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                manager_zooKeaper_add.setVisible(false);
                manager_zooKeaper_delete.setVisible(true);
                manager_zooKeaper_show.setVisible(false);
                manager_zooKeaper_edit.setVisible(false);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                manager_zooKeaper_add.setVisible(false);
                manager_zooKeaper_delete.setVisible(false);
                manager_zooKeaper_show.setVisible(true);
                manager_zooKeaper_edit.setVisible(false);
            }
        });


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                manager_zooKeaper_add.setVisible(false);
                manager_zooKeaper_delete.setVisible(false);
                manager_zooKeaper_show.setVisible(false);
                manager_zooKeaper_edit.setVisible(true);
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
