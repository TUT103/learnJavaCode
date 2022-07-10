package Java1课本示例代码.Chapter07.Example7_3;

interface SpeakHello {
    void speak();
}

class HelloMechine {
    public void turnOn(SpeakHello hello) {
        hello.speak();
    }
}

public class Example7_3 {
    public static void main(String[] args) {
        HelloMechine mechine = new HelloMechine();
        mechine.turnOn(new SpeakHello() {
            @Override
            public void speak() {
                System.out.println("hello, you are welcome");
            }
        });
        mechine.turnOn(new SpeakHello() {
            @Override
            public void speak() {
                System.out.println("你好，欢迎光临");
            }
        });
    }
}
