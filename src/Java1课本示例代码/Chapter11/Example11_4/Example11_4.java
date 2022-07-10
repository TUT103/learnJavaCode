package Java1课本示例代码.Chapter11.Example11_4;

import Java1课本示例代码.Chapter11.Example11_1.GetDBItems;
import Java1课本示例代码.Chapter11.Example11_2.GetDBConnection;

import java.sql.*;

public class Example11_4 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBConnection.connectDB("students", "root", "1");
        if (con == null)
            return;
        String jiLu = "('R1004', '将三', '2000-10-23', 1.66), " + "('R1005', '李武', '1999-7-22', 1.76)";
        String sqlStr = "INSERT INTO mess VALUES " + jiLu;
        try {
            sql = con.createStatement();
            int ok = sql.executeUpdate(sqlStr);
            System.out.println("成功加入" + ok + "条记录");
            rs = sql.executeQuery("SELECT * FROM mess");
            GetDBItems.getItems(rs);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
