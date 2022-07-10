package Java1课本示例代码.Chapter04.Example4_12;

class People {
    float hello(int a, int b) {
        return a + b;
    }

    float hello(long a, int b) {
        return a - b;
    }

    double hello(double a, int b) {
        return a * b;
    }
}

public class Example4_12 {
    public static void main(String[] args) {
        People tom = new People();
        System.out.println(tom.hello(10, 20));
        System.out.println(tom.hello(10l, 20));
        System.out.println(tom.hello(10.0, 20));
    }
}
