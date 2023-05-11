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
import UINam.RegisterForm;
import UINam.UserInterface;
import entity1.Khachhang;
import entity1.Nhanvien;
import entity1.Phanloai;
import entity1.Sanpham;
import entity1.The;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
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
import javax.swing.JFileChooser;
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
    
    /**
     * Creates new form DEMO
     */
    public DEMO() {
        initComponents();
        GetDataKH();
        GetDataNV();
        Fill_Date();
    }
    
//    public void GetDataTableKH() throws SQLException {
//
//        try {
//            sqlconn = DriverManager.getConnection(data, username, pass);
//            pst = sqlconn.prepareStatement("select * from KhachHang join the on khachhang.IDThe = the.IDThe order by IDKhachhang");
//            rs = pst.executeQuery();
//
//            ResultSetMetaData stData = rs.getMetaData();
//
//            q = stData.getColumnCount();
//
//            DefaultTableModel RecordTable = (DefaultTableModel) tableKH.getModel();
//            RecordTable.setRowCount(0);
//
//            while (rs.next()) {
//                Vector columnData = new Vector();
//                for (int i = 1; i <= q; i++) {
//                    columnData.add(rs.getString("IDKhachHang"));
//                    columnData.add(rs.getString("IDThe"));
//                    columnData.add(rs.getString("Loai"));
//                    columnData.add(rs.getString("HeSo"));
//                    columnData.add(rs.getString("NgayLapThe"));
//                    columnData.add(rs.getString("HoVaTen"));
//                    columnData.add(rs.getString("GioiTinh"));
//                    columnData.add(rs.getString("NgaySinh"));
//                    columnData.add(rs.getString("DiaChi"));
//                }
//                RecordTable.addRow(columnData);
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//
//    }
    
    int width = 200;
    int height = 550;
    
    void openMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    sidePanel.setSize(i, height);
                    
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
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
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public Image docAnh(byte[] imageData){
        try {
            // Tạo một đối tượng ByteArrayInputStream từ mảng byte
            ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
            
            // Đọc hình ảnh từ ByteArrayInputStream
            BufferedImage bufferedImage = ImageIO.read(bais);
            
            // Chuyển đổi BufferedImage thành đối tượng Image
            Image image = bufferedImage.getScaledInstance(
                    bufferedImage.getWidth(), bufferedImage.getHeight(), Image.SCALE_SMOOTH);
            
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void GetDataNV() {
        ArrayList<Nhanvien> array = Generic_BUS.getAll(Nhanvien.class);
        DefaultTableModel RecordTable = (DefaultTableModel) tableNV.getModel();
        RecordTable.setRowCount(0);
        for (int i = 0; i < array.size(); ++i) {
            Object[] rowData = new Object[6];
            rowData[0] = array.get(i).getIdnhanVien();
            rowData[1] = array.get(i).getHoVaTen();
            rowData[2] = array.get(i).getSdt();
            rowData[3] = array.get(i).getNgaySinh();
            rowData[4] = array.get(i).getEmail();
            rowData[5] = array.get(i).getLuong();
            RecordTable.addRow(rowData);
        }
    }
    
    
    public void GetDataKH() {
        ArrayList<Khachhang> array = Generic_BUS.getAll(Khachhang.class); 
       ArrayList<The> arr = Generic_BUS.getAll(The.class);
        DefaultTableModel RecordTable = (DefaultTableModel) tableKH.getModel();
        RecordTable.setRowCount(0);
        for (int i = 0; i < array.size(); ++i) {
            Object[] rowData = new Object[9];
            rowData[0] = array.get(i).getIdkhachHang();
            rowData[1] = array.get(i).getThe().getIdthe();
            rowData[2] = arr.get(array.get(i).getThe().getIdthe()-1).getLoai();
            rowData[3] = arr.get(array.get(i).getThe().getIdthe()-1).getHeSo();
            rowData[4] = array.get(i).getNgayLapThe();
            rowData[5] = array.get(i).getHoVaTen();
            rowData[6] = array.get(i).getGioiTinh();
            rowData[7] = array.get(i).getNgaySinh();
            rowData[8] = array.get(i).getDiaChi();

            RecordTable.addRow(rowData);
        }
    }
    
    public void Fill_Date() {
        Date date1 = new Date();
        NgaySinh.setDateFormatString("yyyy-MM-dd");
        NgaySinh.setDate(date1);
        Date date2 = new Date();
        NgayLap.setDateFormatString("yyyy-MM-dd");
        NgayLap.setDate(date2);
    }
    
    public void ImageTableKH() throws IOException{
        BufferedImage image = ImageIO.read(new File("C:\\Users\\ACER\\Documents\\GitHub\\QuanLyBanGiay\\src\\main\\java\\GUIMAN\\image\\tableKH.png"));

        // Tạo một JLabel để chứa ảnh
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        frame.setVisible(true);

        // Tạo một Timer để thay đổi kích thước ảnh
        Timer timer = new Timer(100, new ActionListener() {
        double scale = 0.1;
        AffineTransform transform = new AffineTransform();

        public void actionPerformed(ActionEvent e) {
                if (scale <= 1.0) {
                // Thay đổi kích thước ảnh
                scale += 0.8;
                transform.setToScale(scale, scale);
                AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
                BufferedImage scaledImage = op.filter(image, null);
                ImageIcon icon = new ImageIcon(scaledImage);

                // Đặt ảnh vào JLabel
                label.setIcon(icon);
                } else {
                // Dừng Timer
                    ((Timer) e.getSource()).stop();
                }
        }
        });
        timer.start();
    }
    
    public static void exportToExcel(JTable table, String filePath) {
        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data");

            int rowCount = table.getRowCount();
            int columnCount = table.getColumnCount();

            // Ghi dữ liệu từ JTable vào tệp Excel
            for (int row = 0; row < rowCount; row++) {
                Row excelRow = sheet.createRow(row);
                for (int column = 0; column < columnCount; column++) {
                    Object value = table.getValueAt(row, column);
                    Cell cell = excelRow.createCell(column);
                    if (value != null) {
                        cell.setCellValue(value.toString());
                    } else {
                        cell.setCellValue("");
                    }
                }
            }

            // Tự động điều chỉnh độ rộng của các cột trong Excel
            for (int column = 0; column < columnCount; column++) {
                sheet.autoSizeColumn(column);
            }

            // Lưu workbook vào một tệp Excel
            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }

            System.out.println("Xuất Excel thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
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
        jLabel7 = new javax.swing.JLabel();
        LayeredPane = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        PhanQuyen = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        selectedPanel = new javax.swing.JPanel();
        qtvPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nvKhoPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        nvBanHangPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        NhanVien = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel35 = new javax.swing.JPanel();
        InNV = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MaNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TenNV = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        SDTNV = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        EmailNV = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        LuongNV = new javax.swing.JTextField();
        NgaySinhNV = new com.toedter.calendar.JDateChooser();
        sadsa = new javax.swing.JLabel();
        LinkAnh = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        UpdateNV = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        DeleteNV = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        InsertNV = new javax.swing.JLabel();
        Anh = new javax.swing.JLabel();
        HoaDon = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel39 = new javax.swing.JPanel();
        INHD = new javax.swing.JLabel();
        Kho = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        InsertK = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        UpdateK = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        DeleteK = new javax.swing.JLabel();
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
        MaGiay = new javax.swing.JTextField();
        TenGiay = new javax.swing.JTextField();
        Size = new javax.swing.JTextField();
        Mau = new javax.swing.JTextField();
        Gia = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        VatLieu = new javax.swing.JTextField();
        IDPL = new javax.swing.JTextField();
        MoTa = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        InK = new javax.swing.JLabel();
        KhachHang = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableKH = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        InsertKH = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        UpDateKH = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        DeleteKH = new javax.swing.JLabel();
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
        jLabel46 = new javax.swing.JLabel();
        MaKH = new javax.swing.JTextField();
        HoVaTenKH = new javax.swing.JTextField();
        MaThe = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        DC = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        GT = new javax.swing.JTextField();
        NgayLap = new com.toedter.calendar.JDateChooser();
        NgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel34 = new javax.swing.JPanel();
        InKH = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerPanel.setBackground(new java.awt.Color(51, 51, 51));
        containerPanel.setPreferredSize(new java.awt.Dimension(880, 550));

        sidePanel.setBackground(new java.awt.Color(0, 102, 102));
        sidePanel.setPreferredSize(new java.awt.Dimension(200, 550));

        btnCloseMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCloseMenu.setForeground(new java.awt.Color(204, 255, 204));
        btnCloseMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseMenu.setText("X");
        btnCloseMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMenuMouseClicked(evt);
            }
        });

        btnHOME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHOME.setForeground(new java.awt.Color(204, 255, 204));
        btnHOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHOME.setText("HOME");
        btnHOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHOMEMouseClicked(evt);
            }
        });

        btnNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNV.setForeground(new java.awt.Color(204, 255, 204));
        btnNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNV.setText("NHÂN VIÊN");
        btnNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNVMouseClicked(evt);
            }
        });

        btnHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHD.setForeground(new java.awt.Color(204, 255, 204));
        btnHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHD.setText("HÓA ĐƠN");
        btnHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHDMouseClicked(evt);
            }
        });

        btnKHO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKHO.setForeground(new java.awt.Color(204, 255, 204));
        btnKHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKHO.setText("KHO");
        btnKHO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHOMouseClicked(evt);
            }
        });

        btnPQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPQ.setForeground(new java.awt.Color(204, 255, 204));
        btnPQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPQ.setText("PHÂN QUYỀN");
        btnPQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPQMouseClicked(evt);
            }
        });

        btnKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKH.setForeground(new java.awt.Color(204, 255, 204));
        btnKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKH.setText("KHÁCH HÀNG");
        btnKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHOME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKHO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MENU");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        LayeredPane.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(0, 102, 102));
        Home.setPreferredSize(new java.awt.Dimension(880, 500));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setText("W E L C O M E");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 255, 204));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("T O");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 255, 204));
        jLabel54.setText("S H O E S I N G");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(120, 120, 120))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        LayeredPane.add(Home, "card7");

        PhanQuyen.setBackground(new java.awt.Color(0, 51, 51));

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PHÂN QUYỀN");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 255, 204));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("TẠO MỚI");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel52)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        infoPanel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Mã số người dùng:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("Tên người dùng:");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17)
                    .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        selectedPanel.setBackground(new java.awt.Color(0, 102, 102));

        qtvPanel.setBackground(new java.awt.Color(0, 51, 51));
        qtvPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qtvPanel.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quản Trị Viên");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        nvKhoPanel.setBackground(new java.awt.Color(0, 51, 51));
        nvKhoPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nvKhoPanel.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nhân Viên Kho");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout nvKhoPanelLayout = new javax.swing.GroupLayout(nvKhoPanel);
        nvKhoPanel.setLayout(nvKhoPanelLayout);
        nvKhoPanelLayout.setHorizontalGroup(
            nvKhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        nvKhoPanelLayout.setVerticalGroup(
            nvKhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nvBanHangPanel.setBackground(new java.awt.Color(0, 51, 51));
        nvBanHangPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nvBanHangPanel.setPreferredSize(new java.awt.Dimension(200, 260));

        jLabel11.setBackground(new java.awt.Color(204, 255, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
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
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout selectedPanelLayout = new javax.swing.GroupLayout(selectedPanel);
        selectedPanel.setLayout(selectedPanelLayout);
        selectedPanelLayout.setHorizontalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(qtvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(nvKhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(nvBanHangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        selectedPanelLayout.setVerticalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qtvPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nvKhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nvBanHangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(selectedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(selectedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PhanQuyenLayout = new javax.swing.GroupLayout(PhanQuyen);
        PhanQuyen.setLayout(PhanQuyenLayout);
        PhanQuyenLayout.setHorizontalGroup(
            PhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PhanQuyenLayout.setVerticalGroup(
            PhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhanQuyenLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        LayeredPane.add(PhanQuyen, "card2");

        NhanVien.setBackground(new java.awt.Color(0, 51, 51));

        jLabel15.setBackground(new java.awt.Color(0, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NHÂN VIÊN");

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSNV", "Họ và tên", "SĐT", "Ngày sinh", "Email", "Lương"
            }
        ));
        tableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNV);

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 255, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TÌM KIẾM");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ và tên", "MSNV" }));

        jPanel13.setBackground(new java.awt.Color(0, 51, 51));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 204));
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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel35.setBackground(new java.awt.Color(0, 51, 51));

        InNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InNV.setForeground(new java.awt.Color(204, 255, 204));
        InNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InNV.setText("IN");
        InNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InNVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InNV, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InNV, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("MSNV");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("INFORMATION");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 255, 204));
        jLabel56.setText("Name");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 255, 204));
        jLabel57.setText("Phone");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 255, 204));
        jLabel59.setText("DOB");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 255, 204));
        jLabel60.setText("Email");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 255, 204));
        jLabel61.setText("Salary");

        sadsa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sadsa.setForeground(new java.awt.Color(204, 255, 204));
        sadsa.setText("LinkAnh");

        LinkAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sadsa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LinkAnh)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(SDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(NgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(EmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(LuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sadsa)
                    .addComponent(LinkAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        sadsa.getAccessibleContext().setAccessibleName("");

        jPanel36.setBackground(new java.awt.Color(0, 51, 51));

        UpdateNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateNV.setForeground(new java.awt.Color(204, 255, 204));
        UpdateNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateNV.setText("SỬA");
        UpdateNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateNVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateNV, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel37.setBackground(new java.awt.Color(0, 51, 51));

        DeleteNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteNV.setForeground(new java.awt.Color(204, 255, 204));
        DeleteNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteNV.setText("XÓA");
        DeleteNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteNVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteNV, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteNV, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel38.setBackground(new java.awt.Color(0, 51, 51));

        InsertNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InsertNV.setForeground(new java.awt.Color(204, 255, 204));
        InsertNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertNV.setText("THÊM");
        InsertNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertNVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertNV, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertNV, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Anh, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, 0, 244, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(16, 16, 16))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LayeredPane.add(NhanVien, "card2");

        HoaDon.setBackground(new java.awt.Color(0, 51, 51));

        jLabel21.setBackground(new java.awt.Color(0, 51, 51));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("HÓA ĐƠN");

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));
        jPanel14.setPreferredSize(new java.awt.Dimension(880, 450));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Mã SP", "Ngày xuất ", "SĐT", "Địa chỉ"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel15.setBackground(new java.awt.Color(0, 51, 51));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 255, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("THÊM");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(0, 51, 51));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 255, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("SỬA");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(0, 51, 51));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 255, 204));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("XÓA");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(0, 51, 51));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 204));
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
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSHĐ", "Tên công ty" }));

        jPanel19.setBackground(new java.awt.Color(0, 51, 51));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 255, 204));
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

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel39.setBackground(new java.awt.Color(0, 51, 51));

        INHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        INHD.setForeground(new java.awt.Color(204, 255, 204));
        INHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INHD.setText("IN");
        INHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INHD, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INHD, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(16, 16, 16))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap(103, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );

        LayeredPane.add(HoaDon, "card2");

        Kho.setBackground(new java.awt.Color(0, 51, 51));

        jLabel27.setBackground(new java.awt.Color(0, 51, 51));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 255, 204));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("KHO");

        jPanel20.setBackground(new java.awt.Color(0, 102, 102));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã giày", "Tên giày", "Size", "Màu", "Giá", "Vật Liệu", "ID Phân Loại", "Mô Tả"
            }
        ));
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTable3);

        jPanel21.setBackground(new java.awt.Color(0, 51, 51));

        InsertK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InsertK.setForeground(new java.awt.Color(204, 255, 204));
        InsertK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertK.setText("THÊM");
        InsertK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertK, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(0, 51, 51));

        UpdateK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateK.setForeground(new java.awt.Color(204, 255, 204));
        UpdateK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateK.setText("SỬA");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateK, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(0, 51, 51));

        DeleteK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteK.setForeground(new java.awt.Color(204, 255, 204));
        DeleteK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteK.setText("XÓA");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteK, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(0, 51, 51));
        jPanel24.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 204));
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

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Giày", "Tên Giày", "Năm SX", "Thương Hiệu", "Giá" }));

        jPanel25.setBackground(new java.awt.Color(0, 51, 51));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 255, 204));
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

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("MÃ GIÀY");

        jLabel2.setText("TÊN GIÀY");

        jLabel3.setText("Màu");

        jLabel33.setText("Size");

        jLabel34.setText("GIÁ");

        MaGiay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaGiayActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("THÔNG TIN SẢN PHẨM");

        jLabel18.setText("Vật Liệu");

        jLabel38.setText("ID Phân Loại");

        jLabel39.setText("Mô Tả");

        VatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VatLieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gia)
                            .addComponent(VatLieu)
                            .addComponent(IDPL)
                            .addComponent(MoTa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TenGiay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(Size, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mau)
                            .addComponent(MaGiay))))
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
                    .addComponent(MaGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TenGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(VatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(0, 51, 51));

        InK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InK.setForeground(new java.awt.Color(204, 255, 204));
        InK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InK.setText("IN");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InK, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addGap(16, 16, 16)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 148, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout KhoLayout = new javax.swing.GroupLayout(Kho);
        Kho.setLayout(KhoLayout);
        KhoLayout.setHorizontalGroup(
            KhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        KhoLayout.setVerticalGroup(
            KhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhoLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LayeredPane.add(Kho, "card2");

        KhachHang.setBackground(new java.awt.Color(0, 51, 51));

        jLabel37.setBackground(new java.awt.Color(0, 51, 51));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 255, 204));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("KHÁCH HÀNG");

        jPanel27.setBackground(new java.awt.Color(0, 102, 102));
        jPanel27.setPreferredSize(new java.awt.Dimension(880, 455));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KH", "MÃ THẺ", "LOẠI", "HỆ SỐ", "NGÀY LẶP", "TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐỊA CHỈ"
            }
        ));
        tableKH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKHMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableKH);

        jPanel27.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 470, 350));

        jPanel28.setBackground(new java.awt.Color(0, 51, 51));

        InsertKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InsertKH.setForeground(new java.awt.Color(204, 255, 204));
        InsertKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertKH.setText("THÊM");
        InsertKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InsertKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertKH, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 74, 95, -1));

        jPanel29.setBackground(new java.awt.Color(0, 51, 51));

        UpDateKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpDateKH.setForeground(new java.awt.Color(204, 255, 204));
        UpDateKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpDateKH.setText("SỬA");
        UpDateKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpDateKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpDateKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpDateKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpDateKH, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 190, 95, -1));

        jPanel30.setBackground(new java.awt.Color(0, 51, 51));

        DeleteKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteKH.setForeground(new java.awt.Color(204, 255, 204));
        DeleteKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteKH.setText("XÓA");
        DeleteKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteKH, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 132, 95, -1));

        jPanel31.setBackground(new java.awt.Color(0, 51, 51));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 255, 204));
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

        jPanel27.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 7, -1, -1));
        jPanel27.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 7, 262, 40));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KH", "Tên KH", "Hạng", "Điểm", "Ngày tạo" }));
        jPanel27.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 197, 40));

        jPanel32.setBackground(new java.awt.Color(0, 51, 51));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 255, 204));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("SẮP XẾP THEO");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 7, 140, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TĂNG DẦN", "GIẢM DẦN" }));
        jComboBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel27.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, 40));

        jLabel43.setText("MÃ KH");

        jLabel44.setText("TÊN KH");

        jLabel46.setText("MÃ THẺ");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("THÔNG TIN THẺ THÀNH VIÊN");

        jLabel50.setText("ĐỊA CHỈ");

        jLabel51.setText("NGÀY SINH");

        jLabel9.setText("NGÀY LẶP");

        jLabel17.setText("GIỚI TÍNH");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaThe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(MaKH)
                            .addComponent(GT)
                            .addComponent(NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoVaTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DC, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel48)
                .addGap(10, 10, 10)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoVaTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 280, 350));

        jPanel34.setBackground(new java.awt.Color(0, 51, 51));

        InKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InKH.setForeground(new java.awt.Color(204, 255, 204));
        InKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InKH.setText("IN");
        InKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InKH, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InKH, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 248, 95, -1));

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LayeredPane.add(KhachHang, "card2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        RegisterForm rf = new RegisterForm();
        rf.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void tableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) tableNV.getModel();
        int SelectedRows = tableNV.getSelectedRow();
        
        
        MaNV.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        TenNV.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        SDTNV.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        Date date1 = (Date) RecordTable.getValueAt(SelectedRows, 3);
        NgaySinhNV.setDate(date1);
        EmailNV.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        LuongNV.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
