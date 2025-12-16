/**
 * MOUSE LISTENER :
 *              void mouseClicked(MouseEvent e)  (3)
                void mousePressed(MouseEvent e)  (1)
                void mouseReleased(MouseEvent e)  (2)
                void mouseEntered(MouseEvent e)
                void mouseExited(MouseEvent e)
 * 
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyMouselistener extends JFrame implements MouseListener{

    MyMouselistener() {
        setTitle(" Key Listener Example");
        setBounds(150, 200, 400, 300);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);

        addMouseListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseEntered(MouseEvent m){
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent m){
       System.out.println("Mouse Exited");
    }
    public void mousePressed(MouseEvent m){  
       System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent m){
       System.out.println("Mouse Released");
    }
    public void mouseClicked(MouseEvent m){
       System.out.println("Mouse Click");
    }
    
    public static void main(String[] args) {
        new MyMouselistener();
    }
}
