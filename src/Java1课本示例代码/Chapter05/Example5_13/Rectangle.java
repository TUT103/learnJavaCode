package Java1课本示例代码.Chapter05.Example5_13;

public class Rectangle extends Geometry {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}
