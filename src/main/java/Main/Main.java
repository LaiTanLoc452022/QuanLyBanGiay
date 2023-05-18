package Main;

import DAO.Generic_Implement;
import entity1.*;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class Main extends JFrame {

   public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dữ liệu mẫu
        Object[][] data = {
                {"John", true},
                {"Lisa", false},
                {"David", true}
        };

        // Tiêu đề cột
        String[] columnNames = {"Name", "Selected"};

        // Tạo một DefaultTableModel với dữ liệu và tiêu đề cột
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Tạo một JTable với DefaultTableModel
        JTable table = new JTable(model) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 1) {
                    return Boolean.class; // Đặt kiểu dữ liệu của cột 1 là Boolean
                }
                return super.getColumnClass(column);
            }
        };

        // Tạo một Renderer tùy chỉnh cho cột Checkbox
        TableCellRenderer renderer = new TableCellRenderer() {
            private final JCheckBox checkBox = new JCheckBox();

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                checkBox.setSelected((Boolean) value);
                return checkBox;
            }
        };

        // Tạo một Editor tùy chỉnh cho cột Checkbox
        TableCellEditor editor = new TableCellEditor() {
            private final JCheckBox checkBox = new JCheckBox();

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                checkBox.setSelected((Boolean) value);
                return checkBox;
            }

            @Override
            public Object getCellEditorValue() {
                return checkBox.isSelected();
            }

            @Override
            public boolean isCellEditable(EventObject anEvent) {
                return true;
            }

            @Override
            public boolean shouldSelectCell(EventObject anEvent) {
                return true;
            }

            @Override
            public boolean stopCellEditing() {
                return true;
            }

            @Override
            public void cancelCellEditing() {
            }

            @Override
            public void addCellEditorListener(CellEditorListener l) {
            }

            @Override
            public void removeCellEditorListener(CellEditorListener l) {
            }
        };

        // Đặt Renderer và Editor cho cột Checkbox
        table.getColumnModel().getColumn(1).setCellRenderer(renderer);
        table.getColumnModel().getColumn(1).setCellEditor(editor);

        // Thêm JTable vào JFrame
        frame.getContentPane().add(new JScrollPane(table));

        frame.pack();
        frame.setVisible(true);
    }

}
