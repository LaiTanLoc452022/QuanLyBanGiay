package entity1;
// Generated May 9, 2023, 1:47:18 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * The generated by hbm2java
 */
public class The implements java.io.Serializable {

	private Integer idthe;
	private String loai;
	private Double heSo;
	private Set<Khachhang> khachhangs = new HashSet<Khachhang>(0);

	public The() {
	}

	public The(String loai, Double heSo, Set<Khachhang> khachhangs) {
		this.loai = loai;
		this.heSo = heSo;
		this.khachhangs = khachhangs;
	}
        
        public String toString(){
            return this.idthe + "" +this.loai + "" + this.heSo +"";
        }

	public Integer getIdthe() {
		return this.idthe;
	}

	public void setIdthe(Integer idthe) {
		this.idthe = idthe;
	}

	public String getLoai() {
		return this.loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public Double getHeSo() {
		return this.heSo;
	}

	public void setHeSo(Double heSo) {
		this.heSo = heSo;
	}

	public Set<Khachhang> getKhachhangs() {
		return this.khachhangs;
	}

	public void setKhachhangs(Set<Khachhang> khachhangs) {
		this.khachhangs = khachhangs;
	}

}
