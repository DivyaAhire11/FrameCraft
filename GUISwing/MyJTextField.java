package GUISwing;

/**
 * JTextField = A GUI textbox component that can be used to add , set ,or get text
 */

import java.awt.*; //Color , Dimension , GridLayout , Font 
import javax.swing.*; //JButton ,JFrame , JTextField
import java.awt.event.*;  //ActionListener , ActionEvent

class MyJTextField extends JFrame implements ActionListener {
    JLabel l;
    JTextField t1,t2;
    JButton b;

    MyJTextField() {
        setTitle("All About TextField");
        //setBounds(100, 100, 300, 200);

        l = new JLabel("Enter name :");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("Submit");
        t1.setPreferredSize(new Dimension(250, 40));
        t2.setPreferredSize(new Dimension(250, 40));
        t1.setFont(new Font("Consolas", Font.PLAIN,30));
        t1.setForeground(new Color(0x00FF00));
        t1.setBackground(Color.black);
        t1.setCaretColor(Color.CYAN);  //  ( | ) type 
       // t1.setText("username");
       //t1.setEditable(false);
       //b.setEnabled(false);
        
       t2.setFont(new Font("Arial", Font.BOLD,25));
       t2.setBackground(Color.black);
       t2.setForeground(new Color(0x00FF00));
       b.addActionListener(this);
       
        add(l);
        add(t1);
        add(b);
        add(t2);
        setLayout(new GridLayout(4,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
         String nm = t1.getText();
         t2.setText("WellCome "+nm+"!");
    }

    public static void main(String[] args) {
        new MyJTextField();
    }
}
