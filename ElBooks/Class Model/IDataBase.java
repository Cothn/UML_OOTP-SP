

/**
 * @author User
 * @version 1.0
 * @created 11-дек-2019 15:34:44
 */
public interface IDataBase {

	/**
	 * 
	 * @param entity
	 */
	public void addEntity(Object entity);

	/**
	 * 
	 * @param entity
	 */
	public void deleteEntity(Object entity);

	/**
	 * 
	 * @param entity
	 */
	public void editEntity(Object entity);

	/**
	 * 
	 * @param param
	 */
	public Object getAllLists(String param);

	/**
	 * 
	 * @param param
	 */
	public Object getEntity(String param);

	/**
	 * 
	 * @param param
	 */
	public Object getList(String param);

	/**
	 * 
	 * @param criteria
	 */
	public Object getListByCriteria(String criteria);

}