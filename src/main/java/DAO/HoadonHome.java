package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final
import Database.HIbernateUtil;
import entity1.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.query.Query;

/**
 * Home object for domain model class Hoadon.
 * @see entity1.Hoadon
 * @author Hibernate Tools
 */
public class HoadonHome {
	private static Transaction transaction;
		public static void insert(Hoadon instance){
			try(Session session=HIbernateUtil.getSessionFactory().openSession()){
				transaction=session.beginTransaction();
				session.persist(instance);
				transaction.commit();
			}
		}
		public static void update(Hoadon instance){
			try(Session session =HIbernateUtil.getSessionFactory().openSession()){
				transaction=session.beginTransaction();
				session.merge(instance);
				transaction.commit();
			}
		}
		public static void delete(Hoadon instance){
			try(Session session=HIbernateUtil.getSessionFactory().openSession()){
				 transaction=session.beginTransaction();

				session.delete(instance);
				transaction.commit();
			}
		}
		public static List<Hoadon> getAll(){
			try(Session session=HIbernateUtil.getSessionFactory().openSession()){
				Query<Hoadon> query=session.createQuery("From Hoadon");
				List<Hoadon> list=  query.list();
				return list;
			}
		}
}
