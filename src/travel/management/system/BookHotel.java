
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;


public class BookHotel  extends JFrame implements ActionListener{
    Choice hotel, cac, cfood;
    JTextField tfperson,tfdays, tfroom;
    JLabel labelusername,labelid, labelnumber,labelphone, labelprice;
    String username;
    JButton checkprice, bookhotel,back;
    
    BookHotel(String username){
        this.username=username;
        setBounds(90,100,1000,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Candara",Font.BOLD,20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Candara",Font.BOLD,16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
        
        
        labelusername = new JLabel();
        labelusername.setBounds(250,70,150,20);
        labelusername.setFont(new Font("Candara",Font.BOLD,16));
        add(labelusername);
        
        JLabel lblcpackage = new JLabel("Select Hotel");
        lblcpackage.setFont(new Font("Candara",Font.BOLD,16));
        lblcpackage.setBounds(40,110,200,20);
        add(lblcpackage);
        
        hotel = new Choice();
        hotel.setBounds(250,110,200,20);
        add(hotel);
        
        try{
            Conn c =  new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while(rs.next()){
                hotel.add(rs.getString("name"));
            }
        }catch(Exception e){
            
        }
        
        JLabel lblperson = new JLabel("Total Person");
        lblperson.setFont(new Font("Candara",Font.BOLD,16));
        lblperson.setBounds(40,150,150,20);
        add(lblperson);
        
        tfperson = new JTextField("1");
        tfperson.setBounds(250,150,200,20);
        add(tfperson);
        
        JLabel lbldays = new JLabel("No. of Days");
        lbldays.setFont(new Font("Candara",Font.BOLD,16));
        lbldays.setBounds(40,190,150,20);
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,20);
        add(tfdays);
        
        JLabel lblroom = new JLabel("AC/ Non-AC");
        lblroom.setFont(new Font("Candara",Font.BOLD,16));
        lblroom.setBounds(40,230,150,20);
        add(lblroom);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Candara",Font.BOLD,16));
        lblfood.setBounds(40,270,150,20);
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Candara",Font.BOLD,16));
        lblid.setBounds(40,310,150,20);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(250,310,200,20);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Candara",Font.BOLD,16));
        lblnumber.setBounds(40,350,150,20);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(250,350,200,20);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Candara",Font.BOLD,16));
        lblphone.setBounds(40,390,150,20);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250,390,200,20);
        add(labelphone);
        
        JLabel lblprice = new JLabel("Total Price");
        lblprice.setFont(new Font("Candara",Font.BOLD,16));
        lblprice.setBounds(40,430,150,20);
        add(lblprice);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,430,200,20);
        add(labelprice);
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60,460,120,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.white);
        bookhotel.setBounds(200,460,120,25);
        bookhotel.addActionListener(this);
        add(bookhotel);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(340,460,120,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500,50,600,300);
        add(image);
        
        
        
        try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
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
        if(ae.getSource() == checkprice){
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name ='"+hotel.getSelectedItem()+"'");
                
                while(rs.next()){
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int ac = Integer.parseInt(rs.getString("acroom"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    
                    int persons=Integer.parseInt(tfperson.getText());
                    int days=Integer.parseInt(tfdays.getText());
                    
                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();
                    
                    if(persons * days > 0){
                        int total = 0;
                        total += acselected.equals("AC")? ac:0;
                        total += foodselected.equals("Yes")? food:0;
                        total +=cost;
                        total = total * persons *days;
                        labelprice.setText("Rs "+total);
                    }else{
                        JOptionPane.showMessageDialog(null, "Please enter valid number");
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource() == bookhotel){
            try{
            Conn c = new Conn();
            String query = "INSERT INTO bookhotel VALUES ('" + labelusername.getText() + "','" + hotel.getSelectedItem() + "','" + tfperson.getText() + "','" + tfdays.getText() + "','" + cac.getSelectedItem() + "','" + cfood.getSelectedItem() + "','" + labelid.getText() + "','" + labelnumber.getText() + "','" + labelphone.getText() + "','" + labelprice.getText() + "')";
            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        else{
            setVisible(false);
        }
    }
    

    public static void main(String[] args) {
        new BookHotel("");
    }
}

    