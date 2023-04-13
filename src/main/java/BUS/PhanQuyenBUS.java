package BUS;
import DAO.NhanvienHome;
import GUI.*;
import entity1.Nhanvien;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PhanQuyenBUS extends GUI.PhanQuyenForm {
	public   ImageIcon loadImageAndInfo(int id){ //load ảnh cá nhân lên form;
      
        Nhanvien nhanvien= NhanvienHome.findByID(Nhanvien.class,id);
        byte[] img=nhanvien.getAnh();
        ImageIcon imageIcon=new ImageIcon(img);
        Image image=imageIcon.getImage().getScaledInstance(this.getPersonalImage().getWidth(),this.getPersonalImage().getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon= new ImageIcon(image);
        this.getPersonalImage().setIcon(scaledImageIcon);
        this.getTextField1().setText(nhanvien.getHoVaTen());
        return scaledImageIcon;



    }
}
