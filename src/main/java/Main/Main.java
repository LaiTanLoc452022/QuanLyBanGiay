package Main;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryReturn;
import org.hibernate.query.Query;

import DAO.*;
import Database.HIbernateUtil;
import entity1.Giay;

public class Main {
	public static void main(String[] args) {
		try(Session session= HIbernateUtil.getSessionFactory().openSession()){
		Query <entity1.Giay>query = session.createQuery(" FROM Giay");
		List<entity1.Giay> resultset=query.list();
		resultset.forEach(r->System.out.println(r.getName()));

		}
		
		
			
		
	}
}
