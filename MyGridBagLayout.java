
/**
 * span multiple rows/columns
 * have different sizes
 * resize proportionally
 * 
 * 
 * 
| gridx      | column position           |
| gridy      | row position              |
| gridwidth  | number of columns spanned |
| gridheight | number of rows spanned    |
| weightx    | horizontal resize weight  |
| weighty    | vertical resize weight    |
| fill       | how component grows       |
| anchor     | alignment inside cell     |
| insets     | external padding          |

fill Option:
    
    GridBagConstraints.NONE
    GridBagConstraints.HORIZONTAL
    GridBagConstraints.VERTICAL
    GridBagConstraints.BOTH

anchor Option :
     GridBagConstraints.CENTER
     GridBagConstraints.EAST
     GridBagConstraints.WEST
     GridBagConstraints.NORTH
     GridBagConstraints.SOUTH


 */
import java.awt.*; //GridBagLayout
import javax.swing.*;

class MyGridBagLayout extends JFrame {
    GridBagLayout gb1;
    GridBagConstraints gbc;

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JButton b1;

    MyGridBagLayout() {
        setTitle("GridBagLayout Demo");
        setBounds(200, 100, 400, 300);

        // Step 1: Create GridBagLayout
        gb1 = new GridBagLayout();
        setLayout(gb1);

        // Step 2: Create GridBagConstraints
        gbc = new GridBagConstraints();

        // Common spacing between components
        gbc.insets = new Insets(5, 5, 5, 5);

        // -------- Label Name --------
        l1 = new JLabel("Name :");
        gbc.gridx = 0; // column 0
        gbc.gridy = 0; // row 0
        gbc.anchor = GridBagConstraints.EAST;
        add(l1, gbc);

        // -------- TextField Name --------
        t1 = new JTextField(10);
        gbc.gridx = 1; // col 1
        gbc.gridy = 0; // row 0
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0; // allow horizontal resize
        add(t1, gbc);

        // -------- Label Age --------
        l2 = new JLabel("Age : ");
        gbc.gridx = 0; // col 0
        gbc.gridy = 1; // row 1
        gbc.weightx = 0; // reset weight
        gbc.fill = GridBagConstraints.NONE;
        add(l2, gbc);

        // -------- TextField Age --------
        t2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(t2, gbc);

        // -------- Label Gender --------
        l3 = new JLabel("Gender:");
        gbc.gridx = 0;    //col 0
        gbc.gridy = 2;    //row 2
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        add(l3, gbc);
 
        //------------Radio Button------------
        bg = new ButtonGroup();
        r1 = new JRadioButton("Male");
        gbc.gridx = 1;
        gbc.gridy =2;
        gbc.anchor = GridBagConstraints.WEST;
          add(r1,gbc);
     
        r2 = new JRadioButton("FeMale");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(r2,gbc);

        bg.add(r1);
        bg.add(r2);
        
        // -------- Button Submit --------
        b1 = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;    // span across 2 column
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints. NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        add(b1, gbc);

        // gbc.weightx =0;
        // gbc.weighty =0;
        // gbc.fill = GridBagConstraints.NONE;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridBagLayout();
    }
}
