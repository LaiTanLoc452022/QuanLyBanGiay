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
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.*;
public class Main {




    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Tạo frame
            JFrame frame = new JFrame("Scroll Pane Frame Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Tạo nội dung chứa dữ liệu dài
            JPanel contentPane = new JPanel();
            contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
            for (int i = 0; i < 100; i++) {
                JLabel label = new JLabel("Line " + (i + 1));
                contentPane.add(label);
            }

            // Tạo scroll pane và đặt content pane vào scroll pane
            JScrollPane scrollPane = new JScrollPane(contentPane);

            // Đặt scroll pane làm nội dung chính của frame
            frame.getContentPane().add(scrollPane);

            // Thiết lập kích thước của frame
            frame.setSize(300, 200);

            // Hiển thị frame
            frame.setVisible(true);
        });
    
}


}
