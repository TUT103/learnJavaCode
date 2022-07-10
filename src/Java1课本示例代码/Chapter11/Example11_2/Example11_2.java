package Java1课本示例代码.Chapter11.Example11_2;

import Java1课本示例代码.Chapter08.Example8_18.GetRandomNumber;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Example11_2 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBConnection.connectDB("students", "root", "1");
        if (con == null)
            return;
        try {
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery("SELECT * FROM mess");
            rs.last();
            int max = rs.getRow();
            System.out.println("表中共有" + max + "条记录，随机抽取2条记录");
            int[] a = GetRandomNumber.getRandomNumber(max, 2);
            for (int i : a) {
                rs.absolute(i);
                String number = rs.getString(1);
                String name = rs.getString(2);
                Date date = rs.getDate(3);
                float height = rs.getFloat(4);
                System.out.printf("%s\t", number);
                System.out.printf("%s\t\t", name);
                System.out.printf("%s\t", date);
                System.out.printf("%.2f\n", height);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
