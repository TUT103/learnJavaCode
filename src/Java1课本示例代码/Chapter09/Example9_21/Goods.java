package Java1课本示例代码.Chapter09.Example9_21;

public class Goods {
    String name;
    double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
