package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Ambulance extends JFrame {
    Ambulance(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,630);
        panel.setBackground(new Color(92,100,242));

        panel.setLayout(null);
        add(panel);

        JLabel labelName =new JLabel("Ambulance Facilities");
        labelName.setBounds(300,7,268,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(labelName);

        JTable table =new JTable();
        table.setBounds(10,120,900,450);
        table.setBackground(new Color(92,100,242));
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            conn c = new conn();
            String q ="select * from Ambulance";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel label1 = new JLabel("Name");
        label1.setBounds(10,90,100,14);
        label1.setFont( new Font("Tahoma",Font.BOLD,18));
        panel.add(label1);

        JLabel label2 = new JLabel("Gender");
        label2.setBounds(190,90,100,14);
        label2.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label2);

        JLabel label3 = new JLabel("Vehicle Name");
        label3.setBounds(370,90,150,14);
        label3.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label3);

        JLabel label4 = new JLabel("Available");
        label4.setBounds(550,90,100,14);
        label4.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label4);

        JLabel label5 = new JLabel("Location");
        label5.setBounds(730,90,100,14);
        label5.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label5);




        JButton button = new JButton("Back");
        button.setBounds(400,570,120,30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(900,640);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Ambulance();

    }
}
