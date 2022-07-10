package Java1课本示例代码.Chapter09.Example9_7;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface MyCommandListener extends ActionListener {
    void setJTextField(JTextField text);

    void setJTextArea(JTextArea area);
}
