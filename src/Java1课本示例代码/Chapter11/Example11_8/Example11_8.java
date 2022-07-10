package Java1课本示例代码.Chapter11.Example11_8;


public class Example11_8 {
    public static void main(String[] args) {
        Register user = new Register();
        user.setID("sun");
        user.setPassword("123456");
        user.setBirthday("1999-12-10");
        HandleInsertData handleInsertData = new HandleInsertData();
        handleInsertData.writeRegisterModel(user);
        Login login = new Login();
        login.setID("moonJava");
        login.setPassword("123456");
        HandleLogin handleLogin = new HandleLogin();
        login = handleLogin.queryVerify(login);
        if (login.getLoginSuccess())
            System.out.println("登录成功！");
    }
}
