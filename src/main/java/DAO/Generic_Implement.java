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


    public static <T> void insert(T instance) {
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
            String type = instancetype.getClass() + "";

            session = HIbernateUtil.getSessionFactory().openSession();
            Query<T> query = session.createQuery("FROM " + type.replaceAll("class", ""));
            List<T> list = query.list();
            return list;
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
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
