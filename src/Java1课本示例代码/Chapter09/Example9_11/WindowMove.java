package Java1课本示例代码.Chapter09.Example9_11;

import javax.swing.*;
import java.awt.*;

public class WindowMove extends JFrame {
    LP layeredPane;

    WindowMove() {
        layeredPane = new LP();
        add(layeredPane, BorderLayout.CENTER);
        setVisible(true);
        setBounds(12, 12, 300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
