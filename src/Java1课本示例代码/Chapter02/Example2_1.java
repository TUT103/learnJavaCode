package Java1课本示例代码.Chapter02;

public class Example2_1 {
    public static void main(String[] args) {
        char chinaword = '好', japanword = 'あ'; // '为char类型所用，与"不同
        char you = '\u4F60';
        int position = 20320;
        System.out.println("汉字：" + chinaword + "的位置：" + (int) chinaword);
        System.out.println("日文：" + japanword + "的位置：" + (int) japanword);
        System.out.println(position + "位置上的字符是：" + (char) position);
        position = 21319;
        System.out.println(position + "位置上的字符是：" + (char) position);
        System.out.println("you：" + you);
    }
}
