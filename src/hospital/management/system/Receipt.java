package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Receipt extends JFrame {

    Receipt(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 470);
        panel.setBackground(new Color(92, 100, 242));
        panel.setLayout(null);
        add(panel);



       /* ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/receipt.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(470,60,500,300);
        panel.add(label);
*/
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/receipt .png"));
        Image image =i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i2= new ImageIcon(image);
        JLabel label=new JLabel(i2);
        label.setBounds(520,80,250,250);
        panel.add(label);


        JLabel labelName = new JLabel("Receipt");
        labelName.setBounds(200, 11, 268, 53);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelName.setForeground(Color.black);
        panel.add(labelName);

      /*  ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/receipt.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(470,60,500,300);
        panel.add(label);
*/


        JLabel label2 = new JLabel("Name :");
        label2.setBounds(24,88,100,17);
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        label2.setForeground(Color.BLACK);
        panel.add(label2);

        Choice choice=new Choice();
        choice.setBounds(248,85,140,40);
        panel.add(choice);

        try {
            conn c= new conn();
            ResultSet resultSet=c.statement.executeQuery("select * from patient_info");
            while(resultSet.next()){
                choice.add(resultSet.getString("Name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number :");
        label3.setBounds(25,129,150,18);
        label3.setFont(new Font("Tahoma",Font.BOLD,17));
        label3.setForeground(Color.BLACK);
        panel.add(label3);

        JTextField textFieldR = new JTextField();
        textFieldR.setBounds(248,129,140,25);
        panel.add(textFieldR);

        JLabel label4 = new JLabel("IN-Time :");
        label4.setBounds(24,180,100,17);
        label4.setFont(new Font("Tahoma",Font.BOLD,17));
        label4.setForeground(Color.BLACK);
        panel.add(label4);

        JTextField textFieldINTime = new JTextField();
        textFieldINTime.setBounds(248,175,140,25);
        panel.add(textFieldINTime);

        JLabel label5 = new JLabel("Amount Paid :");
        label5.setBounds(24,225,150,18);
        label5.setFont(new Font("Tahoma",Font.BOLD,17));
        label5.setForeground(Color.BLACK);
        panel.add(label5);

        JTextField textFieldAmount = new JTextField();
        textFieldAmount.setBounds(248,216,140,25);
        panel.add(textFieldAmount);

        JLabel label6 = new JLabel("You Have To Pay :");
        label6.setBounds(24,261,200,25);
        label6.setFont(new Font("Tahoma",Font.BOLD,17));
        label6.setForeground(Color.BLACK);
        panel.add(label6);

        JTextField textFieldPending = new JTextField();
        textFieldPending.setBounds(248,261,140,25);
        panel.add(textFieldPending);

        JButton check = new JButton("CHECK");
        check.setBounds(140,380,120,30);
        check.setBackground(Color.black);
        check.setForeground(Color.white);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = choice.getSelectedItem();
                String q ="select * from patient_info where Name ='"+id+"'";
                try{
                    conn c= new conn();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    while(resultSet.next()){
                        textFieldR.setText(resultSet.getString("Room_Number"));
                        textFieldINTime.setText(resultSet.getString("Time"));
                        textFieldAmount.setText(resultSet.getString("Deposite"));

                    }

                    ResultSet resultSet1=c.statement.executeQuery("select * from rooom where Room_no='"+textFieldR.getText()+"'");
                    while (resultSet1.next()){
                        String price= resultSet1.getString("Price");
                        int amountPaid= Integer.parseInt(price)- Integer.parseInt(textFieldAmount.getText());
                        textFieldPending.setText(""+amountPaid);

                    }
                }catch (Exception E){
                    E.printStackTrace();
                }


            }
        });

        JButton bt14 = new JButton("PAY THE BILL");
        bt14.setBounds(300,380,200,30);
        bt14.setForeground(new Color(9,114,130));
        bt14.setBackground(Color.BLACK);
        bt14.setForeground(Color.white);
        panel.add(bt14);
        bt14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new paymentMode();
            }
        });



        JButton button = new JButton("BACK");
        button.setBounds(540,380,120,30);
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
        setSize(850, 480);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Receipt();
    }
}
