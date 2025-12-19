package GUISwing;

import javax.swing.*;
import java.awt.*;

class MyJLabel {
    public static void main(String[] args) {

        // JLabel : a GUI display area for a string of text , an image , or both
        JLabel l = new JLabel();
        l.setText("Color Wheel"); // set a label

        ImageIcon img = new ImageIcon("colour.png");
        l.setIcon(img);
        l.setHorizontalTextPosition(JLabel.CENTER);// JLabel.CENTER : overlapping over image , JLabel.LEFT
                                                   // ,JLabel.RIGHT(By default) of imageIcon
        l.setVerticalTextPosition(JLabel.TOP); // set text TOP ,CENTER,BOTTOM of imageIcon
        l.setForeground(new Color(0x00FF00)); // set font color
        l.setFont(new Font("My Boli", Font.ITALIC, 20)); // set font size
        l.setIconTextGap(25); // set gap between image and text : -25 (very close)
        l.setBackground(Color.BLACK);
        l.setOpaque(true);  //display background color 

        JFrame f = new JFrame();
        f.setTitle("Liitle Bit About JLabel");
        f.setBounds(100, 100, 600, 620);
       
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
