
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ViewBookHotel extends JFrame implements ActionListener {
    JButton back;
    
    ViewBookHotel(String username){
        setBounds(150,50,1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text = new JLabel("VIEW BOOKED HOTELS DETAILS");
        text.setBounds(60,7,300,30);
        text.setFont(new Font("Candara",Font.BOLD,20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Hotel Name");
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
        
        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30,170,150,25);
        add(lbldays);
        
        JLabel labeldays = new JLabel();
        labeldays.setBounds(220,170,150,25);
        add(labeldays);
        
        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setBounds(30,210,150,25);
        add(lblac);
        
        JLabel labelac = new JLabel();
        labelac.setBounds(220,210,150,25);
        add(labelac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setBounds(30,250,150,25);
        add(lblfood);
        
        JLabel labelfood = new JLabel();
        labelfood.setBounds(220,250,150,25);
        add(labelfood);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,290,150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,290,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,330,150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,330,150,25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(30,370,150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,370,150,25);
        add(labelphone);
        
        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30,410,150,25);
        add(lblprice);
        
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,410,150,25);
        add(labelprice);
        
        
        back = new JButton("Back");
        back.setBounds(130,460,100,25);
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
            String query = "select * from bookhotel where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelpackage.setText(rs.getString("hotel"));
                labeldays.setText(rs.getString("days"));
                labelfood.setText(rs.getString("foodincluded"));
                labelac.setText(rs.getString("acroom"));
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
        new ViewBookHotel("");
    }

   
}
