package Java1课本示例代码.Tests.Test_P200;

import java.util.Date;
import java.util.Locale;

public class test200 {
    public static void main(String[] args) {
        Date nowTime = new Date();
        String s1 = String.format("%ty年%tm月%td日", nowTime, nowTime, nowTime);
        System.out.println(s1);
        String s2 = String.format("%tF", nowTime);
        System.out.println(s2);
        String s3 = String.format("%tY年%<tm月%<td日 %<tH时%<tM分%<tS秒", nowTime);
        System.out.println(s3);

        String s4 = String.format(Locale.US, "%ta. %<tF", nowTime);
        System.out.println(s4);
        String s5 = String.format(Locale.JAPAN, "%ta. %<tF", nowTime);
        System.out.println(s5);
    }
}
