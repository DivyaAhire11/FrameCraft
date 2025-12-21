package GUISwing;

import java.awt.*; //Color, Image
import javax.swing.*; //JFrame , JPanel , Jlabel , ImageIcon ,

public class MyPanel extends JFrame {
    JPanel p1, p2, p3;
    JLabel l;
    ImageIcon img;

    MyPanel() {
        ImageIcon afraidimg = new ImageIcon(
                new ImageIcon("wow.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        setTitle("All About TextField");
        l = new JLabel(afraidimg); // l.setIcon(img)
        //l.setText("hello");
       // l.setVerticalAlignment(JLabel.BOTTOM); // no need when we no used any layout
       //  l.setHorizontalAlignment(JLabel.RIGHT); 
       l.setBounds(50,50,100,100);  


        p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setBounds(0, 0, 250, 250);
        p1.setLayout(null);

        p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setBounds(250, 0, 250, 250);
        p2.setLayout(null);

        p3 = new JPanel();
        p3.setBackground(Color.green);
        p3.setBounds(0, 250, 500, 250);
        p3.setLayout(null);
       
        p3.add(l);

        add(p1);
        add(p2);
        add(p3);

        setLayout(null);
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyPanel();
    }
}
