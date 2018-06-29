package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class VisitorBelit extends JPanel {
    static ArrayList<Visitor> visitorsbelit = new ArrayList<Visitor>();
    Visitor visitor;

    public VisitorBelit() {


        setMinimumSize(new Dimension(200, 400));
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

//        JPanel Panel = new JPanel();
//        Panel.setBackground(Color.decode("#CCCC00"));
//        Panel.setMinimumSize(new Dimension(200, 500));
//        Panel.setPreferredSize(new Dimension(200, 500));
//        add(Panel);

        JTextField tedadTxT = new JTextField("Tedad");
        tedadTxT.setMinimumSize(new Dimension(10, 10));
        tedadTxT.setPreferredSize(new Dimension(10, 10));
        add(tedadTxT);
        JTextField tarTxT = new JTextField("Tarikh");
        tarTxT.setMinimumSize(new Dimension(10, 10));
        tarTxT.setPreferredSize(new Dimension(10, 10));
        add(tarTxT);
        JTextField depTxT = new JTextField("Departeman");
        depTxT.setMinimumSize(new Dimension(10, 10));
        depTxT.setPreferredSize(new Dimension(10, 10));
        add(depTxT);
        JPanel Buttun = new JPanel();
        Buttun.setMinimumSize(new Dimension(100, 100));
        Buttun.setPreferredSize(new Dimension(100, 100));
        Buttun.setBackground(Color.decode("#CCCC00"));
        add(Buttun, BorderLayout.SOUTH);

        JButton add = new JButton("Add");
        add.setMinimumSize(new Dimension(80, 30));
        add.setPreferredSize(new Dimension(80, 30));

        add(tedadTxT);
        add(tarTxT);
        add(depTxT);
        add(Buttun);
        Buttun.add(add);

        tedadTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tedadTxT.setText("");
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

        tarTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tarTxT.setText("");
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

        depTxT.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                depTxT.setText("");
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

        String tedad=tedadTxT.getText();
        String tarikh=tarTxT.getText();
        String departeman=depTxT.getText();

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            Visitor visitor1=new Visitor(visitor.getFirstname(),visitor.getLastname(),visitor.getUsername(),visitor.getPassword(),visitor.getMail(),visitor.getPhonenum(),tedad,tarikh,departeman);
            visitorsbelit.add(visitor1);
            if (depTxT.getText().equals("Aquatic")){
                DepartemanAquatic da=new DepartemanAquatic(visitor.getFirstname(),visitor.getLastname(),visitor.getUsername(),visitor.getPassword(),visitor.getMail(),visitor.getPhonenum(),departeman);
                DepartemanAquatic.departemanAquatics_belit.add(da);
                tedadTxT.setEditable(false);
                tarTxT.setEditable(false);
                depTxT.setEditable(false);
            }
                if (depTxT.getText().equals("Birds")){
                    DepartemanBirds db=new DepartemanBirds(visitor.getFirstname(),visitor.getLastname(),visitor.getUsername(),visitor.getPassword(),visitor.getMail(),visitor.getPhonenum(),departeman);
                    DepartemanBirds.departemanBirds_belit.add(db);
                }
                if (depTxT.getText().equals("Wild")){
                    DepartemanWild db=new DepartemanWild(visitor.getFirstname(),visitor.getLastname(),visitor.getUsername(),visitor.getPassword(),visitor.getMail(),visitor.getPhonenum(),departeman);
                    DepartemanWild.departemanWilds_belit.add(db);
                }
            }
        });


    }
}