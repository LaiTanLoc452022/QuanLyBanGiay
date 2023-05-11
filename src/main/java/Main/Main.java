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
import UINam.UserInterface;
import java.math.MathContext;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hoadon> listhd = Generic_BUS.getAll(Hoadon.class);
        Set<Date> SetNgay = new HashSet<>(); // 
        Set<Integer> SetThang = new HashSet<>();

        for (Hoadon e : listhd) {
            SetNgay.add(e.getNgayLap());

        }
        for (Hoadon e : listhd) {
            SetThang.add(e.getNgayLap().getMonth());
        }
        double dtmon = 0.0d;

        ArrayList<Cus> dtday = new ArrayList();
        for (var ngay : SetNgay) {
            double dt = 0.0d;
            // System.out.println(ngay.toString());
            for (int j = 0; j < listhd.size(); ++j) {
                if (ngay.toString().equals(listhd.get(j).getNgayLap().toString())) {
                    dt = dt + listhd.get(j).getTongTien().doubleValue();
                }
            }
            Cus custemp = new Cus();
            custemp.doanhthu = dt;
            custemp.ngay = ngay;
            dtday.add(custemp);

        }

        ArrayList<UserInterface.CusMonth> month = new ArrayList();
        for (int i = 0; i < 12; i++) {
            month.add(new UserInterface.CusMonth());
        }
        int i = 0;
        for (int itmon : SetThang) {
            double dttheothang = 0.0d;
            for (Cus doanhthutheongay : dtday) {
                if (itmon == doanhthutheongay.ngay.getMonth()) {
                    dttheothang = dttheothang + doanhthutheongay.doanhthu;

                }

            }

            month.get(i).doanhthu = dttheothang;
            month.get(i).thang = itmon+1;
            i = i + 1;
            
        }
        month.forEach(e -> {
            System.out.println(e.doanhthu + "  " + e.thang);
        });

    }

    static class Cus {

        public Date ngay;
        public Double doanhthu;

        public Cus() {
        }
    }

}
