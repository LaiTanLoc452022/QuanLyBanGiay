package entity1;
// Generated Apr 12, 2023, 10:43:38 AM by Hibernate Tools 5.6.12.Final

import java.util.Date;

/**
 * Khachhang generated by hbm2java
 */
public class Khachhang implements java.io.Serializable {

    private Integer idkhachHang;
    public The the;
    private Date ngayLapThe;
    private String hoVaTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;

    public Khachhang() {
    }

    public Khachhang(The the, Date ngayLapThe, String hoVaTen, String gioiTinh, Date ngaySinh, String diaChi) {
        this.the = the;
        this.ngayLapThe = ngayLapThe;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public Integer getIdkhachHang() {
        return this.idkhachHang;
    }

    public void setIdkhachHang(Integer idkhachHang) {
        this.idkhachHang = idkhachHang;
    }

    public The getThe() {
        return this.the;
    }

    public void setThe(The the) {
        this.the = the;
    }

    public Date getNgayLapThe() {
        return this.ngayLapThe;
    }

    public void setNgayLapThe(Date ngayLapThe) {
        this.ngayLapThe = ngayLapThe;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
