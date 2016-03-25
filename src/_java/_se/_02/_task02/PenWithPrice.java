/**
 *
 */
package _java._se._02._task02;

/**
 * @author Lartsev
 *
 */
public class PenWithPrice extends Stationery {

	private int color;
	private int length;
	private int colorOfBody;
	private String type;


	/**
	 * @param color
	 * @param length
	 * @param colorOfBody
	 * @param type
	 */
	public PenWithPrice(int color, int length, int colorOfBody, String type) {
		this.color = color;
		this.length = length;
		this.colorOfBody = colorOfBody;
		this.type = type;
	}

	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PenWithPrice [color=" + color + ", length=" + length + ", colorOfBody=" + colorOfBody + ", type=" + type
				+ "]";
	}



}
