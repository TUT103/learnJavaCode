package Java1课本示例代码.Chapter05.Example5_8;

class Student {
    int number;
    String name;

    Student() { }

    Student(int number, String name) {
        this.number = number;
        this.name = name;
        System.out.println("我的名字是：" + name + "\n" + "学号：" + number);
    }
}

class UniverStudent extends Student {
    boolean 婚否;

    UniverStudent(int number, String name, boolean b) {
        super(number, name);
        婚否 = b;
        System.out.println("婚否 = " + 婚否);
    }
}

public class Example5_8 {
    public static void main(String[] args) {
        UniverStudent zhang = new UniverStudent(9901, "何小林", false);
    }
}
