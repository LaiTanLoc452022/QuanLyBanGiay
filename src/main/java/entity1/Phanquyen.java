package entity1;
// Generated Mar 24, 2023, 8:47:13 AM by Hibernate Tools 4.3.6.Final

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
 * Phanquyen generated by hbm2java
 */
@Entity
@Table(name = "phanquyen", catalog = "cuahangbangiay")
public class Phanquyen implements java.io.Serializable {

	private PhanquyenId id;
	private Manhinh manhinh;
	private Nhom nhom;

	public Phanquyen() {
	}

	public Phanquyen(PhanquyenId id) {
		this.id = id;
	}

	public Phanquyen(PhanquyenId id, Manhinh manhinh, Nhom nhom) {
		this.id = id;
		this.manhinh = manhinh;
		this.nhom = nhom;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idmanHinh", column = @Column(name = "IDManHinh")),
			@AttributeOverride(name = "idnhom", column = @Column(name = "IDNhom")),
			@AttributeOverride(name = "coQuyen", column = @Column(name = "CoQuyen")) })
	public PhanquyenId getId() {
		return this.id;
	}

	public void setId(PhanquyenId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDManHinh", insertable = false, updatable = false)
	public Manhinh getManhinh() {
		return this.manhinh;
	}

	public void setManhinh(Manhinh manhinh) {
		this.manhinh = manhinh;
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
