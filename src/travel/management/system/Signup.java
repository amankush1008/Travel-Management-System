
package travel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    Signup(){
        setBounds(230,200,800,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setBackground(new Color(24, 154, 180));
        p1.setBounds(0,0,450,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Candara",Font.BOLD,20));
        lblusername.setBounds(50,20,125,25);

        p1.add(lblusername);
        
        tfusername= new JTextField();
        tfusername.setBounds(190, 20, 180, 25);
        tfusername.setFont(new Font("Candara",Font.BOLD,14));
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Candara",Font.BOLD,20));
        lblname.setBounds(50,60,125,25);

        p1.add(lblname);
        
        tfname= new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setFont(new Font("Candara",Font.BOLD,14));
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Candara",Font.BOLD,20));
        lblpassword.setBounds(50,100,125,25);

        p1.add(lblpassword);
        
        tfpassword= new JTextField();
        tfpassword.setBounds(190, 100, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        tfpassword.setFont(new Font("Candara",Font.BOLD,14));
        p1.add(tfpassword);
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Candara",Font.BOLD,20));
        lblsecurity.setBounds(50,140,125,25);
        p1.add(lblsecurity);
        
        security = new Choice();
        security.add("Fav Actor");
        security.add("Pet Name");
        security.add("Your Lucky Number");
        security.setFont(new Font("Candara",Font.BOLD,14));
        security.setBounds(190,140,180,25);
        p1.add(security);

        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setFont(new Font("Candara",Font.BOLD,20));
        lblanswer.setBounds(50,180,125,25);
        p1.add(lblanswer);
        
        tfanswer= new JTextField();
        tfanswer.setBounds(190, 180, 180, 25);
        tfanswer.setFont(new Font("Candara",Font.BOLD,14));
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        create = new JButton("Create");
        create.setBounds(80,250,100,30);
        create.setForeground(new Color(24, 154, 180));
        create.setBackground(Color.white);
        create.setFont(new Font("Candara",Font.BOLD,14));
        create.addActionListener(this);
        p1.add(create);
        
        back = new JButton("Back");
        back.setBounds(250,250,100,30);
        back.setBackground(Color.white);
        back.setForeground(new Color(24, 154, 180));
        back.setFont(new Font("Candara",Font.BOLD,14));
        back.addActionListener(this);

        p1.add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/signup3.png"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(500,50,200,200);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == create){
            String username=tfusername.getText();
            String name = tfname.getText();
            String password= tfpassword.getText();
            String question = security.getSelectedItem();
            String answer= tfanswer.getText();
            
            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                setVisible(false);
                new Login();
                
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}
