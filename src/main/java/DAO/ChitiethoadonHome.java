package DAO;
// Generated Mar 30, 2023, 7:14:19 PM by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import Database.HIbernateUtil;
import entity1.Chitiethoadon;

/**
 * Home object for domain model class Chitiethoadon.
 * @see DAO.Chitiethoadon
 * @author Hibernate Tools
 */
public class ChitiethoadonHome {

	private static final Logger logger = Logger.getLogger(ChitiethoadonHome.class.getName());

	private final SessionFactory sessionFactory = HIbernateUtil.getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Chitiethoadon transientInstance) {
		logger.log(Level.INFO, "persisting Chitiethoadon instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Chitiethoadon instance) {
		logger.log(Level.INFO, "attaching dirty Chitiethoadon instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(Chitiethoadon instance) {
		logger.log(Level.INFO, "attaching clean Chitiethoadon instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(Chitiethoadon persistentInstance) {
		logger.log(Level.INFO, "deleting Chitiethoadon instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public Chitiethoadon merge(Chitiethoadon detachedInstance) {
		logger.log(Level.INFO, "merging Chitiethoadon instance");
		try {
			Chitiethoadon result = (Chitiethoadon) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Chitiethoadon findById(entity1.ChitiethoadonId id) {
		logger.log(Level.INFO, "getting Chitiethoadon instance with id: " + id);
		try {
			Chitiethoadon instance = (Chitiethoadon) sessionFactory.getCurrentSession().get("entity1.Chitiethoadon", id);
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

	public List findByExample(Chitiethoadon instance) {
		logger.log(Level.INFO, "finding Chitiethoadon instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("entity1.Chitiethoadon")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
