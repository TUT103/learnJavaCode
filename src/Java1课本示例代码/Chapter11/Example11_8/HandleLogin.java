package Java1课本示例代码.Chapter11.Example11_8;

import javax.swing.*;
import java.sql.*;

public class HandleLogin {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;

    public HandleLogin() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
        String uri = "jdbc:mysql://localhost:3306/user?useSSL=true&characterEncoding=gb2312";
        try {
            con = DriverManager.getConnection(uri, "root", "1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Login queryVerify(Login loginModel) {
        String id = loginModel.getID();
        String pw = loginModel.getPassword();
        String sqlStr = "SELECT id, password FROM register WHERE  " + "id = ? AND password = ?";
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, id);
            preSql.setString(2, pw);
            rs = preSql.executeQuery();
            if (rs.next() == true) {
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null, "登录成功", "恭喜", JOptionPane.WARNING_MESSAGE);
            } else {
                loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null, "登录失败", "登录失败，重新登录", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loginModel;
    }
}
