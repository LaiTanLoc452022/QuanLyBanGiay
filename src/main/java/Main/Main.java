package Main;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import BUS.Generic_BUS;
import GUI.*;

import java.util.*;

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

import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Nhanvien> list = Generic_BUS.getAll(Nhanvien.class);
//        list.forEach(e -> System.out.println(e.toString()));
    Nhanvien nv= new Nhanvien();
    nv.setEmail("aldosfji");
    nv.setNgaySinh(new java.sql.Date(2003-1900,11,02));
    NhanvienHome.insert(nv);
    }

}
