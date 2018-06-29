package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AquaticEdit extends JPanel {

    static Aquatic aquatic;

    public AquaticEdit() {


        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        setBackground(Color.decode("#CCCC00"));
        aquatic = new Aquatic();

        JLabel searchLbL = new JLabel("Search Aquatic");
        JTextField searchTxT = new JTextField("NationalId you want search");
        searchTxT.setMinimumSize(new Dimension(50, 30));
        searchTxT.setPreferredSize(new Dimension(50, 30));
        add(searchLbL);
        add(searchTxT);

        JPanel Buttun = new JPanel();
        JButton searchBtn = new JButton("Search");
        add(searchBtn);


        JLabel lbl1 = new JLabel(" nationality");
        JLabel lbl2 = new JLabel(" nationalid");
        JLabel lbl3 = new JLabel(" sex");
        JLabel lbl4 = new JLabel(" insurance");
        JLabel lbl5 = new JLabel(" food");
        JLabel lbl6 = new JLabel(" comivirous");

        final JTextField text1 = new JTextField();
        final JTextField text2 = new JTextField();
        final JTextField text3 = new JTextField();
        final JTextField text4 = new JTextField();
        final JTextField text5 = new JTextField();
        final JTextField text6 = new JTextField();


        JPanel panel = new JPanel();
        final JButton btnsave = new JButton("Save ");
        final JButton btnedit = new JButton("Edit");


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
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0; i < AquaticAdd.aquatics.size(); i++) {
                    String search = searchTxT.getText();
                    if (search.equals(AquaticAdd.aquatics.get(i).getNationalid())) {
                        text1.setText(AquaticAdd.aquatics.get(i).getNationality());
                        text2.setText(AquaticAdd.aquatics.get(i).getNationalid());
                        text3.setText(AquaticAdd.aquatics.get(i).getSex());
                        text4.setText(AquaticAdd.aquatics.get(i).getInsurance());
                        text5.setText(AquaticAdd.aquatics.get(i).getFood());
                        text6.setText(AquaticAdd.aquatics.get(i).getCamivorous());

                        int id = i;

                        btnsave.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                AquaticAdd.aquatics.get(id).setNationality(text1.getText());
                                AquaticAdd.aquatics.get(id).setNationalid(text2.getText());
                                AquaticAdd.aquatics.get(id).setSex(text3.getText());
                                AquaticAdd.aquatics.get(id).setInsurance(text4.getText());
                                AquaticAdd.aquatics.get(id).setFood(text5.getText());
                                AquaticAdd.aquatics.get(id).setCamivorous(text6.getText());



                                text1.setEditable(false);
                                text2.setEditable(false);
                                text3.setEditable(false);
                                text4.setEditable(false);
                                text5.setEditable(false);
                                text6.setEditable(false);
                                btnedit.setText("Edit");
                            }
                        });


                    }

                }


            }
        });


        add(lbl1);
        add(text1);
        add(lbl2);
        add(text2);
        add(lbl3);
        add(text3);
        add(lbl4);
        add(text4);
        add(lbl5);
        add(text5);
        add(lbl6);
        add(text6);


        panel.add(btnsave);
        panel.add(btnedit);
        add(panel);


    }
}
