/**
 * javax.swing.BorderFactory:
 *       createLineBorder(Color)
 *       createLineBorder(Color, thickness)
 *       createLineBorder(Color, thickness, rounded) 
 */
package GUI;
import java.awt.*;
import javax.swing.*;

class FontFrame extends JFrame{
    JPanel main,bottom,left,right;
    JLabel l1,l2,l3;
    JComboBox cb1,cb2;
    JCheckBox b1,b2,b3;
    JTextField tf;
    FontFrame(){
        setTitle("Font frame");
        setBounds(200,100,400,400);
        setLayout(new BorderLayout());

         //Main Frame
         main = new JPanel(new GridLayout(1,2));
            
            //Left Panel
             left = new JPanel(new GridLayout(4,1));
                left.setBorder(BorderFactory.createLineBorder(Color.RED,2));
                l1 = new JLabel("Font : ");
                cb1 = new JComboBox<>();
                   cb1.addItem("Arial");
                   cb1.addItem("Serif");
                   cb1.addItem("SansSerif");
                   cb1.addItem("Monospaced");
                   cb1.addItem("Dialog");
                l2 = new JLabel("Size : ");
                cb2 = new JComboBox<>();
                    cb2.addItem("10");
                    cb2.addItem("20");
                    cb2.addItem("30");
                    cb2.addItem("40");
                    cb2.addItem("50");

                    left.add(l1);
                    left.add(cb1);
                    left.add(l2);
                    left.add(cb2);

             main.add(left);
         
             //Right Panel
            right = new JPanel(new GridLayout(4,1));
               right.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));

               l3 = new JLabel("Style : ");
               b1 = new JCheckBox("Bold");
               b2 = new JCheckBox("Italic");
               b3 = new JCheckBox("Underline");

                right.add(l3);
                right.add(b1);
                right.add(b2);
                right.add(b3);
            main.add(right);
       
       
       
        add(main,BorderLayout.CENTER);


         //Bottom Frame
         bottom = new JPanel(new GridLayout(1,1));
           tf = new JTextField(30);
           bottom.add(tf);
         add(bottom,BorderLayout.SOUTH);
        
        
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
    public static void main(String[] args) {
        new FontFrame();
    }
}