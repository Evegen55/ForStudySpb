/**
 *
 */
package _java._se._04._task04;

import java.io.Serializable;

/**
 * @author Lartsev
 *
 */
public class Actor  implements Serializable {
	private String Name;

	/**
	 * @param name
	 */
	public Actor(String name) {
		Name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}



}
