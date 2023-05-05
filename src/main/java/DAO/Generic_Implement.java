package DAO;

import Database.HIbernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.lang.reflect.Type;
import java.util.List;

public class Generic_Implement<T> implements GenericDAO {

    private static Session session;
    private static Transaction transaction;


    public static <T> void insert(T instance) {// tạo đối tượng trước rồi , gọi hàm insert nha mằn 
        try {
            session = HIbernateUtil.getSessionFactory().openSession();
            transaction= session.beginTransaction();
            session.save(instance);
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }


    }

    public static <T> void update(T instance) {//object phải persisted
        try {
            session = HIbernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(instance);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    ;

    public static <T> List<T> getAll(Class<T> instancetype) {
        try {
            

            session = HIbernateUtil.getSessionFactory().openSession();
            Query<T> query = session.createQuery("FROM " + instancetype.getName());
            
            List<T> list = query.list();
            session.close();
            return list;
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        } 
    }

    ;

    public static <T> T findByID(Class<T> instance, int ID) {
        try {
            session = HIbernateUtil.getSessionFactory().openSession();
            T result;
            result = session.get(instance, ID);
            session.close();
            return result;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void delete(T instance) {
        try {
            session = HIbernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(instance);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    ;

}
