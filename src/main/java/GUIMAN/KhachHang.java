/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIMAN;

import BUS.Bus;
import BUS.Generic_BUS;
import DAO.Generic_Implement;
import entity1.Khachhang;
import entity1.The;
import java.awt.PopupMenu;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class KhachHang extends javax.swing.JFrame {

    HamCanDung Ham = new HamCanDung();
    ChonF cf = new ChonF(this, true);
    Bus<Khachhang> bus = new Bus();
    public static ArrayList<Khachhang> kh = new ArrayList();
    private ArrayList<The> listt =  TheForm.t;

    /**
     * Creates new form KhachHang
     */
    public KhachHang() {
        
        kh = bus.getList(Khachhang.class);
        initComponents();
    }

    public JPanel openKH() {
        this.GetDataKH();
        return KhachHang;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public boolean checkListIdThe(int instance) {
        for (The i : listt) {
            if (i.getIdthe() == instance) {
                return true;
            }
        }
        return false;
    }

    public void GetDataKH() {
        System.out.println(listt.size());
        DefaultTableModel RecordTable = (DefaultTableModel) tableKH.getModel();
        RecordTable.setRowCount(0);
        Object[] rowData = new Object[9];
        for (int i = 0; i < kh.size(); ++i) {
            try {
                rowData = new Object[9];
                rowData[0] = kh.get(i).getIdkhachHang();
                rowData[1] = kh.get(i).getThe().getIdthe();
                if (checkListIdThe(kh.get(i).getThe().getIdthe())) {
                    rowData[2] = listt.get(kh.get(i).getThe().getIdthe() - 1).getLoai();
                    rowData[3] = listt.get(kh.get(i).getThe().getIdthe() - 1).getHeSo();
                }
                else{
                    rowData[2]="";
                    rowData[3]="";
                }

                rowData[4] = kh.get(i).getNgayLapThe();
                rowData[5] = kh.get(i).getHoVaTen();
                rowData[6] = kh.get(i).getGioiTinh();
                rowData[7] = kh.get(i).getNgaySinh();
                rowData[8] = kh.get(i).getDiaChi();

            } catch (NullPointerException  npe) {
                rowData[1] = "";
                rowData[2] = "";
                rowData[3] = "";
                rowData[4] = kh.get(i).getNgayLapThe();
                rowData[5] = kh.get(i).getHoVaTen();
                rowData[6] = kh.get(i).getGioiTinh();
                rowData[7] = kh.get(i).getNgaySinh();
                rowData[8] = kh.get(i).getDiaChi();
            }
            RecordTable.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        TimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KhachHang.setBackground(new java.awt.Color(0, 51, 51));

        jLabel37.setBackground(new java.awt.Color(0, 51, 51));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 255, 204));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("KHÁCH HÀNG");

        jPanel27.setBackground(new java.awt.Color(0, 102, 102));
        jPanel27.setPreferredSize(new java.awt.Dimension(1000, 455));
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

        jPanel27.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 470, 370));

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

        jPanel27.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 280, 370));

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

        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });
        jPanel27.add(TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 250, 40));

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addGroup(KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE))
                .addContainerGap())
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKHMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) tableKH.getModel();
        int SelectedRows = tableKH.getSelectedRow();
        MaKH.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        MaThe.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        Date date1 = (Date) RecordTable.getValueAt(SelectedRows, 4);
        NgayLap.setDate(date1);
        HoVaTenKH.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        GT.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        Date date2 = (Date) RecordTable.getValueAt(SelectedRows, 7);
        NgaySinh.setDate(date2);
        DC.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
    }//GEN-LAST:event_tableKHMouseClicked

    private void InsertKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertKHMouseClicked
//        try {
            Khachhang khachhang = new Khachhang();
            The T = new The();
            T = Generic_Implement.findByID(The.class, Integer.parseInt(MaThe.getText()));
            khachhang.setThe(T);
            Date date1 = NgayLap.getDate();
            khachhang.setNgayLapThe(date1);
            khachhang.setHoVaTen(HoVaTenKH.getText());
            khachhang.setGioiTinh(GT.getText());
            Date date2 = NgaySinh.getDate();
            khachhang.setNgaySinh(date2);
            khachhang.setGioiTinh(GT.getText());
            khachhang.setDiaChi(DC.getText());

            bus.Them(khachhang);
            this.kh = bus.getList();
            GetDataKH();
            JOptionPane.showMessageDialog(null, "Insert Successfully!");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Insert Unsuccessfully!");
//        }
    }//GEN-LAST:event_InsertKHMouseClicked

    private void UpDateKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpDateKHMouseClicked
        try {
            int SelectedRows = tableKH.getSelectedRow();
            Khachhang KH = new Khachhang();
            The T = new The();
            Date date1 = NgayLap.getDate();
            Date date2 = NgaySinh.getDate();
            KH.setIdkhachHang(Integer.parseInt(MaKH.getText()));
            T = Generic_Implement.findByID(The.class, Integer.parseInt(MaThe.getText()));
            KH.setThe(T);
            KH.setNgayLapThe(date1);
            KH.setHoVaTen(HoVaTenKH.getText());
            KH.setGioiTinh(GT.getText());
            KH.setNgaySinh(date2);
            KH.setDiaChi(DC.getText());

            bus.Sua(KH, SelectedRows);
            this.kh = bus.getList();
            GetDataKH();
            JOptionPane.showMessageDialog(null, "Update successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update error!");
        }
    }//GEN-LAST:event_UpDateKHMouseClicked

    private void DeleteKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteKHMouseClicked
        try {
            int SelectedRows = tableKH.getSelectedRow();
            Khachhang KH = new Khachhang();
            KH.setIdkhachHang(Integer.parseInt(MaKH.getText()));

            bus.Xoa(KH, SelectedRows);
            kh = bus.getList();
            GetDataKH();
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete error!");
        }
    }//GEN-LAST:event_DeleteKHMouseClicked

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
        cf.jFileChooser1 = new JFileChooser();

        // Thiết lập bộ lọc cho chỉ chọn file Excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        cf.jFileChooser1.setFileFilter(filter);

        // Hiển thị hộp thoại chọn file
        int returnValue = cf.jFileChooser1.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một đường dẫn hợp lệ
            File selectedFile = cf.jFileChooser1.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Gọi phương thức để tạo file Excel tại đường dẫn đã chọn
            Ham.exportToExcel(tableKH, filePath + ".xlsx");

            System.out.println("Excel file created successfully at: " + filePath + ".xlsx");
        } else {
            // Người dùng không chọn đường dẫn
            System.out.println("Creation canceled.");
        }
    }//GEN-LAST:event_InKHMouseClicked

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
  
    }//GEN-LAST:event_TimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DC;
    private javax.swing.JLabel DeleteKH;
    private javax.swing.JTextField GT;
    private javax.swing.JTextField HoVaTenKH;
    private javax.swing.JLabel InKH;
    private javax.swing.JLabel InsertKH;
    protected javax.swing.JPanel KhachHang;
    private javax.swing.JTextField MaKH;
    private javax.swing.JTextField MaThe;
    private com.toedter.calendar.JDateChooser NgayLap;
    private com.toedter.calendar.JDateChooser NgaySinh;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JLabel UpDateKH;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableKH;
    // End of variables declaration//GEN-END:variables
}

