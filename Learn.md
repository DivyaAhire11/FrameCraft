                  
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

