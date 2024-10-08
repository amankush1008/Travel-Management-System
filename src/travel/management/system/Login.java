
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.border.*;
public class Login extends JFrame implements ActionListener {
    
    JButton login,signup,password;
    JTextField tfusername,tfpassword;
    
    Login(){
        setSize(850,400);
        setLocation(225,150);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        JPanel p1= new JPanel();
        p1.setBackground(new Color(24, 154, 180));
        p1.setBounds(0,0,400,400);
        add(p1);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/Login2.png"));
        Image i2= i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(100,100,200,300);
        p1.add(image);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(lblusername);
        
        tfusername= new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(lblpassword);
        
        tfpassword= new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(24, 154, 180));
        login.setForeground(Color.white);
        login.setBorder(new LineBorder(new Color(24, 154, 180)));
        login.addActionListener(this);
        p2.add(login);
        
        signup = new JButton("SignUp");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(24, 154, 180));
        signup.setForeground(Color.white);
        signup.setBorder(new LineBorder(new Color(24, 154, 180)));
        signup.addActionListener(this);
        p2.add(signup);
        
        password = new JButton("Forget Password");
        password.setBounds(140,250,130,30);
        password.setBackground(new Color(24, 154, 180));
        password.setForeground(Color.white);
        password.setBorder(new LineBorder(new Color(24, 154, 180)));
        password.addActionListener(this);
        p2.add(password);
        
        JLabel text = new JLabel("Trouble in login..");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.red);
        p2.add(text);
        
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == login){
            try{
                String username = tfusername.getText();
                String password = tfpassword.getText();
                
                String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
                Conn c = new Conn();
                ResultSet rs =c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        else if (ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }
        
        else{
            setVisible(false);
            new ForgetPassword();
        }

    }
    public static void main(String[] args) {
        new Login();
                
    }
}
