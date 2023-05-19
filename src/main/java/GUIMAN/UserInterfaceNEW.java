package GUIMAN;

import BUS.Bus;
import UINam.ThongKeForm;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import entity1.Nguoidung;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UserInterfaceNEW extends javax.swing.JFrame {

    Bus bus = new Bus();
    public Nguoidung nguoiDungLog;
    NhanVien NV = new NhanVien();
    KhachHang KH = new KhachHang();
    Kho K = new Kho();
    HoaDon HD = new HoaDon();
    TheForm TheForm = new TheForm();
    PhanLoaiGiay plg = new PhanLoaiGiay();
    NhaCungCap NCC = new NhaCungCap();
    public UserInterfaceNEW() throws SQLException {
        initComponents();
    }

    int width = 300;
    int height = 700;

    void openMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    sidePanel2.setSize(i, height);

                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserInterfaceNEW.class.getName()).log(Level.SEVERE, null, ex);
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
                    sidePanel2.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserInterfaceNEW.class.getName()).log(Level.SEVERE, null, ex);
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
        LayeredPane.add(PhanQuyen);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openNhanVien() {
        LayeredPane.removeAll();
        LayeredPane.add(NhanVien);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openHoaDon() {
        LayeredPane.removeAll();
        LayeredPane.add(HoaDon);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openKho() {
        LayeredPane.removeAll();
        LayeredPane.add(Kho);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    void openKhachHang() {
        LayeredPane.removeAll();
        LayeredPane.add(KhachHang);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        sidePanel2 = new javax.swing.JPanel();
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
        LayeredPane = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        shoesing = new javax.swing.JLabel();
        PhanQuyen = new javax.swing.JPanel();
        phanQuyenPane = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        pq_userId = new javax.swing.JLabel();
        pq_ten = new javax.swing.JLabel();
        pq_userIdTF = new javax.swing.JTextField();
        pq_tenTF = new javax.swing.JTextField();
        createBTN = new javax.swing.JPanel();
        taoMoi = new javax.swing.JLabel();
        nvBanHangPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nvKhoPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        qtvPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pq_title = new javax.swing.JLabel();
        NhanVien = new javax.swing.JPanel();
        nv_pane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        findnv = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel35 = new javax.swing.JPanel();
        reset = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        msnv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        hovaten = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        chucvu = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        luong = new javax.swing.JTextField();
        ngaysinh = new com.toedter.calendar.JDateChooser();
        jPanel36 = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        insert = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        HoaDon = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHD = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        insertHD = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        updateHD = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        deleteHD = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        idkh = new javax.swing.JTextField();
        idhd = new javax.swing.JTextField();
        idnv = new javax.swing.JTextField();
        tongtien = new javax.swing.JTextField();
        idncc = new javax.swing.JTextField();
        ngayxuat = new com.toedter.calendar.JDateChooser();
        jPanel39 = new javax.swing.JPanel();
        inHD = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        thongkedoanhthu = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Kho = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel25 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        KhachHang = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel32 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        IdKhachHang = new javax.swing.JTextField();
        hoVaTenKH = new javax.swing.JTextField();
        SDT = new javax.swing.JTextField();
        Hang = new javax.swing.JTextField();
        Diem = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        DC = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        NgayTao = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        menuBTN = new javax.swing.JLabel();
        closeBTN = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        btnCloseMenu1 = new javax.swing.JLabel();
        btnHOME1 = new javax.swing.JLabel();
        btnNV1 = new javax.swing.JLabel();
        btnHD1 = new javax.swing.JLabel();
        btnKHO1 = new javax.swing.JLabel();
        btnPQ1 = new javax.swing.JLabel();
        btnKH1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        btnThe = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        btnPhanLoai = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        btnNCC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);

        containerPanel.setBackground(new java.awt.Color(0, 0, 0, 0));
        containerPanel.setMaximumSize(new java.awt.Dimension(1244, 700));
        containerPanel.setMinimumSize(new java.awt.Dimension(1244, 700));
        containerPanel.setPreferredSize(new java.awt.Dimension(1244, 700));

        sidePanel2.setBackground(new java.awt.Color(174,194,218, 222));
        sidePanel2.setToolTipText("");
        sidePanel2.setEnabled(false);
        sidePanel2.setMaximumSize(new java.awt.Dimension(300, 700));
        sidePanel2.setMinimumSize(new java.awt.Dimension(300, 700));
        sidePanel2.setPreferredSize(new java.awt.Dimension(300, 650));

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
        btnNV.setMaximumSize(new java.awt.Dimension(300, 50));
        btnNV.setMinimumSize(new java.awt.Dimension(300, 50));
        btnNV.setName(""); // NOI18N
        btnNV.setPreferredSize(new java.awt.Dimension(300, 50));
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
        btnHD.setMaximumSize(new java.awt.Dimension(300, 50));
        btnHD.setMinimumSize(new java.awt.Dimension(300, 50));
        btnHD.setPreferredSize(new java.awt.Dimension(300, 50));
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
        btnKHO.setMaximumSize(new java.awt.Dimension(300, 50));
        btnKHO.setMinimumSize(new java.awt.Dimension(300, 50));
        btnKHO.setPreferredSize(new java.awt.Dimension(300, 50));
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
        btnPQ.setMaximumSize(new java.awt.Dimension(300, 50));
        btnPQ.setMinimumSize(new java.awt.Dimension(300, 50));
        btnPQ.setPreferredSize(new java.awt.Dimension(300, 50));
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
        btnKH.setMaximumSize(new java.awt.Dimension(300, 50));
        btnKH.setMinimumSize(new java.awt.Dimension(300, 50));
        btnKH.setPreferredSize(new java.awt.Dimension(300, 50));
        btnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(244, 96, 101));

        jSeparator2.setBackground(new java.awt.Color(244, 96, 101));

        jSeparator3.setBackground(new java.awt.Color(244, 96, 101));

        jSeparator4.setBackground(new java.awt.Color(244, 96, 101));

        jSeparator5.setBackground(new java.awt.Color(244, 96, 101));

        javax.swing.GroupLayout sidePanel2Layout = new javax.swing.GroupLayout(sidePanel2);
        sidePanel2.setLayout(sidePanel2Layout);
        sidePanel2Layout.setHorizontalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(sidePanel2Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(btnPQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnKHO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jSeparator4)
                .addComponent(jSeparator5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCloseMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        sidePanel2Layout.setVerticalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel2Layout.createSequentialGroup()
                .addComponent(btnCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKHO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        LayeredPane.setEnabled(false);
        LayeredPane.setMaximumSize(new java.awt.Dimension(1244, 650));
        LayeredPane.setMinimumSize(new java.awt.Dimension(1244, 650));
        LayeredPane.setPreferredSize(new java.awt.Dimension(1244, 650));
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

        PhanQuyen.setBackground(new java.awt.Color(110,143,186, 150));
        PhanQuyen.setMaximumSize(new java.awt.Dimension(1244, 650));
        PhanQuyen.setMinimumSize(new java.awt.Dimension(1244, 650));
        PhanQuyen.setPreferredSize(new java.awt.Dimension(1244, 650));

        phanQuyenPane.setBackground(new java.awt.Color(0,0,0,0));

        infoPanel.setBackground(new java.awt.Color(110,143,186, 80));
        infoPanel.setPreferredSize(new java.awt.Dimension(800, 600));

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

        nvBanHangPanel.setBackground(new java.awt.Color(60, 95, 157));
        nvBanHangPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nvBanHangPanel.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel11.setBackground(new java.awt.Color(204, 255, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(244, 96, 101));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nhân Viên Bán Hàng");
        jLabel11.setToolTipText("");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout nvBanHangPanelLayout = new javax.swing.GroupLayout(nvBanHangPanel);
        nvBanHangPanel.setLayout(nvBanHangPanelLayout);
        nvBanHangPanelLayout.setHorizontalGroup(
            nvBanHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        nvBanHangPanelLayout.setVerticalGroup(
            nvBanHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nvBanHangPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nvKhoPanel.setBackground(new java.awt.Color(60, 95, 157));
        nvKhoPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nvKhoPanel.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(244, 96, 101));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nhân Viên Kho");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout nvKhoPanelLayout = new javax.swing.GroupLayout(nvKhoPanel);
        nvKhoPanel.setLayout(nvKhoPanelLayout);
        nvKhoPanelLayout.setHorizontalGroup(
            nvKhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        nvKhoPanelLayout.setVerticalGroup(
            nvKhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nvKhoPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel10)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        qtvPanel.setBackground(new java.awt.Color(60, 95, 157));
        qtvPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qtvPanel.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(244, 96, 101));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quản Trị Viên");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout qtvPanelLayout = new javax.swing.GroupLayout(qtvPanel);
        qtvPanel.setLayout(qtvPanelLayout);
        qtvPanelLayout.setHorizontalGroup(
            qtvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        qtvPanelLayout.setVerticalGroup(
            qtvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel12)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pq_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pq_title.setForeground(new java.awt.Color(244, 96, 101));
        pq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pq_title.setText("PHÂN QUYỀN");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(qtvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nvKhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pq_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pq_userId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pq_userIdTF)
                            .addComponent(pq_tenTF))))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nvBanHangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
            .addComponent(pq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(pq_title, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pq_userId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pq_userIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pq_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pq_tenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(qtvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nvKhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nvBanHangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout phanQuyenPaneLayout = new javax.swing.GroupLayout(phanQuyenPane);
        phanQuyenPane.setLayout(phanQuyenPaneLayout);
        phanQuyenPaneLayout.setHorizontalGroup(
            phanQuyenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, 1238)
        );
        phanQuyenPaneLayout.setVerticalGroup(
            phanQuyenPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phanQuyenPaneLayout.createSequentialGroup()
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PhanQuyenLayout = new javax.swing.GroupLayout(PhanQuyen);
        PhanQuyen.setLayout(PhanQuyenLayout);
        PhanQuyenLayout.setHorizontalGroup(
            PhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phanQuyenPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PhanQuyenLayout.setVerticalGroup(
            PhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phanQuyenPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LayeredPane.add(PhanQuyen, "card2");

        NhanVien.setBackground(new java.awt.Color(110,143,186, 80));
        NhanVien.setMaximumSize(new java.awt.Dimension(1244, 650));
        NhanVien.setMinimumSize(new java.awt.Dimension(1244, 650));
        NhanVien.setPreferredSize(new java.awt.Dimension(1244, 650));

        nv_pane.setBackground(new java.awt.Color(110,143,186, 80));

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSNV", "Họ và tên", "SĐT", "Ngày sinh", "Email", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNV);
        if (tableNV.getColumnModel().getColumnCount() > 0) {
            tableNV.getColumnModel().getColumn(0).setResizable(false);
            tableNV.getColumnModel().getColumn(1).setResizable(false);
            tableNV.getColumnModel().getColumn(2).setResizable(false);
            tableNV.getColumnModel().getColumn(3).setResizable(false);
            tableNV.getColumnModel().getColumn(4).setResizable(false);
            tableNV.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel11.setBackground(new java.awt.Color(12, 65, 96));
        jPanel11.setForeground(new java.awt.Color(12, 65, 96));

        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(244, 96, 101));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("TÌM KIẾM");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox1.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ và tên", "MSNV" }));

        jPanel13.setBackground(new java.awt.Color(12, 65, 96));
        jPanel13.setForeground(new java.awt.Color(12, 65, 96));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(244, 96, 101));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SẮP XẾP THEO");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox2.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel35.setBackground(new java.awt.Color(12, 65, 96));
        jPanel35.setForeground(new java.awt.Color(12, 65, 96));

        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(244, 96, 101));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setText("RESET");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("MSNV");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Thông tin nhân viên");

        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Name");

        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Phone");

        sdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sdtKeyTyped(evt);
            }
        });

        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Chức");

        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("DOB");

        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Email");

        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Salary");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hovaten)
                            .addComponent(msnv)
                            .addComponent(sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(chucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(luong, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addComponent(ngaysinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(msnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(12, 65, 96));
        jPanel36.setForeground(new java.awt.Color(12, 65, 96));

        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(244, 96, 101));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("SỬA");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel37.setBackground(new java.awt.Color(12, 65, 96));
        jPanel37.setForeground(new java.awt.Color(12, 65, 96));

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(244, 96, 101));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("XÓA");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel38.setBackground(new java.awt.Color(12, 65, 96));
        jPanel38.setForeground(new java.awt.Color(12, 65, 96));

        insert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insert.setForeground(new java.awt.Color(244, 96, 101));
        insert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insert.setText("THÊM");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel15.setBackground(new java.awt.Color(60, 95, 157));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(244, 96, 101));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NHÂN VIÊN");
        jLabel15.setMaximumSize(new java.awt.Dimension(1244, 80));
        jLabel15.setMinimumSize(new java.awt.Dimension(1244, 80));
        jLabel15.setPreferredSize(new java.awt.Dimension(1244, 80));

        javax.swing.GroupLayout nv_paneLayout = new javax.swing.GroupLayout(nv_pane);
        nv_pane.setLayout(nv_paneLayout);
        nv_paneLayout.setHorizontalGroup(
            nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nv_paneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(nv_paneLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(findnv, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nv_paneLayout.createSequentialGroup()
                        .addGroup(nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(nv_paneLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        nv_paneLayout.setVerticalGroup(
            nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nv_paneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findnv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(nv_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(nv_paneLayout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nv_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(nv_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LayeredPane.add(NhanVien, "card2");

        HoaDon.setBackground(new java.awt.Color(110,143,186, 80));
        HoaDon.setMaximumSize(new java.awt.Dimension(1244, 650));
        HoaDon.setMinimumSize(new java.awt.Dimension(1244, 650));
        HoaDon.setPreferredSize(new java.awt.Dimension(1244, 650));

        jPanel14.setBackground(new java.awt.Color(110,143,186, 80));
        jPanel14.setPreferredSize(new java.awt.Dimension(880, 450));

        tableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Ngày xuất ", "ID khách hàng", "Tổng tiền", "ID nhân viên", "ID nhà cung cấp"
            }
        ));
        tableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHD);

        jPanel15.setBackground(new java.awt.Color(12, 65, 96));

        insertHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insertHD.setForeground(new java.awt.Color(244, 96, 101));
        insertHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insertHD.setText("THÊM");
        insertHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertHD, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertHD, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(12, 65, 96));

        updateHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateHD.setForeground(new java.awt.Color(244, 96, 101));
        updateHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateHD.setText("SỬA");
        updateHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateHD, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateHD, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(12, 65, 96));

        deleteHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteHD.setForeground(new java.awt.Color(244, 96, 101));
        deleteHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteHD.setText("XÓA");
        deleteHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteHD, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteHD, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(12, 65, 96));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(244, 96, 101));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("TÌM KIẾM");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox3.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSHĐ", "Tên công ty" }));

        jPanel19.setBackground(new java.awt.Color(12, 65, 96));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(244, 96, 101));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("SẮP XẾP THEO");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox4.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setText("Mã HĐ");

        jLabel17.setText("Ngày xuất");

        jLabel18.setText("ID Khách hàng");

        jLabel62.setText("Tổng tiền");

        jLabel63.setText("ID Nhân viên");

        jLabel64.setText("ID nhà cung cấp");

        jPanel39.setBackground(new java.awt.Color(12, 65, 96));

        inHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inHD.setForeground(new java.awt.Color(244, 96, 101));
        inHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inHD.setText("IN");
        inHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inHD, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inHD, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idkh)
                    .addComponent(idnv)
                    .addComponent(tongtien, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idncc)
                    .addComponent(idhd)
                    .addComponent(ngayxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ngayxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel40.setBackground(new java.awt.Color(12, 65, 96));

        thongkedoanhthu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        thongkedoanhthu.setForeground(new java.awt.Color(244, 96, 101));
        thongkedoanhthu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongkedoanhthu.setText("THỐNG KÊ");
        thongkedoanhthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkedoanhthuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thongkedoanhthu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thongkedoanhthu, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(244, 96, 101));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("HÓA ĐƠN");
        jLabel21.setMaximumSize(new java.awt.Dimension(1244, 80));
        jLabel21.setMinimumSize(new java.awt.Dimension(1244, 80));
        jLabel21.setPreferredSize(new java.awt.Dimension(1244, 80));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(20, 20, 20))
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, 1244)
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        LayeredPane.add(HoaDon, "card2");

        Kho.setBackground(new java.awt.Color(110,143,186, 80));
        Kho.setMaximumSize(new java.awt.Dimension(1244, 650));
        Kho.setMinimumSize(new java.awt.Dimension(1244, 650));
        Kho.setPreferredSize(new java.awt.Dimension(1244, 650));

        jPanel20.setBackground(new java.awt.Color(110,143,186, 80));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001", "YEEZY 350V2",  new Integer(2023), "ADIDAS", "15M"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã giày", "Tên giày", "Năm SX", "Thương hiệu", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTable3);

        jPanel21.setBackground(new java.awt.Color(12, 65, 96));
        jPanel21.setForeground(new java.awt.Color(12, 65, 96));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(244, 96, 101));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("THÊM");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(12, 65, 96));
        jPanel22.setForeground(new java.awt.Color(12, 65, 96));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(244, 96, 101));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("SỬA");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(12, 65, 96));
        jPanel23.setForeground(new java.awt.Color(12, 65, 96));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(244, 96, 101));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("XÓA");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(12, 65, 96));
        jPanel24.setForeground(new java.awt.Color(12, 65, 96));
        jPanel24.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(244, 96, 101));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("TÌM KIẾM");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox5.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Giày", "Tên Giày", "Năm SX", "Thương Hiệu", "Giá" }));

        jPanel25.setBackground(new java.awt.Color(12, 65, 96));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(244, 96, 101));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("SẮP XẾP THEO");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox6.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("MÃ GIÀY");

        jLabel2.setText("TÊN GIÀY");

        jLabel3.setText("THƯƠNG HIỆU");

        jLabel33.setText("NĂM SX");

        jLabel34.setText("GIÁ");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("THÔNG TIN SẢN PHẨM");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTextField8))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel35)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(12, 65, 96));
        jPanel26.setForeground(new java.awt.Color(12, 65, 96));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(244, 96, 101));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("IN");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(244, 96, 101));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("KHO");
        jLabel27.setMaximumSize(new java.awt.Dimension(1244, 80));
        jLabel27.setMinimumSize(new java.awt.Dimension(1244, 80));
        jLabel27.setPreferredSize(new java.awt.Dimension(1244, 80));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout KhoLayout = new javax.swing.GroupLayout(Kho);
        Kho.setLayout(KhoLayout);
        KhoLayout.setHorizontalGroup(
            KhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        KhoLayout.setVerticalGroup(
            KhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LayeredPane.add(Kho, "card2");

        KhachHang.setBackground(new java.awt.Color(110,143,186, 80));
        KhachHang.setMaximumSize(new java.awt.Dimension(1244, 650));
        KhachHang.setMinimumSize(new java.awt.Dimension(1244, 650));
        KhachHang.setPreferredSize(new java.awt.Dimension(1244, 650));

        jPanel27.setBackground(new java.awt.Color(110,143,186, 80));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001", "NAM",  new Integer(123), "GOLD", "15M", "20/4/2023", "Q10"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KH", "TÊN KH", "SĐT", "HẠNG", "ĐIỂM", "NGÀY TẠO", "ĐỊA CHỈ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(jTable4);

        jPanel28.setBackground(new java.awt.Color(12, 65, 96));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(244, 96, 101));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("THÊM");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(12, 65, 96));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(244, 96, 101));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("SỬA");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel30.setBackground(new java.awt.Color(12, 65, 96));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(244, 96, 101));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("XÓA");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(12, 65, 96));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(244, 96, 101));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("TÌM KIẾM");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboBox7.setBackground(new java.awt.Color(12, 65, 96));
        jComboBox7.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KH", "Tên KH", "Hạng", "Điểm", "Ngày tạo" }));

        jPanel32.setBackground(new java.awt.Color(12, 65, 96));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(244, 96, 101));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("SẮP XẾP THEO");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox8.setBackground(new java.awt.Color(12, 65, 96));
        jComboBox8.setForeground(new java.awt.Color(244, 96, 101));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel43.setText("MÃ KH");

        jLabel44.setText("TÊN KH");

        jLabel45.setText("HẠNG");

        jLabel46.setText("SĐT");

        jLabel47.setText("ĐIỂM");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("THÔNG TIN THẺ THÀNH VIÊN");

        jLabel50.setText("ĐỊA CHỈ");

        jLabel51.setText("NGÀY TẠO");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hoVaTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(SDT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdKhachHang)
                            .addComponent(Hang, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Diem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DC)
                            .addComponent(NgayTao))))
                .addGap(15, 15, 15))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel48)
                .addGap(10, 10, 10)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoVaTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(12, 65, 96));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(244, 96, 101));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("IN");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(244, 96, 101));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("KHÁCH HÀNG");
        jLabel37.setMaximumSize(new java.awt.Dimension(1244, 80));
        jLabel37.setMinimumSize(new java.awt.Dimension(1244, 80));
        jLabel37.setPreferredSize(new java.awt.Dimension(1244, 80));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1244, Short.MAX_VALUE)
            .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KhachHangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KhachHangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        LayeredPane.add(KhachHang, "card2");

        menuBTN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        menuBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuBTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\NAM\\OneDrive\\Máy tính\\SHOESING\\QuanLyBanGiay\\src\\main\\java\\UINam\\img\\icons8_menu_50px.png")); // NOI18N
        menuBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBTNMouseClicked(evt);
            }
        });

        closeBTN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        closeBTN.setForeground(new java.awt.Color(244, 96, 101));
        closeBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBTN.setText("X");
        closeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBTNMouseClicked(evt);
            }
        });

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\NAM\\OneDrive\\Máy tính\\SHOESING\\QuanLyBanGiay\\src\\main\\java\\UINam\\img\\backgr.jpg")); // NOI18N

        sidePanel.setBackground(new java.awt.Color(0, 102, 102));
        sidePanel.setPreferredSize(new java.awt.Dimension(200, 550));

        btnCloseMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCloseMenu1.setForeground(new java.awt.Color(204, 255, 204));
        btnCloseMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseMenu1.setText("X");
        btnCloseMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMenu1MouseClicked(evt);
            }
        });

        btnHOME1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHOME1.setForeground(new java.awt.Color(204, 255, 204));
        btnHOME1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHOME1.setText("HOME");
        btnHOME1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHOME1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHOME1MouseClicked(evt);
            }
        });

        btnNV1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNV1.setForeground(new java.awt.Color(204, 255, 204));
        btnNV1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNV1.setText("NHÂN VIÊN");
        btnNV1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNV1MouseClicked(evt);
            }
        });

        btnHD1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHD1.setForeground(new java.awt.Color(204, 255, 204));
        btnHD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHD1.setText("HÓA ĐƠN");
        btnHD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHD1MouseClicked(evt);
            }
        });

        btnKHO1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKHO1.setForeground(new java.awt.Color(204, 255, 204));
        btnKHO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKHO1.setText("KHO");
        btnKHO1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKHO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHO1MouseClicked(evt);
            }
        });

        btnPQ1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPQ1.setForeground(new java.awt.Color(204, 255, 204));
        btnPQ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPQ1.setText("PHÂN QUYỀN");
        btnPQ1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPQ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPQ1MouseClicked(evt);
            }
        });

        btnKH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKH1.setForeground(new java.awt.Color(204, 255, 204));
        btnKH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKH1.setText("KHÁCH HÀNG");
        btnKH1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKH1MouseClicked(evt);
            }
        });

        btnThe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThe.setForeground(new java.awt.Color(204, 255, 204));
        btnThe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThe.setText("THẺ");
        btnThe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTheMouseClicked(evt);
            }
        });

        btnPhanLoai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPhanLoai.setForeground(new java.awt.Color(204, 255, 204));
        btnPhanLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPhanLoai.setText("PHÂN LOẠI");
        btnPhanLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhanLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPhanLoaiMouseClicked(evt);
            }
        });

        btnNCC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNCC.setForeground(new java.awt.Color(204, 255, 204));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHOME1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCloseMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKHO1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(sidePanelLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnThe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(sidePanelLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(btnCloseMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHOME1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKHO1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(sidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(menuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addGap(519, 519, 519)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerPanelLayout.createSequentialGroup()
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sidePanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKHMouseClicked
        openKhachHang();
    }//GEN-LAST:event_btnKHMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void btnPQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPQMouseClicked
        openPhanQuyen();
    }//GEN-LAST:event_btnPQMouseClicked
    
    private void createBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBTNMouseClicked
        
    }//GEN-LAST:event_createBTNMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

    }//GEN-LAST:event_jLabel12MouseClicked

    public void Fill_Date() {
       
    }

    // RESET METHOD
    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
      
    }//GEN-LAST:event_resetMouseClicked

    private void tableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVMouseClicked

    }//GEN-LAST:event_tableNVMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

    }//GEN-LAST:event_deleteMouseClicked

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        
    }//GEN-LAST:event_insertMouseClicked

