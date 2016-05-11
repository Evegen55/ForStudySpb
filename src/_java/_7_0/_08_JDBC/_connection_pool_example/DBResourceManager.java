/**
 *
 */
package _java._7_0._08_JDBC._connection_pool_example;

import java.util.ResourceBundle;

/**
 * @author Lartsev
 *
 */
public class DBResourceManager {
	private final static DBResourceManager instance = new DBResourceManager();

	private ResourceBundle bundle = ResourceBundle
			.getBundle("other/for_properties/db.properties");

	/**
	 * @return the instance
	 */
	public static DBResourceManager getInstance() {
		return instance;
	}

	/**
	 * @return the bundle
	 */
	public String getBundle(String key) {
		return bundle.getString(key);
	}

}
