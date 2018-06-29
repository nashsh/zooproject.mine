package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WildFrame extends JFrame {
    WildAdd wildAdd = new WildAdd();
    WildEdit wildEdit = new WildEdit();
    WildDelete wildDelete = new WildDelete();
    WildShow wildShow = new WildShow();

    public WildFrame() {


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
        centerPanel.add(wildAdd);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(wildAdd);
        wildAdd.setVisible(false);
        WildAdd panel = new WildAdd();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(wildDelete);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(wildDelete);
        wildDelete.setVisible(false);
        WildDelete wd = new WildDelete();//wild delete
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(wildEdit);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(wildEdit);
        wildEdit.setVisible(false);
        WildEdit we = new WildEdit();//wild edit
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(wildShow);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(wildShow);
        wildShow.setVisible(false);
        WildShow wsh = new WildShow();//wild edit
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
                wildAdd.setVisible(true);
               wildDelete.setVisible(false);
                wildEdit.setVisible(false);
                wildShow.setVisible(false);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wildAdd.setVisible(false);
                wildDelete.setVisible(false);
                wildShow.setVisible(true);
                wildEdit.setVisible(false);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wildDelete.setVisible(true);
                wildAdd.setVisible(false);
                wildShow.setVisible(false);
                wildEdit.setVisible(false);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wildDelete.setVisible(false);
                wildAdd.setVisible(false);
                wildShow.setVisible(false);
                wildEdit.setVisible(true);

            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
