package Java1课本示例代码.Chapter03;

import java.util.Scanner;

public class Example3_9 {
    public static void main(String[] args) {
        System.out.println("每输入一个数字回一次车，输入非数字符号结束输入：");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数字的和是%f\n", m, sum);
        System.out.printf("%d个数字的平均值是%f\n", m, sum / m);
    }
}
