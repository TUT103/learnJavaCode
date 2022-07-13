package Java1课本示例代码.Chapter15.Example15_1;

public class Rect {
    double sideA, sideB, area;

    Rect(double a, double b) {
        sideA = a;
        sideB = b;
    }

    @Override
    public String toString() {
        area = sideA * sideB;
        return "" + area;
    }
}
