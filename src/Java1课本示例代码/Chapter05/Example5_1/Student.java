package Java1课本示例代码.Chapter05.Example5_1;

public class Student extends People {
    int number;

    void tellNumber() {
        System.out.printf("学号：%d\t", number);
    }

    int add(int x, int y) {
        return x + y;
    }
}
