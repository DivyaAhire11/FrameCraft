/*
 1. There is No RadionButton class available in AWT so We have to convert Chechbox into Radio Buttons
*/

import java.awt.*;


class MyRadioButton extends Frame{
    Label l1;
    Checkbox cb1,cb2;
    TextField t1;
    MyRadioButton(){
         setTitle("Radio Button using AWT");
         setBounds(200,100,400,400);
         setLayout(new FlowLayout());

         l1 = new Label("Select Your Gender :");
            add(l1);
         cb1 = new Checkbox("Male");
            add(cb1);
         cb2 = new Checkbox("Female");
            add(cb2);
         t1 = new TextField(30);
           t1.setEditable(false);
           add(t1);

        setVisible(true);
      }
}


public class AWTRadioButton {
    public static void main(String args[]){
        MyRadioButton rb = new MyRadioButton();
    }
}
