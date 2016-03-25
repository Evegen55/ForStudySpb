/**
 * 
 */
package _java._se._02._task02_03;

/**
 * @author Lartsev
 *
 */
public class PaperTray extends Stationery {
	
	private int colorOfBody;
	private String type;
	
	/**
	 * @param colorOfBody
	 * @param type
	 */
	public PaperTray(int colorOfBody, String type) {
		this.colorOfBody = colorOfBody;
		this.type = type;
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
