package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BirdsFrame extends JFrame {

    BirdsAdd birdsAdd = new BirdsAdd();
    BirdsDelete birdsDelete = new BirdsDelete();
    BirdsEdit birdsEdit = new BirdsEdit();
    BirdsShow birdsShow = new BirdsShow();

    public BirdsFrame() {


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
        centerPanel.add(birdsAdd);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(birdsAdd);
        birdsAdd.setVisible(false);
        BirdsAdd panel = new BirdsAdd();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(birdsDelete);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(birdsDelete);
        birdsDelete.setVisible(false);
        BirdsDelete badd = new BirdsDelete();//birds add
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(birdsEdit);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(birdsEdit);
        birdsEdit.setVisible(false);
        BirdsEdit be = new BirdsEdit();//birds edit
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(birdsShow);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(birdsShow);
        birdsShow.setVisible(false);
        BirdsEdit bed = new BirdsEdit();//Birds edit
        centerPanel.add(Panel);


        JButton btn1 = new JButton("Back ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);

        JButton btn2 = new JButton("Add");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("Edit");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        JButton btn6 = new JButton("Delete");
        btn6.setMinimumSize(new Dimension(120, 65));
        btn6.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn6, BoxLayout.X_AXIS);

        JButton btn7 = new JButton("Show");
        btn7.setMinimumSize(new Dimension(120, 65));
        btn7.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn7, BoxLayout.X_AXIS);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnimalsFrame animalsFrame = new AnimalsFrame();
                animalsFrame.setVisible(true);
                setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                birdsAdd.setVisible(true);
                birdsDelete.setVisible(false);
                birdsEdit.setVisible(false);
                birdsShow.setVisible(false);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                birdsAdd.setVisible(false);
                birdsDelete.setVisible(false);
                birdsShow.setVisible(true);
                birdsEdit.setVisible(false);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                birdsDelete.setVisible(true);
                birdsAdd.setVisible(false);
                birdsShow.setVisible(false);
                birdsEdit.setVisible(false);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                birdsDelete.setVisible(false);
                birdsAdd.setVisible(false);
                birdsShow.setVisible(false);
                birdsEdit.setVisible(true);

            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
