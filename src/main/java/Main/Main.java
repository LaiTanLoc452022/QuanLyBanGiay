package Main;
import java.math.BigDecimal;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryReturn;
import org.hibernate.query.Query;

import DAO.*;
import Database.HIbernateUtil;
import entity1.Giay;
import entity1.Hoadon;

public class Main {
	public static void main(String[] args) {
		
		try(Session session= HIbernateUtil.getSessionFactory().openSession()){
			Query<Giay> query=session.createQuery("FROM Giay");
			List<Giay> listGiay=query.list();
			listGiay.forEach(a->System.out.println(a.getName()));
		}
			
		
	}
}
