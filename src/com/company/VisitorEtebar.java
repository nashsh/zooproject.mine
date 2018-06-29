package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VisitorEtebar extends JPanel {

    public VisitorEtebar() {

        Visitor v = new Visitor();
        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));



        JPanel Panel = new JPanel();

        JTextField NationaTxT = new JTextField(v.getEtebar());
        NationaTxT.setMinimumSize(new Dimension(10, 10));
        NationaTxT.setPreferredSize(new Dimension(10, 10));
        add(NationaTxT);

        JButton save = new JButton("Save");
        save.setMinimumSize(new Dimension(80, 30));
        save.setPreferredSize(new Dimension(80, 30));
        add(save);
        NationaTxT.setEditable(false);

        NationaTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                NationaTxT.setText("");
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
        NationaTxT.setEditable(true);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String etebar = NationaTxT.getText();
//                v.etebare(etebar);
                NationaTxT.setEditable(false);
                NationaTxT.setText(v.etebare(etebar));
                if (NationaTxT.getText().equals("Wrong !")){
                    NationaTxT.setEditable(true);
                }
            }
        });


    }

}
