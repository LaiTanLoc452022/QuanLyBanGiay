package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final
import entity1.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Nhomvanguoidung.
 * @see DAO.Nhomvanguoidung
 * @author Hibernate Tools
 */
public class NhomvanguoidungHome {

	private static final Logger logger = Logger.getLogger(NhomvanguoidungHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Nhomvanguoidung transientInstance) {
		logger.log(Level.INFO, "persisting Nhomvanguoidung instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Nhomvanguoidung instance) {
		logger.log(Level.INFO, "attaching dirty Nhomvanguoidung instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(Nhomvanguoidung instance) {
		logger.log(Level.INFO, "attaching clean Nhomvanguoidung instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(Nhomvanguoidung persistentInstance) {
		logger.log(Level.INFO, "deleting Nhomvanguoidung instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public Nhomvanguoidung merge(Nhomvanguoidung detachedInstance) {
		logger.log(Level.INFO, "merging Nhomvanguoidung instance");
		try {
			Nhomvanguoidung result = (Nhomvanguoidung) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Nhomvanguoidung findById(entity1.NhomvanguoidungId id) {
		logger.log(Level.INFO, "getting Nhomvanguoidung instance with id: " + id);
		try {
			Nhomvanguoidung instance = (Nhomvanguoidung) sessionFactory.getCurrentSession().get("DAO.Nhomvanguoidung",
					id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(Nhomvanguoidung instance) {
		logger.log(Level.INFO, "finding Nhomvanguoidung instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("DAO.Nhomvanguoidung")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
