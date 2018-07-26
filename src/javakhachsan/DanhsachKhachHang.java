/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakhachsan;

import ConnectDB.ConnectDB;
import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thinh.nguyen
 */
public class DanhsachKhachHang extends JFrame {

    DefaultTableModel dtmQuanLiKhachSan;
    JTable tblKhachHang;
    ROOM phong = new ROOM();
    int i = 0;
    String[] phongs = new String[500];
    ConnectDB conn;

    public DanhsachKhachHang(String title) {
        super(title);
        addControls();
        hienThiDanhsachKhachHang();

    }

    public void hienThiDanhsachKhachHang() {
        try {
            ConnectDB conn = new ConnectDB();
//            conn.Connection();
            String sql = "select * from Phong ";
            PreparedStatement preStatement = conn.getConnect().prepareStatement(sql);
            dtmQuanLiKhachSan.setRowCount(0);
            ResultSet result = preStatement.executeQuery();

            while (result.next()) {
                Object[] arr = {
                    result.getString(1)};
                dtmQuanLiKhachSan.addRow(arr);
                phongs[i] = result.getString(1);
                i++;
                
                    
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addControls() {
        // TODO Auto-generated method stub
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        dtmQuanLiKhachSan = new DefaultTableModel();
        dtmQuanLiKhachSan.addColumn("Tên Phòng");
        tblKhachHang = new JTable(dtmQuanLiKhachSan);
        JScrollPane sc = new JScrollPane(tblKhachHang,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(sc, BorderLayout.CENTER);
    }

    public void showWindow() {
        this.setSize(600, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        DanhsachKhachHang kh = new DanhsachKhachHang("");
        kh.setVisible(true);
        kh.setLocationRelativeTo(null);
        kh.setSize(600, 400);
        kh.setResizable(false);
    }
}
