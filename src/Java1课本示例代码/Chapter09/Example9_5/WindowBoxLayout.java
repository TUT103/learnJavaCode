package Java1课本示例代码.Chapter09.Example9_5;


import javax.swing.*;
import java.awt.*;

public class WindowBoxLayout extends JFrame {
    Box boxH;
    Box boxVOne, boxVTwo;

    public WindowBoxLayout() {
        setLayout(new FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        boxH = Box.createHorizontalBox();
        boxVOne = Box.createVerticalBox();
        boxVTwo = Box.createVerticalBox();
        boxVOne.add(new JLabel("姓名："));
        boxVOne.add(new JLabel("职业："));
        boxVTwo.add(new JTextField(10));
        boxVTwo.add(new JTextField(10));
        boxH.add(boxVOne);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVTwo);
        add(boxH);
    }
}
