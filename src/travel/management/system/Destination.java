package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Destination extends JFrame implements Runnable {
    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, ll0;
    JLabel[] label = new JLabel[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, ll0};
    @Override
    public void run() {
        
        try {
            for (int i = 0; i <9; i++) {
                label[i].setVisible(true);
                Thread.sleep(2500);
                if(i == 8){
                    break;
                }

                label[i].setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Destination() {
         // Move setVisible(true) to the beginning
        setBounds(220, 50, 800, 600);
        
        
        
        ImageIcon h1 = null, h2 = null, h3 = null, h4 = null, h5 = null, h6 = null, h7 = null, h8 = null, h9 = null, h10 = null;
        ImageIcon[] image = new ImageIcon[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};

        ImageIcon j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null, j10 = null;
        ImageIcon[] jimage = new ImageIcon[]{j1, j2, j3, j4, j5, j6, j7, j8, j9, j10};

        ImageIcon k1 = null, k2 = null, k3 = null, k4 = null, k5 = null, k6 = null, k7 = null, k8 = null, k9 = null, k10 = null;
        ImageIcon[] kimage = new ImageIcon[]{k1, k2, k3, k4, k5, k6, k7, k8, k9, k10};

        for (int i = 0; i < 9; i++) {
            image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (i + 1) + ".jpg"));
            Image scaledImage = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            jimage[i] = new ImageIcon(scaledImage);
            kimage[i] = jimage[i];

            label[i] = new JLabel(kimage[i]);
            label[i].setBounds(0, 0, 800, 600);
            label[i].setVisible(true); // Add setVisible(true) here
            add(label[i]);
        }

        t1 = new Thread(this);
        t1.start(); // Start the thread
        setVisible(true);
    }

    public static void main(String[] args) {
        new Destination();
    }
}