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
 * Home object for domain model class Phieunhap.
 * @see DAO.Phieunhap
 * @author Hibernate Tools
 */
public class PhieunhapHome {

	private static final Logger logger = Logger.getLogger(PhieunhapHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Phieunhap transientInstance) {
		logger.log(Level.INFO, "persisting Phieunhap instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Phieunhap instance) {
		logger.log(Level.INFO, "attaching dirty Phieunhap instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(Phieunhap instance) {
		logger.log(Level.INFO, "attaching clean Phieunhap instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(Phieunhap persistentInstance) {
		logger.log(Level.INFO, "deleting Phieunhap instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public Phieunhap merge(Phieunhap detachedInstance) {
		logger.log(Level.INFO, "merging Phieunhap instance");
		try {
			Phieunhap result = (Phieunhap) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Phieunhap findById(java.lang.Integer id) {
		logger.log(Level.INFO, "getting Phieunhap instance with id: " + id);
		try {
			Phieunhap instance = (Phieunhap) sessionFactory.getCurrentSession().get("DAO.Phieunhap", id);
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

	public List findByExample(Phieunhap instance) {
		logger.log(Level.INFO, "finding Phieunhap instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("DAO.Phieunhap")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
