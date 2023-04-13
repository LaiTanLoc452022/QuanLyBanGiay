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
    public static List<Object[]> getAllProductFromCategory(int id){
        try{
            session=HIbernateUtil.getSessionFactory().openSession();
           // Query<Phanloai> query=session.createQuery("select * From ");
            CriteriaBuilder criteriaBuilder= session.getCriteriaBuilder();
            CriteriaQuery<Object[]> criteriaQuery= criteriaBuilder.createQuery(Object[].class);
            Root<Phanloai> phanloaiRoot =criteriaQuery.from(Phanloai.class);
            Root<Sanpham> sanphamRoot= criteriaQuery.from(Sanpham.class);
          criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(phanloaiRoot.get("idphanLoai"),sanphamRoot.get("phanloai")),criteriaBuilder.equal(phanloaiRoot.get("idphanLoai"),id)));
          criteriaQuery=criteriaQuery.multiselect(sanphamRoot.get("ten").as(String.class));
            Query<Object[]> query=session.createQuery(criteriaQuery);
            List<Object[]> list=query.getResultList();
            session.close();
            return list;
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
