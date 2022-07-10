package Java2课本课后习题代码.Chapter03.Exercise3_2;

public class Exercise3_2 {
    public static void main(String[] args) {
        int i, j, count = 0;
        for (j = 2; j <= 100; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0)
                    break;
            }
            if (i > j / 2) {
                System.out.println(j);
            }
        }
    }
}
