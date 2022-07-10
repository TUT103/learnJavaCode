package Java1课本示例代码.Chapter09.Example9_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowMessage extends JFrame implements ActionListener {
    JTextField inputEnglish;
    JTextArea show;
    String regex = "[a-zA-Z]+";

    WindowMessage() {
        inputEnglish = new JTextField(22);
        inputEnglish.addActionListener(this);
        show = new JTextArea();
        add(inputEnglish, BorderLayout.NORTH);
        add(show, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputEnglish) {
            String str = inputEnglish.getText();
            if (str.matches(regex)) {
                show.append(str + ", ");
            } else {
                JOptionPane.showMessageDialog(this, "您输入了非法字符", "消息对话框",
                        JOptionPane.WARNING_MESSAGE);
                inputEnglish.setText(null);
            }
        }
    }
}
