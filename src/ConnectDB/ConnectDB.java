/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.util.Properties;

/**
 *
 * @author trang.nguyen
 */
public class ConnectDB {
    static Connection conn;

    static {
        try {
            String strConn = "jdbc:mysql://localhost/QuanLiKhachSan3";
            Properties pro = new Properties();
            pro.put("user", "root");
            pro.put("password", "");
            Driver driver = new Driver();
            conn = driver.connect(strConn, pro);
            if (conn != null) {
                System.out.println("Kết nối tới CSDL dbtaisan thành công");
            } else {
                System.out.println("Kết nối tới CSDL dbtaisan thất bại");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }

    public static Connection getConnect() {
        return conn;
    }

    public static void main(String[] args) {
        ConnectDB con = new ConnectDB();
        // con.Ketnoi();
    }
}
