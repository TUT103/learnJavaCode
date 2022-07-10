package Java3习题册代码.Chapter02.Practice2_2;

import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        int [] a = {100, 200, 300};
        System.out.println(a.length);
        System.out.println(a);
        int b [][] = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));
        System.out.println(b[4][2]);
        b[4] = a;
        System.out.println(b[4][2]);
    }
}