//        docAnh();
    }//GEN-LAST:event_tableNVMouseClicked

    private void InNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InNVMouseClicked
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập bộ lọc cho chỉ chọn file Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một đường dẫn hợp lệ
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Gọi phương thức để tạo file Excel tại đường dẫn đã chọn
            exportToExcel(tableNV, filePath + ".xlsx");

            System.out.println("Excel file created successfully at: " + filePath + ".xlsx");
        } else {
            // Người dùng không chọn đường dẫn
            System.out.println("Creation canceled.");
        }
    }//GEN-LAST:event_InNVMouseClicked

    private void UpdateNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateNVMouseClicked
        try {
            int SelectedRows = tableNV.getSelectedRow();
            Nhanvien nv = new Nhanvien();
            
            nv.setIdnhanVien(Integer.parseInt(MaNV.getText()));
            nv.setHoVaTen(TenNV.getText());
            nv.setSdt(Integer.parseInt(SDTNV.getText()));
            Date date1 = NgaySinhNV.getDate();
            nv.setNgaySinh(date1);
            
            nv.setEmail(EmailNV.getText());
            nv.setLuong(Double.parseDouble(LuongNV.getText()));
           
            Bus nvbus=new Bus();
            nvbus.getList(Nhanvien.class);
            nvbus.Sua(nv,SelectedRows);
            
            GetDataNV();
            JOptionPane.showMessageDialog(null, "Update successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update error!");
        }
    }//GEN-LAST:event_UpdateNVMouseClicked

    private void DeleteNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteNVMouseClicked
        try{
            int SelectedRows = tableNV.getSelectedRow();
            Nhanvien nv = new Nhanvien();
            nv.setIdnhanVien(Integer.parseInt(MaNV.getText()));
            nv.setHoVaTen(TenNV.getText());
            nv.setSdt(Integer.parseInt(SDTNV.getText()));
            Date date1 = NgaySinhNV.getDate();
            nv.setNgaySinh(date1);
            nv.setEmail(EmailNV.getText());
            
            nv.setLuong(Double.parseDouble(LuongNV.getText()));
            
            Bus nvbus=new Bus();
            
            nvbus.getList(Nhanvien.class);
            nvbus.Xoa(nv,SelectedRows);
            GetDataNV();
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Delete Unsuccessfully!");
        }
    }//GEN-LAST:event_DeleteNVMouseClicked

    private void InsertNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertNVMouseClicked
        try{
            Nhanvien nv = new Nhanvien();
            
            nv.setHoVaTen(TenNV.getText());
            nv.setSdt(Integer.parseInt(SDTNV.getText()));
            Date date1 = NgaySinhNV.getDate();
            nv.setNgaySinh(date1);
            nv.setEmail(EmailNV.getText());
            
            nv.setLuong(Double.parseDouble(LuongNV.getText()));
            
            
            File file= jFileChooser1.getSelectedFile();
            BufferedImage picture = ImageIO.read(file);
            Image image=new ImageIcon(picture).getImage();
            Image imagescaled=image.getScaledInstance(Anh.getWidth(),Anh.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageIcon=new ImageIcon(imagescaled);
            Anh.setIcon(imageIcon);
            
            
            nv.setAnh(ImageToByte.FileToByte(file));
            
            Bus nvbus=new Bus();
            nvbus.getList(Nhanvien.class);
            nvbus.Them(nv);
            GetDataNV();
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insert Unsuccessfully!");
        }
    }//GEN-LAST:event_InsertNVMouseClicked

    private void MaGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaGiayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaGiayActionPerformed

    private void InsertKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertKHMouseClicked
        try{
            Khachhang kh = new Khachhang();
            The T = new The();
//            The the = kh.getThe();
//            String loai = the.getLoai();
            
            
            T=Generic_Implement.findByID(The.class,Integer.parseInt(MaThe.getText()));
            
            
            
            kh.setThe(T);
            Date date1 = NgayLap.getDate();
            kh.setNgayLapThe(date1);
            kh.setHoVaTen(HoVaTenKH.getText());
            kh.setGioiTinh(GT.getText());
            Date date2 = NgaySinh.getDate();
            kh.setNgaySinh(date2);
            kh.setGioiTinh(GT.getText());
            kh.setDiaChi(DC.getText());
            Bus Khbus=new Bus();
            
            Khbus.getList(Khachhang.class);
            Khbus.Them(kh);
            GetDataKH();
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insert Unsuccessfully!");
        }
    }//GEN-LAST:event_InsertKHMouseClicked

    private void DeleteKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteKHMouseClicked

            int SelectedRows = tableKH.getSelectedRow();
            Khachhang KH = new Khachhang();
            The T = new The();
            Date date1 = NgayLap.getDate();
            Date date2 = NgaySinh.getDate();
            KH.setIdkhachHang(Integer.parseInt(MaKH.getText()));
            T.setIdthe(Integer.parseInt(MaThe.getText()));
            KH.setThe(T);
            KH.setNgayLapThe(date1);
            KH.setHoVaTen(HoVaTenKH.getText());
            KH.setGioiTinh(GT.getText());
            KH.setNgaySinh(date2);
            KH.setDiaChi(DC.getText());
            
            Bus Khbus=new Bus();
            
            Khbus.getList(Khachhang.class);
            Khbus.Xoa(KH,SelectedRows);
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
            GetDataKH();
            
            
    }//GEN-LAST:event_DeleteKHMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void tableKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKHMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) tableKH.getModel();
        int SelectedRows = tableKH.getSelectedRow();

        MaKH.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        MaThe.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        
        Date date1 = (Date) RecordTable.getValueAt(SelectedRows, 2);
        NgayLap.setDate(date1);
        HoVaTenKH.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        GT.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        Date date2 = (Date) RecordTable.getValueAt(SelectedRows, 5);
        NgaySinh.setDate(date2);
        DC.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
    }//GEN-LAST:event_tableKHMouseClicked

    private void UpDateKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpDateKHMouseClicked
        try {
            int SelectedRows = tableKH.getSelectedRow();
            Khachhang KH = new Khachhang();
            The T = new The();
            Date date1 = NgayLap.getDate();
            Date date2 = NgaySinh.getDate();
            KH.setIdkhachHang(Integer.parseInt(MaKH.getText()));
            T.setIdthe(Integer.parseInt(MaThe.getText()));
            KH.setThe(T);
            KH.setNgayLapThe(date1);
            KH.setHoVaTen(HoVaTenKH.getText());
            KH.setGioiTinh(GT.getText());
            KH.setNgaySinh(date2);
            KH.setDiaChi(DC.getText());
            
           
            Bus Khbus=new Bus();
            Khbus.getList(Khachhang.class);
            Khbus.Sua(KH,SelectedRows);
            
            GetDataKH();
            JOptionPane.showMessageDialog(null, "Update successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update error!");
        }
    }//GEN-LAST:event_UpDateKHMouseClicked

    private void InKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InKHMouseClicked
