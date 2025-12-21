package GUISwing;

import javax.swing.JOptionPane;

/**
 * JOptionPane = pop up a standard dialog box that prompts users for a 
 *               value or informs them of something
 */

public class DialogBox {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "hey Hello! Good Day!","title",JOptionPane.PLAIN_MESSAGE); //(parentCompo ,msg,title,msgType)
      
       JOptionPane.showMessageDialog(null, "Stay Focused! Always","title",JOptionPane.INFORMATION_MESSAGE);
      
       JOptionPane.showMessageDialog(null, "Are You Sure? About","title",JOptionPane.QUESTION_MESSAGE); 
      
       JOptionPane.showMessageDialog(null, "You Need To Proctect Your Account","title",JOptionPane.WARNING_MESSAGE);
      
       JOptionPane.showMessageDialog(null, "Sorry! Something Went Wrong","title",JOptionPane.ERROR_MESSAGE); 
     
    }
}
