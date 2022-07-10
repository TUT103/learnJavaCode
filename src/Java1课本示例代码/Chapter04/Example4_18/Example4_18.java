package Java1课本示例代码.Chapter04.Example4_18;

import Java1课本示例代码.Chapter04.Example4_17.Triangle;

public class Example4_18 {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.setSides(30, 40, 50);
        System.out.println(tri.getArea());
    }
}
