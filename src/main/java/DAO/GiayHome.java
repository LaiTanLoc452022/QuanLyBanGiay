package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;

import org.hibernate.*;
import org.hibernate.criterion.Example;

import Database.HIbernateUtil;
import entity1.*;
import org.hibernate.criterion.Projection;
import org.hibernate.query.Query;

/**
 * Home object for domain model class Giay.
 * @see entity1.Giay
 * @author Hibernate Tools
 */
public class GiayHome<Thing> {
	
	
	public static <Giay>void insert(Giay instance){
		try(Session session=HIbernateUtil.getSessionFactory().openSession()){
			Transaction transaction=session.getTransaction();
			transaction.begin();
			session.save(instance);
			transaction.commit();

		}

	}
	public static List<Giay> getAll(){
		Session session =HIbernateUtil.getSessionFactory().openSession();
		Query<Giay> query=session.createQuery("FROM Giay");
		List<Giay> list=query.list();
		return list;
	}
	public static<Giay> void update(Giay instance){
		try(Session session=HIbernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
			//Giay giay=session.load(Giay.class,instance.getIdgiay());
			session.update(instance);
			session.getTransaction().commit();
		}
	}
	public static<Giay> void delete(  Giay instance){
		try(Session session =HIbernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
			session.delete(instance);
			session.getTransaction().commit();
		}
	}
	

	public static<Thing> Giay findById(java.lang.Integer id) {
		Giay instance;
		Projection projection;
		try( Session session=HIbernateUtil.getSessionFactory().openSession()){
		instance=session.get(entity1.Giay.class, id);
		return instance;
		}
	}

	
}
