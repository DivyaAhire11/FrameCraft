/**
   java.awt.event
   Event Class     : ItemEvent
   Event Listener  : ItemListener( public void itemStateChanged(ItemEvent) )
 */

import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;

class Subject extends JFrame implements ItemListener {
    JLabel l1;
    JCheckBox cb[];
    JTextField t1;

    Subject() {
        setBounds(100, 200, 300, 300);
        setTitle("Select Subjects ");
        setLayout(new FlowLayout());

        // 1. create Components
        l1 = new JLabel("Select Your Subjects :");
        cb = new JCheckBox[5];

        cb[0] = new JCheckBox("JAVA");
        cb[1] = new JCheckBox("PHP");
        cb[2] = new JCheckBox("PYTHON");
        cb[3] = new JCheckBox("CPP");
        cb[4] = new JCheckBox("C Language");

        t1 = new JTextField(20);
        t1.setEditable(false);
      
        // 2. Add Components
        add(l1);
        for (int i = 0; i < cb.length; i++){
               add(cb[i]);
               cb[i].addItemListener(this);
        }
        
        add(t1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void itemStateChanged(ItemEvent ae) {
        String res = "";

        for (int i = 0; i < cb.length; i++) {
            if (cb[i].isSelected())
                res += cb[i].getText();
        }

        t1.setText(res);

    }

}

public class SubjectSwing1 {
    public static void main(String args[]) {
        new Subject();
    }
}
