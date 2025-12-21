package NewGUIWindow;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame {
    NewWindow() {
       setTitle("New Window");
       
       JLabel l = new JLabel("Hello Divya!");
        l.setFont(new Font("Arial", Font.BOLD,40));
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(Color.BLUE);
        add(l);
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
}
