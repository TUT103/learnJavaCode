package Java1课本示例代码.Chapter06.Example6_6;

public class BlackLandCorp implements Advertisement {
    @Override
    public void showAdvertisement() {
        System.out.println("************************");
        System.out.println("劳动是爹，土地是妈。");
        System.out.println("************************");
    }

    @Override
    public String getCorpName() {
        return "黑土集团";
    }
}
