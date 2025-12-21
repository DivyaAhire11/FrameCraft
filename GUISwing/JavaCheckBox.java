package GUISwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaCheckBox extends JFrame implements ItemListener {
    JCheckBox cb;

    ImageIcon icon, icon2;

    JavaCheckBox() {

        setTitle("About Swing CheckBoxex");
        setSize(400, 100);

        cb = new JCheckBox();
        cb.setText("I'm not a Robot");
        cb.setFocusable(false);
        cb.setFont(new Font("Consolas", Font.PLAIN, 30));

        icon = new ImageIcon("checkMark.png");
        icon2 = new ImageIcon("crossMark.png");

        cb.setIcon(icon);
        cb.addItemListener(this);

        add(cb);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (cb.isSelected()) {
            cb.setIcon(icon);
        } else {
            cb.setIcon(icon2);
        }

    }

    public static void main(String args[]) {
        new JavaCheckBox();
    }
}
