/**
 * javax.swing.BorderFactory:
 *       createLineBorder(Color)
 *       createLineBorder(Color, thickness)
 *       createLineBorder(Color, thickness, rounded) 
 * 
 * CLASS                METHOD madye--->                       METHOD
 * GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontfamilyNames();
 * 
 * Font Color Changed  : l1.setForeground(Color.RED)
 *  java.awt.Font
 *  Font : setFont(name,size,type)
 *        Font(String, int, int) : type = plain , bold ,italic
 * eg.
 *       l1.setFont("Arial",Font.Italic,20)
 * 
 *        Font f = new Font("Arial",Font.BOLD,10);
                l1.setFont(f);

 * javax.swing.BorderFactory
 */
package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FontFrame extends JFrame implements ItemListener{
    JPanel main,bottom,left,right;
    JLabel l1,l2,l3;
    JComboBox cb1,cb2;
    JCheckBox b1,b2,b3;
    JTextField tf;
    
    String fname[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
   
    Font f;

    FontFrame(){
        setTitle("Font frame");
        setBounds(200,100,400,400);
        setLayout(new BorderLayout());

         //Main Frame
         main = new JPanel(new GridLayout(1,2));
            // main.setBackground(new Color(173,216,230));
            //Left Panel
             left = new JPanel(new GridLayout(4,1));
                left.setBorder(BorderFactory.createLineBorder(Color.RED,2));
                l1 = new JLabel("Font : ");
                l1.setForeground(new Color(0,0,139));
                
                
                cb1 = new JComboBox(fname);
                    cb1.addItemListener(this);
           
                l2 = new JLabel("Size : ");
                l2.setForeground(new Color(0,0,139));
                cb2 = new JComboBox();
                    cb2.addItem("10");
                    cb2.addItem("12");
                    cb2.addItem("14");
                    cb2.addItem("16");
                    cb2.addItem("18");
                    cb2.addItem("20");
                    cb2.addItem("22");

                cb2.addItemListener(this);
                    left.add(l1);
                    left.add(cb1);
                    left.add(l2);
                    left.add(cb2);

             main.add(left);
         
             //Right Panel
            right = new JPanel(new GridLayout(4,1));
               right.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));

               l3 = new JLabel("Style : ");
                 l3.setForeground(new Color(0,0,139));
               b1 = new JCheckBox("Bold");
                  b1.addItemListener(this);
               b2 = new JCheckBox("Italic");
                 b2.addItemListener(this);
               b3 = new JCheckBox("Underline");
                 b3.addItemListener(this);
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
    
    public void itemStateChanged(ItemEvent e){
       
       
        // String fname = (String)cb1.getSelectedItem();
        // int size = Integer.parseInt(cb2.getSelectedItem());
    }
    public static void main(String[] args) {
        new FontFrame();
    }
}