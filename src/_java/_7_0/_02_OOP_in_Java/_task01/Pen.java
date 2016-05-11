/**
 *
 */
package _java._7_0._02_OOP_in_Java._task01;

/**
 * @author Lartsev
 *
 */
public class Pen {

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
	public Pen(int color, int length, int colorOfBody, String type) {
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		/**
		 * @see http://stackoverflow.com/questions/3613102/why-use-a-prime-number-in-hashcode
		 */
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + colorOfBody;
		result = prime * result + length;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color != other.color)
			return false;
		if (colorOfBody != other.colorOfBody)
			return false;
		if (length != other.length)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pen [color=" + color + ", length=" + length + ", colorOfBody=" + colorOfBody + ", type=" + type + "]";
	}

}
