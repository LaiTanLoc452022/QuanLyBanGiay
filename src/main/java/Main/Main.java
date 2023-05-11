package Main;

import BUS.Bus;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import BUS.Generic_BUS;
import BUS.ImageToByte;
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
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
        Nhanvien nv=new Nhanvien();
        nv.setAnh(ImageToByte.toData("C:\\Users\\ACER\\Desktop\\tải xuống (2).jpg"));
        Generic_Implement.insert(nv);
              
                
                 
       
                
            
	}

}
