/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UINam;

import BUS.Generic_BUS;
import static DAO.ChitiethoadonHome.getTheoSLGiayVaThang;
import entity1.Chitiethoadon;
import entity1.Hoadon;
import entity1.Sanpham;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author NAM
 */
public class ThongKeForm extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeForm
     */
    public ArrayList<Object[]> results;
    public ArrayList<Chitiethoadon> dscthd;
    public ArrayList<Sanpham> dssp;
    public ArrayList<Hoadon> listhd;

    public ThongKeForm() {
        results = getTheoSLGiayVaThang();
        dscthd = Generic_BUS.getAll(Chitiethoadon.class);
        dssp = Generic_BUS.getAll(Sanpham.class);
        listhd = Generic_BUS.getAll(Hoadon.class);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tkdt = new javax.swing.JLabel();
        tktngay = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tktthang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tkspbanchay = new javax.swing.JPanel();
        tkspBanChay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(537, 550));
        setMinimumSize(new java.awt.Dimension(537, 550));
        setUndecorated(true);

        containerPanel.setBackground(new java.awt.Color(0, 102, 102));
        containerPanel.setMaximumSize(new java.awt.Dimension(537, 550));
        containerPanel.setMinimumSize(new java.awt.Dimension(537, 550));
        containerPanel.setPreferredSize(new java.awt.Dimension(537, 550));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        tkdt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tkdt.setForeground(new java.awt.Color(51, 51, 51));
        tkdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tkdt.setText("THỐNG KÊ DOANH THU");

        tktngay.setBackground(new java.awt.Color(128,128,128, 220));
        tktngay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tktngay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tktngayMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thống kê theo ngày");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tktngayLayout = new javax.swing.GroupLayout(tktngay);
        tktngay.setLayout(tktngayLayout);
        tktngayLayout.setHorizontalGroup(
            tktngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tktngayLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        tktngayLayout.setVerticalGroup(
            tktngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        tktthang.setBackground(new java.awt.Color(128,128,128, 220));
        tktthang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tktthang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tktthangMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thống kê theo tháng hiện tại");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tktthangLayout = new javax.swing.GroupLayout(tktthang);
        tktthang.setLayout(tktthangLayout);
        tktthangLayout.setHorizontalGroup(
            tktthangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tktthangLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        tktthangLayout.setVerticalGroup(
            tktthangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        tkspbanchay.setBackground(new java.awt.Color(128,128,128, 220));
        tkspbanchay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tkspbanchay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tkspbanchayMouseClicked(evt);
            }
        });

        tkspBanChay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tkspBanChay.setForeground(new java.awt.Color(255, 255, 255));
        tkspBanChay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tkspBanChay.setText("Thống kê sản phẩm bán chạy nhất (theo tháng)");
        tkspBanChay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tkspBanChay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tkspBanChayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tkspbanchayLayout = new javax.swing.GroupLayout(tkspbanchay);
        tkspbanchay.setLayout(tkspbanchayLayout);
        tkspbanchayLayout.setHorizontalGroup(
            tkspbanchayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tkspbanchayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tkspBanChay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tkspbanchayLayout.setVerticalGroup(
            tkspbanchayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tkspBanChay, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(tkdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tktngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tkspbanchay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tktthang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tkdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(tktngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tktthang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tkspbanchay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerPanelLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static class Cus {

        public Date ngay;
        public Double doanhthu;
        public int soluong;
        public int day;

        public Cus() {
        }
    }

    public static class CusMonth {

        public int thang;
        public Double doanhthu;
        public int soluong;

        public CusMonth() {

        }
    }

    private ArrayList<Cus> dtCacNgayTrongThang(int selectedMonth, int selectedYear) {
        ArrayList<Cus> dtCacNgayTrongThang = new ArrayList<>();

        // Lọc dữ liệu trong listhd để chỉ lấy các hóa đơn của tháng và năm được chọn
        for (Hoadon e : listhd) {
            if (e.getNgayLap().getMonth() + 1 == selectedMonth && e.getNgayLap().getYear() + 1900 == selectedYear) {
                boolean found = false;
                for (Cus cus : dtCacNgayTrongThang) {
                    if (cus.ngay.equals(e.getNgayLap())) {
                        cus.doanhthu += e.getTongTien().doubleValue();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    Cus custemp = new Cus();
                    custemp.doanhthu = e.getTongTien().doubleValue();
                    custemp.ngay = e.getNgayLap();
                    dtCacNgayTrongThang.add(custemp);
                }
            }
        }

        return dtCacNgayTrongThang;

    }

    private void updateChartForMonth(int selectedMonth, int selectedYear, DefaultCategoryDataset dataset) {
        // Xóa dữ liệu cũ trong dataset
        dataset.clear();

        // Lấy danh sách ngày trong tháng và năm được chọn
        ArrayList<Cus> dtCacNgayTrongThang = dtCacNgayTrongThang(selectedMonth, selectedYear);

        // Tạo danh sách các ngày trong tháng
        Calendar calendar = Calendar.getInstance();
        calendar.set(selectedYear, selectedMonth - 1, 1); // Đặt ngày là 1 để lấy ngày đầu tiên trong tháng
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Thêm các ngày vào biểu đồ
        for (int day = 1; day <= lastDay; day++) {
            boolean found = false;
            for (Cus cus : dtCacNgayTrongThang) {
                if (cus.ngay.getDate() == day) {
                    dataset.setValue(cus.doanhthu, "Doanh thu theo ngày", String.valueOf(day));
                    found = true;
                    break;
                }
            }
            if (!found) {
                dataset.setValue(0, "Doanh thu theo ngày", String.valueOf(day));
            }
        }
    }

    private void tktngayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tktngayMouseClicked

        // Tạo JComboBox cho tháng
        String[] months = {"Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);

        // Tạo JComboBox cho năm
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Integer[] years = new Integer[currentYear - 2000 + 1];
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }
        JComboBox<Integer> yearComboBox = new JComboBox<>(years);

        // Đặt vị trí và kích thước cho JComboBox
        monthComboBox.setBounds(10, 10, 5, 30);
        yearComboBox.setBounds(10, 30, 5, 30);

        // Đặt giá trị mặc định cho JComboBox tháng và năm
        monthComboBox.setSelectedItem("Tháng 1");
        yearComboBox.setSelectedItem(currentYear);

        // Tạo JPanel để chứa cả JComboBox và biểu đồ
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(monthComboBox, BorderLayout.PAGE_START);
        panel.add(yearComboBox);

        // Tạo biểu đồ và thêm vào JPanel
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart("Thống kê doanh thu theo ngày", "Ngày", "Doanh Thu (VND)", dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel, BorderLayout.SOUTH);

        // Thêm sự kiện lắng nghe cho JComboBox
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    int selectedMonth = monthComboBox.getSelectedIndex() + 1;
                    int selectedYear = (int) yearComboBox.getSelectedItem();
                    // Gọi hàm thực hiện xử lý và cập nhật dữ liệu cho biểu đồ
                    updateChartForMonth(selectedMonth, selectedYear, dataset);
                }
            }
        };
        monthComboBox.addItemListener(itemListener);
        yearComboBox.addItemListener(itemListener);

        // Hiển thị JPanel chứa JComboBox và biểu đồ trong JFrame
        JFrame frame = new JFrame("Doanh thu theo ngày");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1244, 800);
        frame.setVisible(true);

    }//GEN-LAST:event_tktngayMouseClicked

    private void tktthangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tktthangMouseClicked
        // TODO add your handling code here:

        Set<Date> SetNgay = new HashSet<>(); // 
        Set<Integer> SetThang = new HashSet<>();

        for (Hoadon e : listhd) {
            SetNgay.add(e.getNgayLap());
        }

        for (Hoadon e : listhd) {
            SetThang.add(e.getNgayLap().getMonth());
        }
        // Tính tổng doanh thu của từng ngày        
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
        // Tính tổng doanh thu của từng tháng 
        ArrayList<CusMonth> month = new ArrayList(12);
        for (int itmon : SetThang) {
            double dttheothang = 0.0d;
            for (Cus doanhthutheongay : dtday) {
                if (itmon == doanhthutheongay.ngay.getMonth()) {
                    dttheothang = dttheothang + doanhthutheongay.doanhthu;
                }
            }
            CusMonth cusMonth = new CusMonth();
            cusMonth.doanhthu = dttheothang;
            cusMonth.thang = itmon + 1;
            month.add(cusMonth);
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (month != null && !month.isEmpty()) {
            for (CusMonth m : month) {
                dataset.setValue(m.doanhthu, "Doanh thu theo tháng", Integer.toString(m.thang));
            }
        }
        // Tạo biểu đồ cột
        JFreeChart chart = ChartFactory.createBarChart("Thống kê doanh thu theo tháng hiện tại", "Tháng", "Doanh Thu (VND)", dataset, PlotOrientation.VERTICAL, false, true, false);

        // Hiển thị biểu đồ trong JFrame
        ChartFrame frame = new ChartFrame("Doanh thu", chart);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(1244, 800);
        frame.setVisible(true);
    }//GEN-LAST:event_tktthangMouseClicked

    private void tkspbanchayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tkspbanchayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tkspbanchayMouseClicked

    private void tkspBanChayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tkspBanChayMouseClicked

        // Sắp xếp tháng theo thứ tự tăng dần
        Collections.sort(results, Comparator.comparingInt((Object[] o) -> (int) o[0])
                .thenComparingInt(o -> ((Number) o[2]).intValue())
                .reversed());

        int[] monthOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Map<Integer, String> giayMap = new HashMap<>();

        for (Chitiethoadon cthd : dscthd) {
            int idGiay = cthd.getId().getIdgiay();
            for (Sanpham sanPham : dssp) {
                if (sanPham.getIdgiay() == idGiay) {
                    giayMap.put(idGiay, sanPham.getTen());
                    break;
                }
            }
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int month : monthOrder) {
            for (Object[] result : results) {
                int resultMonth = (int) result[0];
                if (resultMonth == month) {
                    int idGiay = (int) result[1];
                    int soLuong = ((Number) result[2]).intValue();
                    String tenGiay = giayMap.get(idGiay);
                    dataset.addValue(soLuong, tenGiay, "Tháng " + month);
                }
            }
        }
        // Tạo biểu đồ cột
        JFreeChart chart = ChartFactory.createBarChart(
                "Sản phẩm bán chạy nhất theo tháng",
                "Tháng",
                "Số lượng",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false);
        // Lấy đối tượng CategoryPlot từ biểu đồ
        CategoryPlot plot = chart.getCategoryPlot();
        // Định nghĩa CategoryItemLabelGenerator để hiển thị tên giày trên mỗi cột
        CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator() {
            @Override
            public String generateLabel(CategoryDataset dataset, int row, int column) {
                String label = dataset.getColumnKey(column).toString(); // Lấy tên cột (IDGiay)
                if (label.startsWith("IDGiay ")) {
                    int idGiay = Integer.parseInt(label.replace("IDGiay ", "")); // Chuyển đổi thành IDGiay
                    String tenGiay = giayMap.get(idGiay); // Lấy tên giày từ ánh xạ giày
                    return tenGiay;
                }
                return super.generateLabel(dataset, row, column); // Sử dụng phương thức mặc định để hiển thị tên cột
            }
        };

        // Thiết lập CategoryItemLabelGenerator cho CategoryPlot của biểu đồ
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesItemLabelGenerator(0, generator);
        renderer.setSeriesItemLabelsVisible(0, true);

        // Hiển thị biểu đồ trong JFrame
        ChartFrame frame = new ChartFrame("Sản phẩm bán chạy nhất theo tháng", chart);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(1244, 800);
        frame.setVisible(true);
    }//GEN-LAST:event_tkspBanChayMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ThongKeForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel tkdt;
    private javax.swing.JLabel tkspBanChay;
    private javax.swing.JPanel tkspbanchay;
    private javax.swing.JPanel tktngay;
    private javax.swing.JPanel tktthang;
    // End of variables declaration//GEN-END:variables
}
