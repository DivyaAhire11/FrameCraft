
/**
 * Aadhi components vr listener lavl aata Frame vr Listener lau 
 * KEY LISTENER
        public abstract void keyTyped(KeyEvent);    (2)
        public abstract void keyPressed(KeyEvent);  (1)
        public abstract void keyReleased(KeyEvent); (3)
 * Interface : All method of interface must be implemented by iits subclass
 * 
 * KeyListener      KeyEvent       addKeyListener   (3 methods)
 * 
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
       t2.setText("Key Pressed : "+k.getKeyChar()); //jya Key la pressed kel tyach charecter print
    }
    public void keyTyped(KeyEvent k){
        t3.setText("Key Typed : "+k.getKeyChar());
    }
    public void keyReleased(KeyEvent k){
        t4.setText("Key Released : "+k.getKeyChar());
    }

    public static void main(String[] args) {
        new MyKeyListener();
    }
}
