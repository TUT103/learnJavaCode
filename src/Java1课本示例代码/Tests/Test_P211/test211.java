package Java1课本示例代码.Tests.Test_P211;

import java.io.Console;
import java.util.Arrays;

public class test211 {
    public static void main(String[] args) {
        Console console = System.console();
        char[] a = new char[10];
        a = console.readPassword();
        System.out.println(Arrays.toString(a));
    }
}
