package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VisitorDeleteBelit extends JPanel {

    public VisitorDeleteBelit() {

        setMinimumSize(new Dimension(200, 400));
        setMaximumSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));


        EmptyBorder empty = new EmptyBorder(10, 0, 0, 0);
        JLabel searchLbL = new JLabel("Remove Belit");

        JTextField searchTxT = new JTextField("UsernameVisitor");
        searchLbL.setMinimumSize(new Dimension(150, 30));
        searchLbL.setPreferredSize(new Dimension(150, 30));
        add(searchLbL);


        JPanel Buttun = new JPanel();
        JButton removeBtn = new JButton("Remove");

        searchTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                searchTxT.setText("");
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

        removeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                searchTxT.setEditable(false);
                String user = searchTxT.getText();

                for (int i = 0; i < VisitorBelit.visitorsbelit.size(); i++) {
                    if (user.equals(VisitorBelit.visitorsbelit.get(i).getUsername())) {
                        VisitorBelit.visitorsbelit.remove(i);
                    }
                }
            }
        });

        searchLbL.setBorder(empty);

        add(searchLbL);
        add(searchTxT);

        add(Buttun);
        add(removeBtn);

    }
}
