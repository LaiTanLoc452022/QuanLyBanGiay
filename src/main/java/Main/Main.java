package Main;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import BUS.PhanQuyenBUS;
import GUI.*;

import java.sql.Date;
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
       List<Object[]>list= PhanloaiHome.getAllProductFromCategory(1);
        Iterator<Object[]> iterator=list.listIterator();
        while(iterator.hasNext()){
            //iterator.next();
           Object[] array= iterator.next();
            System.out.println (Arrays.toString (array));
        }

	}


}
