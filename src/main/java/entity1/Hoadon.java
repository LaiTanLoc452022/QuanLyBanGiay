package entity1;
// Generated May 9, 2023, 1:47:18 PM by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Hoadon generated by hbm2java
 */
public class Hoadon implements java.io.Serializable {

    private Integer idhoaDon;
    public Nhacungcap nhacungcap;
    private Date ngayLap;
    private Integer idkhachHang;
    private BigDecimal tongTien;
    private Integer idnhanVien;
    private byte[] Qr;
    private Set<Chitiethoadon> chitiethoadons = new HashSet<Chitiethoadon>(0);

    public Hoadon() {
    }

    public Hoadon(Nhacungcap nhacungcap, Date ngayLap, Integer idkhachHang, BigDecimal tongTien, Integer idnhanVien,
            Set<Chitiethoadon> chitiethoadons) {
        this.nhacungcap = nhacungcap;
        this.ngayLap = ngayLap;
        this.idkhachHang = idkhachHang;
        this.tongTien = tongTien;
        this.idnhanVien = idnhanVien;
        this.chitiethoadons = chitiethoadons;
    }

    public byte[] getQr() {
        return Qr;
    }

    public void setQr(byte[] Qr) {
        this.Qr = Qr;
    }

    public Integer getIdhoaDon() {
        return this.idhoaDon;
    }

    public void setIdhoaDon(Integer idhoaDon) {
        this.idhoaDon = idhoaDon;
    }

    public Nhacungcap getNhacungcap() {
        return this.nhacungcap;
    }

    public void setNhacungcap(Nhacungcap nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public Date getNgayLap() {
        return this.ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Integer getIdkhachHang() {
        return this.idkhachHang;
    }

    public void setIdkhachHang(Integer idkhachHang) {
        this.idkhachHang = idkhachHang;
    }

    public BigDecimal getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public Integer getIdnhanVien() {
        return this.idnhanVien;
    }

    public void setIdnhanVien(Integer idnhanVien) {
        this.idnhanVien = idnhanVien;
    }

    public Set<Chitiethoadon> getChitiethoadons() {
        return this.chitiethoadons;
    }

	public void setChitiethoadons(Set<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

}
