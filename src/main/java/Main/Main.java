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
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Main {

   



    public static void main(String[] args) {
        JFrame frame = new JFrame("Editable JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dữ liệu mẫu
        Object[][] data = {
                {"1", "John Doe"},
                {"2", "Jane Smith"},
                {"3", "Bob Johnson"}
        };

        // Định nghĩa tên cột
        String[] columnNames = {"ID", "Name"};

        // Tạo mô hình bảng và thiết lập dữ liệu
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Tạo JTable từ mô hình bảng
        JTable table = new JTable(model);

        // Kích hoạt chế độ chỉnh sửa trực tiếp trên ô văn bản
        table.setDefaultEditor(Object.class, new DefaultCellEditor(new JTextField()));
        ArrayList<ArrayList<Object>> datalist=new ArrayList();
        for(int i=0;i< table.getRowCount();++i){
            ArrayList<Object> row=new ArrayList();
            for(int j=0;j<table.getColumnCount();++j){
                row.add(table.getValueAt(i, j));
            }
            datalist.add(row);
            
        }
        for(var row: datalist){
            System.out.println(row.toString());
        }
        
        // Đặt JTable vào JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(table);
        frame.setSize(1000,1000);
        frame.setVisible(true);

        
              
                
                 
       
                
            
	}

}
