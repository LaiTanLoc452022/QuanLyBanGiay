package BUS;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImageToByte {

    public static byte[] toData(String path){
        try {
            BufferedImage bImage = ImageIO.read(new File(path));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "jpg", bos);
            return bos.toByteArray();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static byte[] FileToByte(File file){
        ByteArrayOutputStream bos=null;
        try {
            BufferedImage bImage = ImageIO.read(file);
            bos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "jpg", bos);
            
        } catch (IOException ex) {
            Logger.getLogger(ImageToByte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bos.toByteArray();
    }
}
