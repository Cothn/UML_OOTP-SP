

/**
 * @author User
 * @version 1.0
 * @created 11-дек-2019 15:34:44
 */
public class User extends UserController {

	private String email;
	private String first_name;
	private int id_role;
	private int id_user;
	private String login;
	private String password_hash;
	private String phoneNumber;
	public Sale m_Sale;
	public Book m_Book;

	public User(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param id_sale
	 */
	public int paySale(int id_sale){
		return 0;
	}

	/**
	 * 
	 * @param login
	 * @param password
	 * @param email
	 * @param phone
	 * @param firstName
	 */
	public void redactUserInfo(String login, String password, String email, String phone, String firstName){

	}

	public void signOut(){

	}

	/**
	 * 
	 * @param id_sale
	 */
	public void viewBasket(int id_sale){

	}

	public void viewUserInfo(){

	}

}