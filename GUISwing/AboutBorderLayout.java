package GUISwing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

class AboutBorderLayout {
    public static void main(String[] args) {
        // Layout manager = Defines the natural layout for components withing a
        // container
        // 3 common managers
        // BorderLayout = A BorderLayout places components in a five areas:
        // NORTH,SOUTH,EAST,WEST,CENTER
        // All extra space is places in the center area.
       
        JFrame f = new JFrame();
        JPanel north = new JPanel();
        JPanel south = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();
        JPanel center = new JPanel();

        north.setBackground(Color.RED);
        south.setBackground(Color.PINK);
        east.setBackground(Color.GREEN);
        west.setBackground(Color.YELLOW);
        center.setBackground(Color.BLUE);

        north.setPreferredSize(new Dimension(400, 60));
        south.setPreferredSize(new Dimension(400, 60));
        west.setPreferredSize(new Dimension(80, 400));
        east.setPreferredSize(new Dimension(80, 400));

        f.setLayout(new BorderLayout());
        f.add(north, BorderLayout.NORTH);
        f.add(south, BorderLayout.SOUTH);
        f.add(east, BorderLayout.EAST);
        f.add(west, BorderLayout.WEST);
        f.add(center, BorderLayout.CENTER);

        f.setBounds(100, 250, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
