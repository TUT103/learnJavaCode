package Java1课本示例代码.Chapter11.Example11_3;

import Java1课本示例代码.Chapter11.Example11_1.GetDBItems;
import Java1课本示例代码.Chapter11.Example11_2.GetDBConnection;

import java.sql.*;

public class Example11_3 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBConnection.connectDB("students", "root", "1");
        if (con == null)
            return;
        String c1 = " year(birthday)<=2000 and month(birthday)>7";
        String c2 = " name Like '张_'";
        String c3 = " height > 1.65";
        String sqlStr = "select * from mess where " + c1 + " and" + c2 + " and" + c3 + " order by birthday";
        try {
            sql = con.createStatement();
            rs = sql.executeQuery(sqlStr);
            GetDBItems.getItems(rs);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
