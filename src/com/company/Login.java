package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.font.ImageGraphicAttribute;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.io.File;
import javax.security.auth.login.LoginContext;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.nio.ByteOrder;
import java.util.ArrayList;

import static javax.swing.BoxLayout.Y_AXIS;

public class Login extends JFrame {
    Image img;
    String imagepath = "/home/najme/IdeaProjects/zoe/src/com/company/sofia-zoo-pictogram.jpg";
    private int index;
    String zookeepername;
    static ArrayList<User> users = new ArrayList<User>();
    public static User user;
    Manager manager = new Manager();
    public static int userId;
    JPanel Panel = new JPanel();

    static SuperAdmin superAdmin = new SuperAdmin(SuperAdmin.superAdmins.get(0).getFname(),SuperAdmin.superAdmins.get(0).getLname(),SuperAdmin.superAdmins.get(0).getUsername(),SuperAdmin.superAdmins.get(0).getPass(),SuperAdmin.superAdmins.get(0).getMail());

    public Login() {


        setBackgroundImage();
        setMinimumSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(1000, 500));
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(0, 650));
        upPanel.setPreferredSize(new Dimension(0, 650));
        upPanel.setOpaque(false);
        Panel.add(upPanel, BorderLayout.NORTH);


        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(0, 400));
        rightPanel.setPreferredSize(new Dimension(0, 400));
        rightPanel.setOpaque(false);
        Panel.add(rightPanel, BorderLayout.CENTER);


        final JTextField userText = new JTextField("Enter your username");
        userText.setMinimumSize(new Dimension(140, 35));
        userText.setPreferredSize(new Dimension(140, 35));
        userText.setBackground(Color.decode("#330000"));
        Panel.add(userText, BoxLayout.X_AXIS);
        userText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                userText.setBackground(Color.decode("#CCCC00"));
                userText.setText("");
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
        final JTextField passText = new JTextField(" your password");
        passText.setMinimumSize(new Dimension(140, 35));
        passText.setPreferredSize(new Dimension(140, 35));
        passText.setBackground(Color.decode("#330000"));
        Panel.add(passText);
        passText.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                passText.setBackground(Color.decode("#CCCC00"));
                passText.setText("");
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


        final JComboBox comboBox = new JComboBox();
        comboBox.addItem("Visitor");
        comboBox.addItem("Admin");
        comboBox.addItem("ZooKeeper");
        comboBox.addItem("SuperAdmin");
        comboBox.setMinimumSize(new Dimension(140, 35));
        comboBox.setPreferredSize(new Dimension(140, 35));
        comboBox.setBackground(Color.decode("#330000"));
        Panel.add(comboBox);


        JButton btnLogin = new JButton("Login");
        btnLogin.setMinimumSize(new Dimension(140, 35));
        btnLogin.setPreferredSize(new Dimension(140, 35));
        btnLogin.setBackground(Color.decode("#330000"));
        Panel.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String username = userText.getText();
                String password = passText.getText();
int pass=Integer.parseInt(passText.getText());
                if (comboBox.getSelectedItem().equals("SuperAdmin")) {
                    if (username.equals(SuperAdmin.superAdmins.get(0).getFname())) {
                        if (pass==SuperAdmin.superAdmins.get(0).getPass()) {

                            SuperAdminFrame saf = new SuperAdminFrame();
                            setVisible(false);
                            saf.setVisible(true);

                        } else {
                            passText.setText("Password is incorent");
                            passText.setForeground(Color.red);

                        }

                    } else {
                        userText.setText("SuperAdmin is not exist");
                        userText.setForeground(Color.red);
                    }
                } else if (comboBox.getSelectedItem().equals("Admin")) {
                    for (int i = 0; i < AddManager.managers.size(); i++) {
                        if (username.equals(AddManager.managers.get(i).getUsername())) {
                            if (password.equals(AddManager.managers.get(i).getPassword())) {

                                Manager_manager manager_manager = new Manager_manager();
                                manager_manager.setVisible(true);
                                setVisible(false);
                            } else {
                                passText.setText("Password is incorent");
                                passText.setForeground(Color.red);

                            }

                        } else {
                            userText.setText("Admin is not exist");
                            userText.setForeground(Color.red);
                        }
                    }
                } else if (comboBox.getSelectedItem().equals("ZooKeeper")) {
                    for (int i = 0; i < Manager_ZooKeaper_Add.zooKeapers.size(); i++) {
                        if (username.equals(Manager_ZooKeaper_Add.zooKeapers.get(i).getUsername())) {
                            if (password.equals(Manager_ZooKeaper_Add.zooKeapers.get(i).getPassword())) {
                                userId = i;
                                ZooKeeper_Frame zooKeeper_frame = new ZooKeeper_Frame();
                                zooKeeper_frame.setVisible(true);
                                setVisible(false);
                            } else {
                                passText.setText("Password is incorent");
                                passText.setForeground(Color.red);

                            }

                        } else {
                            userText.setText("Zookeeper is not exist");
                            userText.setForeground(Color.red);
                        }
                    }
                }else if (comboBox.getSelectedItem().equals("Visitor")){
                    for (int i = 0; i < VisitorLoginFrame.visitors.size(); i++) {
                        if (username.equals(VisitorLoginFrame.visitors.get(i).getUsername())) {
                            if (password.equals(VisitorLoginFrame.visitors.get(i).getPassword())) {
                                userId = i;
                                VisitorPageFrame vpf=new VisitorPageFrame();
                                vpf.setVisible(true);
                                setVisible(false);
                            } else {
                                passText.setText("Password is incorent");
                                passText.setForeground(Color.red);

                            }

                        } else {
                            userText.setText("Visitor is not exist");
                            userText.setForeground(Color.red);
                        }
                    }


                }

            }
        });


        JButton btnIn = new JButton("In");
        btnIn.setMinimumSize(new Dimension(140, 35));
        btnIn.setPreferredSize(new Dimension(140, 35));
        btnIn.setBackground(Color.decode("#330000"));
        Panel.add(btnIn);

        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                VisitorLoginFrame visitorLoginFrame = new VisitorLoginFrame();
                visitorLoginFrame.setVisible(true);
                setVisible(false);
                System.out.println("in");


            }
        });

        try {
            Manager.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void setBackgroundImage() {

        Panel panel = new Panel();

        try {
            final Image image = ImageIO.read(new File(imagepath));

            Panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, null);


                }
            };


            Panel.setPreferredSize(new Dimension(1000, 500));

            this.add(Panel);

        } catch (Exception e) {
            ;
        }


    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
