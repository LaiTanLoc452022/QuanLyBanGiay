package GUI;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;




public class QRCodeGenerator {
    public static byte[] generateQRCodeImage(String content) {
        try {
            // Tạo đối tượng QRCodeWriter
            QRCodeWriter qrCodeWriter = new QRCodeWriter();

            // Đặt các thuộc tính cho QR code
            int width = 300;
            int height = 300;
            String format = "PNG";
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L; // Mức độ sửa lỗi
            // Tạo các thông số cho mã QR
            java.util.Map<EncodeHintType, ErrorCorrectionLevel> hints = new java.util.HashMap<>();
            hints.put(EncodeHintType.ERROR_CORRECTION, errorCorrectionLevel);

            // Tạo BitMatrix từ dữ liệu và thông số
            BitMatrix bitMatrix = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, width, height, hints);

            // Tạo ảnh từ BitMatrix
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, format, outputStream);

            // Chuyển đổi ảnh thành mảng byte[]
            byte[] imageBytes = outputStream.toByteArray();

            return imageBytes;
        } catch (WriterException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String content = "Hello, world!"; // Nội dung bạn muốn mã hóa thành QR code

        byte[] qrCodeImage = generateQRCodeImage(content);
        if (qrCodeImage != null) {
            // Encode byte[] thành chuỗi base64 để kiểm tra kết quả
            String base64Image = Base64.getEncoder().encodeToString(qrCodeImage);
            System.out.println("QR Code Image (Base64): " + base64Image);
        }
    }
}


   

