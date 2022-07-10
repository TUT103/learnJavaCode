package Java1课本示例代码.Chapter05.Example5_3;

public class Goods {
    double weight;

    void oldSetWeight(double w) {
        weight = w;
        System.out.println("double型的weight=" + weight);
    }

    double oldGetPrice() {
        double price = weight * 10;
        return price;
    }
}
