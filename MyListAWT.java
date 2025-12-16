
/**
 *  List(7,true) : 7 (Number of Elements distat baki Scroll karun distat)
 *               : true for Multiple elements selection
 * Choice : Single Selection
 * List : Multiple Selection
 * 
 */

import java.awt.*;
import java.awt.event.*;

public class MyListAWT extends Frame implements ItemListener {
    Label l;
    List Lt;
    TextArea ta;

    MyListAWT() {
        setTitle("My List Using AWT Example");
        setBounds(150, 200, 400, 300);
        setLayout(new FlowLayout());

        l = new Label("Select Country : ");
        Lt = new List(7, true); // by default : 4 , false
            Lt.add("India");
            Lt.add("America");
            Lt.add("Australia");
            Lt.add("Afrika");
            Lt.add("Caneda");
            Lt.add("Urop");
            Lt.add("NetherLand");
            Lt.add("China");
            Lt.add("Iran");
            Lt.add("Shrilanka");
            Lt.add("Afganistan");
        ta = new TextArea(3,30);
          ta.setEditable(false);
        add(l);
        add(Lt);
        add(ta);

        Lt.addItemListener(this);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
         String ctry[] = Lt. getSelectedItems(); //array of string return 
         String msg = "";
         for(int i=0;i<ctry.length;i++){
            msg += ctry[i]+"\n";
           
         }
        ta.setText(msg);
        }

    public static void main(String args[]) {
        new MyListAWT();
    }
}
