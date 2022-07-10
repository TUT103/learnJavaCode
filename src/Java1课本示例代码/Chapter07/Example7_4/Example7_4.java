package Java1课本示例代码.Chapter07.Example7_4;

import java.io.IOException;

public class Example7_4 {
    public static void main(String[] args) {
        int m = 0, n = 0, t = 1000;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab89");
            t = 7777;
        } catch (NumberFormatException e) {
            System.out.println("发生异常：" + e.getMessage());
        }
        System.out.println("n = " + n + ", m = " + m + ", t=" + t);
        try {
            System.out.println("故意抛出I/O异常");
            throw new java.io.IOException("我是故意的");
        } catch (IOException e) {
            System.out.println("发生异常：" + e.getMessage());
        }
    }
}
