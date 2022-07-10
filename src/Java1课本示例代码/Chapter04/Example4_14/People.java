package Java1课本示例代码.Chapter04.Example4_14;

public class People {
    int leg, hand;
    String name;

    People(String s) {
        this.name = s;
        this.init();
    }

    void init() {
        leg = 2;
        hand = 2;
        System.out.println(name + "有" + hand + "只手" + leg + "条腿");
    }

    public static void main(String[] args) {
        People bushi = new People("布什");
    }
}
