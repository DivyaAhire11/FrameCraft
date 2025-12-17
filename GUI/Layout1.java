package GUI;
import java.awt.*;
import javax.swing.*;

 class MYLayout extends JFrame{
    JTextField t;
    JButton b1, b2, b3, b4;

    MYLayout(){
        setTitle("Demo frame");
        setBounds(200,100,400,200);
        setLayout(new GridLayout(3,2));     //Default Layout = BorderLayout
        t = new JTextField(30);
        b1 = new JButton("bt1");
        b2 = new JButton("bt2");
        b3 = new JButton("bt3");
        b4 = new JButton("bt4");
        
 
        add(t);
        add(b1);
        add(b2);
        add(b3);
        add(b4);  
      

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MYLayout();
    }
}
