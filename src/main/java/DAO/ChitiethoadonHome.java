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
}
