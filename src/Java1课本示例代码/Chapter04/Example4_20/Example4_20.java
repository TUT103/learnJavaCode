package Java1课本示例代码.Chapter04.Example4_20;

import java.util.Arrays;

public class Example4_20 {
    public static void main(String[] args) {
        char a[] = {'a', 'b', 'c', 'D', 'E', 'F'};
        for (int i = 0; i < a.length; i++) {
            if (Character.isLowerCase(a[i]))
                a[i] = Character.toUpperCase(a[i]);
            else if (Character.isUpperCase(a[i]))
                a[i] = Character.toLowerCase(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
}
