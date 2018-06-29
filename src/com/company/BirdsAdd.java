package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class BirdsAdd extends JPanel {
    static ArrayList<Birds> birdsArrayList = new ArrayList<Birds>();

    public BirdsAdd() {


        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        Aquatic aquatic = new Aquatic();


        JPanel Panel = new JPanel();

        JTextField NationaTxT = new JTextField("Nationality");
        NationaTxT.setMinimumSize(new Dimension(10, 10));
        NationaTxT.setPreferredSize(new Dimension(10, 10));
        add(NationaTxT);
        JTextField NationalidTxT = new JTextField("National Id");
        NationalidTxT.setPreferredSize(new Dimension(10, 10));
        add(NationalidTxT);
        JTextField SexTxT = new JTextField("Sex");
        SexTxT.setMinimumSize(new Dimension(10, 10));
        SexTxT.setPreferredSize(new Dimension(10, 10));
        add(SexTxT);
        JTextField InsuranceTxT = new JTextField("Insurance");
        InsuranceTxT.setMinimumSize(new Dimension(10, 10));
        InsuranceTxT.setPreferredSize(new Dimension(10, 10));
        add(InsuranceTxT);
        JTextField FoodTxT = new JTextField("Food");
        FoodTxT.setMinimumSize(new Dimension(10, 10));
        FoodTxT.setPreferredSize(new Dimension(10, 10));
        add(FoodTxT);
        JTextField wildTxT = new JTextField("Wild");
        wildTxT.setMinimumSize(new Dimension(10, 10));
        wildTxT.setPreferredSize(new Dimension(10, 10));
        add(wildTxT);
        JTextField departemanTxT = new JTextField("Departeman");
        departemanTxT.setMinimumSize(new Dimension(10, 10));
        departemanTxT.setPreferredSize(new Dimension(10, 10));
        add(wildTxT);
        JTextField priceTxT = new JTextField("Departeman");
        priceTxT.setMinimumSize(new Dimension(10, 10));
        priceTxT.setPreferredSize(new Dimension(10, 10));
        add(priceTxT);


        JPanel Buttun = new JPanel();
        Buttun.setMinimumSize(new Dimension(100, 100));
        Buttun.setPreferredSize(new Dimension(100, 100));
        Buttun.setBackground(Color.decode("#CCCC00"));
        add(Buttun, BorderLayout.SOUTH);

        JButton save = new JButton("Save");
        save.setMinimumSize(new Dimension(80, 30));
        save.setPreferredSize(new Dimension(80, 30));

        JButton add = new JButton("Add");
        add.setMinimumSize(new Dimension(80, 30));
        add.setPreferredSize(new Dimension(80, 30));

        add(NationaTxT);
        add(NationalidTxT);
        add(SexTxT);
        add(InsuranceTxT);
        add(FoodTxT);
        add(wildTxT);
        add(priceTxT);

        add(Buttun);
        Buttun.add(save);
        Buttun.add(add);

        NationalidTxT.setEditable(false);
        NationaTxT.setEditable(false);
        SexTxT.setEditable(false);
        InsuranceTxT.setEditable(false);
        FoodTxT.setEditable(false);
        wildTxT.setEditable(false);
        departemanTxT.setEditable(false);
        priceTxT.setEditable(false);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                NationalidTxT.setEditable(true);
                NationaTxT.setEditable(true);
                SexTxT.setEditable(true);
                InsuranceTxT.setEditable(true);
                FoodTxT.setEditable(true);
                wildTxT.setEditable(true);
                departemanTxT.setEditable(true);
                priceTxT.setEditable(true);

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
                NationalidTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        NationalidTxT.setText("");
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
                SexTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        SexTxT.setText("");
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
                FoodTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        FoodTxT.setText("");
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
                InsuranceTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        InsuranceTxT.setText("");
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
                wildTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        wildTxT.setText("");
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
                departemanTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        departemanTxT.setText(" ");
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

                priceTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        priceTxT.setText(" ");
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

                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String nationaTxT = NationaTxT.getText();
                        String nationalidTxT = NationalidTxT.getText();
                        String sexTxT = SexTxT.getText();
                        String foodTxT = FoodTxT.getText();
                        String insuranceTxT = InsuranceTxT.getText();
                        //   Boolean comivirous = Boolean.getBoolean(ComivirousTxT.getText());
                        String wild = wildTxT.getText();
                        String depart = departemanTxT.getText();
                        String price=priceTxT.getText();
                        if (wild.equals("true") || wild.equals("false")) {

                            Birds birds = new Birds(nationaTxT, nationalidTxT, sexTxT, insuranceTxT, foodTxT, wild);
                            birdsArrayList.add(birds);

                            NationalidTxT.setEditable(false);
                            NationaTxT.setEditable(false);
                            SexTxT.setEditable(false);
                            InsuranceTxT.setEditable(false);
                            FoodTxT.setEditable(false);
                            wildTxT.setEditable(false);
                            departemanTxT.setEditable(false);
                            priceTxT.setEditable(false);

                            if (departemanTxT.getText().equals("Birds")) {
                                DepartemanBirds departemanBirds = new DepartemanBirds(nationaTxT, nationalidTxT, sexTxT, insuranceTxT, foodTxT, wild, depart);
                                DepartemanBirds.departemanBirds.add(departemanBirds);
                            } else {
                                departemanTxT.setText("wrong ! press add again");
                                departemanTxT.setEditable(false);
                            }

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
                                t.addRow(new Object[]{BirdsAdd.birdsArrayList.get(i).getNationality(), BirdsAdd.birdsArrayList.get(i).getNationalid(), BirdsAdd.birdsArrayList.get(i).getSex(), BirdsAdd.birdsArrayList.get(i).getInsurance(), BirdsAdd.birdsArrayList.get(i).getFood(), BirdsAdd.birdsArrayList.get(i).getWild()});
                            }


                        } else {
                            wildTxT.setText("wrong ! press add again");
                            wildTxT.setEditable(false);

                        }
                    }
                });
            }
        });
    }
}
