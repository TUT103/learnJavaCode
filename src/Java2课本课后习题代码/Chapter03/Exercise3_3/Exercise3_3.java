package Java2课本课后习题代码.Chapter03.Exercise3_3;

public class Exercise3_3 {
    public static void main(String[] args) {
        /*
        int i = 1, n = 20;
        double sum = 0.0, temp = 1.0;
        do {
            temp = temp * (1.0 / i);
            sum += temp;
            i++;
        } while (i <= n);
        System.out.println(sum); // 1.7182818284590455
        */
        int i = 1, n = 20;
        double sum = 0.0, temp = 1.0;
        for (; i<=n; i++){
            temp = temp * (1.0 / i);
            sum += temp;
        }
        System.out.println(sum); // 1.7182818284590455
    }
}
