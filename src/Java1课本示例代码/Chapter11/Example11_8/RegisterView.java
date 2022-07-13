package Java1课本示例代码.Chapter11.Example11_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JPanel implements ActionListener {
    Register register;
    JTextField inputID, inputBirthday;
    JPasswordField inputPassword;
    JButton buttonRegister;

    RegisterView() {
        register = new Register();
        inputID = new JTextField(12);
        inputBirthday = new JTextField(12);
        inputPassword = new JPasswordField(12);
        buttonRegister = new JButton("注册");
        add(new JLabel("ID:"));
        add(inputID);
        add(new JLabel("密码"));
        add(inputPassword);
        add(new JLabel("出生日期(****-**-**)"));
        add(inputBirthday);
        add(buttonRegister);
        buttonRegister.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        register.setID(inputID.getText());
        char[] pw = inputPassword.getPassword();
        register.setPassword(new String(pw));
        register.setBirthday(inputBirthday.getText());
        HandleInsertData handleRegister = new HandleInsertData();
        handleRegister.writeRegisterModel(register);
    }
}
