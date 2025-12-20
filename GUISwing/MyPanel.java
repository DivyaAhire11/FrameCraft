package GUISwing;

import java.awt.Color;

import javax.swing.*; //JFrame , JPanel , Jlabel , ImageIcon ,

public class MyPanel extends JFrame {
    JPanel p1,p2,p3;
    MyPanel() {
        setTitle("All About TextField");
        
        p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setBounds(0,0,250,250);
        
        p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setBounds(250,0,250,250);
        
        p3 = new JPanel();
        p3.setBackground(Color.green);
        p3.setBounds(0,250,500,250);
        
        add(p1);
        add(p2);
        add(p3);
        setLayout(null);
        setSize(750,750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyPanel();
    }
}
