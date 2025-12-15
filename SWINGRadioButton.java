
/**
 * Checkbox  : getState()
 * CheckBox  : isSelected()
 * CheckboxGroup  : getState()
 * JRadioButton  : isSelected()
 * 
 */

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class MySwingRadionButton extends JFrame implements ItemListener {
    JLabel l1;
    JRadioButton r1, r2;
    ButtonGroup bg;
    JTextField t1;

    MySwingRadionButton() {
        setTitle("Using Swing Radio button Example");
        setBounds(100, 200, 400, 400);
        setLayout(new FlowLayout());

        l1 = new JLabel("Select Your Gender :");

        bg = new ButtonGroup();
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        bg.add(r1); // 1. r1,r2 components adds in Button Group for Single Selection
        bg.add(r2);

        t1 = new JTextField(30);
        t1.setEditable(false);

        add(l1);
        add(r1); // 2. then add radion Buttons(Frame madye Stick kele)
        add(r2);
        add(t1);

        r1.addItemListener(this);
        r2.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_CLOSE: public static final variable
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (r1.isSelected()) {
            t1.setText("You are Male!");
        }
        if (r2.isSelected()) {
            t1.setText("You are Female!");
        }
    }
}

public class SWINGRadioButton {
    public static void main(String[] args) {
        new MySwingRadionButton();
    }
}
