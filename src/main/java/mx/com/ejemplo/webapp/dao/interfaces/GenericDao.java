package mx.com.ejemplo.webapp.dao.interfaces;

import java.util.List;

/**
 * Interfaz con los metodos de JPA 
 * para operaciones en bases de datos.
 * @author German Juarez
 *
 * @param <E>
 * @param <K>
 */
public interface GenericDao<E, K> {
	/**
	 * Metodo para agregar registros.
	 * @param entity
	 */
	void add(E entity);
	/**
	 * Metodo para guardar o actualizar registros.
	 * @param entity
	 */
    void saveOrUpdate(E entity);
    /**
     * Metodo para actualizar registros.
     * @param entity
     */
    void update(E entity);
    /**
     * metodo para eliminar registros.
     * @param entity
     */
    void remove(E entity);
    /**
     * Metodo para encontrar un registro en particular.
     * @param key
     * @return
     */
    E find(K key);
    /**
     * Metodo para obtener una lista de registros.
     * @return
     */
    List<E> getAll();
}
