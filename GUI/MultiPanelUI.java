package GUI;
import java.awt.*;


class MultiPanelUI extends Frame{
   Panel main,bottom,left,right;
   TextField t;
   Label l1,l2,l3;
   Choice c1,c2;
   Checkbox cb1,cb2;
    MultiPanelUI(){
         setTitle("Multipanel frame");
        setBounds(200,100,400,400);
        setLayout(new BorderLayout()); 

        //Main PAnel
        main = new Panel(new GridLayout(1,2));
       
        left = new Panel(new GridLayout(4,1));
        right = new Panel(new GridLayout(3,1));
          main.add(left);
          main.add(right);

        l1 = new Label("Font :");
        c1 = new Choice();
           c1.add("Hii");
           c1.add("Hello");
           c1.add("Byy");
        l2 = new Label("Size :");
        c2 = new Choice();
           c2.add("Good");
           c2.add("Average");
           c2.add("Bad");
        
        left.add(l1);
        left.add(c1);
        left.add(l2);
        left.add(c2);

        l3 = new Label("Style :");
        cb1 = new Checkbox("Bold");
        cb2 = new Checkbox("Italic");

        right.add(l3);
        right.add(cb1);
        right.add(cb2); 
        add(main,BorderLayout.CENTER);
       
        //Bottom Panel
        bottom = new Panel();
            t = new TextField(30);
            bottom.add(t);
        
        add(bottom,BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiPanelUI();
    }
}
