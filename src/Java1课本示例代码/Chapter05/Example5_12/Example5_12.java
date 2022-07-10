package Java1课本示例代码.Chapter05.Example5_12;

abstract class GirlFriend {
    abstract void speak();

    abstract void cooking();
}

class ChinaGirlFriend extends GirlFriend {
    @Override
    void speak() {
        System.out.println("你好");
    }

    @Override
    void cooking() {
        System.out.println("水煮鱼");
    }
}

class AmericanGirlFriend extends GirlFriend {
    @Override
    void speak() {
        System.out.println("hello");
    }

    @Override
    void cooking() {
        System.out.println("roast beef");
    }
}

class Boy {
    GirlFriend friend;

    void setGirlFriend(GirlFriend f) {
        friend = f;
    }

    void showGirlFriend() {
        friend.speak();
        friend.cooking();
    }
}

public class Example5_12 {
    public static void main(String[] args) {
        GirlFriend girl = new AmericanGirlFriend();
        Boy boy = new Boy();
        boy.setGirlFriend(girl);
        boy.showGirlFriend();
        girl = new ChinaGirlFriend();
        boy.setGirlFriend(girl);
        boy.showGirlFriend();
    }
}
