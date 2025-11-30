import java.awt.*;

class CalculatorJWT extends Frame {
    Label l1, l2;
    TextField tf1, tf2;
    Button b1, b2, b3, b4;

    CalculatorJWT() {
        setTitle("Calculator Using AWT");
        setBounds(200, 100, 400, 400);
        setLayout(new FlowLayout());

        // Create
        l1 = new Label("Enter First Number : ");
        l2 = new Label("Enter Second Number : ");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");

        // add
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setVisible(true);
    }

    public static void main(String args[]) {
        new CalculatorJWT();
    }

}
