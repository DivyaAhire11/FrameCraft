import java.awt.*;

class TextAreaEx extends Frame {
   Label l1;
   TextArea t1;
    TextAreaEx() {
        setTitle("Using AWT TextArea Example");
        setBounds(100, 200, 400, 400);
        setLayout(new FlowLayout());

        l1 = new Label("Enter Your FeedBack :");
        t1 = new TextArea(2,20);

        add(l1);
        add(t1);

        setVisible(true);
    }

}

public class MyTextArea {
    public static void main(String[] args) {
        new TextAreaEx();
    }
}
