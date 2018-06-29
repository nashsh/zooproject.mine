package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Belit_Departeman extends JFrame {

    Belit_Wild belit_wild=new Belit_Wild();
    Belit_Departeman_Bird belit_departeman_bird=new Belit_Departeman_Bird();
    Belit_Departeman_Aquatic belit_departeman_aquatic=new Belit_Departeman_Aquatic();

    public Belit_Departeman(){

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
        centerPanel.add(belit_departeman_aquatic);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(belit_departeman_aquatic);
        belit_departeman_aquatic.setVisible(false);
        Belit_Departeman_Aquatic panel = new Belit_Departeman_Aquatic();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(belit_departeman_bird);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(belit_departeman_bird);
        belit_departeman_bird.setVisible(false);
        Belit_Departeman_Bird mshm = new Belit_Departeman_Bird();//manager show
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(belit_wild);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(belit_wild);
        belit_wild.setVisible(false);
        Belit_Wild bw = new Belit_Wild();//manager show
        centerPanel.add(Panel);




        JButton btn2 = new JButton("Aquatic");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("Wild");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        JButton btn6 = new JButton("Birds");
        btn6.setMinimumSize(new Dimension(120, 65));
        btn6.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn6, BoxLayout.X_AXIS);

        JButton btn7 = new JButton("Back");
        btn7.setMinimumSize(new Dimension(120, 65));
        btn7.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn7, BoxLayout.X_AXIS);



        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                belit_departeman_aquatic.setVisible(true);
                belit_departeman_bird.setVisible(false);
                belit_wild.setVisible(false);

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                belit_departeman_aquatic.setVisible(false);
                belit_departeman_bird.setVisible(false);
                belit_wild.setVisible(true);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                belit_departeman_aquatic.setVisible(false);
                belit_departeman_bird.setVisible(true);
                belit_wild.setVisible(false);
            }
        });


        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Manager_Belit manager_belit=new Manager_Belit();
                manager_belit.setVisible(true);
                setVisible(false);
            }
        });


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
