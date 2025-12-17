
/**
 * (red = 255 , green = 255 , blue = 255) =  Black Color
 * (red = 255 , green = 0 , blue = 0) = Red Color
 * (red = 0 , green = 255 , blue = 0) = Green Color
 * (red = 0, green = 0 , blue = 255) = Blue Color
 * (red = 0 , green = 0 , blue = 0) = White Color
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ChangeWindowColor extends Frame implements WindowListener {
    ChangeWindowColor() {
        setTitle(" Window Listener Example");
        setBounds(150, 200, 400, 300);

        addWindowListener(this);

        setVisible(true);
    }

    public void windowOpened(WindowEvent w) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent w) {
        System.out.println("Window Closing");
       //1. dispose();
      
       //2. MultiColor 
        Random rd = new Random();
        int r = rd.nextInt(255); // 0 - 255 (High intensity = 255)
        int g = rd.nextInt(255); // 0-255
        int b = rd.nextInt(255); // 0-255

        Color c = new Color(r, g, b);
        setBackground(c);

        //3. Single color = setBackground(Color.red);
    }

    public void windowClosed(WindowEvent w) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent w) {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent w) {
        System.out.println("Window Deiconified");
    }

    public void windowActivated(WindowEvent w) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent w) {
        System.out.println("Window DeActivated");
    }

    public static void main(String[] args) {
        new ChangeWindowColor();
    }
}
