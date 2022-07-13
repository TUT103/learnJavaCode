package Java1课本示例代码.Chapter15.Example15_1;

public class Cone<E> {
    double height;
    E bottom;

    public Cone(E b) {
        bottom = b;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double computerVolume() {
        String s = bottom.toString();
        System.out.println("底面积：" + s);
        double area = Double.parseDouble(s);
        return 1.0 / 3.0 * area * height;
    }
}
