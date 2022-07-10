package Java1课本示例代码.Chapter08.Example8_21;

import java.io.Console;

public class Example8_21 {
    public static void main(String[] args) {
        boolean success;
        int count = 0;
        Console cons;
        char[] passwd;
        cons = System.console();
        while (true) {
            System.out.print("输入密码：");
            passwd = cons.readPassword();
            count++;
            String password = new String(passwd);
            if (password.equals("I love this game")) {
                success = true;
                System.out.println("第" + count + "次密码正确！");
                break;
            } else {
                System.out.println("第" + count + "次密码" + password + "不正确！");
            }
            if (count == 3) {
                System.out.println("您" + count + "次密码都不正确");
                System.exit(0);
            }
        }
        if (success) {
            System.out.println("您好！欢迎您！");
        }
    }
}
