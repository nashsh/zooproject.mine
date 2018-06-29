package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisitorPageFrame extends JFrame {
    VisitorEdit visitorEdit = new VisitorEdit();
    VisitorDeleteBelit vdb = new VisitorDeleteBelit();
    VisitorBelit vb = new VisitorBelit();
    VisitorEtebar ve = new VisitorEtebar();
    VisitorComent vc = new VisitorComent();

    public VisitorPageFrame() {

        setMinimumSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(1000, 500));
        setBackground(Color.decode("#CCCC00"));
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.decode("#CCCC00"));
        Panel.setMinimumSize(new Dimension(1000, 500));
        Panel.setPreferredSize(new Dimension(1000, 500));
        add(Panel);

        JPanel upPanel = new JPanel();
        upPanel.setBackground(Color.decode("#CCCC00"));
        upPanel.setMinimumSize(new Dimension(50, 400));
        upPanel.setPreferredSize(new Dimension(50, 400));
        Panel.add(upPanel, BorderLayout.NORTH);
        Panel.add(upPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(visitorEdit);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(visitorEdit);
        visitorEdit.setVisible(false);
        VisitorEdit panel = new VisitorEdit();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(vdb);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(vdb);
        vdb.setVisible(false);
        VisitorDeleteBelit wd = new VisitorDeleteBelit();//wild delete
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(vb);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(vb);
        vb.setVisible(false);
        VisitorBelit we = new VisitorBelit();//wild edit
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(ve);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(ve);
        ve.setVisible(false);
        VisitorEtebar wsh = new VisitorEtebar();//wild edit
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(vc);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(vc);
        vc.setVisible(false);
        VisitorComent vcb = new VisitorComent();//wild edit
        centerPanel.add(Panel);


        JButton btn1 = new JButton("Edit");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);

        JButton btn2 = new JButton("Etebar");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("buying ticket");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        JButton btn6 = new JButton("Delete");
        btn6.setMinimumSize(new Dimension(120, 65));
        btn6.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn6, BoxLayout.X_AXIS);

        JButton btn7 = new JButton("Coment");
        btn7.setMinimumSize(new Dimension(120, 65));
        btn7.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn7, BoxLayout.X_AXIS);


        JButton btn3 = new JButton("Logout");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visitorEdit.setVisible(false);
                ve.setVisible(true);
                vb.setVisible(false);
                vdb.setVisible(false);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visitorEdit.setVisible(true);
                vb.setVisible(false);
                vdb.setVisible(false);
                ve.setVisible(false);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vb.setVisible(true);
                vdb.setVisible(false);
                ve.setVisible(false);
                visitorEdit.setVisible(false);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vdb.setVisible(true);
                vb.setVisible(false);
                ve.setVisible(false);
                visitorEdit.setVisible(false);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Login login = new Login();
                login.setVisible(true);
                setVisible(false);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vc.setVisible(true);
                vdb.setVisible(false);
                vb.setVisible(false);
                ve.setVisible(false);
                visitorEdit.setVisible(false);
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
