
import javax.swing.JFrame;

class C extends JFrame {
    C() {
        setTitle("Using  SWING");
        setLocation(300, 400);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new C();
    }
}
