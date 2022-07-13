package Java1课本示例代码.Chapter11.Example11_1;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetDBItems {
    public static void getItems(ResultSet rs) throws SQLException {
        while (rs.next()) {
            String number = rs.getString(1);
            String name = rs.getString(2);
            Date date = rs.getDate(3);
            float height = rs.getFloat(4);
            System.out.printf("%s\t", number);
            System.out.printf("%s\t\t", name);
            System.out.printf("%s\t", date);
            System.out.printf("%.2f\n", height);
        }
    }
}