// Hoa Don
    private void insertHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertHDMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_insertHDMouseClicked

    private void deleteHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteHDMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_deleteHDMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked


    }//GEN-LAST:event_searchMouseClicked

    private void thongkedoanhthuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkedoanhthuMouseClicked
        // TODO add your handling code here:
        ThongKeForm thongKe = new ThongKeForm();
        thongKe.setVisible(true);
        thongKe.setLocationRelativeTo(null);
    }//GEN-LAST:event_thongkedoanhthuMouseClicked

    private void tableHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHDMouseClicked
      
//        idncc.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    }//GEN-LAST:event_tableHDMouseClicked

    private void updateHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateHDMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_updateHDMouseClicked

    private void inHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inHDMouseClicked

    }//GEN-LAST:event_inHDMouseClicked

    private void sdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdtKeyTyped

    }//GEN-LAST:event_sdtKeyTyped

    private void menuBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBTNMouseClicked
        // TODO add your handling code here:
        openMenuBar();
    }//GEN-LAST:event_menuBTNMouseClicked

    private void closeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBTNMouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(jf, "Are you sure you want to leave?", "Quit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
    }   
    }//GEN-LAST:event_closeBTNMouseClicked

    private void btnCloseMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMenu1MouseClicked
        closeMenuBar();
    }//GEN-LAST:event_btnCloseMenu1MouseClicked

    private void btnHOME1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHOME1MouseClicked
        openHome();
    }//GEN-LAST:event_btnHOME1MouseClicked

    private void btnNV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNV1MouseClicked
        openNhanVien();
    }//GEN-LAST:event_btnNV1MouseClicked

    private void btnHD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHD1MouseClicked
        openHoaDon();
    }//GEN-LAST:event_btnHD1MouseClicked

    private void btnKHO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKHO1MouseClicked
        openKho();
    }//GEN-LAST:event_btnKHO1MouseClicked

    private void btnPQ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPQ1MouseClicked
        openPhanQuyen();
    }//GEN-LAST:event_btnPQ1MouseClicked

    private void btnKH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKH1MouseClicked
        openKhachHang();
    }//GEN-LAST:event_btnKH1MouseClicked

    private void btnTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTheMouseClicked
        openThe();
    }//GEN-LAST:event_btnTheMouseClicked

    private void btnPhanLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhanLoaiMouseClicked
        openPhanLoaiGiay();
    }//GEN-LAST:event_btnPhanLoaiMouseClicked

    private void btnNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNCCMouseClicked
        openNCC();
    }//GEN-LAST:event_btnNCCMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserInterfaceNEW().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserInterfaceNEW.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DC;
    private javax.swing.JTextField Diem;
    private javax.swing.JTextField Hang;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel Home;
    private javax.swing.JTextField IdKhachHang;
    protected javax.swing.JPanel KhachHang;
    private javax.swing.JPanel Kho;
    private javax.swing.JPanel LayeredPane;
    private javax.swing.JTextField NgayTao;
    private javax.swing.JPanel NhanVien;
    protected javax.swing.JPanel PhanQuyen;
    private javax.swing.JTextField SDT;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnCloseMenu;
    private javax.swing.JLabel btnCloseMenu1;
    private javax.swing.JLabel btnHD;
    private javax.swing.JLabel btnHD1;
    private javax.swing.JLabel btnHOME;
    private javax.swing.JLabel btnHOME1;
    private javax.swing.JLabel btnKH;
    private javax.swing.JLabel btnKH1;
    private javax.swing.JLabel btnKHO;
    private javax.swing.JLabel btnKHO1;
    private javax.swing.JLabel btnNCC;
    private javax.swing.JLabel btnNV;
    private javax.swing.JLabel btnNV1;
    private javax.swing.JLabel btnPQ;
    private javax.swing.JLabel btnPQ1;
    private javax.swing.JLabel btnPhanLoai;
    private javax.swing.JLabel btnThe;
    private javax.swing.JTextField chucvu;
    private javax.swing.JLabel closeBTN;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel createBTN;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel deleteHD;
    private javax.swing.JTextField email;
    private javax.swing.JTextField findnv;
    private javax.swing.JTextField hoVaTenKH;
    private javax.swing.JTextField hovaten;
    private javax.swing.JTextField idhd;
    private javax.swing.JTextField idkh;
    private javax.swing.JTextField idncc;
    private javax.swing.JTextField idnv;
    private javax.swing.JLabel inHD;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel insert;
    private javax.swing.JLabel insertHD;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField luong;
    private javax.swing.JLabel menuBTN;
    private javax.swing.JTextField msnv;
    private com.toedter.calendar.JDateChooser ngaysinh;
    private com.toedter.calendar.JDateChooser ngayxuat;
    private javax.swing.JPanel nvBanHangPanel;
    private javax.swing.JPanel nvKhoPanel;
    private javax.swing.JPanel nv_pane;
    private javax.swing.JPanel phanQuyenPane;
    private javax.swing.JLabel pq_ten;
    private javax.swing.JTextField pq_tenTF;
    private javax.swing.JLabel pq_title;
    private javax.swing.JLabel pq_userId;
    private javax.swing.JTextField pq_userIdTF;
    private javax.swing.JPanel qtvPanel;
    private javax.swing.JLabel reset;
    private javax.swing.JTextField sdt;
    private javax.swing.JLabel search;
    private javax.swing.JLabel shoesing;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel sidePanel2;
    private javax.swing.JTable tableHD;
    private javax.swing.JTable tableNV;
    private javax.swing.JLabel taoMoi;
    private javax.swing.JLabel thongkedoanhthu;
    private javax.swing.JLabel to;
    private javax.swing.JTextField tongtien;
    private javax.swing.JLabel update;
    private javax.swing.JLabel updateHD;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
