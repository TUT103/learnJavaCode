package Java1课本示例代码.Chapter09.Example9_10;

import javax.swing.*;
import java.awt.*;

public class WindowMouse extends JFrame {
    JTextField text;
    JButton button;
    JTextArea textArea;

    MousePolice police;

    WindowMouse() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        text = new JTextField(8);
        textArea = new JTextArea(15, 28);
        police = new MousePolice();
        police.setJTextArea(textArea);
        text.addMouseListener(police);
        button = new JButton("按钮");
        button.addMouseListener(police);
        addMouseListener(police);
        add(button);
        add(text);
        add(new JScrollPane(textArea));
    }
}
