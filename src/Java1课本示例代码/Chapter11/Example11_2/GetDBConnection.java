package Java1课本示例代码.Chapter11.Example11_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetDBConnection {
    public static Connection connectDB(String DBname, String id, String pw) {
        Connection con = null;
        String uri = "jdbc:mysql://localhost:3306/" + DBname + "?useSSL=true&characterEncoding=gb2312";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
        try {
            con = DriverManager.getConnection(uri, id, pw);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
