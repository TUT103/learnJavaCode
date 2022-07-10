package Java1课本示例代码.Chapter08.Example8_16;

import java.util.Arrays;

public class Example8_16 {
    public static void main(String[] args) {
        CalenderBean cb = new CalenderBean();
        cb.setYear(2022);
        cb.setMonth(6);
        String[] a = cb.getCalender();
        char[] str = "日一二三四五六".toCharArray();
        System.out.println(Arrays.toString(str));
        for (char c : str) {
            System.out.printf("%3c", c);
        }
        for (int i = 0; i < a.length; i++) {
            if (i % 7 == 0) System.out.println("");
            System.out.printf("%4s", a[i]);
        }
    }
}
