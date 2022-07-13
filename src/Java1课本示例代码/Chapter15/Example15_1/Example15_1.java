package Java1课本示例代码.Chapter15.Example15_1;

public class Example15_1 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Cone<Circle> coneOne = new Cone<Circle>(circle);
        coneOne.setHeight(16);
        System.out.println("体积：" + coneOne.computerVolume());
        Rect rect = new Rect(15, 23);
        Cone<Rect> coneTwo = new Cone<Rect>(rect);
        coneTwo.setHeight(98);
        System.out.println("体积：" + coneTwo.computerVolume());
    }
}
