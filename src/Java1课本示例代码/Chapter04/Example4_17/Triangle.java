// “Java1课本示例代码.Chapter04.Example4_19”调用的包
package Java1课本示例代码.Chapter04.Example4_17;

public class Triangle {
    double sideA, sideB, sideC;

    public double getArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    public void setSides(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }
}
