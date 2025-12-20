package GUISwing;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class JavaKeyListener extends JFrame implements KeyListener {
    JLabel l;
    ImageIcon icon;

    JavaKeyListener() {
        setTitle("All About keyListener");
        setSize(500, 500);
        setLayout(null);
       

        icon = new ImageIcon("wind-up.png");

        l = new JLabel(icon);
        l.setBounds(0, 0, 100, 100);
        // l.setBackground(Color.red);
        // l.setOpaque(true);
        addKeyListener(this);
        getContentPane().setBackground(Color.BLACK); //set color to background
        
        add(l);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent k) {
        // keyPressed = Invoked when a physical key is pressed down. Uses KeyCode,int
        // output
        switch (k.getKeyCode()) {
            case 37:
                l.setLocation(l.getX() - 10, l.getY()); // move left side
                break;
            case 38:
                l.setLocation(l.getX(), l.getY() - 10); // move upward
                break;
            case 39:
                l.setLocation(l.getX() + 10, l.getY()); // move right
                break;
            case 40:
                l.setLocation(l.getX(), l.getY() + 10); // move downward
                break;
        }

    }

    public void keyReleased(KeyEvent k) {
        // keyReleased : called whenever a button is released
        System.out.println("You released key char : " + k.getKeyChar());
        System.out.println("You released key Code : " + k.getKeyCode()); // Physical key (keyboard key): button number
        // You released key char : ? (Shift doesnt produce any key charecter)
        // You released key Code : 16 (Whwn we pressed shift button)

    }

    public void keyTyped(KeyEvent k) {
        // keyTyped : Invoked when a key is typed ,Uses keyChar,char Output

        switch (k.getKeyChar()) {
            case 'a':
                l.setLocation(l.getX() - 10, l.getY()); // move left side
                break;
            case 'w':
                l.setLocation(l.getX(), l.getY() - 10); // move upward
                break;
            case 's':
                l.setLocation(l.getX() + 10, l.getY()); // move right
                break;
            case 'd':
                l.setLocation(l.getX(), l.getY() + 10); // move downward
                break;
        }

    }

    public static void main(String[] args) {
        new JavaKeyListener();
    }
}
