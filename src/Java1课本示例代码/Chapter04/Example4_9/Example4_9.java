package Java1课本示例代码.Chapter04.Example4_9;

public class Example4_9 {
    public static void main(String[] args) {
        SIM simOne = new SIM(15502201710l);
        MobileTelephone mobileTelephone = new MobileTelephone();
        mobileTelephone.setSim(simOne);
        System.out.println("手机号码：" + mobileTelephone.lookNumber());
        SIM simTwo = new SIM(13102031923l);
        mobileTelephone.setSim(simTwo);
        System.out.println("手机号码：" + mobileTelephone.lookNumber());
    }
}
