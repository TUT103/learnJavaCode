package Java1课本示例代码.Chapter09.Example9_15;

public class Triangle {
    double sideA, sideB, sideC, area;
    boolean isTriange;

    public String getArea() {
        if (isTriange) {
            double p = (sideA + sideB + sideC) / 2.0;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return String.valueOf(area);
        } else
            return "无法计算面积";
    }

    public void setSideA(double a) {
        this.sideA = a;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)
            isTriange = true;
        else
            isTriange = false;
    }

    public void setSideB(double b) {
        this.sideB = b;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)
            isTriange = true;
        else
            isTriange = false;
    }

    public void setSideC(double c) {
        this.sideC = c;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)
            isTriange = true;
        else
            isTriange = false;
    }
}
