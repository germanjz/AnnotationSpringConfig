package mx.com.ejemplo.webapp.dao.interfaces;

import java.util.List;

import mx.com.ejemplo.webapp.dao.entity.IataCodes;

public interface IataDao extends GenericDao<IataCodes, Integer> {
	/**
	 * 
	 * @return
	 */
	List<IataCodes> getAll();

}
