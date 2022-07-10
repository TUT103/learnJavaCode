package Java1课本示例代码.Chapter06.Example6_1;

public class China implements Computable {
    int number;

    @Override
    public int f(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
