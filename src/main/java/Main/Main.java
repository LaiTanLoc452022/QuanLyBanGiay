package Main;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import entity1.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.internal.NaturalIdCacheKey;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryReturn;
import org.hibernate.query.Query;

import DAO.*;
import Database.HIbernateUtil;

public class Main {
	public static void main(String[] args) {
		Hoadon hoadon=new Hoadon();
		Giay giay=new Giay();
		giay.setVatLieu("Vai");
		giay.setSize(41.5);
		giay.setTen("Nike");
		giay.setThemMoTa("dep va tien loi");
		giay.setMau("Xanh");
		GiayHome.insert(giay);
		/*Giay giay1=new Giay();
		giay1.setThemMoTa("xinh");
		giay1.setTen("adidas");
		giay1.setVatLieu("nhua");
		entity1.Chitiethoadon chitiethoadon=new Chitiethoadon(new ChitiethoadonId(hoadon.getIdhoaDon(), giay.getIdgiay(),1),giay,hoadon);
		Chitiethoadon chitiethoadon1=new Chitiethoadon(new ChitiethoadonId(hoadon.getIdhoaDon(),giay1.getIdgiay(),1),giay1,hoadon);
		Set<Chitiethoadon> set= new HashSet<>();
		set.add(chitiethoadon);
		set.add(chitiethoadon1);
		hoadon.setChitiethoadons(set);

		HoadonHome.insert(hoadon);*/

		
		
		
	}
			
		
	
}
