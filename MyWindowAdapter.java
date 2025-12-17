
/**
 * Interface madhil srv methods default ne public and abstrct astat.
 * tyamule jevha ekhadi class interface implement karte tevha tya class madye
 * methods public access modifier
 * nech lihavi lagte
 * default ,protected kivha private chalat nahi
 * 
 * INTERFACE METHODS -> public abstract
 * IMPLEMENTING CLASS METHOD -> public
 * 
 * 
 * WindowAdapter implements WindowListener,WindowStateListener,WindowFocusListener
         *) public void windowOpened(WindowEvent);
         *) public void windowClosing(WindowEvent);
         *) public void windowClosed(WindowEvent);
         *) public void windowIconified(WindowEvent);
         *) public void windowDeiconified(WindowEvent);
         *) public void windowActivated(WindowEvent);
         *) public void windowDeactivated(WindowEvent);
         *) public void windowStateChanged(WindowEvent);
         *) public void windowGainedFocus(WindowEvent);
         *) public void windowLostFocus(WindowEvent);
  

interface WindowListener {
    void windowOpened(WindowEvent);
    void windowClosing(WindowEvent);
    void windowClosed(WindowEvent);
    void windowIconified(WindowEvent);
    void windowDeiconified(WindowEvent);
    void windowActivated(WindowEvent);
    void windowDeactivated(WindowEvent);
}

class WindowAdapter implements WindowListener {
    public void windowOpened(WindowEvent w) { }
    public void windowClosing(WindowEvent w) { }
    public void windowClosed(WindowEvent w) { }
    public void windowIconified(WindowEvent w){ }
    public void windowDeiconified(WindowEvent w){ }
    public void windowActivated(WindowEvent w){ }
    public void windowDeactivated(WindowEvent w){ }
    }

 */

// According to multiple inheritance we can't extends multiple classes
// According to multiple inheritance we can implements multiple interfaces

//Adapter class has already implemented all listeners method , by which we can use any one method of listener.

import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter{
    Frame f;  //HAS-A RelationShip

    MyWindowAdapter(){
        f = new Frame();
        f.setTitle("Adaptor Class Example");
        f.setBounds(200,200,400,200);
        

        f.addWindowListener(this);


        f.setVisible(true);
    }

    public void windowClosing(WindowEvent w){
        System.out.println("Window Closing");
        f.dispose();
    }

    public static void main(String[] args) {
        new MyWindowAdapter();
    }
}