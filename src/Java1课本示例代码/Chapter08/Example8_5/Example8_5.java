package Java1课本示例代码.Chapter08.Example8_5;


import java.util.Date;

public class Example8_5 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        TV tv = new TV();
        tv.setPrice(8520.96);
        System.out.println(tv.toString());
    }
}
