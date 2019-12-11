

/**
 * @author User
 * @version 1.0
 * @created 11-дек-2019 15:34:44
 */
public class StorageBook {

	private Date adding_date;
	private String description;
	private int id_game;
	private int id_stock;
	private boolean is_selling;
	private int price;
	public Sale m_Sale;

	public StorageBook(){

	}

	public void finalize() throws Throwable {

	}

	public String getDescription(){
		return "";
	}

	public int getPrice(){
		return 0;
	}

	public boolean getState(){
		return false;
	}

}