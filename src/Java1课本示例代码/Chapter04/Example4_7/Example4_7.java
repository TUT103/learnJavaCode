package Java1课本示例代码.Chapter04.Example4_7;

public class Example4_7 {
    public static void main(String[] args) {
        Battery battery = new Battery(100);
        System.out.println("南孚电池的储电量是：" + battery.electricityAmount);
        Radio radio = new Radio();
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(battery);
        System.out.println("南孚电池的储电量是：" + battery.electricityAmount);
    }
}
