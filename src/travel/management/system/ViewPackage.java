
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener {
    JButton back;
    
    ViewPackage(String username){
        setBounds(200,100,900,455);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setBounds(60,7,300,30);
        text.setFont(new Font("Candara",Font.BOLD,20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        JLabel lblperson = new JLabel("Total Person");
        lblperson.setBounds(30,130,150,25);
        add(lblperson);
        
        JLabel labelperson = new JLabel();
        labelperson.setBounds(220,130,150,25);
        add(labelperson);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,170,150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,210,150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(30,250,150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,250,150,25);
        add(labelphone);
        
        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30,290,150,25);
        add(lblprice);
        
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);
        
        
        back = new JButton("Back");
        back.setBounds(130,360,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookeddetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,500,400);
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelpackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelperson.setText(rs.getString("persons"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new ViewPackage("");
    }

   
}
