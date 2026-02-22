package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QRcode extends JFrame {

    QRcode(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 540, 490);
        panel.setBackground(new Color(92, 100, 242));
        panel.setLayout(null);
        add(panel);

        JLabel labelBranch = new JLabel("QR Code ");
        labelBranch.setBounds(200, 20, 200, 30);
        labelBranch.setFont(new Font("Tahoma", Font.BOLD, 25));
        labelBranch.setForeground(Color.black);
        panel.add(labelBranch);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/QR.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(180, 100, 200, 300);
        panel.add(label);

        JButton button = new JButton("Back");
        button.setBounds(230,430,120,30);
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
        setSize(550, 500);
        setLayout(null);
        setLocation(400, 250);
        setVisible(true);
    }
    public static void main(String[] args) {

        new QRcode();
    }
}
