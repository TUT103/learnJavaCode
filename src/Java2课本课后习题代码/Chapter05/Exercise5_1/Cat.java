package Java2课本课后习题代码.Chapter05.Exercise5_1;

public class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("喵喵");
    }

    @Override
    void getAnimalName() {
        System.out.println("猫");
    }
}
