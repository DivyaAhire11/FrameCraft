package GUISwing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * JOptionPane = pop up a standard dialog box that prompts users for a
 * value or informs them of something
 */

public class DialogBox {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "hey Hello! Good
        // Day!","DialogBox",JOptionPane.PLAIN_MESSAGE); //(parentCompo
        // ,msg,title,msgType)

        // JOptionPane.showMessageDialog(null, "Stay
        // Focused!","DialogBox",JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Are You
        // Sure?","DialogBox",JOptionPane.QUESTION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "You're Computer has a
        // VIRUS!!","DialogBox",JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Something Went
        // Wrong!!","DialogBox",JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Do you even Code?",
        // "Confirm Title",
        // JOptionPane.YES_NO_CANCEL_OPTION); // RETURN yes: 0 ,No : 1 , Cancle : 2 , (
        // X ): -1
        // System.out.println(answer);

        // JOptionPane.showConfirmDialog(null, "Are You Do Exercise?","Confirm
        // Title",JOptionPane.YES_NO_OPTION);//(parentCoompo , msg,title, optionType)
        // JOptionPane.showConfirmDialog(null, "Wake Up Early Morning!","Confirm
        // Title",JOptionPane.YES_OPTION);

        // String name = JOptionPane.showInputDialog("Enter Your Name :");
        // System.out.println(name);

        // String cs = JOptionPane.showInputDialog(null,"Enter Your Course NAme
        // :","Course");
        // System.out.println(cs);

        String[] responce = { "Not really!", "thank You", "Blush" };
        ImageIcon icon = new ImageIcon("image.png");

        JOptionPane.showOptionDialog(null, "You're Awesome!", "Foody Day!!", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responce, null);

    }
}
