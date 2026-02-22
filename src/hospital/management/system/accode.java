package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accode extends JFrame {
    accode(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 470);
        panel.setBackground(new Color(92, 100, 242));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/hdfc.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(570, 100, 200, 200);
        panel.add(label);

        JLabel labelName1 = new JLabel("Bank Details");
        labelName1.setBounds(350, 11, 268, 53);
        labelName1.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelName1.setForeground(Color.black);
        panel.add(labelName1);


        JLabel labelBName1 = new JLabel("Bank Name :");
        labelBName1.setBounds(35, 100, 200, 14);
        labelBName1.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelBName1.setForeground(Color.black);
        panel.add(labelBName1);

        JLabel labelBName2 = new JLabel("HDFC BANK");
        labelBName2.setBounds(200, 100, 200, 14);
        labelBName2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        labelBName2.setForeground(Color.WHITE);
        panel.add(labelBName2);



        JLabel labelName2 = new JLabel("A/C Name : ");
        labelName2.setBounds(35, 150, 200, 14);
        labelName2.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelName2.setForeground(Color.black);
        panel.add(labelName2);

        JLabel labelName3 = new JLabel("ASVA HOSPITAL");
        labelName3.setBounds(200, 150, 200, 14);
        labelName3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        labelName3.setForeground(Color.white);
        panel.add(labelName3);

        JLabel labelNumber = new JLabel("A/C Number : ");
        labelNumber.setBounds(35, 200, 200, 14);
        labelNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelNumber.setForeground(Color.black);
        panel.add(labelNumber);

        JLabel labelNumber1 = new JLabel("123349838559");
        labelNumber1.setBounds(200, 200, 200, 14);
        labelNumber1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        labelNumber1.setForeground(Color.white);
        panel.add(labelNumber1);

        JLabel labelType = new JLabel("A/C Type : ");
        labelType.setBounds(35, 250, 200, 19);
        labelType.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelType.setForeground(Color.black);
        panel.add(labelType);

        JLabel labelType1 = new JLabel("CURRENT BANK ACCOUNT");
        labelType1.setBounds(200, 250, 250, 14);
        labelType1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        labelType1.setForeground(Color.white);
        panel.add(labelType1);

        JLabel labelBranch = new JLabel("Branch : ");
        labelBranch.setBounds(35, 300, 200, 19);
        labelBranch.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelBranch.setForeground(Color.black);
        panel.add(labelBranch);

        JLabel labelBranch1 = new JLabel("MALDAHIYA");
        labelBranch1.setBounds(200, 300, 250, 14);
        labelBranch1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        labelBranch1.setForeground(Color.white);
        panel.add(labelBranch1);

        JLabel labelIFSC = new JLabel("IFSC Code : ");
        labelIFSC.setBounds(35, 350, 200, 19);
        labelIFSC.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelIFSC.setForeground(Color.black);
        panel.add(labelIFSC);

        JLabel labelIFSC1 = new JLabel("HDF003875");
        labelIFSC1.setBounds(200, 350, 250, 14);
        labelIFSC1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        labelIFSC1.setForeground(Color.white);
        panel.add(labelIFSC1);


        JButton button = new JButton("Back");
        button.setBounds(340,400,120,30);
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
        new accode();
    }
}
