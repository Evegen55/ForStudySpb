/**
 * 
 */
package _java._se._02_OOP_in_Java._generics;

/**
 * @author Lartsev
 *
 */
public class Mark<T extends Number> {
	
	public T mark;

	/**
	 * @param mark
	 */
	public Mark(T mark) {
		this.mark = mark;
	}

	/**
	 * @return the mark
	 */
	public T getMark() {
		return mark;
	}
	
	/**
	 * 
	 * @return
	 */
	public int roundMark() {
		return Math.round(mark.floatValue());
	}
	
	/**
	 * 
	 * @param ob
	 * @return
	 */
	public boolean sameAny(Mark<?> ob) {
		return roundMark() == ob.roundMark();
	}
	
	/**
	 * 
	 * @param ob
	 * @return
	 */
	public boolean same(Mark<T> ob) {
		return getMark() == ob.getMark();
	}
	

}
