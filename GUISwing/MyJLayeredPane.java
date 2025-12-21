package GUISwing;

import java.awt.Color;

/**
 * JLayeredPane = Swing container that provides a third dimension for positioning components 
 * ex . depth , z-index
 */
import javax.swing.*;

class MyJLayeredPane extends JFrame {
    JLayeredPane lp;
    JLabel l1,l2,l3;
    MyJLayeredPane() {
        setTitle("My Layered Panel");
        setSize(750, 750);

        //label 1
        l1 = new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.red);
        l1.setBounds(50,50,200,200);

         //label 2
        l2 = new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.green);
        l2.setBounds(100,100,200,200);

         //label 3
        l3 = new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.blue);
        l3.setBounds(150,150,200,200);
      
        lp = new JLayeredPane();
        lp.setBounds(0,0,500,500);
        
        //Default - Palette - Modal - PopUp - Drag
      
        lp.add(l1,Integer.valueOf(0));//JLayeredPane.DEFAULT_LAYER
        lp.add(l2,Integer.valueOf(2));//JLayeredPane.DRAG_LAYER
        lp.add(l3,Integer.valueOf(1));//JLayeredPane.MODAL_LAYER

        add(lp);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJLayeredPane();
    }
}
