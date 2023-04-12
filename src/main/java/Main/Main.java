package Main;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import entity1.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.internal.NaturalIdCacheKey;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryReturn;
import org.hibernate.query.Query;

import DAO.*;
import Database.HIbernateUtil;

public class Main {
    public static void main(String[] args) {
       /*Phanloai pl=new Phanloai();
       PhanloaiHome.findByID(Phanloai.class,1);*/
       /* Sanpham sp=SanPhamHome.findByID(Sanpham.class,6);
        System.out.println(sp.toString());*/
        List<Sanpham> list=PhanloaiHome.getAllProductFromID();
        list.forEach(a->System.out.println(a.toString()));
    }


}
