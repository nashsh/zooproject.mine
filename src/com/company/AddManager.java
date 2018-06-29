package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

public class AddManager extends JPanel {
    Manager manager;
    static ArrayList<Manager> managers = new ArrayList<Manager>();

    public AddManager() {
        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#CCCC00"));
        Manager manager = new Manager();


        JPanel Panel = new JPanel();

        JTextField NameTxT = new JTextField("Name");
        NameTxT.setMinimumSize(new Dimension(10, 10));
        NameTxT.setPreferredSize(new Dimension(10, 10));
        add(NameTxT);
        JTextField lastnameTxT = new JTextField(" Last Name");
        lastnameTxT.setPreferredSize(new Dimension(10, 10));
        add(lastnameTxT);
        JTextField usernameTxT = new JTextField("UserName");
        usernameTxT.setMinimumSize(new Dimension(10, 10));
        usernameTxT.setPreferredSize(new Dimension(10, 10));
        add(usernameTxT);
        JTextField passTxT = new JTextField("Pass");
        passTxT.setMinimumSize(new Dimension(10, 10));
        passTxT.setPreferredSize(new Dimension(10, 10));
        add(passTxT);
        JTextField mailTxT = new JTextField("Email");
        mailTxT.setMinimumSize(new Dimension(10, 10));
        mailTxT.setPreferredSize(new Dimension(10, 10));
        add(mailTxT);
        JTextField phoneTxT = new JTextField("Phone Num");
        phoneTxT.setMinimumSize(new Dimension(10, 10));
        phoneTxT.setPreferredSize(new Dimension(10, 10));
        add(phoneTxT);
        JTextField adressTxT = new JTextField("Adress");
        adressTxT.setMinimumSize(new Dimension(10, 10));
        adressTxT.setPreferredSize(new Dimension(10, 10));
        add(adressTxT);
        JTextField wageTxT = new JTextField("Wage ");
        wageTxT.setMinimumSize(new Dimension(10, 10));
        wageTxT.setPreferredSize(new Dimension(10, 10));
        add(wageTxT);


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

        add(NameTxT);
        add(lastnameTxT);

        add(Buttun);
        Buttun.add(save);
        Buttun.add(add);
        NameTxT.setEditable(false);
        lastnameTxT.setEditable(false);
        phoneTxT.setEditable(false);
        usernameTxT.setEditable(false);
        passTxT.setEditable(false);
        mailTxT.setEditable(false);
        adressTxT.setEditable(false);
        wageTxT.setEditable(false);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                NameTxT.setEditable(true);
                lastnameTxT.setEditable(true);
                phoneTxT.setEditable(true);
                usernameTxT.setEditable(true);
                passTxT.setEditable(true);
                mailTxT.setEditable(true);
                adressTxT.setEditable(true);
                wageTxT.setEditable(true);

                NameTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        NameTxT.setText("");
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
                lastnameTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        lastnameTxT.setText("");
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
                usernameTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        usernameTxT.setText("");
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
                phoneTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        phoneTxT.setText("");
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
                passTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        passTxT.setText("");
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
                mailTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        mailTxT.setText("");
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
                adressTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        adressTxT.setText("");
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
                wageTxT.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        wageTxT.setText("");
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

            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = NameTxT.getText();
                String lname = lastnameTxT.getText();
                String user = usernameTxT.getText();
                String phone = phoneTxT.getText();
                String pass = passTxT.getText();
                String mail = mailTxT.getText();
                String adress = adressTxT.getText();
                String wage = wageTxT.getText();

                try {
                    if (mail.matches("[A-Za-z0-9]+[@]+[g][m][a][i][l]+[.]+[c]+[o]+[m]")) {
                        Manager manager = new Manager(name, lname, user, pass, mail, phone, adress, wage);
                        managers.add(manager);
                    } else {
                        mailTxT.setText("Wrong Text");
                        mailTxT.setEditable(true);
                    }
                } catch (Exception e) {
                    mailTxT.setText("Wrong Text");
                    mailTxT.setEditable(true);
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
                // System.out.println(managers.get(0).getFirstname());

                NameTxT.setEditable(false);
                lastnameTxT.setEditable(false);
                phoneTxT.setEditable(false);
                usernameTxT.setEditable(false);
                passTxT.setEditable(false);
                mailTxT.setEditable(false);
                adressTxT.setEditable(false);
                wageTxT.setEditable(false);

            }
        });
    }

}