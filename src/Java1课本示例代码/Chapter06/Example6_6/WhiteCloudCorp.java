package Java1课本示例代码.Chapter06.Example6_6;

public class WhiteCloudCorp implements Advertisement {
    @Override
    public void showAdvertisement() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("飞机中的战斗机，哎yes！");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    @Override
    public String getCorpName() {
        return "白云有限公司";
    }
}
