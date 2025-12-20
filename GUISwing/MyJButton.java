package GUISwing;

import java.awt.*; //Image , BorderLayout , Color , Font
import java.awt.event.*; //ActionListener , ActionEvent
import javax.swing.*; // BorderFactory , ImageIcon , JButton , JFrame , JOptionPane , JLabel , JPanel

class MyJButton extends JFrame implements ActionListener {
    JButton b;
    JLabel l1, l2;
    boolean isSleeping = true;

    MyJButton() {
        // Load and scale images
        ImageIcon pointHand = new ImageIcon(
                new ImageIcon("pointing.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        ImageIcon sleepimg = new ImageIcon(
                new ImageIcon("sleep.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

        ImageIcon afraidimg = new ImageIcon(
                new ImageIcon("wow.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

        // Labels
        l1 = new JLabel(sleepimg);// l1.setIcon(sleepimg);
        l2 = new JLabel(afraidimg);// l2.setIcon(Afraidimg);
        l2.setVisible(false);

        // Top panel for emoji
        JPanel topPanel = new JPanel();
        topPanel.add(l1);
        topPanel.add(l2);

        // Button
        b = new JButton("Don’t wake me up!", pointHand); // b.setText("I'm a button!"); , //b.setIcon(pointHand);
        b.setFocusable(false); // remove inner border 
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setIconTextGap(-8); //gap between img amd text
        b.setFont(new Font("Comic Sans", Font.BOLD, 18));
        b.setForeground(new Color(0xd9ed92));
        b.setBackground(new Color(0x184e77));
        b.setBorder(BorderFactory.createEtchedBorder());
        // b.setEnabled(false);
         JPanel bottomPanel = new JPanel();
         bottomPanel.setLayout(null);
         b.setBounds(100, 50, 200, 75);
         bottomPanel.add(b);
        
        b.addActionListener(this);

        // Frame settings
        setTitle("All About button");
        setSize(400, 420);

        // b.addActionListener(e -> {cnt++; JOptionPane.showMessageDialog(this, "You
        // Click Button : " +
        // cnt);});//Lambda expresion
       

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        isSleeping = !isSleeping;
        l1.setVisible(isSleeping);
        l2.setVisible(!isSleeping);
    }

    public static void main(String[] args) {
        new MyJButton();
    }
}
