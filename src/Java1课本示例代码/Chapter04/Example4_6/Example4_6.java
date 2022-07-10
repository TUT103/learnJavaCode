package Java1课本示例代码.Chapter04.Example4_6;

class Computer {
    int add(int x, int y) {
        return x + y;
    }
}

public class Example4_6 {
    public static void main(String[] args) {
        Computer com = new Computer();
        int m = 100;
        int n = 200;
        int result = com.add(m, n);
        System.out.println(result);
        result = com.add(120 + m, n * 10 + 8);
        System.out.println(result);
    }
}
