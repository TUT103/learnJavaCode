package Java2课本课后习题代码.Chapter03.Exercise3_5;

public class Exercise3_5 {
    public static void main(String[] args) {
        double temp = 0, sum = 0;
        for (int i = 1; i <= 10; i++) {
            temp = temp + 8 * Math.pow(10 , (i - 1));
            sum += temp;
        }
        System.out.println(sum);
    }
}
