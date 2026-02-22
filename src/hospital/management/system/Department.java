package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){



                    JPanel panel =new JPanel();
                    panel.setBounds(5,5,690,490);
                    panel.setLayout(null);
                    panel.setBackground(new Color(92,100,242));
                    add(panel);

        JLabel labelName =new JLabel("Facilities");
        labelName.setBounds(200,7,268,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(labelName);



                    JTable table=new JTable();
                    table.setBounds(30,90,650,320);
                    table.setBackground(new Color(92,100,242));
                    table.setFont(new Font("Tahoma",Font.PLAIN,14));
                    table.setForeground(Color.white);
                    panel.add(table);

                    try{
                           conn c =new conn();
                           String q="select * from department";
                        ResultSet resultSet=c.statement.executeQuery(q);
                        table.setModel(DbUtils.resultSetToTableModel(resultSet));

                    }catch (Exception e){
                        e.printStackTrace();

                    }

                    JLabel label1 =new JLabel("Department");
                    label1.setBounds(35,65,120,20);
                    label1.setFont(new Font("Tahoma",Font.BOLD,18));
                    panel.add(label1);

                    JLabel label2 =new JLabel("Phone Number");
                    label2.setBounds(331,65,150,20);
                    label2.setFont(new Font("Tahoma",Font.BOLD,18));
                    panel.add(label2);

                    JButton b1 =new JButton("Back");
                    b1.setBounds(250,430,130,30);
                    b1.setBackground(Color.black);
                    b1.setForeground(Color.white);
                    panel.add(b1);
                    b1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setVisible(false);
                        }
                    });




                    setUndecorated(true);
                    setSize(700,500);
                    setLayout(null);
                    setLocation(350,250);
                    setVisible(true);

                }

    public static void main(String[] args) {
           new Department();
    }
}
