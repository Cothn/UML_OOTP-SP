

/**
 * @author User
 * @version 1.0
 * @created 11-дек-2019 15:34:44
 */
public interface IReport {

	/**
	 * 
	 * @param date
	 */
	public Object getMonthReport(Date date);

	/**
	 * 
	 * @param year
	 */
	public Object getYearReport(int year);

}