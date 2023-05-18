/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIMAN;

import BUS.Bus;
import BUS.Generic_BUS;
import DAO.Generic_Implement;
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
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class NhapHDandCTHD extends JFrame {

    Bus busCTHD = new Bus();
    Bus<Chitiethoadon> busCTHDtamthoi;
    public Sanpham sp;
    InHoaDon In = new InHoaDon();
    private ArrayList<Nhacungcap> listncc = HoaDon.ncc;
    private ArrayList<The> listt = TheForm.t;
    private ArrayList<Khachhang> listkh = KhachHang.kh;
    private ArrayList<Nhanvien> listnv = NhanVien.nv;
    private ArrayList<Sanpham> listsp = Kho.sp;
    public Hoadon hdvao = new Hoadon();
    public Hoadon hoaDontruyenvao;
    ArrayList<Chitiethoadon> CTHD;
    ArrayList<Chitiethoadon> CTHDtamthoi = new ArrayList();
    public Chitiethoadon cthd;//Chi tiet hoa don moi luc them
    public ArrayList<Sanpham> listSanphamCanThem = new ArrayList();
    public ArrayList<BigDecimal> listTongtien = new ArrayList();
    public ArrayList<Integer> listSoLuongMua = new ArrayList();
    public String phuongthucthanhtoan=new String();

    /**
     * Creates new form NhapHDandCTHD
     */
    public NhapHDandCTHD() {
        CTHD = busCTHD.getList(Chitiethoadon.class);
        initComponents();
    }

    public void setModelHD() {
        DefaultComboBoxModel<String> comboBoxModelNCC = new DefaultComboBoxModel<>();
        for (Nhacungcap x : listncc) {
            comboBoxModelNCC.addElement(x.getTen());
        }
        TenNCC.setModel(comboBoxModelNCC);
        DefaultComboBoxModel<String> comboBoxModelThe = new DefaultComboBoxModel<>();
        for (The x : listt) {
            comboBoxModelThe.addElement(x.getIdthe().toString());
        }
        
        MaThe.setModel(comboBoxModelThe);
        DefaultComboBoxModel<String> comboBoxModelKH = new DefaultComboBoxModel<>();
        for (Khachhang x : listkh) {
            comboBoxModelKH.addElement(x.getHoVaTen());
        }

        TenKH.setModel(comboBoxModelKH);
        DefaultComboBoxModel<String> comboBoxModelSP = new DefaultComboBoxModel<>();
        for (Sanpham x : listsp) {
            comboBoxModelSP.addElement(x.getTen());
            GiaBan.setText(x.getGiaBan() + "");
        }
        TenSP.setModel(comboBoxModelSP);
    }

    public void GetDataCTHD() {
        DefaultTableModel RecordTable = (DefaultTableModel) tableCTHD.getModel();
        RecordTable.setRowCount(0);
        for (int i = 0; i < CTHDtamthoi.size(); ++i) {
            Object[] rowData = new Object[4];
            rowData[0] = listSanphamCanThem.get(i).getTen();
            //nho check so luong cua truong phai be hon soluong ton kho
            rowData[1] = listSoLuongMua.get(i);
            rowData[2] = listSanphamCanThem.get(i).getGiaBan();
            rowData[3] = listTongtien.get(i);
            RecordTable.addRow(rowData);
        }
    }
    
    public void reset(){
        
    }

    public void openHoaDon(Hoadon hoadontruyentuHoaDonform) {
        this.hoaDontruyenvao = hoadontruyentuHoaDonform;
//        System.out.println(hoaDontruyenvao.getIdhoaDon());
        MaHD2.setText(this.hoaDontruyenvao.getIdhoaDon().toString());
        setSize(900, 760);
        setModelHD();
        jPanel2.setVisible(true);
        setVisible(true);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pThongTin = new javax.swing.JPanel();
        pThongTin_ThongTin = new javax.swing.JPanel();
        lblThongTin_MaKH = new javax.swing.JLabel();
        lblThongTin_MaNV = new javax.swing.JLabel();
        lblThongTin_TongTien = new javax.swing.JLabel();
        TongTien = new javax.swing.JTextField();
        MaThe = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        TenNCC = new javax.swing.JComboBox<>();
        TenKH = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        HoTen = new javax.swing.JLabel();
        lblThongTin_TongTien1 = new javax.swing.JLabel();
        chonPhuongThucThanhToan = new javax.swing.JComboBox<>();
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
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTHD = new javax.swing.JTable();
        TenSP = new javax.swing.JComboBox<>();
        SoLuong = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pThongTin.setPreferredSize(new java.awt.Dimension(340, 580));
        pThongTin.setVerifyInputWhenFocusTarget(false);

        pThongTin_ThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pThongTin_ThongTin.setPreferredSize(new java.awt.Dimension(405, 280));

        lblThongTin_MaKH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_MaKH.setText("Khách hàng");

        lblThongTin_MaNV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_MaNV.setText("Nhân viên");

        lblThongTin_TongTien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_TongTien.setText("Tổng tiền");

        TongTien.setEditable(false);
        TongTien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TongTien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TongTien.setPreferredSize(new java.awt.Dimension(170, 28));

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
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
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

        lblThongTin_TongTien1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblThongTin_TongTien1.setText("Phương thức");

        chonPhuongThucThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chonPhuongThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tại chỗ", "Momo" }));
        chonPhuongThucThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonPhuongThucThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pThongTin_ThongTinLayout = new javax.swing.GroupLayout(pThongTin_ThongTin);
        pThongTin_ThongTin.setLayout(pThongTin_ThongTinLayout);
        pThongTin_ThongTinLayout.setHorizontalGroup(
            pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThongTin_MaKH)
                    .addComponent(lblThongTin_TongTien)
                    .addComponent(lblThongTin_MaNV)
                    .addComponent(jLabel1)
                    .addComponent(lblThongTin_TongTien1))
                .addGap(22, 22, 22)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                        .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                                .addComponent(MaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(chonPhuongThucThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        pThongTin_ThongTinLayout.setVerticalGroup(
            pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pThongTin_ThongTinLayout.createSequentialGroup()
                        .addComponent(chonPhuongThucThanhToan)
                        .addGap(1, 1, 1))
                    .addComponent(lblThongTin_TongTien1))
                .addGap(28, 28, 28)
                .addGroup(pThongTin_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(jButton8))
                .addGap(76, 76, 76))
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

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton7.setText("Xóa");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

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
        tableCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCTHD);

        TenSP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TenSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Sản Phẩm", " " }));
        TenSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenSPActionPerformed(evt);
            }
        });

        SoLuong.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

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
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MaHD2)
                                        .addComponent(GiaBan)
                                        .addComponent(TenSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InsertCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
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
                    .addComponent(InsertCTHD))
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
    public Hoadon hoaDonTraVe() {
        return this.hoaDontruyenvao;
    }
    private void InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseClicked
        Nhacungcap ncc = new Nhacungcap();
        for (Nhacungcap x : listncc) {
            if (x.getTen().equals(TenNCC.getSelectedItem())) {
                ncc = x;
            }
        }

        this.hoaDontruyenvao.setNhacungcap(ncc);
        Khachhang kh = new Khachhang();
        for (Khachhang x : listkh) {
            if (x.getHoVaTen().equals(TenKH.getSelectedItem())) {
                kh = x;
            }
        }
        this.hoaDontruyenvao.setIdkhachHang(kh.getIdkhachHang());
        String strNumber = TongTien.getText();
        BigDecimal number = new BigDecimal(strNumber);
        this.hoaDontruyenvao.setTongTien(number);
        this.hoaDonTraVe();
        Generic_Implement.insert(hoaDontruyenvao);
        for (Chitiethoadon var : CTHDtamthoi) {
            Generic_Implement.insert(var);
        }
        this.dispose();
        In.openInHoaDon(hoaDontruyenvao,HoTen.getText());
         
    }//GEN-LAST:event_InsertMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        listSanphamCanThem.clear();
        listSoLuongMua.clear();
        listTongtien.clear();
        DefaultTableModel RecordTable = (DefaultTableModel) tableCTHD.getModel();
        RecordTable.setRowCount(0);
        this.TongTien.setText("");
        setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked
    private void InsertCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertCTHDMouseClicked
        try {
            this.cthd = new Chitiethoadon();
            cthd.setId(new ChitiethoadonId(this.hoaDontruyenvao.getIdhoaDon(), this.sp.getIdgiay(), 0));
            cthd.getId().setSoLuong(Integer.parseInt(SoLuong.getValue().toString()));
            int soluonggiay = Integer.parseInt(SoLuong.getValue().toString());
            listSoLuongMua.add(soluonggiay);
            BigDecimal tongtiencuamotdong = sp.getGiaBan().multiply(BigDecimal.valueOf(soluonggiay));
            CTHDtamthoi.add(cthd);
            listTongtien.add(tongtiencuamotdong);
            BigDecimal sum = BigDecimal.ZERO;
            for (BigDecimal x : listTongtien) {
                sum = sum.add(x);
            }
            TongTien.setText(sum + "");
            listSanphamCanThem.add(sp);

            GetDataCTHD();
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Error!");
        }
    }//GEN-LAST:event_InsertCTHDMouseClicked

    private void TenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenSPActionPerformed
        this.sp = new Sanpham();
        for (Sanpham x : listsp) {
            
            if (x.getTen().equals(TenSP.getSelectedItem().toString())) {
                sp = x;
                GiaBan.setText(sp.getGiaBan().toString());
                SoLuong.setValue(1);
            }
        }
    }//GEN-LAST:event_TenSPActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertActionPerformed

    private void chonPhuongThucThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonPhuongThucThanhToanActionPerformed
        this.phuongthucthanhtoan= chonPhuongThucThanhToan.getSelectedItem().toString();
        In.ThanhToan.setText(this.phuongthucthanhtoan);
    }//GEN-LAST:event_chonPhuongThucThanhToanActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int selectable = tableCTHD.getSelectedRow();
        System.out.println(selectable);
        CTHDtamthoi.remove(selectable);
        GetDataCTHD();
    }//GEN-LAST:event_jButton7MouseClicked
    
    private void tableCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTHDMouseClicked
        
    }//GEN-LAST:event_tableCTHDMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GiaBan;
    public javax.swing.JLabel HoTen;
    private javax.swing.JButton Insert;
    private javax.swing.JButton InsertCTHD;
    public javax.swing.JTextField MaHD2;
    private javax.swing.JComboBox<String> MaThe;
    private javax.swing.JSpinner SoLuong;
    private javax.swing.JComboBox<String> TenKH;
    private javax.swing.JComboBox<String> TenNCC;
    private javax.swing.JComboBox<String> TenSP;
    public javax.swing.JTextField TongTien;
    public javax.swing.JComboBox<String> chonPhuongThucThanhToan;
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
    private javax.swing.JLabel lblThongTin_MaKH;
    private javax.swing.JLabel lblThongTin_MaNV;
    private javax.swing.JLabel lblThongTin_TongTien;
    private javax.swing.JLabel lblThongTin_TongTien1;
    private javax.swing.JPanel pThongTin;
    private javax.swing.JPanel pThongTin_ThongTin;
    private javax.swing.JTable tableCTHD;
    // End of variables declaration//GEN-END:variables
}
