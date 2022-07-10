package Java1课本示例代码.Chapter08.Example8_8;

public class EncryptAndDecrypt {
    public String encrypt(String command, String password) {
        char[] p = password.toCharArray();
        int n = p.length;
        char[] c = command.toCharArray();
        int m = c.length;
        for (int k = 0; k < m; k++) {
            int mima = c[k] + p[k % n];
            c[k] = (char) mima;
        }
        return new String(c);
    }

    public String decrypt(String sourceString, String password) {
        char[] p = password.toCharArray();
        int n = p.length;
        char[] c = sourceString.toCharArray();
        int m = c.length;
        for (int k = 0; k < m; k++) {
            int mima = c[k] - p[k % n];
            c[k] = (char) mima;
        }
        return new String(c);
    }
}
