/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author ACER
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchInterface extends JFrame {
    private JTextField searchField;
    private JButton searchButton;
    private JList<String> resultList;
    private DefaultListModel<String> listModel;

    public SearchInterface() {
        // Thiết lập cửa sổ
        setTitle("Giao diện tìm kiếm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        // Tạo các thành phần giao diện
        searchField = new JTextField();
        searchButton = new JButton("Tìm kiếm");
        listModel = new DefaultListModel<>();
        resultList = new JList<>(listModel);

        // Tạo sự kiện cho nút tìm kiếm
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = searchField.getText();
                // Gọi phương thức tìm kiếm và cập nhật danh sách kết quả
                performSearch(keyword);
            }
        });

        // Tạo bố cục giao diện
        setLayout(new BorderLayout());
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new BorderLayout());
        searchPanel.add(searchField, BorderLayout.CENTER);
        searchPanel.add(searchButton, BorderLayout.EAST);
        add(searchPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultList), BorderLayout.CENTER);
    }

    private void performSearch(String keyword) {
        // Xử lý tìm kiếm tại đây
        // Đây chỉ là một phương thức mẫu, bạn có thể thay thế bằng logic tìm kiếm thực tế của bạn
        // Ví dụ: Tạo danh sách kết quả giả định
        ArrayList<String> results = new ArrayList<>();
        results.add("Kết quả 1");
        results.add("Kết quả 2");
        results.add("Kết quả 3");

        // Xóa danh sách cũ
        listModel.clear();

        // Thêm kết quả mới vào danh sách
        for (String result : results) {
            listModel.addElement(result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SearchInterface searchInterface = new SearchInterface();
                searchInterface.setVisible(true);
            }
        });
    }
}
