/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakhachsan;

import java.awt.Image;
import java.util.Date;

/**
 *
 *
 * @author trang.nguyen
 */
public class Employee1 {

    private String MaNhanVien;
    private String TenNhanVien;
    private Date NgaySinh;
    private String GioiTinh;
    private String MaChucVu;
    private String PhongBan;
    private String DiaChi;
    private String phoneNumber;
    private byte [] picture;

    public Employee1(String MaNhanVien, String TenNhanVien, Date NgaySinh, String GioiTinh, String MaChucVu, String PhongBan, String DiaChi, String phoneNumber,byte []image) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.MaChucVu = MaChucVu;
        this.PhongBan = PhongBan;
        this.DiaChi = DiaChi;
        this.phoneNumber = phoneNumber;
        this.picture= image;
    }


    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
//    public byte[] get(byte[] imagedata) {
//        return picture;
//    }
    
    
    
    
    
}

