package Java2课本课后习题代码.Chapter03.Exercise3_6;

public class Exercise3_6 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum >= 8888) {
                System.out.println(i-1);
                break;
            }
        }
    }
}
