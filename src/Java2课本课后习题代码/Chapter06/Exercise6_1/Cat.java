package Java2课本课后习题代码.Chapter06.Exercise6_1;


public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("喵喵");
    }

    @Override
    public void getAnimalName() {
        System.out.println("狗");
    }
}
