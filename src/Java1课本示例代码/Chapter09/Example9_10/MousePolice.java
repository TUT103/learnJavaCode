package Java1课本示例代码.Chapter09.Example9_10;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePolice implements MouseListener {
    JTextArea area;

    public void setJTextArea(JTextArea area) {
        this.area = area;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() >= 2)
            area.append("\n鼠标连击，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        area.append("\n鼠标按下，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        area.append("\n鼠标释放，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton)
            area.append("\n鼠标进入按钮，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
        if (e.getSource() instanceof JTextField)
            area.append("\n鼠标进入文本框，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
        if (e.getSource() instanceof JFrame)
            area.append("\n鼠标进入窗口，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        area.append("\n鼠标退出，位置：" + "（" + e.getX() + ", " + e.getY() + "）");
    }
}
