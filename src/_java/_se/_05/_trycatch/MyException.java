/**
 *
 */
package _java._se._05._trycatch;

/**
 * @author Lartsev
 *
 */
public class MyException extends Exception {

	private int detail;

	/**
	 * @param detail
	 */
	public MyException(int detail) {
		this.detail = detail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyException [detail=" + detail + "]";
	}



}
