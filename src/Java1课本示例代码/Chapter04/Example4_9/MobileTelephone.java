package Java1课本示例代码.Chapter04.Example4_9;

public class MobileTelephone {
    SIM sim;

    void setSim(SIM card) {
        sim = card;
    }

    long lookNumber() {
        return sim.getNumber();
    }
}
