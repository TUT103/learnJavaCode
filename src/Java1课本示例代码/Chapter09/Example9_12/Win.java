package Java1课本示例代码.Chapter09.Example9_12;

import javax.swing.*;
import java.awt.*;

public class Win extends JFrame {
    JTextField[] text = new JTextField[3];
    Police police;
    JButton b;

    Win() {
        setLayout(new FlowLayout());
        police = new Police();
        for (int i = 0; i < 3; i++) {
            text[i] = new JTextField(7);
            text[i].addKeyListener(police);
            text[i].addFocusListener(police);
            add(text[i]);
        }
        b = new JButton("确定");
        add(b);
        text[0].requestFocusInWindow();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
