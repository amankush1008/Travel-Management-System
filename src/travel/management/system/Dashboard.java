
package travel.management.system;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails, viewPersonalDetails,updatePersonalDetails,deletePersonalDetails;
    JButton checkpackages, bookpackage, viewpackage, viewhotels, destination, bookhotel, viewBookedHotel, payments,notepad, calculators, about;
    Dashboard(String username){
        this.username=username;
        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(10, 10, 122));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(10, 10, 122));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setBounds(0,0,300,39);
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setBackground(new Color(10, 10, 122));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setBounds(0,39,300,39);
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setBackground(new Color(10, 10, 122));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setBounds(0,78,300,39);
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setBackground(new Color(10, 10, 122));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setBounds(0,117,300,39);
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setBackground(new Color(10, 10, 122));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackages = new JButton("Check Package");
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setBounds(0,156,300,39);
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setBackground(new Color(10, 10, 122));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setBounds(0,195,300,39);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBackground(new Color(10, 10, 122));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package");
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setBounds(0,234,300,39);
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setBackground(new Color(10, 10, 122));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setBounds(0,273,300,40);
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setBackground(new Color(10, 10, 122));
        viewhotels.setMargin(new Insets(0,0,0,140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setBounds(0,313,300,40);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBackground(new Color(10, 10, 122));
        bookhotel.setMargin(new Insets(0,0,0,150));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setBounds(0,353,300,39);
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setBackground(new Color(10, 10, 122));
        viewBookedHotel.setMargin(new Insets(0,0,0,80));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destination = new JButton("Destinations");
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setBounds(0,392,300,39);
        destination.setForeground(Color.WHITE);
        destination.setBackground(new Color(10, 10, 122));
        destination.setMargin(new Insets(0,0,0,135));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payments");
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setBounds(0,431,300,39);
        payments.setForeground(Color.WHITE);
        payments.setBackground(new Color(10, 10, 122));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculators = new JButton("Calculator");
        calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculators.setBounds(0,470,300,39);
        calculators.setForeground(Color.WHITE);
        calculators.setBackground(new Color(10, 10, 122));
        calculators.setMargin(new Insets(0,0,0,155));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        notepad = new JButton("Notepad");
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setBounds(0,509,300,39);
        notepad.setForeground(Color.WHITE);
        notepad.setBackground(new Color(10, 10, 122));
        notepad.setMargin(new Insets(0,0,0,165));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setBounds(0,548,300,39);
        about.setForeground(Color.WHITE);
        about.setBackground(new Color(10, 10, 122));
        about.setMargin(new Insets(0,0,0,185));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.PLAIN,42));
        image.add(text);
        
        setVisible(true);

    }
    
    public static void main(String[] args) {
        new Dashboard("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkpackages){
            new CheckPackage();
        }
        else if(ae.getSource()==bookpackage){
            new BookPackage(username);
        }
        
        else if(ae.getSource()==viewpackage){
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }
        else if(ae.getSource()==destination){
            new Destination();
        }
        else if(ae.getSource()==bookhotel){
            new BookHotel(username);
        }
        
        else if(ae.getSource()==viewBookedHotel){
            new ViewBookHotel(username);
        }
        else if(ae.getSource()==payments){
            new Payments();
        }
        else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==about){
            new About();
        }
        else if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }

        
    }
}
