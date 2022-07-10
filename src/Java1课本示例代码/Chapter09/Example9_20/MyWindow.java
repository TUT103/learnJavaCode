package Java1课本示例代码.Chapter09.Example9_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements ActionListener {
    JButton button;
    MyDialog dialog;

    MyWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        button = new JButton("打开对话框");
        button.addActionListener(this);
        add(button, BorderLayout.NORTH);
        dialog = new MyDialog(this, "我是对话框");
        dialog.setModal(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true);
        String str = dialog.getTitle();
        setTitle(str);
    }
}
