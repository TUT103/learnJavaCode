package Java1课本示例代码.Chapter06.Example6_6;

public class AdvertisementBoard {
    public void show(Advertisement advertisement) {
        System.out.println(advertisement.getCorpName() + "的广告词如下：");
        advertisement.showAdvertisement();
    }
}
