package Java1课本示例代码.Chapter03;

public class Example3_6 {
    public static void main(String[] args) {
        double sum = 0, item = 1;
        int i = 1, n = 20;
        while (i <= n) {
            System.out.println(item);
            sum = sum + item;
            i += 1;
            item = item * (1.0 / i);
        }
        System.out.println(sum);
    }
}
