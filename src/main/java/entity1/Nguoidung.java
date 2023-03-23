package entity1;
// Generated Mar 23, 2023, 7:01:00 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Nguoidung generated by hbm2java
 */
@Entity
@Table(name = "nguoidung", catalog = "cuahangbangiay", uniqueConstraints = @UniqueConstraint(columnNames = "TenTaiKhoan"))
public class Nguoidung implements java.io.Serializable {

	private int idnguoiDung;
	private Nhanvien nhanvien;
	private String tenDangNhap;
	private String tenTaiKhoan;
	private String matKhau;
	private Set<Nhomvanguoidung> nhomvanguoidungs = new HashSet<Nhomvanguoidung>(0);

	public Nguoidung() {
	}

	public Nguoidung(int idnguoiDung) {
		this.idnguoiDung = idnguoiDung;
	}

	public Nguoidung(int idnguoiDung, Nhanvien nhanvien, String tenDangNhap, String tenTaiKhoan, String matKhau,
			Set<Nhomvanguoidung> nhomvanguoidungs) {
		this.idnguoiDung = idnguoiDung;
		this.nhanvien = nhanvien;
		this.tenDangNhap = tenDangNhap;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.nhomvanguoidungs = nhomvanguoidungs;
	}

	@Id

	@Column(name = "IDNguoiDung", unique = true, nullable = false)
	public int getIdnguoiDung() {
		return this.idnguoiDung;
	}

	public void setIdnguoiDung(int idnguoiDung) {
		this.idnguoiDung = idnguoiDung;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDNhanVien")
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Column(name = "TenDangNhap", length = 0)
	public String getTenDangNhap() {
		return this.tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	@Column(name = "TenTaiKhoan", unique = true, length = 100)
	public String getTenTaiKhoan() {
		return this.tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	@Column(name = "MatKhau", length = 0)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nguoidung")
	public Set<Nhomvanguoidung> getNhomvanguoidungs() {
		return this.nhomvanguoidungs;
	}

	public void setNhomvanguoidungs(Set<Nhomvanguoidung> nhomvanguoidungs) {
		this.nhomvanguoidungs = nhomvanguoidungs;
	}

}
