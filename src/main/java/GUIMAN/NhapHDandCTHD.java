/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIMAN;

import BUS.Bus;
import BUS.Generic_BUS;
import DAO.Generic_Implement;
import static GUIMAN.Login1.nguoiDungLog;
import entity1.Chitiethoadon;
import entity1.ChitiethoadonId;
import entity1.Hoadon;
import entity1.Khachhang;
import entity1.Nhacungcap;
import entity1.Nhanvien;
import entity1.Sanpham;
import entity1.The;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class NhapHDandCTHD extends JFrame  {
    Bus bus = new Bus();
    private ArrayList<Nhacungcap> listncc = HoaDon.ncc;
    private ArrayList<The> listt = KhachHang.t;
    private ArrayList<Khachhang> listkh = KhachHang.kh;
    private ArrayList<Nhanvien> listnv = NhanVien.nv;
    private ArrayList<Sanpham> listsp = Kho.sp;
    public Hoadon hd = new Hoadon();
    ArrayList<Chitiethoadon> CTHD = Generic_BUS.getAll(Chitiethoadon.class);
    ArrayList<ChitiethoadonId> CTHDId = Generic_BUS.getAll(ChitiethoadonId.class);
    
    /**
     * Creates new form NhapHDandCTHD
     */
    public NhapHDandCTHD() {
        initComponents();
    }
    
    public void setModelHD(){
        DefaultComboBoxModel<String> comboBoxModelNCC = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> comboBoxModelThe = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> comboBoxModelKH = new DefaultComboBoxModel<>();
        for(Nhacungcap x : listncc){
            comboBoxModelNCC.addElement(x.getTen());
        }
        TenNCC.setModel(comboBoxModelNCC);
        for(The x : listt){
            comboBoxModelThe.addElement(x.getIdthe().toString());
        }
        MaThe.setModel(comboBoxModelThe);
        
        for(Khachhang x : listkh){
            comboBoxModelKH.addElement(x.getHoVaTen());
        }
        TenKH.setModel(comboBoxModelKH);
    }
    
    public void GetDataCTHD(){
        DefaultTableModel RecordTable = (DefaultTableModel) tableCTHD.getModel();
        RecordTable.setRowCount(0);
        for(int i = 0;i < CTHD.size();i++){
            Object[] rowData = new Object[4];
            rowData[0] = CTHD.get(i).getSanpham().getTen();
            rowData[1] = CTHD.get(i).getId().getSoLuong();
            rowData[2] = CTHD.get(i).getSanpham().getGiaBan();
//            rowData[3] = 
            RecordTable.addRow(rowData);
        }
    }
    
    public void setModelCTHD(){
        DefaultComboBoxModel<String> comboBoxModelSP = new DefaultComboBoxModel<>();
        for(Sanpham x : listsp){
            comboBoxModelSP.addElement(x.getTen());
        }
        TenSP.setModel(comboBoxModelSP);
    }
    
    public void openCTHD(){
        pThongTin.setVisible(false);
        setSize( 450, 760);
        setModelCTHD();
        GetDataCTHD();
        jPanel1.setVisible(true);
        setVisible(true);
    }
    
    public void openHoaDon(){
        jPanel1.setVisible(false);
        setSize(450, 760);
        setModelHD();
        pThongTin.setVisible(true);
        setVisible(true);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pThongTin = new javax.swing.JPanel();
        pThongTin_ThongTin = new javax.swing.JPanel();
        lblThongTin_MaHD = new javax.swing.JLabel();
        lblThongTin_MaKH = new javax.swing.JLabel();
        lblThongTin_MaNV = new javax.swing.JLabel();
        lblThongTin_NgayBan = new javax.swing.JLabel();
        lblThongTin_TongTien = new javax.swing.JLabel();
        MaHD1 = new javax.swing.JTextField();
        TongTien = new javax.swing.JTextField();
        NgayLap = new com.toedter.calendar.JDateChooser();
        MaThe = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        TenNCC = new javax.swing.JComboBox<>();
        TenKH = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        HoTen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MaHD2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GiaBan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        InsertCTHD = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTHD = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        TenSP = new javax.swing.JComboBox<>();
        SoLuong = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pThongTin.setPreferredSize(new java.awt.Dimension(340, 580));
        pThongTin.setVerifyInputWhenFocusTarget(false);

        pThongTin_ThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pThongTin_ThongTin.setPreferredSize(new java.awt.Dimension(405, 280));

        lblThongTin_MaHD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_MaHD.setText("Mã hóa đơn");

        lblThongTin_MaKH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_MaKH.setText("Khách hàng");

        lblThongTin_MaNV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_MaNV.setText("Nhân viên");

        lblThongTin_NgayBan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_NgayBan.setText("Ngày bán");

        lblThongTin_TongTien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_TongTien.setText("Tổng tiền");

        MaHD1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MaHD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MaHD1.setPreferredSize(new java.awt.Dimension(170, 28));

        TongTien.setEditable(false);
        TongTien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TongTien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TongTien.setPreferredSize(new java.awt.Dimension(170, 28));

        NgayLap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NgayLap.setDate(new java.util.Date(1590147174000L));
        NgayLap.setDateFormatString("dd / MM / yyyy");
        NgayLap.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MaThe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MaThe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nhà cung cấp");

        Insert.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Insert.setText("Đồng ý");
        Insert.setBorder(new javax.swing.border.MatteBorder(null));
        Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertMouseClicked(evt);
            }
        });

        TenNCC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TenNCC.setMaximumRowCount(100);
        TenNCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TenKH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TenKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TenKH.setBorder(null);

        jButton8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton8.setText("Hủy");
        jButton8.setBorder(new javax.swing.border.MatteBorder(null));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        HoTen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pThongTin_ThongTinLayout = new javax.swing.GroupLayout(pThongTin_ThongTin);
        pThongTin_ThongTin.setLayout(pThongTin_ThongTinLayout);
        pThongTin_ThongTinLayout.setHorizontalGroup(
            pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblThongTin_MaHD)
                            .addComponent(lblThongTin_MaKH)
                            .addComponent(lblThongTin_NgayBan)
                            .addComponent(lblThongTin_TongTien)
                            .addComponent(lblThongTin_MaNV)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pThongTin_ThongTinLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaHD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                        .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                                .addComponent(MaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );
        pThongTin_ThongTinLayout.setVerticalGroup(
            pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThongTin_MaHD)
                    .addComponent(MaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThongTin_NgayBan)
                    .addComponent(NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThongTin_MaKH)
                    .addComponent(MaThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThongTin_MaNV)
                    .addComponent(HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThongTin_TongTien))
                .addGap(62, 62, 62)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(jButton8))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pThongTinLayout = new javax.swing.GroupLayout(pThongTin);
        pThongTin.setLayout(pThongTinLayout);
        pThongTinLayout.setHorizontalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pThongTin_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pThongTinLayout.setVerticalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(pThongTin_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(428, 547));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mã hóa đơn");

        MaHD2.setEditable(false);
        MaHD2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MaHD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tên giày");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Giá Bán");

        GiaBan.setEditable(false);
        GiaBan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GiaBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Chi Tiết Hóa đơn");

        InsertCTHD.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        InsertCTHD.setText("Thêm");
        InsertCTHD.setBorder(new javax.swing.border.MatteBorder(null));
        InsertCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertCTHDMouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton6.setText("Sửa");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton7.setText("Xóa");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));

        tableCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên SP", "SL", "Giá Bán", "T.Tiền"
            }
        ));
        jScrollPane1.setViewportView(tableCTHD);

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setText("Hủy");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        TenSP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TenSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TenSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SoLuong.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MaHD2)
                                    .addComponent(GiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(TenSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(InsertCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(InsertCTHD)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseClicked
        try {
            Nhacungcap ncc = new Nhacungcap();
            for(Nhacungcap x : listncc){
                if(x.getTen() == TenNCC.getSelectedItem()){
                    ncc = x;
                }
            }
            hd.setNhacungcap(ncc);
            hd.setNgayLap(NgayLap.getDate());
            Khachhang kh = new Khachhang();
            for(Khachhang x : listkh){
                if(x.getHoVaTen() == TenKH.getSelectedItem()){
                    kh = x;
                }
            }
            hd.setIdkhachHang(kh.getIdkhachHang());
            
            bus.getList(Hoadon.class);
            bus.Them(hd);
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Error!");
        }
    }//GEN-LAST:event_InsertMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void InsertCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertCTHDMouseClicked
        try {
            
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Error!");
        }
    }//GEN-LAST:event_InsertCTHDMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GiaBan;
    public javax.swing.JLabel HoTen;
    private javax.swing.JButton Insert;
    private javax.swing.JButton InsertCTHD;
    private javax.swing.JTextField MaHD1;
    public javax.swing.JTextField MaHD2;
    private javax.swing.JComboBox<String> MaThe;
    private com.toedter.calendar.JDateChooser NgayLap;
    private javax.swing.JSpinner SoLuong;
    private javax.swing.JComboBox<String> TenKH;
    private javax.swing.JComboBox<String> TenNCC;
    private javax.swing.JComboBox<String> TenSP;
    public javax.swing.JTextField TongTien;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblThongTin_MaHD;
    private javax.swing.JLabel lblThongTin_MaKH;
    private javax.swing.JLabel lblThongTin_MaNV;
    private javax.swing.JLabel lblThongTin_NgayBan;
    private javax.swing.JLabel lblThongTin_TongTien;
    private javax.swing.JPanel pThongTin;
    private javax.swing.JPanel pThongTin_ThongTin;
    private javax.swing.JTable tableCTHD;
    // End of variables declaration//GEN-END:variables
}
