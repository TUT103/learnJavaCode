package Java1课本示例代码.Chapter09.Example9_2;

import javax.swing.*;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static javax.swing.JFrame.*;

public class WindowMenu extends JFrame {
    JMenuBar menuBar;
    JMenu menu, subMenu;
    JMenuItem item1, item2;

    public WindowMenu() {
    }

    public WindowMenu(String s, int x, int y, int w, int h) {
        init(s);
        setLocation(x, y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    void init(String s) {
        setTitle(s);
        menuBar = new JMenuBar();
        menu = new JMenu("zoo");
        subMenu = new JMenu("食草动物");
        item1 = new JMenuItem("大象", new ImageIcon("ele.gif"));
        item2 = new JMenuItem("兔子", new ImageIcon("rab.gif"));
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("老虎", new ImageIcon("tig.gif")));
        subMenu.add(new JMenuItem("猎豹", new ImageIcon("leo.gif")));
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
}
