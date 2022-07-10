package Java1课本示例代码.Chapter05.Example5_13;

public class Application {
    public static void main(String[] args) {
        Geometry bottom = null;
        Pillar pillar;
        pillar = new Pillar(bottom, 100);
        System.out.println("体积：" + pillar.getVolume());
        bottom = new Rectangle(12, 22);
        pillar = new Pillar(bottom, 58);
        System.out.println("体积：" + pillar.getVolume());
        bottom = new Circle(10);
        pillar = new Pillar(bottom, 58);
        System.out.println("体积：" + pillar.getVolume());
    }
}
