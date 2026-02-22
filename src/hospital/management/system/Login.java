package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;



public class Login extends JFrame implements ActionListener {

   JTextField textField;

   JPasswordField jPasswordField;

   JButton b1,b2;

    Login() {

        JLabel namelabel=new JLabel("Username");
        namelabel.setBounds(40,20,100,30);
        namelabel.setFont(new Font("Tahoma",Font.BOLD,18));
        namelabel.setForeground(Color.white);
        add(namelabel);

        JLabel Password=new JLabel("Password");
        Password.setBounds(40,80,100,30);
        Password.setFont(new Font("Tahoma",Font.BOLD,18));
        Password.setForeground(Color.white);
        add(Password);

        textField=new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.BOLD,15)) ;
        textField.setBackground(new Color(228,227,230));
        add(textField);

        jPasswordField=new JPasswordField();
        jPasswordField.setBounds(150,80,150,30);
        jPasswordField.setFont(new Font("Tahoma",Font.PLAIN,15));
        jPasswordField.setBackground(new Color(228,227,230));
        add(jPasswordField);

       ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/logo icon.jpg"));
        Image i1=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label= new JLabel(imageIcon1);
        label.setBounds(300,-30,400,300);
        add(label);



        b1=new JButton("Login");
        b1.setBounds(60,150,100,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        //b1.setBackground(Color.black);
        //b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);



        b2=new JButton("Cancel");
        b2.setBounds(200,150,100,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        //b2.setBackground(Color.black);
        //b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        //28,26,26


        getContentPane().setBackground(new Color(28,26,26));
        setSize(750,300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);

    }

     //public static void main(String[] args) {
       // new Login();
    //}

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            try{
                conn c=new conn();
                String user=textField.getText();
                String pass=jPasswordField.getText();

                String q="select * from login where ID='"+user+"' and PW = '"+pass+"'";
                ResultSet resultSet=c.statement.executeQuery(q);

                if(resultSet.next()){
                    new Reception();
                    setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null,"Invalid");
                }

            } catch(Exception E){
                E.printStackTrace();

            }
        }else{
            System.exit(10);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
