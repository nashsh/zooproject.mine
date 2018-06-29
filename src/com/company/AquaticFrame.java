package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AquaticFrame extends JFrame {
    AquaticAdd aquaticAdd = new AquaticAdd();
    AquaticShow aquaticShow = new AquaticShow();
AquaticDelete aquaticDelete=new AquaticDelete();
AquaticEdit aquaticEdit=new AquaticEdit();
    public AquaticFrame() {

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
        centerPanel.add(aquaticAdd);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(aquaticAdd);
        aquaticAdd.setVisible(false);
        AquaticAdd panel = new AquaticAdd();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(aquaticShow);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(aquaticShow);
        aquaticShow.setVisible(false);
        AquaticShow ash = new AquaticShow();//aquatic show
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(aquaticEdit);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(aquaticEdit);
        aquaticEdit.setVisible(false);
        AquaticEdit ae = new AquaticEdit();//aquatic edit
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(aquaticDelete);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(aquaticDelete);
        aquaticDelete.setVisible(false);
        AquaticDelete ad = new AquaticDelete();//aquatic delete
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
                aquaticAdd.setVisible(true);
                aquaticShow.setVisible(false);
                aquaticDelete.setVisible(false);
                aquaticEdit.setVisible(false);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aquaticDelete.setVisible(false);
                aquaticAdd.setVisible(false);
                aquaticShow.setVisible(true);
                aquaticEdit.setVisible(false);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aquaticDelete.setVisible(true);
                aquaticAdd.setVisible(false);
                aquaticShow.setVisible(false);
                aquaticEdit.setVisible(false);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                aquaticDelete.setVisible(false);
                aquaticAdd.setVisible(false);
                aquaticShow.setVisible(false);
                aquaticEdit.setVisible(true);

            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
