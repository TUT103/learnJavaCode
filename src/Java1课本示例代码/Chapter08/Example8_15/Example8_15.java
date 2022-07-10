package Java1课本示例代码.Chapter08.Example8_15;

import java.util.Calendar;
import java.util.Date;

public class Example8_15 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        System.out.println(date);
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR),
                month = calendar.get(Calendar.MONTH) + 1,
                day = calendar.get(Calendar.DAY_OF_MONTH),
                hour = calendar.get(Calendar.HOUR_OF_DAY),
                minute = calendar.get(Calendar.MINUTE),
                second = calendar.get(Calendar.SECOND);
        System.out.print("现在的时间是：");
        System.out.print("" + year + "年" + month + "月" + day + "日");
        System.out.println(" " + hour + "时" + minute + "分" + second + "秒");

        int y = 2019, m = 12, d = 21;
        calendar.set(y, m - 1, d);
        long time1 = calendar.getTimeInMillis();
        y = 2022;
        m = 2;
        d = 12;
        calendar.set(y, m - 1, d);
        long time2 = calendar.getTimeInMillis();
        long subDay = (time2 - time1) / (1000 * 60 * 60 * 24);
        System.out.print("" + new Date(time2) + " 与 " + new Date(time1) + "相隔" + subDay + "天");
    }
}
