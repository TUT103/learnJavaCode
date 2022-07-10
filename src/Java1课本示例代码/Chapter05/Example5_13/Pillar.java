package Java1课本示例代码.Chapter05.Example5_13;

public class Pillar {
    Geometry bottom;
    double height;

    Pillar(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume() {
        if (bottom == null) {
            System.out.println("没有底，无法计算面积");
            return -1;
        }
        return bottom.getArea() * height;
    }
}
