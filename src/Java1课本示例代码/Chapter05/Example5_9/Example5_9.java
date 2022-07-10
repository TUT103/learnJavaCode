package Java1课本示例代码.Chapter05.Example5_9;

class A {
    final double PI = 3.1415926;

    public double getArea(final double r) {
        return PI * r * r;
    }

    public final void speak() {
        System.out.println("您好！");
    }
}

public class Example5_9 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("面积：" + a.getArea(100));
        a.speak();
    }
}
