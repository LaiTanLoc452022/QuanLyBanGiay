package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;

import entity1.ChitiethoadonId;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import Database.HIbernateUtil;
import entity1.Chitiethoadon;

/**
 * Home object for domain model class Chitiethoadon.
 * @see DAO.Chitiethoadon
 * @author Hibernate Tools
 */
public class ChitiethoadonHome {
	private static Transaction transaction;
	private static Session session;
	public static void insert(Chitiethoadon instance){
		try{
			session=HIbernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			session.save(instance);
			transaction.commit();
			session.close();
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	public static void update(Chitiethoadon instance){
		session=HIbernateUtil.getSessionFactory().openSession();
		transaction=session.beginTransaction();
		session.update(instance);
		session.close();
	}
}
