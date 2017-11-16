package mx.com.ejemplo.webapp.dao.interfaces;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import mx.com.ejemplo.webapp.dao.entity.IataCodes;

@Repository("iataDao")
public class IataDaoImpl extends GenericDaoImpl<IataCodes, Integer> implements IataDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<IataCodes> getAll() {
		Criteria crit = currentSession().createCriteria(IataCodes.class);
		crit.addOrder(Order.asc("id"));
		crit.setMaxResults(20);
		
		return crit.list();
	}

}
