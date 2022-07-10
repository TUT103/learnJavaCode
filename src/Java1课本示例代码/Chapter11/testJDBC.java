package Java1课本示例代码.Chapter11;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
        Connection connection;
        String uri = "jdbc:mysql://localhost:3306/students?user=root&password=1&useSSL=true&characterEncoding=gb2312";
        try {
            connection = DriverManager.getConnection(uri);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
