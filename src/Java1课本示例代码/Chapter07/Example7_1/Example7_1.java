package Java1课本示例代码.Chapter07.Example7_1;

class RedCowFarm {
    static String farmName;
    RedCow cow;

    RedCowFarm() {
    }

    RedCowFarm(String s) {
        cow = new RedCow(150, 112, 5000);
        farmName = s;
    }

    void showCowMess() {
        cow.speak();
    }

    class RedCow {
        String cowName = "红牛";
        int height, weight, price;

        RedCow(int h, int w, int p) {
            height = h;
            weight = w;
            price = p;
        }

        void speak() {
            System.out.println("我是" + cowName + "，身高：" + height + "，体重：" + weight + "，生活在" + farmName);
        }
    }
}

public class Example7_1 {
    public static void main(String[] args) {
        RedCowFarm farm = new RedCowFarm("红牛农场");
        farm.showCowMess();
        farm.cow.speak();
    }
}
