/**
 *
 */
package _java._se._08_JDBC;

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
