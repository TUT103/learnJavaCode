package Java1课本示例代码.Chapter04.Example4_13;

public class Example4_13 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(196.87);
        Tixing tixing = new Tixing(3, 21, 9);
        Student zhang = new Student();
        System.out.println("zhang计算圆的面积");
        double result = zhang.computeArea(circle);
        System.out.println(result);
        System.out.println("zhang计算梯形的面积");
        result = zhang.computeArea(tixing);
        System.out.println(result);
    }
}
