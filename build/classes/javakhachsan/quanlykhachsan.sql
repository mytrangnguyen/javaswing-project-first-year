DROP DATABASE QuanLiKhachSan3;

CREATE DATABASE QuanLiKhachSan3;

USE QuanLiKhachSan3;

SET SQL_SAFE_UPDATES = 0;

CREATE TABLE Phong(
MaPhong varchar(5) NOT NULL PRIMARY KEY,
   LoaiPhong char NOT NULL,
   TinhTrang varchar(10),
   Tang int,
   GiaPhong decimal(12,3) NOT NULL
);


CREATE TABLE DichVu(
MaDichVu varchar(5) NOT NULL PRIMARY KEY,
   TenDichVu varchar(50) NOT NULL,
GiaDichVu decimal(12,3) NOT NULL
);

CREATE TABLE ChucVu(
MaChucVu varchar(10) NOT NULL PRIMARY KEY,
   TenChucVu varchar(50) NOT NULL UNIQUE KEY,
   Luong decimal(12,3)
);

CREATE TABLE KhachHang(
MaKhachHang int NOT NULL PRIMARY KEY,
   TenKhachHang varchar(100) NOT NULL,
   Ngaysinh date NOT NULL,
   CMND varchar(14) UNIQUE KEY,
   QuocTich varchar(20) NOT NULL,
   GioiTinh varchar(5),
   DiaChi text,
   SDT varchar(20)
);
select * from khachhang;

CREATE TABLE NhanVien(
MaNhanVien varchar(10) NOT NULL PRIMARY KEY,
   TenNhanVien varchar(100) NOT NULL,
   MaChucVu varchar(10) NOT NULL,
   Tuoi int NOT NULL,
   GioiTinh varchar(5) NOT NULL,
   DiaChi text,
   FOREIGN KEY(MaChucVu) REFERENCES ChucVu (MaChucVu)
);

CREATE TABLE HoaDon(
	MaHoaDon int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   MaKhachHang int NOT NULL,
   MaDichVu varchar(5) NOT NULL,
   MaNhanVien varchar(10) NOT NULL,
   MaPhong varchar(5) NOT NULL,
   NgayDen date NOT NULL,
   NgayDi date,
   TienPhong decimal (13,2),
   TienDichVu decimal (13,2),
   GiamGiaKH decimal (13,2),
   HinhThucThanhToan varchar(50),
   SoNgay int,
   ThanhTien decimal (13,2),
   FOREIGN KEY(MaKhachHang) REFERENCES KhachHang (MaKhachHang),
   FOREIGN KEY(MaPhong) REFERENCES Phong (MaPhong),
   FOREIGN KEY(MaDichVu) REFERENCES DichVu(MaDichVu),
   FOREIGN KEY(MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);


/*CREATE TABLE PhucVu(
MaHoaDon int NOT NULL,
   MaDichVu varchar(5) NOT NULL,
   MaNhanVien varchar(10) NOT NULL,
	PRIMARY KEY(MaHoaDon, MaDichVu),
   FOREIGN KEY(MaHoaDon) REFERENCES HoaDon(MaHoaDon),
   FOREIGN KEY(MaDichVu) REFERENCES DichVu(MaDichVu),
   FOREIGN KEY(MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);*/
