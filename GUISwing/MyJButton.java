package GUISwing;

import java.awt.Image;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

class MyJButton extends JFrame implements ActionListener {
    JButton b;
    JLabel l1, l2;
    boolean isSleeping = true;

    // int cnt=0;
    MyJButton() {
        // Load image
        ImageIcon icon = new ImageIcon("pointing.png");
        ImageIcon icon2 = new ImageIcon("sleep.png");
        ImageIcon icon3 = new ImageIcon("wow.png");

        // Scale image
        Image img = icon.getImage();
        Image img2 = icon2.getImage();
        Image img3 = icon3.getImage();

        Image point = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image sleep = img2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        Image afraid = img3.getScaledInstance(150, 150, Image.SCALE_SMOOTH);

        // set scaled image
        ImageIcon pointHand = new ImageIcon(point);
        ImageIcon sleepimg = new ImageIcon(sleep);
        ImageIcon Afraidimg = new ImageIcon(afraid);

        l1 = new JLabel();
        l1.setIcon(sleepimg);
        l1.setBounds(150, 250, 150, 150);
        l1.setVerticalTextPosition(JLabel.TOP);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setVisible(true);

        l2 = new JLabel();
        l2.setIcon(Afraidimg);
        l2.setBounds(150, 250, 150, 150);
        l2.setVerticalTextPosition(JLabel.TOP);
         l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setVisible(false);

        b = new JButton();
        b.setBounds(100, 200, 170, 70);
        b.setText("I'm a button!");
        b.setFocusable(false); // remove inner border
        b.setIcon(pointHand);
        b.setHorizontalAlignment(JButton.CENTER);
        b.setVerticalAlignment(JButton.TOP);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setIconTextGap(-8);
        b.setFont(new Font("Comic Sans", Font.BOLD, 18));
        b.setForeground(new Color(0xd9ed92));
        b.setBackground(new Color(0x184e77));
        b.setBorder(BorderFactory.createEtchedBorder());
        // b.setEnabled(false);

        setTitle("All About button");
        setBounds(50, 50, 400, 420);
        setLayout(null);

        b.addActionListener(this);
        // b.addActionListener(e -> {cnt++; JOptionPane.showMessageDialog(this, "You
        // Click Button : " +
        // cnt);});//Lambda expresion

        add(b);
        add(l1);
        add(l2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (isSleeping) {
            l1.setVisible(false); // sleep image
            l2.setVisible(true); // afraid image
        } else {
            l2.setVisible(false);
            l1.setVisible(true);
        }
        isSleeping = !isSleeping; // toggle state
        // cnt++;
        // JOptionPane.showMessageDialog(this, "You Click Button : " + cnt);
        // b.setEnabled(false);
    }

    public static void main(String[] args) {
        // JButton : a button that performs an action when clicked on
        new MyJButton();
    }
}
