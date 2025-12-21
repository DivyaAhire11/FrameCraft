package GUISwing;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

/**
 * Layout Manager :defines the natural layout for components within a container
 * 
 * Flowlayout : Place components in a row , sized at their preferred size.
 *              If the horizontal space in the container is too small, the FlowLayout class uses the next available row
 */
import javax.swing.*;

public class AboutFlowLayout extends JFrame {
    AboutFlowLayout() {
        setSize(500, 500);
       JPanel p = new JPanel();
       p.setPreferredSize(new Dimension(250,200));
       p.setBackground(Color. LIGHT_GRAY);
       // Panel used Bydefault FlowLayout

       p.add(new JButton("Btn1"));
       p.add(new JButton("Btn2"));
       p.add(new JButton("Btn3"));
       p.add(new JButton("Btn4"));
       p.add(new JButton("Btn5"));
       p.add(new JButton("Btn6"));
       p.add(new JButton("Btn7"));
       p.add(new JButton("Btn8"));
       p.add(new JButton("Btn9"));
       
       
       add(p);
       setLayout(new FlowLayout(FlowLayout.CENTER,20,30)); //horizontal spacing ,  vertical spacing :GAP BETWEEN BUTTONS
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
          pack();
    }

    public static void main(String[] args) {
        new AboutFlowLayout();
    }
}
