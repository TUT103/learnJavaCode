package Java1课本示例代码.Chapter09.Example9_7;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PoliceListen implements MyCommandListener {
    JTextField textInput;
    JTextArea textShow;

    public void setJTextField(JTextField text) {
        textInput = text;
    }

    public void setJTextArea(JTextArea area) {
        textShow = area;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textInput.getText();
        textShow.append(str + "的长度：" + str.length() + "\n");
    }
}
