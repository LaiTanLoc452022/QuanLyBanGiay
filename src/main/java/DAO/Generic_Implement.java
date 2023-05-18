package DAO;

import Database.HIbernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.lang.reflect.Type;
import java.util.List;

public class Generic_Implement<T> implements GenericDAO {

    public static Session session;
   public static Transaction transaction;


    public static <T> void insert(T instance) {// tạo đối tượng trước rồi , gọi hàm insert nha mằn 
        try {
            session = HIbernateUtil.getSessionFactory().openSession();
           
            session.save(instance);
           
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
    public static<T> void SuaTheoID(T instance){
        
            session=HIbernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.merge(instance);
            session.flush();
            transaction.commit();
            session.close();
        
    }

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
   public static <Child, Parent> List<Child> getAllChildrenFromParent(Class<Child> childClass, Parent parent) {
    Session session = HIbernateUtil.getSessionFactory().openSession();
    String parentClassName = parent.getClass().getSimpleName();
    String hql = "SELECT c FROM " + childClass.getSimpleName() + " c WHERE c." + parentClassName.toLowerCase() + " = :parent";
    Query<Child> query = session.createQuery(hql, childClass);
    query.setParameter("parent", parent);
    List<Child> children = query.getResultList();
    session.close();
    return children;
}
  

    public static <T> void delete(T instance) {
        try {
            session = HIbernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(instance);
            transaction.commit();
           
        } catch (Exception e) {
             if (transaction != null) {
            transaction.rollback();
        }
            throw new RuntimeException(e);
        } finally{
          if (session != null && session.isOpen()) {
            session.close();
          }
        }

    }

    ;

}
