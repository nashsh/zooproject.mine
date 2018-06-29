package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class VisitorComent extends JPanel {
Visitor vis=new Visitor();
static ArrayList<Visitor> coments=new ArrayList<Visitor>();
    public VisitorComent() {

        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        setBackground(Color.decode("#CCCC00"));


        final JTextField text1 = new JTextField("Coment");
        text1.setMinimumSize(new Dimension(100, 100));
        text1.setPreferredSize(new Dimension(100, 100));
        add(text1);

        final JButton btnsave = new JButton("Save ");
        add(btnsave);


text1.setEditable(true);
        text1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                text1.setText("");
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
        text1.setEditable(true);
        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text1.setEditable(false);
                for (int i = 0; i < VisitorLoginFrame.visitors.size(); i++) {
                        String coment = text1.getText();
                       vis.setComent(coment);
                       Visitor v = new Visitor( vis.getComent());
                      System.out.println(vis.getComent());
                     //   VisitorLoginFrame.visitors.add(v);
                    coments.add(v);
                        break;
                    }

                text1.setEditable(false);
            }
        });
    }

}
