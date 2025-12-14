import java.awt.*;
import java.awt.event.*;


class Subject extends Frame implements ItemListener{
    Label l1;
    Checkbox cb[];
    TextField tf1;

    Subject() {
        setTitle("Subject Select");
        setBounds(200, 200, 500, 400);
        setLayout(new FlowLayout()); 
      

        // 1. Create Components

        l1 = new Label("Select Your Subjects :");
        cb = new Checkbox[4]; // array of CheckBoxes
        cb[0] = new Checkbox("JAVA"); 
        cb[1] = new Checkbox("PHP");
        cb[2] = new Checkbox("C Language");
        cb[3] = new Checkbox("C++");

       
        tf1 = new TextField(20);
        tf1.setEditable(false);

        // 2. Add Components
        add(l1);
        for (int i = 0; i < cb.length; i++) {
            add(cb[i]);
            cb[i].addItemListener(this);
        }
         add(tf1);
         setVisible(true);
    }
    public void  itemStateChanged(ItemEvent ie){
        String res = "";
      
        for(int i=0;i<cb.length;i++){
          if(cb[i].getState()){
              res += cb[i].getLabel();
          }
       }

       tf1.setText(res);
    }
}
public class SubjectFrame1 {
    public static void main(String args[]) {
        new Subject();
    }
}


