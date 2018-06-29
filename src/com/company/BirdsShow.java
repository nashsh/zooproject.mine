package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BirdsShow extends JPanel {


    public BirdsShow() {


        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.decode("#CCCC00"));

        JPanel panel = new JPanel();
        panel.setMinimumSize(new Dimension(400, 400));
        panel.setPreferredSize(new Dimension(400, 400));
        panel.setBackground(Color.decode("#CCCC00"));
        add(panel);

        String[] colName = {"nationality", "nationalid", "sex", "insurance", "food", "Wild"};
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


        int row = BirdsAdd.birdsArrayList.size();
        for (int i = 0; i < row; i++) {
            t.addRow(new Object[]{BirdsAdd.birdsArrayList.get(i).getNationality(), BirdsAdd.birdsArrayList.get(i).getNationalid(), BirdsAdd.birdsArrayList.get(i).getSex(), BirdsAdd.birdsArrayList.get(i).getInsurance(), BirdsAdd.birdsArrayList.get(i).getFood(),BirdsAdd.birdsArrayList.get(i).getWild()});
        }
        table.setModel(t);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setMinimumSize((new Dimension(400, 400)));
        scrollPane.setPreferredSize(new Dimension(400, 400));
        panel.add(scrollPane);


    }
}
