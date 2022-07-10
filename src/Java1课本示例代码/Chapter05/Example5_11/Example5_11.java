package Java1课本示例代码.Chapter05.Example5_11;

class Animal {
    void cry() {

    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("汪汪……");
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("喵喵……");
    }
}

public class Example5_11 {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.cry();
        animal = new Cat();
        animal.cry();
    }
}
