package Java1课本示例代码.Chapter09.Example9_4;

import javax.swing.*;
import java.awt.*;

public class ShowLayout extends JFrame {
    PanelGridLayout panelGrid;
    PanelNullLayout panelNull;
    JTabbedPane p;

    ShowLayout() {
        panelGrid = new PanelGridLayout();
        panelNull = new PanelNullLayout();
        p = new JTabbedPane();
        p.add("网格布局的面板", panelGrid);
        p.add("空布局的面板", panelNull);
        add(p, BorderLayout.CENTER);
        add(new JButton("窗体是BorderLayout布局"), BorderLayout.NORTH);
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("西"), BorderLayout.WEST);
        add(new JButton("东"), BorderLayout.EAST);
        setBounds(300, 300, 570, 390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
}
