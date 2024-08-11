
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class CheckPackage extends JFrame {
    
    
    
    CheckPackage(){
        setBounds(190,50,900,600);
        
        String[] package1 ={ "GOLD PACKAGE","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Soft Drinks Free","Full Day 3 Island Cruise","English Speaking Guide","BOOK PACKAGE","SUMMER SPECIAL","Rs 32000/-","package1.jpg"};
        String[] package2 ={ "SILVER PACKAGE", "5 Days and 6 Night","Toll Free","Entrance Free Tickets","Meet and Greet at Airpot","Welcome Drinks on Arrival","Night Safari","Cruise with Dinner","BOOK NOW","WINTER SPECIAL","Rs 24000/-","package2.jpg"};
        String[] package3 ={ "BRONZE PACKAGE","6 Days and 5 Nights","Return Airfare","Free Clubbing","Horse Riding","River Rafting","Hard Drinks Free","Daily Buffet","BOOK NOW","BBQ Dinner","Rs 12000/-","package3.jpg"};

        JTabbedPane tab = new JTabbedPane();
        
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null,p1);
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null,p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null,p3);
        
        add(tab);
        
        setVisible(true);
    }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50,15,300,30);
        l1.setForeground(new Color(255,215,0));
        l1.setFont(new Font("Candara",Font.BOLD,30));
        p1.add(l1);
        
        JLabel f1 = new JLabel(pack[1]);
        f1.setBounds(30,60,300,30);
        f1.setForeground(Color.red);
        f1.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f1);
        
        JLabel f2 = new JLabel(pack[2]);
        f2.setBounds(30,110,300,30);
        f2.setForeground(Color.blue);
        f2.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f2);
        
        JLabel f3 = new JLabel(pack[3]);
        f3.setBounds(30,160,300,30);
        f3.setForeground(Color.red);
        f3.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f3);
        
        JLabel f4 = new JLabel(pack[4]);
        f4.setBounds(30,210,300,30);
        f4.setForeground(Color.blue);
        f4.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f4);
        
        JLabel f5 = new JLabel(pack[5]);
        f5.setBounds(30,260,300,30);
        f5.setForeground(Color.red);
        f5.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f5);
        
        JLabel f6 = new JLabel(pack[6]);
        f6.setBounds(30,310,300,30);
        f6.setForeground(Color.blue);
        f6.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f6);
        
        JLabel f7 = new JLabel(pack[7]);
        f7.setBounds(30,360,300,30);
        f7.setForeground(Color.red);
        f7.setFont(new Font("Candara",Font.BOLD,25));
        p1.add(f7);
        
        JLabel f8 = new JLabel(pack[8]);
        f8.setBounds(60,430,300,30);
        f8.setForeground(Color.black);
        f8.setFont(new Font("Candara",Font.BOLD,30));
        p1.add(f8);
        
        JLabel f9 = new JLabel(pack[9]);
        f9.setBounds(80,480,300,30);
        f9.setForeground(Color.magenta);
        f9.setFont(new Font("Candara",Font.BOLD,30));
        p1.add(f9);
        
        JLabel f10 = new JLabel(pack[10]);
        f10.setBounds(500,480,300,30);
        f10.setForeground(Color.cyan);
        f10.setFont(new Font("Candara",Font.BOLD,30));
        p1.add(f10);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,20,500,300);
        p1.add(image);
        
        return p1;
    }
    
    public static void main(String[] args) {
        new CheckPackage();
    }
}
