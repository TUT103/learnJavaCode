package Java1课本示例代码.Chapter11.Example11_8;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HandleInsertData {
    Connection con;
    PreparedStatement preSql;

    public HandleInsertData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("导入jar包出错");
        }
        String uri = "jdbc:mysql://localhost:3306/user?useSSL=true&characterEncoding=utf8";
        try {
            con = DriverManager.getConnection(uri, "root", "1");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库出错");
        }
    }

    public void writeRegisterModel(Register register) {
        String sqlStr = "INSERT INTO register VALUES (?, ?, ?)";
        int ok = 0;
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, register.getID());
            preSql.setString(2, register.getPassword());
            preSql.setString(3, register.getBirthday());
            ok = preSql.executeUpdate();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "id不能重复",
                    "警告", JOptionPane.WARNING_MESSAGE);
        }
        if (ok != 0) {
            JOptionPane.showMessageDialog(null, "注册成功",
                    "恭喜", JOptionPane.WARNING_MESSAGE);
        }
    }
}
