package Java1课本示例代码.Chapter06.Example6_6;

public class Example6_6 {
    public static void main(String[] args) {
        AdvertisementBoard board = new AdvertisementBoard();
        board.show(new BlackLandCorp());
        System.out.println(" ");
        board.show(new WhiteCloudCorp());
    }
}
