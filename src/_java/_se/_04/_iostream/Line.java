/**
 * 
 */
package _java._se._04._iostream;

import java.io.Serializable;

/**
 * @author Lartsev
 *
 */
public class Line implements Serializable {
	private Point p1;
	private Point p2;
	private int index;
	
	/**
	 * 
	 */
	public Line() {
		System.out.println("Constructing empty line");
	}

	/**
	 * @param p1
	 * @param p2
	 * @param index
	 */
	public Line(Point p1, Point p2, int index) {
		this.p1 = p1;
		this.p2 = p2;
		this.index = index;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	
	public void printInfo() {
		System.out.println("Line" + "\t" + index);
		System.out.println("Object reference: " + super.toString());
		System.out.println("from point" + p1);
		System.out.println("to point" + p2);
	}

}
