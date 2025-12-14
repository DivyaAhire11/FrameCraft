//javax : x means extended
import javax.swing.*; //JFrame ,JLabel , JCheckBox,JButton,JTextField
import java.awt.event.*; //ActionListener , ActionEvent
import java.awt.*; // FlowLayout

class Subject extends JFrame implements ActionListener {
    JLabel l1;
    JCheckBox cb[];
    JButton b1;
    JTextField t1;
   
    Subject() {
        setBounds(100, 200, 300, 300);
        setTitle("Select Subjects ");
        setLayout(new FlowLayout());

        //1. create Components
        l1 = new JLabel("Select Your Subjects :"); 
        cb = new JCheckBox[5];

        cb[0] = new JCheckBox("JAVA");
        cb[1] = new JCheckBox("PHP");
        cb[2] = new JCheckBox("PYTHON");
        cb[3] = new JCheckBox("CPP");
        cb[4] = new JCheckBox("C Language");
       
        b1 = new JButton("OKK");
        t1 = new JTextField(20);
           t1.setEditable(false);
        //2. Add Components
         add(l1);
       
         for(int i = 0;i<cb.length;i++)
            add(cb[i]);
       
         add(b1);
         add(t1);


         //3. Action Listeners
         b1.addActionListener(this);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
     public void actionPerformed(ActionEvent ae) {
        String res = "";

        // for (int i = 0; i < cb.length; i++) {
        //     if (cb[i].getState())
        //         res += cb[i].getLabel();
        // }

        System.out.println(res);
        t1.setText(res);

    }

}

public class TestSubjectSWING {
    public static void main(String args[]) {
        new Subject();
    }
}
