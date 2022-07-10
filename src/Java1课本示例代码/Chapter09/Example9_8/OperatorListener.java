package Java1课本示例代码.Chapter09.Example9_8;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OperatorListener implements ItemListener {
    JComboBox choice;
    ComputerListener workTogether;

    public void setJComboBox(JComboBox box) {
        choice = box;
    }

    public void setWorkTogether(ComputerListener computer) {
        workTogether = computer;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String fuhao = choice.getSelectedItem().toString();
        workTogether.setFuhao(fuhao);
    }
}
