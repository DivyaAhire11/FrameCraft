package GUISwing;

import javax.swing.*; //BorderFactory,ImageIcon,JFrame,JLabel 
import java.awt.*; //Color,Font
import javax.swing.border.Border;

class MyJLabel {
    public static void main(String[] args) {
        
        // JLabel : a GUI display area for a string of text , an image , or both
        JLabel l = new JLabel();
        l.setText("Color Wheel"); // set a label

         Border b = BorderFactory.createLineBorder(Color.green,3);


        ImageIcon img = new ImageIcon("colour.png");
        l.setIcon(img);
        l.setHorizontalTextPosition(JLabel.CENTER);// JLabel.CENTER : overlapping over image , JLabel.LEFT
                                                   // ,JLabel.RIGHT(By default) of imageIcon
        l.setVerticalTextPosition(JLabel.TOP); // set text TOP ,CENTER,BOTTOM of imageIcon
        l.setForeground(new Color(0x00FF00)); // set font color
        l.setFont(new Font("My Boli", Font.ITALIC, 50)); // set font size
        l.setIconTextGap(25); // set gap between image and text : -25 (very close)
        l.setBackground(Color.BLACK);
        l.setOpaque(true);  //display background color 
        l.setBorder(b);  //full frame la border apply
        l.setVerticalAlignment(JLabel.TOP); // set verticle positionn of icon+text withing label
        l.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within Label
        //l.setBounds(100,100,500,550); //set x,y position withing frame as well as dimmention

        JFrame f = new JFrame();
        f.setTitle("Liitle Bit About JLabel");
        f.setLocation(100,100);
        // f.setBounds(100, 100, 600, 620);
        //f.setLayout(null);
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack(); //need to add last
    }
}
