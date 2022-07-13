package Java1课本示例代码.Chapter08.Example8_5;

public class TV {
    double price;

    public void setPrice(double m) {
        price = m;
    }

    @Override
    public String toString() {
        String oldStr = super.toString();
        return oldStr + "\n这是电视机，价格是：" + price;
    }
}
