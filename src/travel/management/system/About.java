
package travel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class About extends JFrame implements ActionListener {
    JButton back;
    About(){
        setBounds(400,100,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Candara",Font.BOLD,20));
        add(l1);
        
        String s ="Welcome to Touris and Travel Management , a comprehensive and innovative solution designed to simplify and streamline travel planning and management for individuals, groups, and organizations. Our system is built to provide a seamless and hassle-free travel experience, from booking flights and hotels to managing itineraries and expenses.\n" +
"\n" +
"Our Mission\n" +
"\n" +
"Our mission is to revolutionize the way people travel by providing a user-friendly, efficient, and cost-effective platform that caters to the diverse needs of travelers. We aim to make travel planning and management a breeze, allowing our users to focus on what matters most – enjoying their trip.";
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setFont(new Font("Candara",Font.BOLD,14));
         area.setBounds(20,100,450,300);
        add(area);
        
        back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new About();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back){
            setVisible(false);
        }
    }
}
