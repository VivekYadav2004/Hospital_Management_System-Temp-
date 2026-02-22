package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Update_Patient_Details extends JFrame {
    Update_Patient_Details(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(92,100,242));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/pp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(470,60,500,300);
        panel.add(label);



        JLabel label1= new JLabel("Update Patient Details");
        label1.setBounds(124,11,260,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        label1.setForeground(Color.black);
        panel.add(label1);

        JLabel label2 = new JLabel("Name :");
        label2.setBounds(24,88,100,17);
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        label2.setForeground(Color.white);
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

        JLabel label3 = new JLabel("Room Number");
        label3.setBounds(25,129,120,14);
        label3.setFont(new Font("Tahoma",Font.BOLD,17));
        label3.setForeground(Color.white);
        panel.add(label3);

        JTextField textFieldR = new JTextField();
        textFieldR.setBounds(248,129,140,25);
        panel.add(textFieldR);

        JLabel label4 = new JLabel("In-Time :");
        label4.setBounds(24,180,100,14);
        label4.setFont(new Font("Tahoma",Font.BOLD,17));
        label4.setForeground(Color.white);
        panel.add(label4);

        JTextField textFieldINTime = new JTextField();
        textFieldINTime.setBounds(248,175,140,25);
        panel.add(textFieldINTime);

        JLabel label5 = new JLabel("Amount Paid :");
        label5.setBounds(24,225,150,14);
        label5.setFont(new Font("Tahoma",Font.BOLD,17));
        label5.setForeground(Color.white);
        panel.add(label5);

        JTextField textFieldAmount = new JTextField();
        textFieldAmount.setBounds(248,216,140,25);
        panel.add(textFieldAmount);

        JLabel label6 = new JLabel("Pending Amount :");
        label6.setBounds(24,261,150,25);
        label6.setFont(new Font("Tahoma",Font.BOLD,17));
        label6.setForeground(Color.white);
        panel.add(label6);

        JTextField textFieldPending = new JTextField();
        textFieldPending.setBounds(248,261,140,25);
        panel.add(textFieldPending);

        JButton check = new JButton("CHECK");
        check.setBounds(281,378,89,23);
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

        JButton Update = new JButton("UPDATE");
        Update.setBounds(395,378,89,23);
        Update.setBackground(Color.black);
        Update.setForeground(Color.white);
        panel.add(Update);
        Update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    conn c = new conn();
                    String q = choice.getSelectedItem();
                    String room= textFieldR.getText();
                    String time= textFieldINTime.getText();
                    String amount=textFieldAmount.getText();
                    c.statement.executeUpdate("update patient_info set Room_number='"+room+"',Time='"+time+"',Deposite='"+amount+"' where Name ='"+q+"'");
                    JOptionPane.showMessageDialog(null,"Updated Successfully");
                    setVisible(false);


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("BACK");
        back.setBounds(168,378,89,23);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(950,500);
        setLayout(null);
        setLocation(400,250);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Update_Patient_Details();
    }
}
