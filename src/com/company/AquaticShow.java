package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AquaticShow extends JPanel {
    public AquaticShow() {


        setMinimumSize(new Dimension(400, 400));
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.decode("#CCCC00"));

        JPanel panel = new JPanel();
        panel.setMinimumSize(new Dimension(400, 400));
        panel.setPreferredSize(new Dimension(400, 400));
        panel.setBackground(Color.decode("#CCCC00"));
        add(panel);

        String[] colName = {"nationality", "nationalid", "sex", "insurance", "food", "camivorous"};
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


        int row = AquaticAdd.aquatics.size();
        for (int i = 0; i < row; i++) {
            t.addRow(new Object[]{AquaticAdd.aquatics.get(i).getNationality(), AquaticAdd.aquatics.get(i).getNationalid(), AquaticAdd.aquatics.get(i).getSex(), AquaticAdd.aquatics.get(i).getInsurance(), AquaticAdd.aquatics.get(i).getFood(), AquaticAdd.aquatics.get(i).getCamivorous()});
        }
        table.setModel(t);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setMinimumSize((new Dimension(400, 400)));
        scrollPane.setPreferredSize(new Dimension(400, 400));
        panel.add(scrollPane);
    }

}

