

/**
 * @author User
 * @version 1.0
 * @created 11-���-2019 15:34:44
 */
public interface IPayment {

	public void checkPayment();

	public void getReport();

	/**
	 * 
	 * @param id_transaction
	 */
	public void sendTransaction(int id_transaction);

}