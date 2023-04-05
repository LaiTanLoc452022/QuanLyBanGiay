package Database;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HIbernateUtil {
	private static SessionFactory factory;
	static {
		Configuration config=new Configuration().configure("/hibernate.cfg.xml");
		config.addResource("Chitiethoadon.hbm.xml");
		config.addResource("Chitietphieunhap.hbm.xml");
		config.addResource("Giay.hbm.xml");
		config.addResource("Hoadon.hbm.xml");
		config.addResource("Khachhang.hbm.xml");
		config.addResource("Loainv.hbm.xml");
		config.addResource("Manhinh.hbm.xml");
		config.addResource("Nguoidung.hbm.xml");
		config.addResource("Nhacungcap.hbm.xml");
		config.addResource("Nhanvien.hbm.xml");
		config.addResource("Nhom.hbm.xml");
		config.addResource("Nhomvanguoidung.hbm.xml");
		config.addResource("Phanloai.hbm.xml");
		config.addResource("Phanquyen.hbm.xml");
		config.addResource("Phieunhap.hbm.xml");
		config.addResource("The.hbm.xml");
		  StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		            config.getProperties()).build();
		factory=config.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceRegistry);
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}

