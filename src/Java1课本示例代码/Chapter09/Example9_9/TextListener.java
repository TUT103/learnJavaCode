package Java1课本示例代码.Chapter09.Example9_9;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Arrays;

public class TextListener implements DocumentListener {
    JTextArea inputText, showText;

    public void setInputText(JTextArea inputText) {
        this.inputText = inputText;
    }

    public void setShowText(JTextArea showText) {
        this.showText = showText;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        String str = inputText.getText();
        String regex = "[\\s\\d\\p{Punct}]+";
        String[] words = str.split(regex);
        Arrays.sort(words);
        showText.setText(null);
        for (int i = 0; i < words.length; i++) {
            showText.append(words[i] + ", ");
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

}
