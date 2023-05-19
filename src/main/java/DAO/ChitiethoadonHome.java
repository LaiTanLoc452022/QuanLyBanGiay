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
import entity1.Hoadon;
import entity1.Sanpham;
import org.hibernate.query.Query;

import java.util.ArrayList;

/**
 * Home object for domain model class Chitiethoadon.
 * @see DAO.Chitiethoadon
 * @author Hibernate Tools
 */
public class ChitiethoadonHome extends Generic_Implement {
    public static ArrayList getAllParent(Hoadon hoadon){
        ArrayList<Chitiethoadon>listCthd=new ArrayList(Generic_Implement.getAllChildrenFromParent(Chitiethoadon.class, hoadon));
        ArrayList<Sanpham>resutl=new ArrayList();
        for(Chitiethoadon cthd: listCthd){
            Sanpham tamthoi=new Sanpham();
            tamthoi=findByID(Sanpham.class, cthd.getId().getIdgiay());
            resutl.add(tamthoi);
        }

        return resutl;
    }
    public static List<ChitiethoadonHome> getAll() {
        try (Session session = HIbernateUtil.getSessionFactory().openSession()) {
            Query<ChitiethoadonHome> query = session.createQuery("From ChitiethoadonId");
            List<ChitiethoadonHome> list = query.list();
            return list;
        }
    }
    public static ArrayList getTheoSLGiayVaThang() {
        String hql = "SELECT MONTH(hd.ngayLap), a.id.idgiay, SUM(a.id.soLuong) "
                + "FROM Chitiethoadon a "
                + "JOIN a.hoadon hd "
                + "GROUP BY MONTH(hd.ngayLap), a.id.idgiay";

        Session session = HIbernateUtil.getSessionFactory().openSession();
        Query<Object[]> query = session.createQuery(hql);
        ArrayList<Object[]> results = new ArrayList(query.getResultList());

        return results;
    }
}
