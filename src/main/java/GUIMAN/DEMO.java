/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIMAN;

import BUS.Bus;
import BUS.ImageToByte;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import BUS.Generic_BUS;
import DAO.Generic_Implement;
import DAO.KhachhangHome;
import DAO.TheHome;
import entity1.Nguoidung;
import entity1.Nhanvien;
import entity1.The;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DEMO extends javax.swing.JFrame {
    Bus bus = new Bus();
    public Nguoidung nguoiDungLog;
    NhanVien NV = new NhanVien();
    KhachHang KH = new KhachHang();
    Kho K = new Kho();
    HoaDon HD = new HoaDon();
    TheForm TheForm = new TheForm();
    PhanLoaiGiay plg = new PhanLoaiGiay();
    NhaCungCap NCC = new NhaCungCap();
    /**
     * Creates new form DEMO
     */
    
    public DEMO() {
        initComponents();
        TheForm.GetDataThe();
        plg.GetDataPhanLoaiGiay();
        KH.GetDataKH();
        NV.GetDataNV();
        K.GetDataK();
        HD.GetDataHD();
        NCC.GetDataNCC();
    }
    
    int width = 300;
    int height = 700;

    void openMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    sidePanel.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();

    }

    void closeMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    sidePanel.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();

    }

    void openHome() {
        LayeredPane.removeAll();
        LayeredPane.add(Home);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openPhanQuyen() {
        LayeredPane.removeAll();
        LayeredPane.add(PhanQuyen1);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openNhanVien() {
        LayeredPane.removeAll();
        LayeredPane.setSize(NV.getSize());
        LayeredPane.add(NV.openNV());
        LayeredPane.repaint();
        LayeredPane.revalidate();

    }
    public Nhanvien timNhanvien(int idNV){
        for(var nhanvienit : NV.nv){
            if(nhanvienit.getIdnhanVien() == idNV){
                return nhanvienit;
            }
        }
        return null;
    }
    void openHoaDon() {
        LayeredPane.removeAll();
        Nhanvien truyenra = timNhanvien(this.nguoiDungLog.getNhanvien().getIdnhanVien());
        HD.HD.hdvao.setIdnhanVien(truyenra.getIdnhanVien());
        HD.HD.HoTen.setText(truyenra.getHoVaTen());
        LayeredPane.add(HD.openHD());
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openKho() {
        LayeredPane.removeAll();
        LayeredPane.add(K.openK());
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openKhachHang() {
        LayeredPane.removeAll();
        LayeredPane.add(KH.openKH());
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }
    
    void openThe() {
        LayeredPane.removeAll();
        LayeredPane.add(TheForm.openThe());
        LayeredPane.repaint();
        LayeredPane.revalidate();
    } 

    void openPhanLoaiGiay(){
        LayeredPane.removeAll();
        LayeredPane.add(plg.openPhanLoaiGiay());
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }
    
    void openNCC(){
        LayeredPane.removeAll();
        LayeredPane.add(NCC.openNCC());
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }
    

//    public void ImageTableKH() throws IOException {
//        BufferedImage image = ImageIO.read(new File("C:\\Users\\ACER\\Documents\\GitHub\\QuanLyBanGiay\\src\\main\\java\\GUIMAN\\image\\tableKH.png"));
//
//        // Tạo một JLabel để chứa ảnh
//        JFrame frame = new JFrame();
//        JLabel label = new JLabel();
//        label.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
//        frame.getContentPane().add(label, BorderLayout.CENTER);
//
//        frame.setVisible(true);
//
//        // Tạo một Timer để thay đổi kích thước ảnh
//        Timer timer = new Timer(100, new ActionListener() {
//            double scale = 0.1;
//            AffineTransform transform = new AffineTransform();
//
//            public void actionPerformed(ActionEvent e) {
//                if (scale <= 1.0) {
//                    // Thay đổi kích thước ảnh
//                    scale += 0.8;
//                    transform.setToScale(scale, scale);
//                    AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
//                    BufferedImage scaledImage = op.filter(image, null);
//                    ImageIcon icon = new ImageIcon(scaledImage);
//
//                    // Đặt ảnh vào JLabel
//                    label.setIcon(icon);
//                } else {
//                    // Dừng Timer
//                    ((Timer) e.getSource()).stop();
//                }
//            }
//        });
//        timer.start();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnCloseMenu = new javax.swing.JLabel();
        btnHOME = new javax.swing.JLabel();
        btnNV = new javax.swing.JLabel();
        btnHD = new javax.swing.JLabel();
        btnKHO = new javax.swing.JLabel();
        btnPQ = new javax.swing.JLabel();
        btnKH = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnThe = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnPhanLoai = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        btnNCC = new javax.swing.JLabel();
        LayeredPane = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        shoesing = new javax.swing.JLabel();
        PhanQuyen1 = new javax.swing.JPanel();
        phanQuyenPane = new javax.swing.JPanel();
        infoPanel1 = new javax.swing.JPanel();
        pq_userId = new javax.swing.JLabel();
        pq_ten = new javax.swing.JLabel();
        pq_userIdTF = new javax.swing.JTextField();
        pq_tenTF = new javax.swing.JTextField();
        createBTN = new javax.swing.JPanel();
        taoMoi = new javax.swing.JLabel();
        nvBanHangPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        nvKhoPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        qtvPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pq_title = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1244, 700));

        containerPanel.setBackground(new java.awt.Color(51, 51, 51));
        containerPanel.setPreferredSize(new java.awt.Dimension(1244, 700));

        sidePanel.setBackground(new java.awt.Color(0, 102, 102, 220));
        sidePanel.setMaximumSize(new java.awt.Dimension(300, 700));
        sidePanel.setMinimumSize(new java.awt.Dimension(300, 700));
        sidePanel.setPreferredSize(new java.awt.Dimension(300, 700));

        btnCloseMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCloseMenu.setForeground(new java.awt.Color(244, 96, 101));
        btnCloseMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseMenu.setText("X");
        btnCloseMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMenuMouseClicked(evt);
            }
        });

        btnHOME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHOME.setForeground(new java.awt.Color(244, 96, 101));
        btnHOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHOME.setText("HOME");
        btnHOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHOME.setMaximumSize(new java.awt.Dimension(300, 50));
        btnHOME.setMinimumSize(new java.awt.Dimension(300, 50));
        btnHOME.setPreferredSize(new java.awt.Dimension(300, 50));
        btnHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHOMEMouseClicked(evt);
            }
        });

        btnNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNV.setForeground(new java.awt.Color(244, 96, 101));
        btnNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNV.setText("NHÂN VIÊN");
        btnNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNVMouseClicked(evt);
            }
        });

        btnHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHD.setForeground(new java.awt.Color(244, 96, 101));
        btnHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHD.setText("HÓA ĐƠN");
        btnHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHDMouseClicked(evt);
            }
        });

        btnKHO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKHO.setForeground(new java.awt.Color(244, 96, 101));
        btnKHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKHO.setText("KHO");
        btnKHO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHOMouseClicked(evt);
            }
        });

        btnPQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPQ.setForeground(new java.awt.Color(244, 96, 101));
        btnPQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPQ.setText("PHÂN QUYỀN");
        btnPQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPQMouseClicked(evt);
            }
        });

        btnKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKH.setForeground(new java.awt.Color(244, 96, 101));
        btnKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKH.setText("KHÁCH HÀNG");
        btnKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHMouseClicked(evt);
            }
        });

        btnThe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThe.setForeground(new java.awt.Color(244, 96, 101));
        btnThe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThe.setText("THẺ");
        btnThe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTheMouseClicked(evt);
            }
        });

        btnPhanLoai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPhanLoai.setForeground(new java.awt.Color(244, 96, 101));
        btnPhanLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPhanLoai.setText("PHÂN LOẠI");
        btnPhanLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhanLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPhanLoaiMouseClicked(evt);
            }
        });

        btnNCC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNCC.setForeground(new java.awt.Color(244, 96, 101));
        btnNCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNCC.setText("NHÀ CUNG CẤP");
        btnNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNCCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKHO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPhanLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator8)
            .addComponent(jSeparator7)
            .addComponent(btnNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnHOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(btnCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHOME, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKHO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LayeredPane.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(0, 0, 0, 0));
        Home.setMaximumSize(new java.awt.Dimension(1244, 650));
        Home.setMinimumSize(new java.awt.Dimension(1244, 650));
        Home.setName(""); // NOI18N
        Home.setPreferredSize(new java.awt.Dimension(1244, 650));

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(244, 96, 101));
        welcome.setText("W E L C O M E");

        to.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        to.setForeground(new java.awt.Color(244, 96, 101));
        to.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        to.setText("T O");

        shoesing.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        shoesing.setForeground(new java.awt.Color(244, 96, 101));
        shoesing.setText("S H O E S I N G");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shoesing)
                    .addComponent(welcome)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(747, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shoesing, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        LayeredPane.add(Home, "card7");

        PhanQuyen1.setBackground(new java.awt.Color(110,143,186, 150));
        PhanQuyen1.setMaximumSize(new java.awt.Dimension(1244, 650));
        PhanQuyen1.setMinimumSize(new java.awt.Dimension(1244, 650));

        phanQuyenPane.setBackground(new java.awt.Color(0,0,0,0));

        infoPanel1.setBackground(new java.awt.Color(110,143,186, 80));
        infoPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        pq_userId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pq_userId.setForeground(new java.awt.Color(244, 96, 101));
        pq_userId.setText("Mã số người dùng:");

        pq_ten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pq_ten.setForeground(new java.awt.Color(244, 96, 101));
        pq_ten.setText("Tên người dùng:");

        createBTN.setBackground(new java.awt.Color(60, 95, 157));
        createBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBTNMouseClicked(evt);
            }
        });

        taoMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        taoMoi.setForeground(new java.awt.Color(244, 96, 101));
        taoMoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taoMoi.setText("TẠO MỚI");

        javax.swing.GroupLayout createBTNLayout = new javax.swing.GroupLayout(createBTN);
        createBTN.setLayout(createBTNLayout);
        createBTNLayout.setHorizontalGroup(
            createBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createBTNLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(taoMoi)
                .addGap(16, 16, 16))
        );
        createBTNLayout.setVerticalGroup(
            createBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createBTNLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(taoMoi)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        nvBanHangPanel1.setBackground(new java.awt.Color(60, 95, 157));
        nvBanHangPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nvBanHangPanel1.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel15.setBackground(new java.awt.Color(204, 255, 204));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(244, 96, 101));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nhân Viên Bán Hàng");
        jLabel15.setToolTipText("");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout nvBanHangPanel1Layout = new javax.swing.GroupLayout(nvBanHangPanel1);
        nvBanHangPanel1.setLayout(nvBanHangPanel1Layout);
        nvBanHangPanel1Layout.setHorizontalGroup(
            nvBanHangPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        nvBanHangPanel1Layout.setVerticalGroup(
            nvBanHangPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nvBanHangPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nvKhoPanel1.setBackground(new java.awt.Color(60, 95, 157));
        nvKhoPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nvKhoPanel1.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(244, 96, 101));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nhân Viên Kho");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout nvKhoPanel1Layout = new javax.swing.GroupLayout(nvKhoPanel1);
        nvKhoPanel1.setLayout(nvKhoPanel1Layout);
        nvKhoPanel1Layout.setHorizontalGroup(
            nvKhoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        nvKhoPanel1Layout.setVerticalGroup(
            nvKhoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nvKhoPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel17)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        qtvPanel1.setBackground(new java.awt.Color(60, 95, 157));
        qtvPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qtvPanel1.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(244, 96, 101));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Quản Trị Viên");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout qtvPanel1Layout = new javax.swing.GroupLayout(qtvPanel1);
        qtvPanel1.setLayout(qtvPanel1Layout);
        qtvPanel1Layout.setHorizontalGroup(
            qtvPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        qtvPanel1Layout.setVerticalGroup(
            qtvPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel18)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pq_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pq_title.setForeground(new java.awt.Color(244, 96, 101));
        pq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pq_title.setText("PHÂN QUYỀN");

        javax.swing.GroupLayout infoPanel1Layout = new javax.swing.GroupLayout(infoPanel1);
        infoPanel1.setLayout(infoPanel1Layout);
        infoPanel1Layout.setHorizontalGroup(
            infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(infoPanel1Layout.createSequentialGroup()
                        .addComponent(qtvPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nvKhoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanel1Layout.createSequentialGroup()
                        .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pq_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pq_userId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pq_userIdTF)
                            .addComponent(pq_tenTF))))
                .addGap(18, 18, 18)
                .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nvBanHangPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
            .addComponent(pq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoPanel1Layout.setVerticalGroup(
            infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanel1Layout.createSequentialGroup()
                .addComponent(pq_title, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanel1Layout.createSequentialGroup()
                        .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pq_userId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pq_userIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pq_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pq_tenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(qtvPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanel1Layout.createSequentialGroup()
                        .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(infoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nvKhoPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nvBanHangPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout phanQuyenPaneLayout = new javax.swing.GroupLayout(phanQuyenPane);
        phanQuyenPane.setLayout(phanQuyenPaneLayout);
        phanQuyenPaneLayout.setHorizontalGroup(
            phanQuyenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, 1238)
        );
        phanQuyenPaneLayout.setVerticalGroup(
            phanQuyenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phanQuyenPaneLayout.createSequentialGroup()
                .addComponent(infoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PhanQuyen1Layout = new javax.swing.GroupLayout(PhanQuyen1);
        PhanQuyen1.setLayout(PhanQuyen1Layout);
        PhanQuyen1Layout.setHorizontalGroup(
            PhanQuyen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phanQuyenPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PhanQuyen1Layout.setVerticalGroup(
            PhanQuyen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phanQuyenPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LayeredPane.add(PhanQuyen1, "card2");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(244, 96, 101));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MENU");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(200, 50));
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 50));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 96, 101));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\NAM\\OneDrive\\Máy tính\\SHOESING\\QuanLyBanGiay\\src\\main\\java\\UINam\\img\\backgr.jpg")); // NOI18N

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, Short.MAX_VALUE)))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(LayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_btnCloseMenuMouseClicked

    private void btnHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHOMEMouseClicked
        openHome();
    }//GEN-LAST:event_btnHOMEMouseClicked

    private void btnNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNVMouseClicked
        openNhanVien();
    }//GEN-LAST:event_btnNVMouseClicked

    private void btnHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHDMouseClicked
        openHoaDon();
    }//GEN-LAST:event_btnHDMouseClicked

    private void btnKHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKHOMouseClicked
        openKho();
    }//GEN-LAST:event_btnKHOMouseClicked

    private void btnPQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPQMouseClicked
        openPhanQuyen();
    }//GEN-LAST:event_btnPQMouseClicked

    private void btnKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKHMouseClicked
        openKhachHang();
    }//GEN-LAST:event_btnKHMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        openMenuBar();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTheMouseClicked
        openThe();
    }//GEN-LAST:event_btnTheMouseClicked

    private void btnPhanLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhanLoaiMouseClicked
        openPhanLoaiGiay();
    }//GEN-LAST:event_btnPhanLoaiMouseClicked

    private void btnNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNCCMouseClicked
        openNCC();
    }//GEN-LAST:event_btnNCCMouseClicked

    private void createBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBTNMouseClicked

    }//GEN-LAST:event_createBTNMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEMO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEMO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel LayeredPane;
    protected javax.swing.JPanel PhanQuyen1;
    private javax.swing.JLabel btnCloseMenu;
    private javax.swing.JLabel btnHD;
    private javax.swing.JLabel btnHOME;
    private javax.swing.JLabel btnKH;
    private javax.swing.JLabel btnKHO;
    private javax.swing.JLabel btnNCC;
    private javax.swing.JLabel btnNV;
    private javax.swing.JLabel btnPQ;
    private javax.swing.JLabel btnPhanLoai;
    private javax.swing.JLabel btnThe;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel createBTN;
    private javax.swing.JPanel infoPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel nvBanHangPanel1;
    private javax.swing.JPanel nvKhoPanel1;
    private javax.swing.JPanel phanQuyenPane;
    private javax.swing.JLabel pq_ten;
    private javax.swing.JTextField pq_tenTF;
    private javax.swing.JLabel pq_title;
    private javax.swing.JLabel pq_userId;
    private javax.swing.JTextField pq_userIdTF;
    private javax.swing.JPanel qtvPanel1;
    private javax.swing.JLabel shoesing;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel taoMoi;
    private javax.swing.JLabel to;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}