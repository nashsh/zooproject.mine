package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Manager_Belit_Daramad extends JPanel {
    DepartemanWild dw = new DepartemanWild();
    DepartemanBirds db = new DepartemanBirds();
    DepartemanAquatic da = new DepartemanAquatic();

    public Manager_Belit_Daramad() {

        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));

        JTextField tedadTxT = new JTextField("Daramad");
        tedadTxT.setMinimumSize(new Dimension(10, 10));
        tedadTxT.setPreferredSize(new Dimension(10, 10));
        add(tedadTxT);

        JButton add = new JButton("Show");
        add.setMinimumSize(new Dimension(80, 30));
        add.setPreferredSize(new Dimension(80, 30));
        add(add);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tedadTxT.setText("20500");
            }
        });


    }

}
