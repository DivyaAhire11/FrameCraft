import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSWING extends JFrame implements ActionListener {
  JLabel l1, l2;
  JTextField tf1, tf2, res;
  JButton b1, b2, b3, b4;

  CalculatorSWING() {
    setTitle("Calculator Using AWT");
    setBounds(200, 100, 400, 200);
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
    res = new JTextField(20);
    res.setEditable(false);

    // add
    add(l1);
    add(tf1);
    add(l2);
    add(tf2);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(res);

    // add Listener : java.awt.ActionListener
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    try {
      int a = Integer.parseInt(tf1.getText());
      int b = Integer.parseInt(tf2.getText());
      int c = 0;
      if (ae.getSource() == b1) {
        c = a + b;
      }
      if (ae.getSource() == b2) {
        c = a - b;
      }
      if (ae.getSource() == b3) {
        c = a * b;
      }
      if (ae.getSource() == b4) {
        c = a / b;
      }

      res.setText("" + c);
    } catch (Exception e) {
      res.setText("Please Enter Valid Number");
    }
  }

  public static void main(String args[]) {
    new CalculatorSWING();
  }

}
