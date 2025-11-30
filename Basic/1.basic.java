package Basic;

import java.awt.Color;
import java.awt.Frame;

class A extends Frame {
    A() {
        setBounds(200, 300, 400, 400);
        setTitle("My Frame In JAVA");
        setBackground(Color.CYAN);
       

        setResizable(false);
       
        setVisible(true);
    }
}

class Test {
    public static void main(String[] args) {
         new A();
    }
}