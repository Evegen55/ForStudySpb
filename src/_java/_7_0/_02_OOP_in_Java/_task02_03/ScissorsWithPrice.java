/**
 *
 */
package _java._7_0._02_OOP_in_Java._task02_03;

/**
 * @author Lartsev
 *
 */
public class ScissorsWithPrice  extends Stationery {

	private int length;
	private int colorOfBody;
	private String type;


		/**
	 * @param length
	 * @param colorOfBody
	 * @param type
	 */
	public ScissorsWithPrice(int length, int colorOfBody, String type) {
		this.length = length;
		this.colorOfBody = colorOfBody;
		this.type = type;
	}


	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the colorOfBody
	 */
	public int getColorOfBody() {
		return colorOfBody;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}



}
