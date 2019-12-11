

/**
 * @author User
 * @version 1.0
 * @created 11-дек-2019 15:34:44
 */
public class Transaction extends PaymentController {

	private BigInt card_number;
	private int id_transaction;
	private BigInt total_sum;
	private DateTime transaction_date;
	public Sale m_Sale;

	public Transaction(){

	}

	public void finalize() throws Throwable {

	}

	public void checkPayment(){

	}

	public DateTime getDate(){
		return null;
	}

	public int getTotalSum(){
		return 0;
	}

	/**
	 * 
	 * @param id_transaction
	 */
	public void sendTransaction(int id_transaction){

	}

}