
package travel.management.system;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Payments extends JFrame implements ActionListener{
    JButton pay;
    Payments(){
        setBounds(230,50,800,600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image); 
        
        pay = new JButton("Pay");
        pay.setBounds(420,10,80,40);
        pay.addActionListener(this);
        image.add(pay);
        
        JButton back = new JButton("Back");
        back.setBounds(520,10,80,40);
        back.addActionListener(this);
        image.add(back);
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new Payments();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == pay){
            setVisible(false);
            new Paytm();
            
        }
        else{
            setVisible(false);
        }
    }
}
