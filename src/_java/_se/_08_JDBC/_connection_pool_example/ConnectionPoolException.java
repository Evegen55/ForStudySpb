/**
 *
 */
package _java._se._08_JDBC._connection_pool_example;

/**
 * @author Lartsev
 *
 */
public class ConnectionPoolException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ConnectionPoolException(String message, Exception e) {
		super(message, e);
	}
}
