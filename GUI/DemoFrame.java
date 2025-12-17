/**
 * BorderLayout :
    NORTH , SOUTH , EAST, WEST, CENTER;
 */
package GUI;

import java.awt.*;
import javax.swing.*;

class DemoFrame extends JFrame {
    JTextField t;
    JButton b1, b2, b3, b4;

    DemoFrame(){
        setTitle("Demo frame");
        setBounds(200,100,400,200);
        setLayout(new BorderLayout());     //Default Layout = BorderLayout
        t = new JTextField(30);
        b1 = new JButton("bt1");
        b2 = new JButton("bt2");
        b3 = new JButton("bt3");
        b4 = new JButton("bt4");
        

        add(t,BorderLayout.CENTER);
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.NORTH);  
      

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoFrame();
    }
}
