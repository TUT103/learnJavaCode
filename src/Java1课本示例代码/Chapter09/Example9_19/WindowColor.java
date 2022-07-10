package Java1课本示例代码.Chapter09.Example9_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowColor extends JFrame implements ActionListener {
    JButton button;

    WindowColor(){
        button = new JButton("打开颜色对话框");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(button);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color newColor = JColorChooser.showDialog(this, "调色板", getContentPane().getBackground());
        if (newColor != null){
            getContentPane().setBackground(newColor);
        }
    }
}
