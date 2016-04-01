/**
 *
 */
package _java._se._04._task04;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Lartsev
 *
 */
public class Film  implements Serializable {
	private Collection<Actor> actors;

	/**
	 * @param actors
	 */
	public Film(Collection<Actor> actors) {
		this.actors = actors;
	}

	/**
	 * @return the actors
	 */
	public Collection<Actor> getActors() {
		return actors;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Film [actors=" + actors + "]";
	}



}
