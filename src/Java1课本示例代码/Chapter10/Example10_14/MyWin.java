package Java1课本示例代码.Chapter10.Example10_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyWin extends JFrame implements ActionListener {
    JLabel label = null;
    JButton 读入 = null, 写出 = null;
    ByteArrayInputStream in = null;
    ByteArrayOutputStream out = null;

    MyWin() {
        setLayout(new FlowLayout());
        label = new JLabel("How are you");
        读入 = new JButton("读入对象");
        写出 = new JButton("写出对象");
        读入.addActionListener(this);
        写出.addActionListener(this);
        setVisible(true);
        add(label);
        add(写出);
        add(读入);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == 写出) {
            try {
                out = new ByteArrayOutputStream();
                ObjectOutputStream objectOut = new ObjectOutputStream(out);
                objectOut.writeObject(label);
                objectOut.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == 读入) {
            try {
                in = new ByteArrayInputStream(out.toByteArray());
                ObjectInputStream objectIn = new ObjectInputStream(in);
                JLabel temp = (JLabel) objectIn.readObject();
                temp.setText("你好");
                this.add(temp);
                this.validate();
                objectIn.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }
}
