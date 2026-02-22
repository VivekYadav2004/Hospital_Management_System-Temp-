package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame {
    Choice choice;
    JTable table;

    SearchRoom(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(92,100,242));
        panel.setLayout(null);
        add(panel);

        JLabel For = new JLabel("Search For Room");
        For.setBounds(230,11,220,31);
        For.setForeground(Color.black);
        For.setFont(new Font("Tahoma",Font.BOLD,23));
        panel.add(For);

        JLabel status = new JLabel("Status :");
        status.setBounds(70,70,80,20);
        status.setForeground(Color.black);
        status.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(status);

        choice = new Choice();
        choice.setBounds(170,70,120,30);
        choice.add("Available");
        choice.add("Occupied");
        panel.add(choice);

        table =new JTable();
        table.setBounds(0,187,700, 210);
        table.setBackground(new Color(92,100,242));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            conn c=new conn();
            String q="select *from room";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel room_no = new JLabel("Room Number");
        room_no.setBounds(2,158,150,20);
        room_no.setForeground(Color.black);
        room_no.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(room_no);

        JLabel available = new JLabel("Availability");
        available.setBounds(175,158,150,20);
        available.setForeground(Color.black);
        available.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(available);

        JLabel Price = new JLabel("Price");
        Price.setBounds(340,158,150,20);
        Price.setForeground(Color.black);
        Price.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(Price);

        JLabel Bed = new JLabel("Bed Type");
        Bed.setBounds(520,158,150,20);
        Bed.setForeground(Color.black);
        Bed.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(Bed);

        JButton Search= new JButton("Search");
        Search.setBounds(200,430,120,25);
        Search.setBackground(Color.black);
        Search.setForeground(Color.white);
        panel.add(Search);
        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q ="select * from  Room where Availability = '"+choice.getSelectedItem()+"'";
                try {

                    conn c= new conn();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton Back = new JButton("Back");
        Back.setBounds(380,430,120,25);
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(450,250);
        setVisible(true);



    }
    public static void main(String[] args) {
         new SearchRoom();
    }
}
