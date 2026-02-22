package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;



public class Emergency extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldDisease, textFieldName, textFieldNumber, textFieldDeposit;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;
    JButton b1, b2;


    Emergency() {


        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 390);
        panel.setBackground(new Color(92, 100, 242));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/emg.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(540, 50, 300, 300);
        panel.add(label);

        JLabel labelName = new JLabel("Emergency");
        labelName.setBounds(118, 11, 268, 53);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(labelName);

        JLabel labelID = new JLabel("Id : ");
        labelID.setBounds(35, 76, 200, 14);
        labelID.setFont(new Font("Tahoma", Font.BOLD, 18));
        labelID.setForeground(Color.white);
        panel.add(labelID);

        comboBox = new JComboBox(new String[]{"Aadhaar Card", "Voter ID", "Driving License"});
        comboBox.setBounds(271, 73, 150, 25);
        comboBox.setBackground(new Color(3, 44, 48));
        comboBox.setForeground(Color.white);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number : ");
        labelNumber.setBounds(35, 111, 200, 18);
        labelNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelNumber.setForeground(Color.white);
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271, 111, 150, 20);
        panel.add(textFieldNumber);

        JLabel labelName1 = new JLabel("Name : ");
        labelName1.setBounds(35, 151, 200, 18);
        labelName1.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelName1.setForeground(Color.white);
        panel.add(labelName1);

        textFieldName = new JTextField();
        textFieldName.setBounds(271, 151, 150, 20);
        panel.add(textFieldName);

        JLabel labelGender = new JLabel("Gender : ");
        labelGender.setBounds(35, 191, 200, 18);
        labelGender.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelGender.setForeground(Color.white);
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setForeground(Color.white);
        r1.setBackground(new Color(109, 164, 170));
        r1.setBounds(271, 191, 80, 15);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setForeground(Color.white);
        r2.setBackground(new Color(109, 164, 170));
        r2.setBounds(350, 191, 80, 15);
        panel.add(r2);

      /*  JLabel labelBlood = new JLabel("Blood Group : ");
        labelBlood.setBounds(35, 231, 200, 14);
        labelBlood.setFont(new Font("Tahoma", Font.BOLD, 18));
        labelBlood.setForeground(Color.white);
        panel.add(labelBlood);

        comboBox = new JComboBox(new String[]{"A+", "B+", "O+","AB+","O-"});
        comboBox.setBounds(271, 231, 150, 25);
        comboBox.setBackground(new Color(3, 44, 48));
        comboBox.setForeground(Color.white);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
        panel.add(comboBox);
*/



        JLabel labelRoom = new JLabel("Room : ");
        labelRoom.setBounds(35, 230, 200, 16);
        labelRoom.setFont(new Font("Tahoma", Font.BOLD, 18));
        labelRoom.setForeground(Color.white);
        panel.add(labelRoom);

        c1=new Choice();
        try{
            conn c=new conn();
            ResultSet resultSet=c.statement.executeQuery("select * from ERoom ");
            while (resultSet.next()){
                c1.add(resultSet.getString("Room_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        c1.setBounds(271, 230, 150, 20);
       // c1.setFont(new Font("Tahoma", Font.BOLD, 14));
        //c1.setForeground(Color.WHITE);
       // c1.setBackground(Color.BLACK);
        panel.add(c1);

        JLabel labelDate = new JLabel("Time : ");
        labelDate.setBounds(35, 280, 200, 14);
        labelDate.setFont(new Font("Tahoma", Font.BOLD, 18));
        labelDate.setForeground(Color.white);
        panel.add(labelDate);

        Date date1 = new Date();

        date = new JLabel("" + date1);
        date.setBounds(271, 280, 280, 14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(date);

       /* JLabel labelDeposit = new JLabel("Deposit :");
        labelDeposit.setBounds(35, 359, 200, 20);
        labelDeposit.setFont(new Font("Tahoma", Font.BOLD, 18));
        labelDeposit.setForeground(Color.white);
        panel.add(labelDeposit);

        textFieldDeposit = new JTextField();
        textFieldDeposit.setBounds(271, 359, 150, 20);
        panel.add(textFieldDeposit);*/

        b1 = new JButton("ADD");
        b1.setBounds(100, 340, 120, 30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("EXIT");
        b2.setBounds(260, 340, 120, 30);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        panel.add(b2);



        setUndecorated(true);
        setSize(850, 400);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);

    }


   @Override
    public void actionPerformed(ActionEvent e)
   {
        if(e.getSource()==b1) {
            conn c = new conn();
            String radioBTN = null;
            if (r1.isSelected()) {
                radioBTN = "Male";

            } else if (r2.isSelected()) {
                radioBTN = "Female";
            }

            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textFieldName.getText();
            String s4 = radioBTN;
            // String s5 = (String) comboBox.getSelectedItem();//
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            // String s8 = textFieldDeposit.getText();//

             try {
                String q = "insert  into Epatient_info values ('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s6 + "','" + s7 + "')";
                String q1 = "update ERoom set Availability = 'Occupied' where Room_no=" + s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Added Successfully");
                setVisible(false);

            } catch (Exception E) {
                E.printStackTrace();
            }
        }
           else {
            setVisible(false);
        }

    }


    public static void main(String[] args) {
        new Emergency();
    }
}
