package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EmergencyWard extends JFrame {

    JTable table;

    EmergencyWard(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,800,540);
        panel.setBackground(new Color(92,100,242));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/"));
        Image image= imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        JLabel labelName =new JLabel("Room Information");
        labelName.setBounds(270,11,268,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(labelName);

        table=new JTable();
        table.setBounds(10,120,700,300);
        table.setBackground(new Color(92,100,242));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            conn c=new conn();
            String q= "select * from ERoom";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }




        JLabel label1 = new JLabel("Room No");
        label1.setBounds(9,90,80,15);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Availability");
        label2.setBounds(180,90,80,15);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Price");
        label3.setBounds(360,90,80,15);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Bed Type");
        label4.setBounds(540,90,80,15);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JButton back =new JButton("Back");
        back.setBounds(300,450,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(810,550);    //810,550
        setLayout(null);
        setLocation(300,230);       //300,230
        setVisible(true);

    }
    public static void main(String[] args){
        new EmergencyWard();
    }
}
