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
        south.setBackground(Color.MAGENTA);
        east.setBackground(Color.GREEN);
        west.setBackground(Color.YELLOW);
        center.setBackground(Color.BLUE);

        north.setPreferredSize(new Dimension(100,100));
        south.setPreferredSize(new Dimension(100,100));
        west.setPreferredSize(new Dimension(100,100));
        east.setPreferredSize(new Dimension(100,100));

        //---------------subpanels -------------
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.darkGray);
        panel3.setBackground(Color.gray);
        panel4.setBackground(Color.darkGray);
        panel5.setBackground(Color.white);
        
        center.setLayout(new BorderLayout());
        
        panel1.setPreferredSize(new Dimension(50,50));
        panel2.setPreferredSize(new Dimension(50,50));
        panel3.setPreferredSize(new Dimension(50,50));
        panel4.setPreferredSize(new Dimension(50,50));
        panel5.setPreferredSize(new Dimension(50,50));
        
        
        center.add(panel1,BorderLayout.NORTH);
        center.add(panel2,BorderLayout.SOUTH);
        center.add(panel3,BorderLayout.EAST);
        center.add(panel4,BorderLayout.WEST);
        center.add(panel5,BorderLayout.CENTER);
        
        
        f.setLayout(new BorderLayout(10,10)); //set manager //10 is margin width,height
        f.add(north, BorderLayout.NORTH);
        f.add(south, BorderLayout.SOUTH);
        f.add(east, BorderLayout.EAST);
        f.add(west, BorderLayout.WEST);
        f.add(center, BorderLayout.CENTER);

        f.setBounds(100, 250, 500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
