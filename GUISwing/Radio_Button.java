package GUISwing;

import java.awt.*;
import javax.swing.*; //ButtonGroup ,JFrame , JLabel , JRadioButton
import java.awt.event.*;

public class Radio_Button extends JFrame implements ActionListener {
    JRadioButton pizza, rasmalai, samosa;
    // ImageIcon pizzIcon, rasIcon, samosaIcon;
    JLabel l;
    Radio_Button() {
        setTitle("About Swing RadioButton");

        // pizzIcon = new ImageIcon("pizza.jpg");
        // rasIcon = new ImageIcon("rasmalai.jpg");
        // samosaIcon = new ImageIcon("samosa.jpg");

        l = new JLabel("Select Your Favorite Food :");
        ButtonGroup bg = new ButtonGroup();
        pizza = new JRadioButton("Pizza");
        rasmalai = new JRadioButton("Rasmalai");
        samosa = new JRadioButton("Samosa");

        bg.add(pizza);
        bg.add(rasmalai);
        bg.add(samosa);

        pizza.addActionListener(this);
        rasmalai.addActionListener(this);
        samosa.addActionListener(this);

        // pizza.setIcon(pizzIcon);
        // rasmalai.setIcon( rasIcon);
        // samosa.setIcon(samosaIcon);
        add(l);
        add(pizza);
        add(rasmalai);
        add(samosa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizza){
            System.out.println("Your favorite Food is Pizza!!!");
        }
        if(e.getSource() == rasmalai){
             System.out.println("Your favorite Food is Rasmalai!!");
        }
          if(e.getSource() == samosa){
             System.out.println("Your favorite Food is Samosa!!!");
        }
    }

    public static void main(String[] args) {
        new Radio_Button();
    }
}