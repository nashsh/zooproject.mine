package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Manager_editmanager extends JPanel {
    static Manager manager;

    public Manager_editmanager() {
        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        setBackground(Color.decode("#CCCC00"));
        manager = new Manager();

        JLabel searchLbL = new JLabel("Search Manager");
        JTextField searchTxT = new JTextField(" username Manger's you want search");
        searchTxT.setMinimumSize(new Dimension(50, 30));
        searchTxT.setPreferredSize(new Dimension(50, 30));
        add(searchLbL);
        add(searchTxT);

        JPanel Buttun = new JPanel();
        JButton searchBtn = new JButton("Search");
        add(searchBtn);


        JLabel lbl1 = new JLabel(" First Name");
        JLabel lbl2 = new JLabel(" Last Name");
        JLabel lbl3 = new JLabel(" UserName");
        JLabel lbl4 = new JLabel(" Password");
        JLabel lbl5 = new JLabel(" Email");
        JLabel lbl6 = new JLabel(" PhoneNum");
        JLabel lbl7 = new JLabel(" Adress");


        final JTextField text1 = new JTextField();
        final JTextField text2 = new JTextField();
        final JTextField text3 = new JTextField();
        final JTextField text4 = new JTextField();
        final JTextField text5 = new JTextField();
        final JTextField text6 = new JTextField();
        final JTextField text7 = new JTextField();
//text1.setText(AddManager.managers.get(i).getAddress());

        JPanel panel = new JPanel();
        final JButton btnsave = new JButton("Save ");
        final JButton btnedit = new JButton("Edit");


//        text1.setEditable(false);
//        text2.setEditable(false);
//        text3.setEditable(false);
//        text4.setEditable(false);
//        text5.setEditable(false);
//        text6.setEditable(false);
//        text7.setEditable(false);

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
                for (int i = 0; i < AddManager.managers.size(); i++) {
                    String search = searchTxT.getText();
                    if (search.equals(AddManager.managers.get(i).getUsername())) {
                        text1.setText(AddManager.managers.get(i).getFirstname());
                        text2.setText(AddManager.managers.get(i).getLastname());
                        text3.setText(AddManager.managers.get(i).getUsername());
                        text4.setText(AddManager.managers.get(i).getPassword());
                        text5.setText(AddManager.managers.get(i).getMail());
                        text6.setText(AddManager.managers.get(i).getPhonenum());
                        text7.setText(AddManager.managers.get(i).getAddress());
                        int id = i;
                       // Manager manager=new Manager(text1.getText(),text2.getText(),text3.getText(),text4.getText())

//                        btnedit.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent actionEvent) {
//
//                                if (btnedit.getText().equals("Edit")) {
//                                    btnedit.setText("Cancel");
//
//
//                                    text1.setEditable(true);
//                                    text2.setEditable(true);
//                                    text3.setEditable(true);
//                                    text4.setEditable(true);
//                                    text5.setEditable(true);
//                                    text6.setEditable(true);
//                                    text7.setEditable(true);
//
//
//                                } else if (btnedit.getText().equals("Cancel")) {
//                                    btnedit.setText("Edit");
//                                    text1.setEditable(false);
//                                    text2.setEditable(false);
//                                    text3.setEditable(false);
//                                    text4.setEditable(false);
//                                    text5.setEditable(false);
//                                    text6.setEditable(false);
//                                    text7.setEditable(false);
//                                }
//
//                            }
//                        });

                        btnsave.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                AddManager.managers.get(id).setFirstname(text1.getText());
                                AddManager.managers.get(id).setLastname(text2.getText());
                                AddManager.managers.get(id).setUsername(text3.getText());
                                AddManager.managers.get(id).setPassword(text4.getText());
                                AddManager.managers.get(id).setMail(text5.getText());
                                AddManager.managers.get(id).setPhonenum(text6.getText());
                                AddManager.managers.get(id).setAddress(text7.getText());


                                text1.setEditable(false);
                                text2.setEditable(false);
                                text3.setEditable(false);
                                text4.setEditable(false);
                                text5.setEditable(false);
                                text6.setEditable(false);
                                text7.setEditable(false);
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
        add(lbl7);
        add(text7);


        panel.add(btnsave);
        panel.add(btnedit);
        add(panel);


//        String[] colName = {"fname", "lname", "username", "password", "Email", "phone", "adress", "wage"};
//        JTable table = new JTable(0, 4);
//
//
//        DefaultTableModel t = new DefaultTableModel() {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//
//        t.addColumn(colName[0]);
//        t.addColumn(colName[1]);
//        t.addColumn(colName[2]);
//        t.addColumn(colName[3]);
//        t.addColumn(colName[4]);
//        t.addColumn(colName[5]);
//        t.addColumn(colName[6]);
//        t.addColumn(colName[7]);
////        t.addColumn(colName[8]);
//
//        int row = AddManager.managers.size();
//        for (int i = 0; i < row; i++) {
//            t.addRow(new Object[]{AddManager.managers.get(i).getFirstname(), AddManager.managers.get(i).getLastname(), AddManager.managers.get(i).getUsername(), AddManager.managers.get(i).getPassword(), AddManager.managers.get(i).getMail(), AddManager.managers.get(i).getPhonenum(), AddManager.managers.get(i).getAddress(), AddManager.managers.get(i).getWage()});
//        }
////        panel.setVisible(true);

    }

}
