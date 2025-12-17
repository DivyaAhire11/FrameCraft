/**
 * Window Listener : 7 methods
        *)  void windowOpened(WindowEvent e) : when the window is opened for the first time
        *)  void windowClosing(WindowEvent e) : when the user clicks the close(X) button on window
        *)  void windowClosed(WindowEvent e)  : After the window is completely closed
        *)  void windowIconified(WindowEvent e) : when the window is minimized
        *)  void windowDeiconified(WindowEvent e) : when the minimized window is restored
        *)  void windowActivated(WindowEvent e) : Frame samore yeto (when the window gains focus COMES TO FRONT)
        *)  void windowDeactivated(WindowEvent e) : Frame samore nasto (when window loses focus)
 

 * if any one method is not implement then : error ( MyWindowListener is not abstract and does not override abstract method windowClosed(WindowEvent) in WindowListener )
 * RULE : 
 *       subclass of interface must override Or implement all methods of interface IF NOT 
         then you should declared yourself as abstract 

 * Sequence must 
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
--------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------

* WindowFocusListener :
*       public void windowGainedFocus(WindowEvent);
*       public void windowLostFocus(WindowEvent);
*
Sequence :  
    WINDOW OPEN      
            Window Activated
            Focus Gain
            Window Opened
   
    ACTIVATE :
            Focus Lost
            Window DeActivated
                    
            Window Activated
            Focus Gain
        
    MINIMIZE:
            Window Iconified
            Focus Lost
            Window DeActivated
    MAXIMIZE :
            Window Deiconified
            Window Activated
            Focus Gain
    CLOSE WINDOW:
            Window Closing
            Focus Lost
            Window DeActivated
            Window Closed
        */

import java.awt.*;
import java.awt.event.*; //WindowEvent , WindowListener , WindowFocusListener


public class MyWindowListener extends Frame implements WindowListener,WindowFocusListener{

    MyWindowListener(){
        setTitle(" Window Listener Example");
        setBounds(150, 200, 400, 300);
       
        addWindowListener(this);  //listener add krnyasathi method
        addWindowFocusListener(this);

        setVisible(true);
    }
    public void windowOpened(WindowEvent w){   //listener chya methods
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
    //--------------------------------------------------------------

    public void windowGainedFocus(WindowEvent e){
        System.out.println("Focus Gain");
    }
    public void windowLostFocus(WindowEvent e){
        System.out.println("Focus Lost");
    }


    public static void main(String[] args) {
        new MyWindowListener();
    }
}
