package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager_Belit extends JFrame {

    Belit_Departeman belit_departeman = new Belit_Departeman();
    Manager_Belit_Daramad mbd = new Manager_Belit_Daramad();

    public Manager_Belit() {


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
        centerPanel.add(mbd);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(mbd);
        mbd.setVisible(false);
        Manager_Belit_Daramad panel = new Manager_Belit_Daramad();
        centerPanel.add(Panel);


//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.add(manager_showmanager);
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.setBackground(Color.decode("#CCCC00"));
//        centerPanel.add(manager_showmanager);
//        manager_showmanager.setVisible(false);
//        Manager_showmanager mshm = new Manager_showmanager();//manager show
//        centerPanel.add(Panel);

        JButton btn1 = new JButton("Back ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);


        JButton btn2 = new JButton("Daramad");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("Jarime");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        JButton btn6 = new JButton("Takhfif");
        btn6.setMinimumSize(new Dimension(120, 65));
        btn6.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn6, BoxLayout.X_AXIS);

        JButton btn7 = new JButton("Departeman");
        btn7.setMinimumSize(new Dimension(120, 65));
        btn7.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn7, BoxLayout.X_AXIS);


        JButton btn3 = new JButton("belit kharide ");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Manager_manager manager_manager = new Manager_manager();
                setVisible(false);
                manager_manager.setVisible(true);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mbd.setVisible(true);
            }
        });
//        btn3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//
//                manager_editmanager.setVisible(true);
//                manager_showmanager.setVisible(false);
//            }
//        });
//        btn4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                manager_showmanager.setVisible(true);
//                manager_editmanager.setVisible(false);
//            }
//        });

//        btn5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                AnimalsFrame animalsFrame = new AnimalsFrame();
//                animalsFrame.setVisible(true);
//                setVisible(false);
//
//            }
//        });
//
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                belit_departeman.setVisible(true);
                setVisible(false);

            }
        });


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
