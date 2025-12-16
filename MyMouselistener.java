/**
 * MOUSE LISTENER :
 *              void mouseClicked(MouseEvent e)  (3)
                void mousePressed(MouseEvent e)  (1)
                void mouseReleased(MouseEvent e)  (2)
                void mouseEntered(MouseEvent e)
                void mouseExited(MouseEvent e)
 * 
 * MOUSE MOTION LISTENER :
 *              void mouseDragged(MouseEvent e)
                void mouseMoved(MouseEvent e)
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyMouselistener extends JFrame implements MouseListener,MouseMotionListener{
   
    MyMouselistener() {
        setTitle(" Key Listener Example");
        setBounds(150, 200, 400, 300);
        getContentPane().setBackground(Color.GREEN);

        addMouseListener(this);
        addMouseMotionListener(this);

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
    public void mouseDragged(MouseEvent me){
        System.out.println("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent me){
        System.out.println("Mouse Moved");
    }
    
    public static void main(String[] args) {
        new MyMouselistener();
    }
}
