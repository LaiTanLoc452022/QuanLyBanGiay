package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final

import org.hibernate.Session;
import org.hibernate.Transaction;

import Database.HIbernateUtil;
import entity1.Hoadon;
import java.util.List;
import org.hibernate.query.Query;

/**
 * Home object for domain model class Chitiethoadon.
 *
 * @see DAO.Chitiethoadon
 * @author Hibernate Tools
 */
public class ChitiethoadonHome extends Generic_Implement {

    private static Transaction transaction;

    public static List<ChitiethoadonHome> getAll() {
        try (Session session = HIbernateUtil.getSessionFactory().openSession()) {
            Query<ChitiethoadonHome> query = session.createQuery("From ChitiethoadonId");
            List<ChitiethoadonHome> list = query.list();
            return list;
        }
    }
}
