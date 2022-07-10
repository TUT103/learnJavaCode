package Java1课本示例代码.Chapter09.Example9_24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    PrintJob p = null;
    Graphics g = null;
    JTextArea text = new JTextArea(10, 10);
    JButton printTextField = new JButton("打印文本框"),
            printFrame = new JButton("打印窗口"),
            printButton = new JButton("打印按钮");

    MyFrame() {
        super("在应用程序中打印");
        printTextField.addActionListener(this);
        printFrame.addActionListener(this);
        printButton.addActionListener(this);
        add(text, "Center");
        JPanel panel = new JPanel();
        panel.add(printTextField);
        panel.add(printFrame);
        panel.add(printButton);
        add(panel, "South");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == printTextField) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            g.translate(120, 200);
            text.printAll(g);
            g.dispose();
            p.end();
        } else if (e.getSource() == printFrame) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            g.translate(120, 200);
            this.printAll(g);
            g.dispose();
            p.end();
        } else if (e.getSource() == printButton) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            g.translate(120, 200);
            printTextField.printAll(g);
            g.translate(78, 0);
            printFrame.printAll(g);
            g.translate(66, 0);
            printButton.printAll(g);
            g.dispose();
            p.end();
        }
    }
}
