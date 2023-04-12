package DAO;

import Database.HIbernateUtil;
import entity1.Phanloai;
import entity1.Sanpham;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.*;
import java.util.List;

public class PhanloaiHome extends Generic_Implement<Phanloai> {
   private static Session session;
    private static Transaction transaction;
    public static List<Sanpham> getAllProductFromID(){
        try{
            session=HIbernateUtil.getSessionFactory().openSession();
           // Query<Phanloai> query=session.createQuery("select * From ");
            CriteriaBuilder criteriaBuilder= session.getCriteriaBuilder();
            CriteriaQuery<Sanpham> criteriaQuery= criteriaBuilder.createQuery(Sanpham.class);
            Root<Phanloai> phanloaiRoot =criteriaQuery.from(Phanloai.class);
            Root<Sanpham> sanphamRoot= criteriaQuery.from(Sanpham.class);
            Join<Sanpham,Phanloai> joinsp=sanphamRoot.join("Sanpham.phanloai.idphanLoai", JoinType.INNER);
            Query<Sanpham> query=session.createQuery(criteriaQuery);
            List<Sanpham> list=query.getResultList();
            session.close();
            return list;



        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
