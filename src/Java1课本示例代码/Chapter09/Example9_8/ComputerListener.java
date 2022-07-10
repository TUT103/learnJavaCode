package Java1课本示例代码.Chapter09.Example9_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerListener implements ActionListener {
    JTextField inputNumberOne, inputNumberTwo;
    JTextArea textShow;
    String fuhao;

    public void setJTextFieldOne(JTextField inputNumberOne) {
        this.inputNumberOne = inputNumberOne;
    }

    public void setJTextFieldTwo(JTextField inputNumberTwo) {
        this.inputNumberTwo = inputNumberTwo;
    }

    public void setJTextArea(JTextArea textArea) {
        this.textShow = textArea;
    }

    public void setFuhao(String s) {
        this.fuhao = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = Double.parseDouble(inputNumberOne.getText());
            double number2 = Double.parseDouble(inputNumberTwo.getText());
            double result = 0;
            if (fuhao.equals("+"))
                result = number1 + number2;
            else if (fuhao.equals("-"))
                result = number1 - number2;
            else if (fuhao.equals("*"))
                result = number1 * number2;
            else if (fuhao.equals("/"))
                result = number1 / number2;
            textShow.append(number1 + " " + fuhao + " " + number2 + " = " + result + "\n");
        } catch (Exception exp) {
            System.out.println("\n请输入字符\n");
        }
    }
}
