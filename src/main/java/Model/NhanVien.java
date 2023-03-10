package Model;

import java.sql.Date;

public class NhanVien {
	private int IDNhanVien;
	private String HoVaTen;
	private int SDT;
	private Date NgaySinh;
	private String Email;
	private float Luong;
////Get set
	public int getIDNhanVien() {
		return IDNhanVien;
	}
	public void setIDNhanVien(int iDNhanVien) {
		IDNhanVien = iDNhanVien;
	}
	public String getHoVaTen() {
		return HoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		SDT = sDT;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	//////
	
	
	
}
