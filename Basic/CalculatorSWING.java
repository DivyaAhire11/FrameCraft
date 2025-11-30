import javax.swing.*;
import java.awt.*;

public class CalculatorSWING extends JFrame {
    JLabel l1, l2;
    JTextField tf1, tf2;
    JButton b1, b2, b3, b4;

    CalculatorSWING() {
        setTitle("Calculator Using AWT");
        setBounds(200, 100, 400, 400);
        setLayout(new FlowLayout());

        // Create
        l1 = new JLabel("Enter First Number : ");
        l2 = new JLabel("Enter Second Number : ");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MUL");
        b4 = new JButton("DIV");

        // add
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new CalculatorSWING();
    }

}
