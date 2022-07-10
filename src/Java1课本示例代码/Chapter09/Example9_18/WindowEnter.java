package Java1课本示例代码.Chapter09.Example9_18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowEnter extends JFrame implements ActionListener {
    JTextField inputName;
    JTextArea save;

    WindowEnter() {
        inputName = new JTextField(22);
        inputName.addActionListener(this);
        save = new JTextArea();
        add(inputName, BorderLayout.NORTH);
        add(new JScrollPane(save), BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = inputName.getText();
        int n = JOptionPane.showConfirmDialog(this, "确认是否正确", "确认对话框",
                JOptionPane.OK_CANCEL_OPTION);
        System.out.println(n);
        if (n == JOptionPane.YES_OPTION) {
            save.append("\n" + s);
        } else if (n == JOptionPane.NO_OPTION) {
            inputName.setText(null);
        }
    }
}
