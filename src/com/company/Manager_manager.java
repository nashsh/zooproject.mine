package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager_manager extends JFrame {
    Manager_editmanager manager_editmanager = new Manager_editmanager();
    Manager_showmanager manager_showmanager = new Manager_showmanager();
    Manager_manager_coments mmc = new Manager_manager_coments();

    public Manager_manager() {
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
        centerPanel.add(manager_editmanager);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(manager_editmanager);
        manager_editmanager.setVisible(false);
        ShowInfoSuperAdmin panel = new ShowInfoSuperAdmin();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(manager_showmanager);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(manager_showmanager);
        manager_showmanager.setVisible(false);
        Manager_showmanager mshm = new Manager_showmanager();//manager show
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(mmc);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(mmc);
        mmc.setVisible(false);
        Manager_manager_coments mdmc = new Manager_manager_coments();//manager coments
        centerPanel.add(Panel);

        JButton btn1 = new JButton("Logout ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);


        JButton btn2 = new JButton("ZooKeaper");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("Animals");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        JButton btn6 = new JButton("Coments");
        btn6.setMinimumSize(new Dimension(120, 65));
        btn6.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn6, BoxLayout.X_AXIS);

        JButton btn7 = new JButton("Belit");
        btn7.setMinimumSize(new Dimension(120, 65));
        btn7.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn7, BoxLayout.X_AXIS);


        JButton btn3 = new JButton("Edit");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);

        JButton btn4 = new JButton("Show");
        btn4.setMinimumSize(new Dimension(120, 65));
        btn4.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn4, BoxLayout.X_AXIS);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Login login = new Login();
                setVisible(false);
                login.setVisible(true);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                manager_editmanager.setVisible(false);
                manager_showmanager.setVisible(false);
                ZooKeaperFrame zooKeaperFrame = new ZooKeaperFrame();
                zooKeaperFrame.setVisible(true);
                setVisible(false);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mmc.setVisible(false);
                manager_editmanager.setVisible(true);
                manager_showmanager.setVisible(false);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                manager_showmanager.setVisible(true);
                manager_editmanager.setVisible(false);
                mmc.setVisible(false);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnimalsFrame animalsFrame = new AnimalsFrame();
                animalsFrame.setVisible(true);
                setVisible(false);

            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Manager_Belit mb = new Manager_Belit();
                mb.setVisible(true);
                setVisible(false);

            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                mmc.setVisible(true);
                manager_showmanager.setVisible(false);
                manager_editmanager.setVisible(false);
                mmc.setVisible(true);
                System.out.println("read kard mmc ro");
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


