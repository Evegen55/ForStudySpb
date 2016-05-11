/**
 * 
 */
package _java._7_0._04_IO_NIO_Streams._iostream;

import java.io.Serializable;

/**
 * @author Lartsev
 *
 */
public class Point implements Serializable {
	private double x;
	private double y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]" + "\t" + super.toString();
	}
	
	

}
