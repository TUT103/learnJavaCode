package Java2课本课后习题代码.Chapter03.Exercise3_1;

public class Exercise3_1 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0, temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = temp * i;
            sum += temp;
        }
        System.out.println(sum);
    }
}
