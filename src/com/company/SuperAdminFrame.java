package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SuperAdminFrame extends JFrame {
    static SuperAdmin superAdmin;
    ShowInfoSuperAdmin showInfoSuperAdmin = new ShowInfoSuperAdmin();
    EditSuperAdmin editSuperAdmin = new EditSuperAdmin();
    ManagerFrame managerFrame = new ManagerFrame();

    public SuperAdminFrame() {
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
        centerPanel.add(showInfoSuperAdmin);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.decode("#CCCC00"));
        centerPanel.add(showInfoSuperAdmin);
        showInfoSuperAdmin.setVisible(false);
        ShowInfoSuperAdmin panel = new ShowInfoSuperAdmin();
        centerPanel.add(Panel);


        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(editSuperAdmin);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(editSuperAdmin);
        editSuperAdmin.setVisible(false);
        EditSuperAdmin saep = new EditSuperAdmin();//seap=super admin edit panel
        centerPanel.add(Panel);

        JButton btn1 = new JButton("Profile ");
        btn1.setMinimumSize(new Dimension(120, 65));
        btn1.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn1, BoxLayout.X_AXIS);


        JButton btn2 = new JButton("EditProfile");
        btn2.setMinimumSize(new Dimension(120, 65));
        btn2.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn2, BoxLayout.X_AXIS);

        JButton btn3 = new JButton("Managers");
        btn3.setMinimumSize(new Dimension(120, 65));
        btn3.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn3, BoxLayout.X_AXIS);

        JButton btn5 = new JButton("M Menu");
        btn5.setMinimumSize(new Dimension(120, 65));
        btn5.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn5, BoxLayout.X_AXIS);

        JButton btn4 = new JButton("Logout");
        btn4.setMinimumSize(new Dimension(120, 65));
        btn4.setPreferredSize(new Dimension(120, 65));
        Panel.add(btn4, BoxLayout.X_AXIS);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                showInfoSuperAdmin.setVisible(true);
                editSuperAdmin.setVisible(false);
                managerFrame.setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showInfoSuperAdmin.setVisible(false);
                editSuperAdmin.setVisible(true);
                managerFrame.setVisible(false);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editSuperAdmin.setVisible(false);
                showInfoSuperAdmin.setVisible(false);
                managerFrame.setVisible(true);
                setVisible(false);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Login login=new Login();
                login.setVisible(true);
                setVisible(false);
                try {

                    Manager.write();
                } catch (IOException e) {

                }
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               Manager_manager mm=new Manager_manager();
               mm.setVisible(true);
               setVisible(false);
            }
        });


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
