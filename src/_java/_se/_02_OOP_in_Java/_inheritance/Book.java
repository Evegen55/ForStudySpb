/**
 * 
 */
package _java._se._02_OOP_in_Java._inheritance;

/**
 * @author Lartsev
 *
 */
public class Book {
	
	private String title;
	private int price;
	/**
	 * 
	 */
	public Book() {
	}
	/**
	 * @param title
	 * @param price
	 */
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getInfo() {
		return "Title: " + title + ", " + "price: " + price;
	}

}
