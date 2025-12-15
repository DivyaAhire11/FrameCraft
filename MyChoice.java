import java.awt.*;
import java.awt.event.*;

class DropDownList extends Frame implements ItemListener {
    Label l1;
    Choice ch;
    TextField t1;

    DropDownList() {
        setTitle("Drop Down List Example");
        setBounds(100, 200, 400, 400);
        setLayout(new FlowLayout());
        setBackground(Color.CYAN);

        l1 = new Label("Select Your College :");
        ch = new Choice();
        ch.add("MSG College Malegaon");
        ch.add("Govt PolyTechnique Nashik");
        ch.add("SPH College nampur");
        ch.add("K.K.Wagh");
        ch.add("Sandip University");
        ch.add("K.V.N Nike");
        ch.add("K.T.H.M");
        ch.add("MODERN");
        ch.add("Sinhgad");

        ch.addItemListener(this);

        t1 = new TextField(20);
        t1.setEditable(false);

        add(l1);
        add(ch);
        add(t1);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        t1.setText(ch.getSelectedItem());  //ch.getSelectedItem()  : return string
    }
}

public class MyChoice {
    public static void main(String args[]) {
        new DropDownList();
    }
}
