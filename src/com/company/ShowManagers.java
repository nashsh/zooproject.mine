package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;

public class ShowManagers extends JPanel {

    public ShowManagers() {


        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.decode("#CCCC00"));

        JPanel panel = new JPanel();
        panel.setMinimumSize(new Dimension(400, 400));
        panel.setPreferredSize(new Dimension(400, 400));
        panel.setBackground(Color.decode("#CCCC00"));
        add(panel);
        try {
            Manager.read();
        } catch (Exception e) {
            System.out.println( e.getMessage());
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

        table.setModel(t);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setMinimumSize((new Dimension(400, 400)));
        scrollPane.setPreferredSize(new Dimension(400, 400));
        panel.add(scrollPane);

    }

}

