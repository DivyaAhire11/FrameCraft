import java.awt.*;
import java.awt.event.*;

class LoginApp extends Frame implements ActionListener {
    Label head, user, pass, msg;
    TextField ut1, pt2;
    Button b1, b2;

    LoginApp() {

        setTitle("Beautiful AWT Login App");
        setBounds(200, 100, 400, 300);
        setBackground(new Color(245, 245, 245));
        setLayout(new BorderLayout());

        // ====== TITLE =========
        head = new Label("LOGIN FORM", Label.CENTER);
        head.setFont(new Font("Arial", Font.BOLD, 22));
        head.setForeground(new Color(30, 144, 255));
        add(head, BorderLayout.NORTH);

        // ====== CENTER PANEL =======
        Panel centerPanel = new Panel(new GridLayout(2, 2, 10, 10));
        centerPanel.setBackground(Color.white);

        user = new Label("Username : ");
        pass = new Label("Password : ");

        ut1 = new TextField();
        pt2 = new TextField();
        pt2.setEchoChar('*');

        centerPanel.add(user);
        centerPanel.add(ut1);
        centerPanel.add(pass);
        centerPanel.add(pt2);

        add(centerPanel, BorderLayout.CENTER);

        // ====== BUTTON + MESSAGE ======
        Panel btPanel = new Panel(new GridLayout(2, 1));
        btPanel.setBackground(Color.WHITE);

        Panel btns = new Panel();
        b1 = new Button("Login");
        b2 = new Button("Clear");

        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.white);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);

        btns.add(b1);
        btns.add(b2);

        msg = new Label("", Label.CENTER);
        msg.setForeground(Color.red);

        btPanel.add(btns);
        btPanel.add(msg);

        add(btPanel, BorderLayout.SOUTH);

        // ==== Events =====
        b1.addActionListener(this);
        b2.addActionListener(this);

        // ====== Close Window =====
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            if (ut1.getText().equals("admin") && pt2.getText().equals("12345")) {
                msg.setText("Login Successful");
               msg.setFont(new Font("Arial", Font.BOLD, 15));
                msg.setForeground(Color.green);
            
            } else {
                msg.setText("Invalid Credentials");
                msg.setForeground(Color.red);
                msg.setFont(new Font("Arial", Font.BOLD, 15));
            }
        } else {
            ut1.setText("");
            pt2.setText("");
            msg.setText("");
        }
    }
}

public class Project1 {
    public static void main(String[] args) {
        new LoginApp();
    }
}
