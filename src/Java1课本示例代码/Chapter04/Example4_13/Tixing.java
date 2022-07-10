package Java1课本示例代码.Chapter04.Example4_13;

public class Tixing {
    double above, bottom, height;

    Tixing(double a, double b, double c) {
        above = a;
        bottom = b;
        height = c;
    }

    double getArea() {
        return (above + bottom) * height / 2;
    }
}