//        int width = tableKH.getWidth();
//        int height = tableKH.getHeight();
//        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        Graphics2D g2 = image.createGraphics();
//        tableKH.paint(g2);
//        g2.dispose();
//         try {
//            ImageIO.write(image, "png", new File("C:\\Users\\ACER\\Documents\\GitHub\\QuanLyBanGiay\\src\\main\\java\\GUIMAN\\image\\tableKH.png"));
//            System.out.println("Table image created successfully.");
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        try {
//            ImageTableKH();
//        } catch (IOException ex) {
//            Logger.getLogger(DEMO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        // Tạo đối tượng JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập bộ lọc cho chỉ chọn file Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một đường dẫn hợp lệ
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Gọi phương thức để tạo file Excel tại đường dẫn đã chọn
            exportToExcel(tableKH, filePath + ".xlsx");

            System.out.println("Excel file created successfully at: " + filePath + ".xlsx");
        } else {
            // Người dùng không chọn đường dẫn
            System.out.println("Creation canceled.");
        }
    }//GEN-LAST:event_InKHMouseClicked

    private void INHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INHDMouseClicked
        InHoaDon in = new InHoaDon();
        BufferedImage image = new BufferedImage(in.width(),in.height(),BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        in.get().print(graphics);
        graphics.dispose();
        try {
            ImageIO.write(image, "png", new File("C:\\Users\\ACER\\Documents\\GitHub\\QuanLyBanGiay\\src\\main\\java\\GUIMAN\\image\\HoaDon.png"));
            System.out.println("Ảnh đã được tạo và lưu thành công.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_INHDMouseClicked

    private void LinkAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkAnhMouseClicked
        this.jFileChooser1 = new JFileChooser();

    // Hiển thị hộp thoại chọn file
    int result = jFileChooser1.showOpenDialog(null);

    // Kiểm tra xem người dùng đã chọn file hay chưa
    if (result == JFileChooser.APPROVE_OPTION) {
        // Lấy đường dẫn của file đã chọn
        File selectedFile = jFileChooser1.getSelectedFile();
    
        // Đặt đường dẫn vào JTextField
        LinkAnh.setText('"'+selectedFile.getAbsolutePath()+'"');
        }
    }//GEN-LAST:event_LinkAnhMouseClicked

    private void VatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VatLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VatLieuActionPerformed

    private void InsertKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertKMouseClicked
        try{
            Sanpham sp = new Sanpham();
            
            Phanloai pl = new Phanloai();
            
            
            pl=Generic_Implement.findByID(Phanloai.class,Integer.parseInt(IDPL.getText()));
            
            
            
            sp.setPhanloai(pl);
            
            
            sp.setTen(TenGiay.getText());
            sp.setSize(Double.parseDouble(Size.getText()));
            sp.setMau(Mau.getText());
            sp.setVatLieu(VatLieu.getText());
            String strNumber = Gia.getText();
            BigDecimal number = new BigDecimal(strNumber);
            sp.setGiaBan(number);
            
            Bus spbus=new Bus();
            
            spbus.getList(Sanpham.class);
            spbus.Them(sp);
            GetDataKH();
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insert Unsuccessfully!");
        }
    }//GEN-LAST:event_InsertKMouseClicked

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
    private javax.swing.JLabel Anh;
    private javax.swing.JTextField DC;
    private javax.swing.JLabel DeleteK;
    private javax.swing.JLabel DeleteKH;
    private javax.swing.JLabel DeleteNV;
    private javax.swing.JTextField EmailNV;
    private javax.swing.JTextField GT;
    private javax.swing.JTextField Gia;
    private javax.swing.JTextField HoVaTenKH;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel Home;
    private javax.swing.JTextField IDPL;
    private javax.swing.JLabel INHD;
    private javax.swing.JLabel InK;
    private javax.swing.JLabel InKH;
    private javax.swing.JLabel InNV;
    private javax.swing.JLabel InsertK;
    private javax.swing.JLabel InsertKH;
    private javax.swing.JLabel InsertNV;
    protected javax.swing.JPanel KhachHang;
    private javax.swing.JPanel Kho;
    private javax.swing.JPanel LayeredPane;
    private javax.swing.JTextField LinkAnh;
    private javax.swing.JTextField LuongNV;
    private javax.swing.JTextField MaGiay;
    private javax.swing.JTextField MaKH;
    private javax.swing.JTextField MaNV;
    private javax.swing.JTextField MaThe;
    private javax.swing.JTextField Mau;
    private javax.swing.JTextField MoTa;
    private com.toedter.calendar.JDateChooser NgayLap;
    private com.toedter.calendar.JDateChooser NgaySinh;
    private com.toedter.calendar.JDateChooser NgaySinhNV;
    private javax.swing.JPanel NhanVien;
    protected javax.swing.JPanel PhanQuyen;
    private javax.swing.JTextField SDTNV;
    private javax.swing.JTextField Size;
    private javax.swing.JTextField TenGiay;
    private javax.swing.JTextField TenNV;
    private javax.swing.JLabel UpDateKH;
    private javax.swing.JLabel UpdateK;
    private javax.swing.JLabel UpdateNV;
    private javax.swing.JTextField VatLieu;
    private javax.swing.JLabel btnCloseMenu;
    private javax.swing.JLabel btnHD;
    private javax.swing.JLabel btnHOME;
    private javax.swing.JLabel btnKH;
    private javax.swing.JLabel btnKHO;
    private javax.swing.JLabel btnNV;
    private javax.swing.JLabel btnPQ;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel nvBanHangPanel;
    private javax.swing.JPanel nvKhoPanel;
    private javax.swing.JPanel qtvPanel;
    private javax.swing.JLabel sadsa;
    private javax.swing.JPanel selectedPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTable tableKH;
    private javax.swing.JTable tableNV;
    // End of variables declaration//GEN-END:variables
}
