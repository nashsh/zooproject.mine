package com.company;

import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;

public class DeleteManager extends JPanel {

    public DeleteManager() {
        setMinimumSize(new Dimension(200, 400));
        setMaximumSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));


        EmptyBorder empty = new EmptyBorder(10, 0, 0, 0);
        JLabel searchLbL = new JLabel("Remove Manager");

        JTextField searchTxT = new JTextField(" Username Manger");
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

                for (int i = 0; i < AddManager.managers.size(); i++) {
                    if (user.equals(AddManager.managers.get(i).getUsername())) {
                        AddManager.managers.remove(i);
                    }
                }

                String[] colName = {"fname", "lname", "username", "password", "Email", "phone", "adress", "wage"};
                JTable table = new JTable(0, 4);


                DefaultTableModel t = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };

                t.addColumn(colName[0]);
                t.addColumn(colName[1]);
                t.addColumn(colName[2]);
                t.addColumn(colName[3]);
                t.addColumn(colName[4]);
                t.addColumn(colName[5]);
                t.addColumn(colName[6]);
                t.addColumn(colName[7]);
//        t.addColumn(colName[8]);

                int row = AddManager.managers.size();
                for (int i = 0; i < row; i++) {
                    t.addRow(new Object[]{AddManager.managers.get(i).getFirstname(), AddManager.managers.get(i).getLastname(), AddManager.managers.get(i).getUsername(), AddManager.managers.get(i).getPassword(), AddManager.managers.get(i).getMail(), AddManager.managers.get(i).getPhonenum(), AddManager.managers.get(i).getAddress(), AddManager.managers.get(i).getWage()});
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
