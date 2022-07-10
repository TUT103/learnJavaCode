package Java1课本示例代码.Chapter11.Example11_1;

import java.sql.*;

public class Example11_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载JDBC-MySQL驱动
        } catch (Exception e) {
        }
        String uri = "jdbc:mysql://localhost:3306/students?useSSL=true&characterEncoding=gb2312";
        String user = "root";
        String password = "1";

        Connection con = null;//建立连接
        Statement sql;//向数据库发送SQL查询语句
        ResultSet rs;//处理查询结果
        try {
            con = DriverManager.getConnection(uri, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT * FROM mess");
            GetDBItems.getItems(rs);
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
