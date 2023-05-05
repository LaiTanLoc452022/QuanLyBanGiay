package entity1;
// Generated Apr 13, 2023, 9:30:14 PM by Hibernate Tools 5.6.12.Final

import com.toedter.calendar.JDateChooser;
import java.util.Date;

public class Nhanvien implements java.io.Serializable {

    private Integer idnhanVien;
    private String hoVaTen;
    private Integer sdt;
    private Date ngaySinh;
    private String email;
    private Double luong;
    private Integer idloai;
    private byte[] anh;

    public Nhanvien() {
    }

    public Nhanvien(String hoVaTen, Integer sdt, Date ngaySinh, String email, Double luong, Integer idloai,
            byte[] anh) {
        this.hoVaTen = hoVaTen;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.luong = luong;
        this.idloai = idloai;
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "idnhanVien=" + idnhanVien + ", hoVaTen=" + hoVaTen + ", sdt=" + sdt + ", ngaySinh=" + ngaySinh + ", email=" + email + ", luong=" + luong + '}';
    }

    public Integer getIdnhanVien() {
        return this.idnhanVien;
    }

    public void setIdnhanVien(Integer idnhanVien) {
        this.idnhanVien = idnhanVien;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Integer getSdt() {
        return this.sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getLuong() {
        return this.luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public Integer getIdloai() {
        return this.idloai;
    }

    public void setIdloai(Integer idloai) {
        this.idloai = idloai;
    }

    public byte[] getAnh() {
        return this.anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }
}
