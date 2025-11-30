
import java.awt.Color;
import java.awt.Frame;

class B {
    Frame f;
    B(){
        f = new Frame();

        f.setBounds(200, 300, 400, 400);
        f.setTitle("My Frame In JAVA");
        f.setBackground(Color.CYAN);
       

        f.setResizable(false);
       
        f.setVisible(true);
    }

    public static void main(String[] args) {
         new B();
    }
}