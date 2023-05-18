/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMAN;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ACER
 */
public class HamCanDung {

    public String AnhToString(byte[] Anh){
        String temp = "";
        if(null != Anh){
            for(byte i : Anh){
                temp += i + " ";
            }
        }
        return temp;
    }
    
    public byte[] stringToByteArray(String stringObject) {
        String[] byteValues = stringObject.split(" ");
        byte[] byteArray = new byte[byteValues.length];
        for (int i = 0; i < byteValues.length; i++) {
            byteArray[i] = Byte.parseByte(byteValues[i]);
        }
        return byteArray;
    }
    public void exportToExcel(JTable table, String filePath) {
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
            try ( FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }

            System.out.println("Xuất Excel thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
