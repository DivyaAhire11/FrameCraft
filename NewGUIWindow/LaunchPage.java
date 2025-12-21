package NewGUIWindow;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class LaunchPage implements ActionListener{
    JFrame f;
    JButton b;
    LaunchPage(){
        f = new JFrame();
        b = new JButton("New Window");
        b.setBounds(100,160,200,40);
        b.setFocusable(false);
       
        b.addActionListener(this);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,200,400,400);
        // f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    
    }

    public void actionPerformed(ActionEvent e){
        f.dispose();  //one window only
         new NewWindow(); 
    }
    public static void main(String[] args) {
        new LaunchPage();
    }
}
