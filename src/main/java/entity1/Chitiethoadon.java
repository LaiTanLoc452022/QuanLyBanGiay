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
 * Chitiethoadon generated by hbm2java
 */
@Entity
@Table(name = "chitiethoadon", catalog = "cuahangbangiay")
public class Chitiethoadon implements java.io.Serializable {

	private ChitiethoadonId id;
	private Giay giay;
	private Hoadon hoadon;

	public Chitiethoadon() {
	}

	public Chitiethoadon(ChitiethoadonId id) {
		this.id = id;
	}

	public Chitiethoadon(ChitiethoadonId id, Giay giay, Hoadon hoadon) {
		this.id = id;
		this.giay = giay;
		this.hoadon = hoadon;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idhoaDon", column = @Column(name = "IDHoaDon")),
			@AttributeOverride(name = "idgiay", column = @Column(name = "IDGiay")),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SoLuong")) })
	public ChitiethoadonId getId() {
		return this.id;
	}

	public void setId(ChitiethoadonId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDGiay", insertable = false, updatable = false)
	public Giay getGiay() {
		return this.giay;
	}

	public void setGiay(Giay giay) {
		this.giay = giay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDHoaDon", insertable = false, updatable = false)
	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

}
