package Java1课本示例代码.Chapter06.Example6_3;

abstract class MotorVehicle {
    abstract void brake();
}

interface MoneyFare {
    void charge();
}

interface ControlTemprature {
    void controlAirTempature();
}

class Bus extends MotorVehicle implements MoneyFare {
    @Override
    void brake() {
        System.out.println("公共汽车使用孤石刹车技术");
    }

    @Override
    public void charge() {
        System.out.println("公共汽车：一元一张，不计算公里数");
    }
}

class Taxi extends MotorVehicle implements MoneyFare, ControlTemprature {

    @Override
    void brake() {
        System.out.println("出租车使用盘式刹车技术");
    }

    @Override
    public void charge() {
        System.out.println("出租车：两元一公里，起价3公里");
    }

    @Override
    public void controlAirTempature() {
        System.out.println("出租车安装了海尔空调");
    }
}

class Cinema implements MoneyFare, ControlTemprature {
    @Override
    public void charge() {
        System.out.println("电影院：门票十元一张");
    }

    @Override
    public void controlAirTempature() {
        System.out.println("电影院安装了中央空调");
    }
}

public class Example6_3 {
    public static void main(String[] args) {
        Bus bus101 = new Bus();
        Taxi blueTaxi = new Taxi();
        Cinema resStarCiname = new Cinema();
        MoneyFare fare;
        ControlTemprature temprature;
        fare = bus101;
        bus101.brake();
        fare.charge();
        fare = blueTaxi;
        temprature = blueTaxi;
        blueTaxi.brake();
        fare.charge();
        temprature.controlAirTempature();
        fare = resStarCiname;
        temprature = resStarCiname;
        fare.charge();
        temprature.controlAirTempature();
    }
}
