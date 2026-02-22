package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paymentMode extends JFrame {
    paymentMode(){



        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 540, 320);
        panel.setBackground(new Color(92, 100, 242));
        panel.setLayout(null);
        add(panel);

      /*  ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/PM.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(570, 150, 200, 200);
        panel.add(label);
*/

        JButton bt1 = new JButton("QR Code");
        bt1.setBounds(170,190,200,30);
        bt1.setForeground(new Color(9,114,130));
        panel.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new QRcode();
            }
        });

        JButton bt2 = new JButton("Account Details");
        bt2.setBounds(170,130,200,30);
        bt2.setForeground(new Color(9,114,130));
        panel.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new accode();
            }
        });



        JLabel labelName = new JLabel("Payment Mode");
        labelName.setBounds(200, 11, 268, 53);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelName.setForeground(Color.black);
        panel.add(labelName);

        JButton button = new JButton("Back");
        button.setBounds(220,260,120,30);
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
        setSize(550, 330);
        setLayout(null);
        setLocation(500, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new paymentMode();
    }
}
