package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Belit_Wild extends JPanel {
    DepartemanWild departemanWild = new DepartemanWild();

    public Belit_Wild() {

        setMinimumSize(new Dimension(200, 200));
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        Aquatic aquatic = new Aquatic();


        JPanel Panel = new JPanel();

        JTextField AquaticTxT = new JTextField("Wild price ");
        AquaticTxT.setMinimumSize(new Dimension(100, 70));
        AquaticTxT.setPreferredSize(new Dimension(100, 70));
        add(AquaticTxT);

        AquaticTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                AquaticTxT.setText(" ");
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


        JButton set = new JButton("Set");
        set.setMinimumSize(new Dimension(100, 80));
        set.setPreferredSize(new Dimension(100, 80));
        add(set);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                departemanWild.setPrice(AquaticTxT.getText());
                System.out.println(" wild price set shood");
            }
        });

    }

}
