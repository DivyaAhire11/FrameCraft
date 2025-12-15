/*
 1. There is No RadionButton class available in AWT so We have to convert Chechbox into Radio Buttons
 2. Checkbox Multiple section and Radio Button single selection( AnyOne Checkbox = radio Button )
 3.  4 Constructor
    Checkbox()
    Checkbox(String)
    Checkbox(String, boolean) 
    Checkbox(String, boolean, CheckboxGroup)
    Checkbox(String, CheckboxGroup, boolean) 

 */

import java.awt.*;
import java.awt.event.*;

class MyRadioButton extends Frame implements ItemListener{
    Label l1;
    Checkbox cb1,cb2;
    CheckboxGroup cb; // logical group of Checkboxes (NOT A COMPONENT) dont add
    TextField t1;
    MyRadioButton(){
         setTitle("Radio Button using AWT");
         setBounds(200,100,400,400);  //setLocation() , setSize()
         setLayout(new FlowLayout());

         l1 = new Label("Select Your Gender :");
            add(l1);

         cb = new CheckboxGroup();
         cb1 = new Checkbox("Male",cb,false); //false : uncheck
            add(cb1);
         cb2 = new Checkbox("Female",cb,false); //true : check
            add(cb2);
         t1 = new TextField(30);
           t1.setEditable(false);
           add(t1);


           cb1.addItemListener(this); //this : current Frame
           cb2.addItemListener(this);
        
           setVisible(true);
      }
      public void itemStateChanged(ItemEvent ie){
          if(cb1.getState()){
             t1.setText("You are Male!");
          }
          if(cb2.getState()){
             t1.setText("You are Female!");
          }
      }
}


public class AWTRadioButton {
    public static void main(String args[]){
        MyRadioButton rb = new MyRadioButton();
    }
}
