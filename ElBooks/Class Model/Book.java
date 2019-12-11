

/**
 * @author User
 * @version 1.0
 * @created 11-дек-2019 15:34:43
 */
public class Book {

	private String anotation;
	private String cover;
	private ENUM genre;
	private int id_author;
	private int id_book;
	private String name;
	public StorageBook m_StorageBook;

	public Book(){

	}

	public void finalize() throws Throwable {

	}

	public String getAnotation(){
		return "";
	}

	public Object getAuthor(){
		return null;
	}

	public String getAuthorName(){
		return "";
	}

	public String getCover(){
		return "";
	}

	public Enum getGenre(){
		return null;
	}

	public String getName(){
		return "";
	}

	/**
	 * 
	 * @param anotion
	 */
	public void setAnotation(String anotion){

	}

	/**
	 * 
	 * @param link
	 */
	public void setCover(String link){

	}

	/**
	 * 
	 * @param enum
	 */
	public void setGenre(Enum enum){

	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name){

	}

}