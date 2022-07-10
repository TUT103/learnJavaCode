package Java1课本示例代码.Chapter09.Example9_9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandleListener implements ActionListener {
    JTextArea inputText, showText;

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }

    public void setShowText(JTextArea showText) {
        this.showText = showText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("copy"))
            showText.copy();
        else if (str.equals("cut"))
            showText.cut();
        else if (str.equals("paste"))
            showText.paste();
    }
}
