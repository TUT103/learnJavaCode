package Java1课本示例代码.Chapter09.Example9_13;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends JFrame {
    Boy police;

    MyFrame(String s) {
        super(s);
        police = new Boy();
        setBounds(300, 300, 200, 300);
        setVisible(true);
        addWindowListener(police);
        validate();
    }
}

class Boy extends WindowAdapter {
    public void windowsClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class Example9_13 {
    public static void main(String[] args) {
        new MyFrame("窗口");
    }
}
