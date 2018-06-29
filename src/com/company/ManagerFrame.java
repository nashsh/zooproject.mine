package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerFrame extends JFrame {
    static Manager manager;
    AddManager addManager = new AddManager();
    EditManager editManager = new EditManager();
    ShowManagers showManagers = new ShowManagers();
    DeleteManager deleteManager = new DeleteManager();

    public ManagerFrame() {
        setMinimumSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(1000, 500));

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
        centerPanel.add(addManager);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(addManager);
        addManager.setVisible(false);
        AddManager panel = new AddManager();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(editManager);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(editManager);
        editManager.setVisible(false);
        EditManager panell = new EditManager();//edit manager
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(showManagers);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(showManagers);
        showManagers.setVisible(false);
        ShowManagers paanel = new ShowManagers();//show manager
        centerPanel.add(Panel);

        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(deleteManager);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(deleteManager);
        deleteManager.setVisible(false);
        DeleteManager pannel = new DeleteManager();//show manager
        centerPanel.add(Panel);

        JButton btn1 = new JButton("Add ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);


        JButton btn2 = new JButton("EditManager");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn3 = new JButton("Delete");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);

        JButton btn4 = new JButton("Show");
        btn4.setMinimumSize(new Dimension(120, 65));
        btn4.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn4, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("Back ");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addManager.setVisible(true);
                editManager.setVisible(false);
                showManagers.setVisible(false);
                deleteManager.setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editManager.setVisible(true);
                addManager.setVisible(false);
                showManagers.setVisible(false);
                deleteManager.setVisible(false);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showManagers.setVisible(true);
                addManager.setVisible(false);
                editManager.setVisible(false);
                showManagers.setVisible(true);
                deleteManager.setVisible(false);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showManagers.setVisible(false);
                addManager.setVisible(false);
                editManager.setVisible(false);
                deleteManager.setVisible(true);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showManagers.setVisible(false);
                addManager.setVisible(false);
                editManager.setVisible(false);
                deleteManager.setVisible(false);
                SuperAdminFrame SAF=new SuperAdminFrame();
                SAF.setVisible(true);
                setVisible(false);
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
