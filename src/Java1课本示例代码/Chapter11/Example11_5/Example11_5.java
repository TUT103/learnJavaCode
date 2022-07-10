package Java1课本示例代码.Chapter11.Example11_5;

import Java1课本示例代码.Chapter11.Example11_1.GetDBItems;
import Java1课本示例代码.Chapter11.Example11_2.GetDBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
g
public class Example11_5 {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement preSql;
        ResultSet rs;
        con = GetDBConnection.connectDB("students", "root", "1");
        if (con ==null)
            return;
        String sqlStr = "INSERT INTO mess VALUES (?, ?, ?, ?)";
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, "A0001");
            preSql.setString(2, "刘伟");
            preSql.setString(3, "1999-9-10");
            preSql.setFloat(4, 1.77f);
            int ok = preSql.executeUpdate();
            System.out.println("成功加入" + ok + "条记录");
            sqlStr = "SELECT * FROM mess WHERE NAME LIKE ? ";
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, "张%");
            rs = preSql.executeQuery();
            GetDBItems.getItems(rs);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
