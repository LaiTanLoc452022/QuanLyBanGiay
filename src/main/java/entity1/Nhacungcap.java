package entity1;
// Generated Mar 30, 2023, 4:12:58 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Nhacungcap generated by hbm2java
 */
public class Nhacungcap implements java.io.Serializable {

	private Integer idnhaCungCap;
	private String ten;
	private Integer sdt;
	private String email;
	private Date thoiGianHopTac;
	private Set hoadons = new HashSet(0);

	public Nhacungcap() {
	}

	public Nhacungcap(String ten, Integer sdt, String email, Date thoiGianHopTac, Set hoadons) {
		this.ten = ten;
		this.sdt = sdt;
		this.email = email;
		this.thoiGianHopTac = thoiGianHopTac;
		this.hoadons = hoadons;
	}

	public Integer getIdnhaCungCap() {
		return this.idnhaCungCap;
	}

	public void setIdnhaCungCap(Integer idnhaCungCap) {
		this.idnhaCungCap = idnhaCungCap;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Integer getSdt() {
		return this.sdt;
	}

	public void setSdt(Integer sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getThoiGianHopTac() {
		return this.thoiGianHopTac;
	}

	public void setThoiGianHopTac(Date thoiGianHopTac) {
		this.thoiGianHopTac = thoiGianHopTac;
	}

	public Set getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set hoadons) {
		this.hoadons = hoadons;
	}

}
