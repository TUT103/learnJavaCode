package Java1课本示例代码.Chapter09.Example9_12;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Police implements KeyListener, FocusListener {
    @Override
    public void focusGained(FocusEvent e) {
        JTextField text = (JTextField) e.getSource();
        text.setText(null);
    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        JTextField t = (JTextField) e.getSource();
        if (t.getCaretPosition() >= 6)
            t.transferFocus();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
