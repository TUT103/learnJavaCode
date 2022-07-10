package Java1课本示例代码.Chapter04.Example4_10;


public class Example4_10 {
    public static void main(String[] args) {
        Lader2.下底 = 100;
        Lader2 laderOne = new Lader2();
        Lader2 laderTwo = new Lader2();
        laderOne.设置上底(28);
        laderTwo.设置上底(66);
        System.out.println("laderOne的上底 = " + laderOne.获取上底());
        System.out.println("laderOne的下底 = " + laderOne.获取下底());
        System.out.println("laderTwo的上底 = " + laderTwo.获取上底());
        System.out.println("laderTwo的下底 = " + laderTwo.获取下底());
    }
}
