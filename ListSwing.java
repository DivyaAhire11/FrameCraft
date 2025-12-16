import java.awt.*;
import javax.swing.*;
import javax.swing.event.*; //ListSelectionListener ,ListSelectionEvent
import java.util.List;

public class ListSwing extends JFrame{
    JLabel l;
    JList Lt;
    JTextArea ta;
    JScrollPane sp;
    DefaultListModel model;

    ListSwing() {
        setTitle("My List Using SWING Example");
        setBounds(150, 200, 400, 300);
        setLayout(new FlowLayout());

        l = new JLabel("Select Country : ");
       
        model = new DefaultListModel();
        model.addElement("India");
        model.addElement("America");
        model.addElement("Australia");
        model.addElement("Afrika");
        model.addElement("Caneda");
        model.addElement("Urop");
        model.addElement("NetherLand");
        model.addElement("China");
        model.addElement("Iran");
        model.addElement("Shrilanka");
        model.addElement("Afganistan");

        Lt = new JList(model);
        Lt.setVisibleRowCount(5);  //List(5,true)
    
        
        sp = new JScrollPane(Lt);
        
        // Lt.addItem("Afganistan");
        ta = new JTextArea(3, 30);
        ta.setEditable(false);
        add(l);
        add(sp);
        add(ta);

        Lt.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                List st = Lt.getSelectedValuesList(); 
                String msg = "";

                for (Object item : st) {
                    msg += item + "\n";
                }
                ta.setText(msg);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String args[]) {
        new ListSwing();
    }
}
