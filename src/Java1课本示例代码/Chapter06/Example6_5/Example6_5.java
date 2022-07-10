package Java1课本示例代码.Chapter06.Example6_5;

interface SpeakHello {
    void speakHello();
}

class Chinese implements SpeakHello {
    @Override
    public void speakHello() {
        System.out.println("中国人习惯问候语：你好，吃饭了吗？");
    }
}

class Englist implements SpeakHello {
    @Override
    public void speakHello() {
        System.out.println("英国人习惯问候语：你好，天气不错！");
    }
}

class KindHello {
    public void lookHello(SpeakHello hello) {
        hello.speakHello();
    }
}

public class Example6_5 {
    public static void main(String[] args) {
        KindHello kindHello = new KindHello();
        kindHello.lookHello(new Chinese());
        kindHello.lookHello(new Englist());
    }
}
