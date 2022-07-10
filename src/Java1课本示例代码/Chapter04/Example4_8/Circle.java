package Java1课本示例代码.Chapter04.Example4_8;

public class Circle {
    double radius, area;
    void setRadius(double r){
        radius = r;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        area = 3.14 * radius * radius;
        return area;
    }
}
