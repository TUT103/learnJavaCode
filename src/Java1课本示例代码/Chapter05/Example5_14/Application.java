package Java1课本示例代码.Chapter05.Example5_14;

public class Application {
    public static void main(String[] args) {
        MobileTelephone telephone = new MobileTelephone();

        SIM sim1 = new SIMOfChinaMobile();
        sim1.setNumber("138 8765 6432");
        telephone.useSIM(sim1);
        telephone.showMess();

        SIM sim2 = new SIMOfChinaUnicom();
        sim2.setNumber("131 0203 1923");
        telephone.useSIM(sim2);
        telephone.showMess();
    }
}
