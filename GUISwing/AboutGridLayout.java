package GUISwing;
/**
 * GridLayout : places components  in a grid of cells
 *              Each component takes all the available space within its cell,add each cell is the same size.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;


public class AboutGridLayout extends JFrame  {
    AboutGridLayout() {
       
        setTitle("About BorderLayout");
        add(new JButton("Btn1"));
        add(new JButton("Btn2"));
        add(new JButton("Btn3"));
        add(new JButton("Btn4"));
        add(new JButton("Btn5"));
        add(new JButton("Btn6"));
        add(new JButton("Btn7"));
        add(new JButton("Btn8"));
        add(new JButton("Btn9"));
      
        setSize(400,400);
        setLayout(new GridLayout(3,3,10,10)); // Bydefault  row = 1,col = no of components , 3rd horizontal margin and 4th is vertical margin
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        
    }

    public static void main(String[] args) {
        new AboutGridLayout();
    }
}
