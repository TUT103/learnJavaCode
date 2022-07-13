package Java1课本示例代码.Chapter09.Example9_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends JDialog implements ActionListener {
    JTextField inputTitle;
    String title;

    MyDialog(JFrame f, String s) {
        super(f, s);
        inputTitle = new JTextField(10);
        inputTitle.addActionListener(this);
        setLayout(new FlowLayout());
        add(new JLabel("输入窗口的新标题"));
        add(inputTitle);
        setBounds(60, 60, 100, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        title = inputTitle.getText();
        setVisible(false);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
