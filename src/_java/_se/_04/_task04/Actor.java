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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Actor [Name=" + Name + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
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
		Actor other = (Actor) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	


}
