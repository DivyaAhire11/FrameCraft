import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


class MyComboBox extends JFrame implements ItemListener {
    JLabel l1;
    JComboBox cb;
    JTextField t1;

    MyComboBox() {
      setTitle("Drop Down List Using Swing Example");
        setBounds(100, 200, 400, 400);
        setLayout(new FlowLayout());

        l1 = new JLabel("Select Your College :");
        cb = new JComboBox();
            cb.addItem("MSG College Malegaon");
            cb.addItem("Govt PolyTechnique Nashik");
            cb.addItem("SPH College nampur");
            cb.addItem("K.K.Wagh");
            cb.addItem("Sandip University");
            cb.addItem("K.V.N Nike");
            cb.addItem("K.T.H.M");
            cb.addItem("MODERN");
            cb.addItem("Sinhgad");

        cb.addItemListener(this);

        t1 = new JTextField(20);
        t1.setEditable(false);

        add(l1);
        add(cb);
        add(t1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
      public void itemStateChanged(ItemEvent ie) {
        t1.setText(""+cb.getSelectedItem());  //cb.getSelectedItem() ha Object return krto
    }
}

public class TestMyComboBox {
    public static void main(String[] args) {
        new MyComboBox();
    }
}
