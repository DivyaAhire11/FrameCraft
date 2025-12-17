                  
Java Listeners
         In Java, listeners are interfaces used to handle events such as clicks, selection changes, key presses, etc. They are part of the Java Event Model in java.awt.event and javax.swing.event packages.

--------------------------------------------------------

1. ActionListener

        Package :  import java.awt.event.ActionListener;
                import java.awt.event.ActionEvent;

        Methods :  void actionPerformed(ActionEvent e)
--------------------------------------------------------

2. ItemListener

        Package :  import java.awt.event.ItemListener;
                import java.awt.event.ItemEvent;

        Methods :  void itemStateChanged(ItemEvent e)
--------------------------------------------------------

3. KeyListener

        Package :  import java.awt.event.KeyListener;
                import java.awt.event.KeyEvent;

        Methods :  void keyPressed(KeyEvent e)
                void keyReleased(KeyEvent e)
                void keyTyped(KeyEvent e)
--------------------------------------------------------

4. MouseListener

        Package  : import java.awt.event.MouseListener;
                import java.awt.event.MouseEvent;

        Methods  : void mouseClicked(MouseEvent e)
                void mousePressed(MouseEvent e)
                void mouseReleased(MouseEvent e)
                void mouseEntered(MouseEvent e)
                void mouseExited(MouseEvent e)
-------------------------------------------------------    
5. ChangeListener

        Package  : import javax.swing.event.ChangeListener;
                import javax.swing.event.ChangeEvent;

        Methods  : void stateChanged(ChangeEvent e)
--------------------------------------------------------

6. FocusListener

        Package  : import java.awt.event.FocusListener;
                import java.awt.event.FocusEvent;

        Methods  : void focusGained(FocusEvent e)
                void focusLost(FocusEvent e)
--------------------------------------------------------

7. WindowListener

        Package  : import java.awt.event.WindowListener;
                import java.awt.event.WindowEvent;

        Methods  : void windowOpened(WindowEvent e)
                void windowClosing(WindowEvent e)
                void windowClosed(WindowEvent e)
                void windowIconified(WindowEvent e)
                void windowDeiconified(WindowEvent e)
                void windowActivated(WindowEvent e)
                void windowDeactivated(WindowEvent e)
-------------------------------------------------------  
8. MouseMotionListener

        Package  :  import java.awt.event.MouseMotionListener;
                    import java.awt.event.MouseEvent;

        Methods  :  void mouseDragged(MouseEvent e)
                    void mouseMoved(MouseEvent e)
 -------------------------------------------------------

AWT
*) Frame (Main Window)
       🪟 Basic window (OS-dependent)

*)Choice (Dropdown)
      [ Java ▼ ]

*) TextArea
     |              |
     |              |
     |              |


*) List
    C
    C++
    Java


SWING 

*) JFrame (Main Window) 
     🪟 A normal application window with a title bar

*) JButton (Button)
     [ Click Me ]

*) JLabel (Text Display)
    Hello Java

*) JTextField (Text Box)
    [______________]

*) JCheckBox (Checkbox)
   ☐ Accept

*) JRadioButton (Radio Button)
   ◯ Male
   ◯ Female

*) JComboBox (Dropdown)
    [ Java ▼ ]


| AWT                | Swing                |
| ------------------ | -------------------- |
| Heavyweight        | Lightweight          |
| OS-dependent look  | Same look everywhere |
| Faster but limited | More components      |

======================================================================================

* What is a Layout Manager in Java?
    A Layout Manager controls how components (buttons, labels, text fields, etc.) are arranged inside a container (Frame, Panel, JFrame, JPanel).

    Java uses layout managers to make GUIs platform-independent and responsive.

🔹 Why Use Layout Managers?

    *)Automatically adjust component size & position
    *)Platform independent
    *)Resizable window support
    *)Clean and maintainable GUI design

---------------------------------------------------------
1️⃣ FlowLayout
     1.Default layout for JPanel
     2.Components arranged left to right
     3.Wraps to next line if space is insufficient

--------------------------------------------------------

2️⃣ BorderLayout
    1.Default layout for JFrame
    2.NORTH , SOUTH ,EAST,WEST,CENTER

--------------------------------------------------------

3️⃣ GridLayout
   1.Components in rows and columns
   2.All components have equal size
   3.Use Case: Calculator, dashboards

--------------------------------------------------------

4️⃣ CardLayout
   1.Multiple components, one visible at a time
   2.Works like cards
   3.Use Case: Login screens, step-by-step forms

--------------------------------------------------------

5️⃣ GridBagLayout (Advanced)
   1.Most flexible and complex
   2.Components can span multiple rows/columns

--------------------------------------------------------

6️⃣ Null Layout (Not Recommended)
   1.Absolute positioning using setBounds()
   2.No automatic resizing


