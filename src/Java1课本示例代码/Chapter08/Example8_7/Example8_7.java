package Java1课本示例代码.Chapter08.Example8_7;

import java.util.Arrays;

public class Example8_7 {
    public static void main(String[] args) {
        byte[] d = "Java你好".getBytes();
        System.out.println("数组d的长度是：" + d.length);
//        System.out.println(Arrays.toString(d));
        String s = new String(d, 6, 2);
        System.out.println(s);
        s = new String(d, 0, 6);
        System.out.println(s);
    }
}
