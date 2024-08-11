package travel.management.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.IOException;

public class Paytm extends JFrame implements ActionListener {
    JButton back;
    Paytm() {
        setBounds(230, 50, 800, 600);
        setLayout(null);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try {
            pane.setPage("https://paytm.com/rent-payment");
        } catch (IOException e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
        }

        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);

        
        back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);

    }

    public static void main(String[] args) {
        new Paytm();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back){
            setVisible(false);
            new Payments();
        }
    }
}    