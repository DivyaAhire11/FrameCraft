/**
 * Window Listener :
        *)  void windowOpened(WindowEvent e) : when the window is opened for the first time
        *)  void windowClosing(WindowEvent e) : when the user clicks the close(X) button on window
        *)  void windowClosed(WindowEvent e)  : After the window is completely closed
        *)  void windowIconified(WindowEvent e) : when the window is minimized
        *)  void windowDeiconified(WindowEvent e) : when the minimized window is restored
        *)  void windowActivated(WindowEvent e) : Frame samore yeto (when the window gains focus COMES TO FRONT)
        *)  void windowDeactivated(WindowEvent e) : Frame samore nasto (when window loses focus)
 
 * Sequence must 
 * if any one method is not implement then : error ( MyWindowListener is not abstract and does not override abstract method windowClosed(WindowEvent) in WindowListener )
 * RULE : 
 *       subclass of interface must override Or implement all methods of interface IF NOT 
         then you should declared yourself as Abstract 


Sequence :
        Window Activated
        Window Opened
       
        Window Closing
        Window Closing
        Window Closing
       
        Window Iconified = minimize
        Window DeActivated = Active nsto(Focus jato)
       
        Window Deiconified = maximize
        Window Activated = Activate hoto(Focus yeto)

  WINDOW CLOSE :
        Window Closing
        Window DeActivated
        Window Closed
*/

import java.awt.*;
import java.awt.event.*; //WindowEvent , WindowListener


public class MyWindowListener extends Frame implements WindowListener{

    MyWindowListener(){
        setTitle(" Window Listener Example");
        setBounds(150, 200, 400, 300);
       
        addWindowListener(this);


        setVisible(true);
    }
    public void windowOpened(WindowEvent w){
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent w){
        System.out.println("Window Closing");
        dispose();                                   //closing madye dispose() 
    }
    public void windowClosed(WindowEvent w){
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent w){
       System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent w){
       System.out.println("Window Deiconified");
    }
    public void windowActivated(WindowEvent w){
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent w){
        System.out.println("Window DeActivated");
    }

    public static void main(String[] args) {
        new MyWindowListener();
    }
}
