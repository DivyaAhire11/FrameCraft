package GUISwing;

import javax.swing.*;
import java.awt.event.*;
//already attached an anonymous ActionListener to the button:Because of that, class does NOT need to implement ActionListener
class LambdaEx2 extends JFrame{
    JButton b1,b2;
    LambdaEx2(){
        //First Button
        b1 = new JButton("First BUTTON");
        b1.setBounds(100,100,200,50);
        b1.setFocusable(false);
       
    //    b1.addActionListener(new ActionListener(){
    //         public void actionPerformed(ActionEvent e){
    //             System.out.println("You Clicked");
    //         }
    //    });

        b1.addActionListener(
            (e) -> System.out.println("You Click First Button")
        );
         //Second Button
         b2 = new JButton("Second Button");
         b2.setBounds(100,200,200,50);
         b2.addActionListener(
            (e) -> System.out.println("You Click Second Button")
         );
         b2.setFocusable(false);
      
         add(b1);
        add(b2);
        setTitle("About Lambda Expression");
        setSize(420,420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    
}
