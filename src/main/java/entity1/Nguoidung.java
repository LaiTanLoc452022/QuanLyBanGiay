package entity1;
// Generated Mar 30, 2023, 4:12:58 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Nguoidung generated by hbm2java
 */
public class Nguoidung implements java.io.Serializable {

	private Integer idnguoiDung;
	private Nhanvien nhanvien;
	private String tenDangNhap;
	private String tenTaiKhoan;
	private String matKhau;
	private Set nhomvanguoidungs = new HashSet(0);

	public Nguoidung() {
	}

	public Nguoidung(Nhanvien nhanvien, String tenDangNhap, String tenTaiKhoan, String matKhau, Set nhomvanguoidungs) {
		this.nhanvien = nhanvien;
		this.tenDangNhap = tenDangNhap;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.nhomvanguoidungs = nhomvanguoidungs;
	}

	public Integer getIdnguoiDung() {
		return this.idnguoiDung;
	}

	public void setIdnguoiDung(Integer idnguoiDung) {
		this.idnguoiDung = idnguoiDung;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public String getTenDangNhap() {
		return this.tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getTenTaiKhoan() {
		return this.tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public Set getNhomvanguoidungs() {
		return this.nhomvanguoidungs;
	}

	public void setNhomvanguoidungs(Set nhomvanguoidungs) {
		this.nhomvanguoidungs = nhomvanguoidungs;
	}

}
