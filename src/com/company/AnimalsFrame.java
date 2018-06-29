package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalsFrame extends JFrame {

    public AnimalsFrame() {
        setMinimumSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(1000, 500));

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


//        JPanel centerPanel = new JPanel();
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.add(addManager);
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.setBackground(Color.decode("#CCCC00"));
//        centerPanel.add(addManager);
//        addManager.setVisible(false);
//        AddManager panel = new AddManager();
//        centerPanel.add(Panel);
//
//
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.add(editManager);
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.setBackground(Color.decode("#CCCC00"));
//        centerPanel.add(editManager);
//        editManager.setVisible(false);
//        EditManager panell = new EditManager();//edit manager
//        centerPanel.add(Panel);
//
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.add(showManagers);
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.setBackground(Color.decode("#CCCC00"));
//        centerPanel.add(showManagers);
//        showManagers.setVisible(false);
//        ShowManagers paanel = new ShowManagers();//show manager
//        centerPanel.add(Panel);
//
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.add(deleteManager);
//        add(centerPanel, BorderLayout.CENTER);
//        centerPanel.setBackground(Color.decode("#CCCC00"));
//        centerPanel.add(deleteManager);
//        deleteManager.setVisible(false);
//        DeleteManager pannel = new DeleteManager();//show manager
//        centerPanel.add(Panel);



        JButton btn1 = new JButton("Aquatic");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);

        JButton btn2 = new JButton("Birds");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn3 = new JButton("Wild");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);

        JButton btn4 = new JButton("Back");
        btn4.setMinimumSize(new Dimension(120, 65));
        btn4.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn4, BoxLayout.X_AXIS);




        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AquaticFrame aquaticFrame=new AquaticFrame();
                aquaticFrame.setVisible(true);
                setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BirdsFrame birdsFrame=new BirdsFrame();
                birdsFrame.setVisible(true);
                setVisible(false);
            }
        });

//        btn4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                showManagers.setVisible(true);
//                addManager.setVisible(false);
//                editManager.setVisible(false);
//                showManagers.setVisible(true);
//                deleteManager.setVisible(false);
//            }
//        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WildFrame wildFrame=new WildFrame();
                wildFrame.setVisible(true);
                setVisible(false);
                Manager_manager manager_manager=new Manager_manager();
                manager_manager.setVisible(false);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               Manager_manager manager_manager=new Manager_manager();
               manager_manager.setVisible(true);
                setVisible(false);
            }
        });


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

