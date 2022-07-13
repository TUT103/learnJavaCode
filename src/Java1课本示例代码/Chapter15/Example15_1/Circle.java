package Java1课本示例代码.Chapter15.Example15_1;

public class Circle {
    double area, radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    public String toString() {
        area = radius * radius * Math.PI;
        return "" + area;
    }
}
