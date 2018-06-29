package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Manager_ZooKeaper_Show extends JPanel {

   public Manager_ZooKeaper_Show(){
       setMinimumSize(new Dimension(400, 400));
       setPreferredSize(new Dimension(400, 400));
       setBackground(Color.decode("#CCCC00"));

       JPanel panel = new JPanel();
       panel.setMinimumSize(new Dimension(400, 400));
       panel.setPreferredSize(new Dimension(400, 400));
       panel.setBackground(Color.decode("#CCCC00"));
       add(panel);

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

       int row = Manager_ZooKeaper_Add.zooKeapers.size();
       for (int i = 0; i < row; i++) {
           t.addRow(new Object[]{Manager_ZooKeaper_Add.zooKeapers.get(i).getFirstname(), Manager_ZooKeaper_Add.zooKeapers.get(i).getLastname(), Manager_ZooKeaper_Add.zooKeapers.get(i).getUsername(), Manager_ZooKeaper_Add.zooKeapers.get(i).getPassword(), Manager_ZooKeaper_Add.zooKeapers.get(i).getMail(), Manager_ZooKeaper_Add.zooKeapers.get(i).getPhonenum(), Manager_ZooKeaper_Add.zooKeapers.get(i).getAddress(), Manager_ZooKeaper_Add.zooKeapers.get(i).getWage()});
       }
       table.setModel(t);
       JScrollPane scrollPane = new JScrollPane(table);
       scrollPane.setMinimumSize((new Dimension(400, 400)));
       scrollPane.setPreferredSize(new Dimension(400, 400));
       panel.add(scrollPane);

        }

    }

