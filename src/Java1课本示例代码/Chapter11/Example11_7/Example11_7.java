package Java1课本示例代码.Chapter11.Example11_7;

import Java1课本示例代码.Chapter11.Example11_2.GetDBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example11_7 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement sql;
        ResultSet rs;
        String sqlStr;
        connection = GetDBConnection.connectDB("students", "root", "1");
        if (connection == null)
            return;
        try {
            float n = 0.02f;
            connection.setAutoCommit(false);
            sql = connection.createStatement();
            sqlStr = "SELECT name ,height FROM mess WHERE number='R1001'";
            rs = sql.executeQuery(sqlStr);
            rs.next();
            float h1 = rs.getFloat(2);
            System.out.println("事务之前" + rs.getString(1) + "身高：" + h1);
            sqlStr = "SELECT name ,height FROM mess WHERE number='R1002'";
            rs = sql.executeQuery(sqlStr);
            rs.next();
            float h2 = rs.getFloat(2);
            System.out.println("事务之前" + rs.getString(1) + "身高：" + h2);
            h1 = h1 - n;
            h2 = h2 + n;
            sqlStr = "UPDATE mess SET height =" + h1 + "WHERE number = 'R1001'";
            sql.executeUpdate(sqlStr);
            sqlStr = "UPDATE mess SET height =" + h2 + "WHERE number = 'R1002'";
            sql.executeUpdate(sqlStr);
            connection.commit();
            connection.setAutoCommit(true);
            String s = "SELECT name, height FROM mess" + " WHERE number='R1001' or number='R1002'";
            rs = sql.executeQuery(s);
            while (rs.next()) {
                System.out.println("事务后" + rs.getString(1) + "身高：" + rs.getString(2));
            }
            connection.close();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
