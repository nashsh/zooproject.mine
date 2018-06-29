package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AquaticDelete extends JPanel {

    public AquaticDelete() {

        setMinimumSize(new Dimension(200, 400));
        setMaximumSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));


        EmptyBorder empty = new EmptyBorder(10, 0, 0, 0);
        JLabel searchLbL = new JLabel("Remove Aquatic");

        JTextField searchTxT = new JTextField("National id");
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

                for (int i = 0; i < AquaticAdd.aquatics.size(); i++) {
                    if (user.equals(AquaticAdd.aquatics.get(i).getNationalid())) {
                        AquaticAdd.aquatics.remove(i);
                    }
                }

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

            }
        });

        searchLbL.setBorder(empty);

        add(searchLbL);
        add(searchTxT);


        add(Buttun);
        add(removeBtn);
    }
}