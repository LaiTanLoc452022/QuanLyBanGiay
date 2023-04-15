package BUS;
import DAO.NhanvienHome;
import DAO.NhomHome;
import GUI.*;
import entity1.Nhanvien;
import entity1.Nhom;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

public class PhanQuyenBUS extends GUI.PhanQuyenForm {
	public   ImageIcon loadImageAndInfo(int id){ //load ảnh cá nhân lên form;
      
        Nhanvien nhanvien= NhanvienHome.findByID(Nhanvien.class,id);
        byte[] img=nhanvien.getAnh();
        ImageIcon imageIcon=new ImageIcon(img);
        Image image=imageIcon.getImage().getScaledInstance(this.getPersonalImage().getWidth(),this.getPersonalImage().getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon= new ImageIcon(image);
        this.getPersonalImage().setIcon(scaledImageIcon);
        this.getTenNhanVien().setText(nhanvien.getHoVaTen());
        return scaledImageIcon;
    }
    @Override
    public void ChonPhanQuyen(ActionEvent e) {
        Nhom nhom = NhomHome.findByID(Nhom.class,1);
       JButton button=(JButton) e.getSource();
        button.setEnabled(false);
    }
}
