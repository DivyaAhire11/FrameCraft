package GUISwing;

/**
 * JFrame.EXIT_ON_CLOSE  : exit out the application
 * JFrame.HIDE_ON_CLOSE : byDefault  : killed the application ut it's still running in the background
 * JFrame.DO_NOTHING_ON_CLOSE  : it is actually prevent from somebody from hitting the X buttton
 */
import javax.swing.*;
import java.awt.Color;

class MyJFrame {
    public static void main(String[] args) {

        // JFrame : a GUI window to add components to

        JFrame f = new JFrame(); // craete a frame
        f.setTitle("JFrame title goes here");
        f.setBounds(100, 100, 420, 420);
        f.setResizable(false); // prevent from resize

        ImageIcon ic = new ImageIcon("colour.png"); // create an image Icon
        f.setIconImage(ic.getImage()); // change icon of Image

        f.getContentPane().setBackground(new Color(32, 144, 132)); // Change Color of Background(hexadecimal color
                                                                   // values : 0x000000[Black] or OxFFFFFF[white])
        // f.getContentPane().setBackground(new Color(0x123456)); //neavy blue

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        f.setVisible(true);
    }
}
