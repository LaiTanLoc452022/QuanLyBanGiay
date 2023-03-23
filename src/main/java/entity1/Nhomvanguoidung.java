package entity1;
// Generated Mar 23, 2023, 7:01:00 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Nhomvanguoidung generated by hbm2java
 */
@Entity
@Table(name = "nhomvanguoidung", catalog = "cuahangbangiay")
public class Nhomvanguoidung implements java.io.Serializable {

	private NhomvanguoidungId id;
	private Nguoidung nguoidung;
	private Nhom nhom;

	public Nhomvanguoidung() {
	}

	public Nhomvanguoidung(NhomvanguoidungId id) {
		this.id = id;
	}

	public Nhomvanguoidung(NhomvanguoidungId id, Nguoidung nguoidung, Nhom nhom) {
		this.id = id;
		this.nguoidung = nguoidung;
		this.nhom = nhom;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idnguoiDung", column = @Column(name = "IDNguoiDung")),
			@AttributeOverride(name = "idnhom", column = @Column(name = "IDNhom")),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GhiChu", length = 0)) })
	public NhomvanguoidungId getId() {
		return this.id;
	}

	public void setId(NhomvanguoidungId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDNguoiDung", insertable = false, updatable = false)
	public Nguoidung getNguoidung() {
		return this.nguoidung;
	}

	public void setNguoidung(Nguoidung nguoidung) {
		this.nguoidung = nguoidung;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDNhom", insertable = false, updatable = false)
	public Nhom getNhom() {
		return this.nhom;
	}

	public void setNhom(Nhom nhom) {
		this.nhom = nhom;
	}

}
