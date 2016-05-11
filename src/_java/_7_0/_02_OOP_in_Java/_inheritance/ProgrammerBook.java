/**
 * 
 */
package _java._7_0._02_OOP_in_Java._inheritance;

/**
 * @author Lartsev
 *
 */
public class ProgrammerBook extends Book {
	
	private String language;

	/**
	 * 
	 */
	public ProgrammerBook() {
	}

	/**
	 * @param title
	 * @param price
	 * @param language
	 */
	public ProgrammerBook(String title, int price, String language) {
		super(title, price);
		this.language = language;
	}

	/* (non-Javadoc)
	 * @see _java._se._02._inheritance.Book#getInfo()
	 */
	@Override
	public String getInfo() {
		return super.getInfo() + ", language: " + language;
	}
	
	

}
