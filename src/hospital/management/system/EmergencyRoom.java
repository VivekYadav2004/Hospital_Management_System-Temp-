package hospital.management.system;


import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EmergencyRoom extends JFrame {

    EmergencyRoom(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,640);
        panel.setBackground(new Color(92,100,242));
        panel.setLayout(null);
        add(panel);

        JLabel labelName =new JLabel("Emergency Patient Information");
        labelName.setBounds(300,7,500,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(labelName);

        JTable table =new JTable();
        table.setBounds(10,120,900,450);
        table.setBackground(new Color(92,100,242));
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            conn c = new conn();
            String q="select * from Epatient_info";//EmergencyWard
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel label1 = new JLabel("ID");
        label1.setBounds(25,90,100,14);
        label1.setFont( new Font("Tahoma",Font.BOLD,18));
        panel.add(label1);

        JLabel label2 = new JLabel("Number");
        label2.setBounds(160,90,100,14);
        label2.setFont( new Font("Tahoma",Font.BOLD,18));
        panel.add(label2);

        JLabel label3 = new JLabel("Name");
        label3.setBounds(310,90,100,14);
        label3.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label3);

        JLabel label4 = new JLabel("Gender");
        label4.setBounds(460,90,100,14);
        label4.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label4);

     /*   JLabel label5 = new JLabel("Disease");
        label5.setBounds(460,90,100,14);
        label5.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label5);
*/
        JLabel label6 = new JLabel("Room");
        label6.setBounds(620,90,100,14);
        label6.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label6);

        JLabel label7 = new JLabel("Time");
        label7.setBounds(800,90,100,15);
        label7.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label7);

       /* JLabel label8 = new JLabel("Deposit");
        label8.setBounds(800,90,100,16);
        label8.setFont( new Font("Tahoma",Font.BOLD,17));
        panel.add(label8);
*/

        JButton button = new JButton("Back");
        button.setBounds(410,570,120,30);//600
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
        setSize(900,650);//800
        setLayout(null);
        setLocation(300,150);
        setVisible(true);


    }
    public static void main(String[] args) {
        new EmergencyRoom();
    }
}

