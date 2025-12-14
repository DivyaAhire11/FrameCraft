import java.awt.*; //Frame , FlowLayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SubjectFrame extends Frame implements ActionListener {
    Label l1;
    // Checkbox cb1, cb2, cb3, cb4;
    Checkbox cb[];
    Button b1;
    TextField tf1;

    SubjectFrame() {
        setTitle("Subject Select");
        // setSize(500,400);
        // setLocation(200,200);
        setBounds(200, 200, 500, 400);
        setLayout(new FlowLayout()); // default layout = BorderLayout
        setBackground(Color.CYAN);

        // 1. Create Components

        l1 = new Label("Select Your Subjects :");

        cb = new Checkbox[4]; // Create array of 4 CheckBoxes
        cb[0] = new Checkbox("JAVA", true); // bydefault checkmark to java
        cb[1] = new Checkbox("PHP");
        cb[2] = new Checkbox("C Language");
        cb[3] = new Checkbox("C++");

        b1 = new Button("OKK");
        tf1 = new TextField(20); // TextField(String:"Result", int:20)
        tf1.setEditable(false);

        // 2. Add Components
        add(l1);

        for (int i = 0; i < cb.length; i++) {
            add(cb[i]); // fast access
        }

        add(b1);
        add(tf1);

        b1.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String res = "";

        for (int i = 0; i < cb.length; i++) {
            if (cb[i].getState())
                res += cb[i].getLabel();
        }

        System.out.println(res);
        tf1.setText(res);

    }
}

public class TestSubjectFrame {
    public static void main(String args[]) {
        new SubjectFrame();
    }
}
