package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
//////
  Reception(){

        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(70,131,224));
        add(panel);



        JPanel panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(29,33,32));
        add(panel1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/DR.jpg"));
        Image image =i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);//250,250
        ImageIcon i2= new ImageIcon(image);
        JLabel label=new JLabel(i2);
        label.setBounds(1300,0,250,230);//1300,0,250,250);
        panel1.add(label);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/recp2.png"));//Rp
        Image i11 =imageIcon.getImage().getScaledInstance(2000,700,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i11);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(-50,-140,1600,900);
        panel.add(label1);



     /* ImageIcon i111 =new ImageIcon(ClassLoader.getSystemResource("icon/Rp.png"));
        Image image11 = i111.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT);
        ImageIcon i222 = new ImageIcon(image);
        JLabel label2 =new JLabel(i222);
        label2.setBounds(1000,1000,300,100);
        panel1.add(label2);*/

        JButton bt1= new JButton("Add New Patient");
        bt1.setBounds(30,20,200,30);
        bt1.setForeground(new Color(9,114,130));
        panel1.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             new New_patient();
                       }
        });

        JButton bt2 = new JButton("Room");
        bt2.setBounds(30,65,200,30);//1000,60
        bt2.setForeground(new Color(9,114,130));
        panel1.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();

            }
        });

        JButton bt3 = new JButton("Department");
        bt3.setBounds(510,110,200,30);
        bt3.setForeground(new Color(9,114,130));
        panel1.add(bt3);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();

            }
        });

        JButton bt4 = new JButton("All Employee Info");
        bt4.setBounds(750,20,200,30);
        bt4.setForeground(new Color(9,114,130));
        panel1.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();

            }
        });

        JButton bt5 = new JButton("Patient Info");
        bt5.setBounds(30,110,200,30);    //270,90
        bt5.setForeground(new Color(9,114,130));
        panel1.add(bt5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ALL_Patient_Info();
            }
        });

        JButton bt6 = new JButton("Patient Discharge");
        bt6.setBounds(1000,65,200,30);     //750,110
        bt6.setForeground(new Color(9,114,130));
        panel1.add(bt6);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_Discharge();

            }
        });

        JButton bt7 = new JButton("Update Patient Detail");
        bt7.setBounds(510,20,200,30);
        bt7.setForeground(new Color(9,114,130));
        panel1.add(bt7);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new Update_Patient_Details();
            }
        });

        JButton bt8 = new JButton("Hospital Ambulance");
        bt8.setBounds(750,65,200,30);
        bt8.setForeground(new Color(9,114,130));
        panel1.add(bt8);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();

            }
        });

        JButton bt9 = new JButton("Search Room");
        bt9.setBounds(510,65,200,30);
        bt9.setForeground(new Color(9,114,130));
        panel1.add(bt9);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchRoom();

            }
        });

        JButton bt10 = new JButton("Logout");
        bt10.setBounds(1000,110,200,30);
        bt10.setForeground(new Color(9,114,130));
        panel1.add(bt10);
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        JButton bt11 = new JButton("Emergency Case");
        bt11.setBounds(270,20,200,30);
        bt11.setForeground(new Color(9,114,130));
        panel1.add(bt11);
        bt11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Emergency();
            }
        });

        JButton bt12 = new JButton("Emergency Room Info");
        bt12.setBounds(270,110,200,30);
        bt12.setForeground(new Color(9,114,130));
        panel1.add(bt12);
        bt12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmergencyWard();
            }
        });

        JButton bt13 = new JButton("Emergency Patient Info");
        bt13.setBounds(270,65,200,30);
        bt13.setForeground(new Color(9,114,130));
        panel1.add(bt13);
        bt13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmergencyRoom();
            }
        });

        JButton bt14 = new JButton("Payment Mode");
        bt14.setBounds(750,110,200,30);
        bt14.setForeground(new Color(9,114,130));
        panel1.add(bt14);
        bt14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new paymentMode();
            }
        });

        JButton bt15 = new JButton("Receipt");
        bt15.setBounds(1000,20,200,30);
        bt15.setForeground(new Color(9,114,130));
        panel1.add(bt15);
        bt15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Receipt();
            }
        });

        setSize(1950,1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
