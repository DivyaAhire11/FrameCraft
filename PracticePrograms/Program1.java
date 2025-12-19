/**
 *  JOptionPane.showMessageDialog(null, "Hello "+name);
       null : parentComponent
 *
 * used for :
 *       Show message 
 *       Take user input
 *       Show confirmation dialogs
 *       show errors/warnings/info msg
 *       useful for alerts ,confirmations,inputs
 * 
 * 
 * Build in buttons(okk,yes,no,cancle)
 * 
 */
import javax.swing.JOptionPane;
public class Program1 {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
       
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age : "));
        JOptionPane.showMessageDialog(null, "Your Age is :"+age);
    
    }
}
