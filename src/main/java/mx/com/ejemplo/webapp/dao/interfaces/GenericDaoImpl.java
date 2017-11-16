package mx.com.ejemplo.webapp.dao.interfaces;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase con la implementacion de los metodos
 * basicos para realizar operaciones en la BD
 * con JPA.
 * @author German Juarez
 *
 * @param <E>
 * @param <K>
 */
@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K> {
    protected Class<? extends E> daoType;
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Constructor Class
     */
	@SuppressWarnings("rawtypes")
	public GenericDaoImpl() {	
		Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
	}

	/**
	 * Obtiene la Session actual de Hibernate.
	 * @return Session
	 */
	protected Session currentSession() {
		try {
		    return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    return sessionFactory.openSession();
		}
	}

	@Override
	public void add(E entity) {
		currentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(E entity) {
		currentSession().saveOrUpdate(entity);
	}

	@Override
	public void update(E entity) {
		currentSession().update(entity);
	}

	@Override
	public void remove(E entity) {
		currentSession().delete(entity);
	}

	@Override
	public E find(K key) {
		return (E) currentSession().get(daoType, key);
	}

	@Override
	public List<E> getAll() {
		return currentSession().createCriteria(daoType).list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
