package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_info extends JFrame {
    Employee_info(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);;
        panel.setBackground(new Color(92,100,242));
        panel.setLayout(null);
        add(panel);

        JLabel labelName =new JLabel("Doctors Detail");
        labelName.setBounds(350,11,268,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,24));
        panel.add(labelName);


        JTable table =new JTable();
        table.setBounds(10,110,980,400);
        table.setBackground(new Color(92,100,242));
        table.setFont(new Font("Tahoma",Font.PLAIN,14));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            conn c =new conn();
            String q="select *from EMP_INFO";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Name");
        label1.setBounds(10,80,70,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(170,80,70,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(label2);

        JLabel label3 = new JLabel("Phone No");
        label3.setBounds(340,80,130,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(495,80,70,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(670,80,70,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(label5);

        JLabel label6 = new JLabel("Adhaar No");
        label6.setBounds(830,80,150,20);
        label6.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(label6);

        JButton button= new JButton("Back");
        button.setBounds(350,510,120,30);
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
        setSize(1000,600);
        setLocation(350,170);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Employee_info();

    }
}
