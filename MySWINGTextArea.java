/**
 * Not Default : Scrollpane
 * Used ScrollPane using : JScrollPane
 * Don't add TextArea add Panel
 */

import javax.swing.*;
import java.awt.*;

public class MySWINGTextArea extends JFrame {
    JLabel l1;
    JTextArea t1;
    JScrollPane sp;
    MySWINGTextArea() {
        setTitle("Using SWING TextArea Example");
        setBounds(100, 200, 400, 400);
        setLayout(new FlowLayout());

        l1 = new JLabel("Enter Your FeedBack :");
        t1 = new JTextArea(4, 20);
        sp = new JScrollPane(t1);  //Pane : Panel : panel mhadye textarea add kela
         
        add(l1);
        add(sp); //Not add textarea => add Panel

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MySWINGTextArea();
    }
}
