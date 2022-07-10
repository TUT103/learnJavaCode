package Java1课本示例代码.Chapter09.Example9_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class LP extends JLayeredPane implements MouseListener, MouseMotionListener {
    JButton button;
    int x, y, a, b, x0, y0;

    LP() {
        button = new JButton("用鼠标拖动我");
        button.addMouseListener(this);
        button.addMouseMotionListener(this);
        setLayout(new FlowLayout());
        add(button, JLayeredPane.DEFAULT_LAYER);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        JComponent com = null;
        com = (JComponent) e.getSource();
        setLayer(com, JLayeredPane.DRAG_LAYER);
        a = com.getBounds().x;
        b = com.getBounds().y;
        x0 = e.getX();
        y0 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JComponent com = null;
        com = (JComponent) e.getSource();
        setLayer(com, JLayeredPane.DEFAULT_LAYER);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Component com = null;
        if (e.getSource() instanceof Component) {
            com = (Component) e.getSource();
            a = com.getBounds().x;
            b = com.getBounds().y;
            x = e.getX();
            y = e.getY();
            a = a + x;
            b = b + y;
            com.setLocation(a - x0, b - y0);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
