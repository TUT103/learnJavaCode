package Java1课本示例代码.Chapter05.Example5_10;

class 类人猿 {
    void crySpeak(String s) {
        System.out.println(s);
    }
}

class People extends 类人猿 {
    void compute(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    void crySpeak(String s) {
        System.out.println("***" + s + "***");
    }
}

public class Example5_10 {
    public static void main(String[] args) {
        类人猿 monkey;
        People geng = new People();
        monkey = geng;
        monkey.crySpeak("I Love this Game");
        People people = (People) monkey;
        people.compute(10, 10);
    }
}
