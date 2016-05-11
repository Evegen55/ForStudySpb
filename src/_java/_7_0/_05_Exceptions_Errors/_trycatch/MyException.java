/**
 *
 */
package _java._7_0._05_Exceptions_Errors._trycatch;

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
