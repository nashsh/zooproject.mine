package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Manager_manager_coments extends JPanel {

    public Manager_manager_coments() {

        setMinimumSize(new Dimension(400,400));
        setPreferredSize(new Dimension(400,400));

        int row = VisitorLoginFrame.visitors.size();
        String[] columName = {"Comment"};
        DefaultTableModel t = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable table = new JTable(t);
        table.setOpaque(false);
        t.addColumn(columName[0]);

        for(int i=0;i<VisitorLoginFrame.visitors.size();i++){

            t.addRow(new Object[]{VisitorComent.coments.get(i).getComent()
            });
        }

        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(390, 360));
        scroll.setMinimumSize(new Dimension(390, 360));
        add(scroll);
    }

}
