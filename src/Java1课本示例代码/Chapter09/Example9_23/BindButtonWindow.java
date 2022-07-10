package Java1课本示例代码.Chapter09.Example9_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BindButtonWindow extends JFrame {
    JButton button;
    Police listener;

    BindButtonWindow() {
        setLayout(new FlowLayout());
        listener = new Police();
        button = new JButton("单击我或按A键移动我");
        add(button);
        button.addActionListener(listener);
        InputMap inputMap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("A"), "dog");
        ActionMap actionMap = button.getActionMap();
        actionMap.put("dog", listener);
        setVisible(true);
        setBounds(300, 300, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Police extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            int x = b.getBounds().x;
            int y = b.getBounds().y;
            b.setLocation(x + 10, y + 10);
        }
    }
}
