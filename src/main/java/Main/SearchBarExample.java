package Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBarExample extends JFrame {
    private JTextField searchField;
    private JButton searchButton;
    private JPopupMenu popupMenu;

    public SearchBarExample() {
        setTitle("Search Bar Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tạo thanh tìm kiếm
        searchField = new JTextField();
        searchButton = new JButton("Search");

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.add(searchField, BorderLayout.CENTER);
        searchPanel.add(searchButton, BorderLayout.EAST);

        // Tạo danh sách tìm kiếm
        popupMenu = new JPopupMenu();

        // Xử lý sự kiện tìm kiếm
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

        searchField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

        // Thêm các thành phần vào frame
        add(searchPanel, BorderLayout.NORTH);

        // Gắn sự kiện bấm chuột phải để hiển thị danh sách tìm kiếm
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (SwingUtilities.isRightMouseButton(evt)) {
                    showPopupMenu();
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performSearch() {
        String keyword = searchField.getText();
        // Thực hiện tìm kiếm dựa trên từ khóa 'keyword' và cập nhật danh sách kết quả tìm kiếm
        // popupMenu.removeAll();
        // Thêm các kết quả tìm kiếm vào popupMenu
        // ...

        // Ví dụ: Tạm thời hiển thị kết quả mẫu
        popupMenu.removeAll();
        popupMenu.add(new JMenuItem("Result 1"));
        popupMenu.add(new JMenuItem("Result 2"));
        popupMenu.add(new JMenuItem("Result 3"));

        // Hiển thị danh sách tìm kiếm
        showPopupMenu();
    }

    private void showPopupMenu() {
        popupMenu.show(searchField, 0, searchField.getHeight());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchBarExample();
            }
        });
    }
}
