package Main;

import DAO.ChitiethoadonHome;
import static DAO.ChitiethoadonHome.getTheoSLGiayVaThang;
import DAO.Generic_Implement;
import entity1.Chitiethoadon;
import entity1.Hoadon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object[]> results = getTheoSLGiayVaThang();

        Collections.sort(results, Comparator.comparingInt((Object[] o) -> (int) o[0]));

        int[] monthOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int month : monthOrder) {
            for (Object[] result : results) {
                int resultMonth = (int) result[0];
                if (resultMonth == month) {
                    int idGiay = (int) result[1];
                    int soLuong = ((Number) result[2]).intValue();
                    dataset.addValue(soLuong, "IDGiay " + idGiay, "Tháng " + month);
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Sản phẩm bán chạy nhất theo tháng", "Tháng", "Số lượng", dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();

// Định nghĩa CategoryItemLabelGenerator để hiển thị tên giày trên mỗi cột
        CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator() {
            @Override
            public String generateLabel(CategoryDataset dataset, int row, int column) {
                String label = dataset.getColumnKey(column).toString(); // Lấy tên cột (IDGiay)
                int idGiay = Integer.parseInt(label.replace("IDGiay ", "")); // Chuyển đổi thành IDGiay
                String tenGiay = giayMap.get(idGiay); // Lấy tên giày từ ánh xạ giày
                return tenGiay;
            }
        };

// Thiết lập CategoryItemLabelGenerator cho BarRenderer của biểu đồ
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesItemLabelGenerator(0, generator);
        renderer.setSeriesItemLabelsVisible(0, true);

// Các cài đặt khác cho biểu đồ...
        ChartFrame frame = new ChartFrame("Sản phẩm bán chạy nhất theo tháng", chart);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);

    }

}
