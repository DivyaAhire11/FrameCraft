
/**
 * Aadhi components vr listener lavl aata Frame vr Listener lau 
 * KEY LISTENER
        public abstract void keyTyped(KeyEvent);
        public abstract void keyPressed(KeyEvent);
        public abstract void keyReleased(KeyEvent);
 * Interface : All method of interface must be implemented by iits subclass
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyKeyListener extends JFrame implements KeyListener{
   JTextField t1,t2,t3,t4;

   
    MyKeyListener() {
        setTitle(" Key Listener Example");
        setBounds(150, 200, 400, 300);
        setLayout(new FlowLayout());

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);


        add(t1);
        add(t2);
        add(t3);
        add(t4);

        t1.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void keyPressed(KeyEvent k){
        System.out.println("key Pressed");
    }
    public void keyTyped(KeyEvent k){
       System.out.println("key Typed");
    }
    public void keyReleased(KeyEvent k){
        System.out.println("key Released");
    }

    public static void main(String[] args) {
        new MyKeyListener();
    }
}
