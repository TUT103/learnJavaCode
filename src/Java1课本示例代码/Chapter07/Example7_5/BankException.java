package Java1课本示例代码.Chapter07.Example7_5;

public class BankException extends Exception {
    String message;

    public BankException(int m, int n) {
        message = "入账资金" + m + "是负数或支出" + n + "是正数，不符合系统要求";
    }

    public String warnMessage() {
        return message;
    }
}
