package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class WildAdd extends JPanel {

    static ArrayList<Wild> wilds = new ArrayList<Wild>();

    public WildAdd() {

        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        Wild wild=new Wild();


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
        JTextField homeTxT = new JTextField("Home");
        homeTxT.setMinimumSize(new Dimension(10, 10));
        homeTxT.setPreferredSize(new Dimension(10, 10));
        add(homeTxT);

        JTextField departTxT = new JTextField("departeman");
        departTxT.setMinimumSize(new Dimension(10, 10));
        departTxT.setPreferredSize(new Dimension(10, 10));
        add(departTxT);



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
        add(homeTxT);
        add(departTxT);


        add(Buttun);
        Buttun.add(save);
        Buttun.add(add);

        NationalidTxT.setEditable(false);
        NationaTxT.setEditable(false);
        SexTxT.setEditable(false);
        InsuranceTxT.setEditable(false);
        FoodTxT.setEditable(false);
        homeTxT.setEditable(false);
        departTxT.setEditable(false);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                NationalidTxT.setEditable(true);
                NationaTxT.setEditable(true);
                SexTxT.setEditable(true);
                InsuranceTxT.setEditable(true);
                FoodTxT.setEditable(true);
                homeTxT.setEditable(true);
                departTxT.setEditable(true);


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
                homeTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        homeTxT.setText("");
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
                departTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        departTxT.setText(" ");
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
                        String home = homeTxT.getText();
                        String departeman = departTxT.getText();


                            Wild wild = new Wild(nationaTxT, nationalidTxT, sexTxT, insuranceTxT, foodTxT, home);
                            wilds.add(wild);

                            NationalidTxT.setEditable(false);
                            NationaTxT.setEditable(false);
                            SexTxT.setEditable(false);
                            InsuranceTxT.setEditable(false);
                            FoodTxT.setEditable(false);
                            homeTxT.setEditable(false);
                            departTxT.setEditable(false);


                            DepartemanWild departemanWild = new DepartemanWild(nationaTxT, nationalidTxT, sexTxT, insuranceTxT, foodTxT, home, departeman);
                            DepartemanWild.departemanWilds.add(departemanWild);

                            String[] colName = {"nationality", "nationalid", "sex", "insurance", "food", "Home"};
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


                            int row = WildAdd.wilds.size();
                            for (int i = 0; i < row; i++) {
                                t.addRow(new Object[]{WildAdd.wilds.get(i).getNationality(), WildAdd.wilds.get(i).getNationalid(), WildAdd.wilds.get(i).getSex(), WildAdd.wilds.get(i).getInsurance(), WildAdd.wilds.get(i).getFood(), WildAdd.wilds.get(i).getHome()});
                            }


                    }
                });
            }
        });

    }
}
