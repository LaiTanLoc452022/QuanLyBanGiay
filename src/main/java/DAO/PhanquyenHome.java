package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final
import Database.HIbernateUtil;
import entity1.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Phanquyen.
 * @see DAO.Phanquyen
 * @author Hibernate Tools
 */
public class PhanquyenHome extends Generic_Implement {
    private static Session session;
    public static void phanQuyen(Nhom nhom, Manhinh manhinh){//persistent class arguments

        PhanquyenId phanquyenId=new PhanquyenId(manhinh.getIdmanHinh(),nhom.getIdnhom(),true);
        Phanquyen phanquyen=new Phanquyen(phanquyenId);
        PhanquyenHome.insert(phanquyen);

    }


}
