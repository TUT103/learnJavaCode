package Java1课本示例代码.Chapter05.Example5_14;

public class MobileTelephone {
    SIM card;

    public void useSIM(SIM card) {
        this.card = card;
    }

    public void showMess() {
        System.out.println("使用的卡是：" + card.getCorpName() + "提供的");
        System.out.println("手机号码是：" + card.giveNumber());
    }
}
